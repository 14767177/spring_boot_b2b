package com.casic.utils;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 *  Http相关操作
 * </p>
 *
 * @author tangzheng
 * @since 2018-04-02
 */
public class HttpClientUtil {


    //测试环境外网地址
    private final static String API_ROOT_URL = "http://218.85.78.201:8081/fcsapp";
    /**
     * 连接超时时间
     */
    public static final int CONNECTION_TIMEOUT_MS = 360000;

    /**
     * 读取数据超时时间
     */
    public static final int SO_TIMEOUT_MS = 360000;

    public static final String CONTENT_TYPE_JSON_CHARSET = "application/json;charset=utf-8";

    public static final String CONTENT_TYPE_XML_CHARSET = "application/xml;charset=utf-8";


    public static final String CONTENT_TYPE_JSON_CHARSET_UTF8 = "application/json;charset=utf-8";

    public static final String CONTENT_TYPE_XML_CHARSET_UTF8 = "application/xml;charset=utf-8";


    /**
     * httpclient读取内容时使用的字符集
     */
    public static final String CHARSET_GBK = "GBK";

    public static final String CHARSET_UTF8 = "UTF-8";

    public static final Charset UTF_8 = Charset.forName(CHARSET_UTF8);

    public static final Charset GBK = Charset.forName(CHARSET_GBK);


    /**
     * 通用post请求
     * @param url 请求地址
     * @param params 请求参数
     * @return 返回json 自己解析
     */
    public static String jsonPostInvoke(String url, Map<String, Object> params){

        System.out.println("post方式提交json数据开始......");
        // 接收参数json列表
        //2.创建默认的httpClient实例和httppost   
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // post请求
        HttpPost method = new HttpPost(url);

        if(null != params){
            String paramsJons = JSONUtils.toJSONString(params);

            // 参数实体
            StringEntity entity = new StringEntity(paramsJons, CHARSET_UTF8);//解决中文乱码问题
            entity.setContentEncoding(CHARSET_UTF8);
            entity.setContentType(CONTENT_TYPE_JSON_CHARSET_UTF8);
            method.setEntity(entity);
        }
        // 执行响应操作
        HttpResponse result = null;
        String data="";
        try {
            result = httpClient.execute(method);
            data= EntityUtils.toString(result.getEntity());
        } catch (Exception e) {
            data="请求错误";
            e.printStackTrace();
        }  finally{
            method.releaseConnection();
        }
        // 请求结束，返回结果
        System.out.println("post方式提交json数据结束......");
        return data;
    }

    public static void main(String[] args) {
        String url="http://106.74.152.118:2381/common/calculate/getKCumulativeByReids.ht";
        Map<String,Object> params=new HashMap<>();
        List<Long> devids  = new ArrayList<>();
        //10000050233233, 10000050233227, 10000050233055, 10000050233049
        devids.add(10000050233097L);
        devids.add(10000050233111L);
        devids.add(10000050233151L);
        params.put("devIds", devids);
        String result="";

        String jsonString = JSON.toJSONString(params);
        System.out.println(jsonString);
        try {
            result=jsonPostInvoke(url, params);
            JSONObject fromObject = JSON.parseObject(result);
            String jsonobj = fromObject.getString("10000050233097");
            //JSONObject fromObject = JSONObject.fromObject(result);
            //String jsonobj = (String) fromObject.get("10000050233097");
            System.out.println(jsonobj);
            Map parseObject = JSON.parseObject(jsonobj, Map.class);
            Object object = parseObject.get("power");
            System.out.println("----"+object.toString()+"-------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
