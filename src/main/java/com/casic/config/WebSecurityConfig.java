package com.casic.config;

import com.casic.security.*;
import com.casic.security.MyAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.ForwardAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import scala.concurrent.FutureTaskRunner;

import java.util.List;

/**
 * Created by LRN on 2017/12/20.
 */
@Configuration
@EnableWebSecurity //启动web安全性
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserValidateService userValidateService;

    @Autowired
    private ForwardAuthenticationSuccessHandler forwardAuthenticationSuccessHandler;

    @Autowired
    private SimpleUrlAuthenticationFailureHandler simpleUrlAuthenticationFailureHandler;

    @Autowired
    private CasicSecurityMetadataSource casicSecurityMetadataSource;

    @Autowired
    private CasicDecisionManager casicDecisionManager;

    @Autowired
    private MyPermissionFilter myPermissionFilter;



    /**
     * AuthenticationManagerBuilder用来配置全局的认证相关的信息，
     * 其实就是AuthenticationProvider和UserDetailsService，
     * 前者是认证服务提供商，后者是用户详情查询服务。
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //这东西千万不能忘
        auth.authenticationProvider(new MyAuthenticationProvider(userValidateService));
        auth.userDetailsService(userValidateService);

    }

    @Override
    protected AuthenticationManager authenticationManager() throws Exception {

        return super.authenticationManager();
    }


    /**
     * 具体的权限控制规则配置。一个这个配置相当于xml配置中的一个标签。
     各种具体的认证机制的相关配置，OpenIDLoginConfigurer、AnonymousConfigurer、FormLoginConfigurer、HttpBasicConfigurer
     LogoutConfigurer
     RequestMatcherConfigurer：spring mvc style、ant style、regex style
     HeadersConfigurer：
     CorsConfigurer、CsrfConfigurer
     SessionManagementConfigurer：
     PortMapperConfigurer：
     JeeConfigurer：
     X509Configurer：
     RememberMeConfigurer：
     ExpressionUrlAuthorizationConfigurer：
     RequestCacheConfigurer：
     ExceptionHandlingConfigurer：
     SecurityContextConfigurer：
     ServletApiConfigurer：
     ChannelSecurityConfigurer：
     此模块的authenticationProvider和userDetailsService；
     SecurityFilterChain控制
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {


         //允许所有用户访问"/","/index.jsp"
        //在正确的位置添加我们自定义的过滤器
        http
                /*.addFilterBefore( new MyPermissionFilter(casicDecisionManager,casicSecurityMetadataSource)
                , FilterSecurityInterceptor.class)*/
                .addFilterAt( myPermissionFilter
                        , FilterSecurityInterceptor.class)
                .authorizeRequests()
                .antMatchers("/indexjsp","/validCode").permitAll()
               //其他地址的访问需要权限验证
                .anyRequest().authenticated()
                //指定登陆页面
               .and()
                //自定义filter
                //需要放入authenticationManagerBean 是生成authenticationManager的条件
                .addFilterBefore(new ApiUsernamePasswordAuthenticationFilter(this.authenticationManagerBean(),forwardAuthenticationSuccessHandler,simpleUrlAuthenticationFailureHandler),
                        UsernamePasswordAuthenticationFilter.class)
                .formLogin().loginPage("/indexjsp")
                .permitAll()
                .and()

                //关闭csrf
                .csrf().disable()
                .logout().logoutSuccessUrl("/indexjsp").permitAll().invalidateHttpSession(true);


    }


    /**
     * 成功跳转页面
     * @return
     */
    @Bean
    public ForwardAuthenticationSuccessHandler ForwardAuthenticationSuccessHandlerStart(){
        ForwardAuthenticationSuccessHandler forwardAuthenticationSuccessHandler = new ForwardAuthenticationSuccessHandler("/getuserlist");
        return forwardAuthenticationSuccessHandler;
    }

    /**
     * 失败跳转页面
     * @return
     */
    @Bean
    public SimpleUrlAuthenticationFailureHandler getSimpleUrlAuthenticationFailureHandler(){
        SimpleUrlAuthenticationFailureHandler simpleUrlAuthenticationFailureHandler = new SimpleUrlAuthenticationFailureHandler("/indexjsp?error");
        return simpleUrlAuthenticationFailureHandler;
    }

   /* @Bean
    public CasicSecurityMetadataSource getCasicSecurityMetadataSource(){
        return  new CasicSecurityMetadataSource();
    }

    @Bean
    public CasicDecisionManager getCasicDecisionManager(){
        return new CasicDecisionManager();
    }*/

    /**
     * 全局请求忽略规则配置（比如说静态文件，比如说注册页面）、
     * 全局HttpFirewall配置、是否debug配置、全局SecurityFilterChain配置、
     * privilegeEvaluator、expressionHandler、securityInterceptor
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        // 设置不拦截规则
        web.ignoring().antMatchers("/base/**","/build/**","/css/**","/images/**","/js/**","/vendors/**");
    }


}
