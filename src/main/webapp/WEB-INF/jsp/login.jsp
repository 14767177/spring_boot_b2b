<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentelella Alela! | </title>

    <!-- Bootstrap -->
    <link href="${ctx}/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${ctx}/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${ctx}/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="${ctx}/vendors/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${ctx}/build/css/custom.min.css" rel="stylesheet">
    <script type="text/javascript" src="${ctx}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
    
    var displayValidateCodeFlag=false;
	document.onkeydown=function(event){
	    var e = event || window.event || arguments.callee.caller.arguments[0];
	    if(e && e.keyCode==27){ // 按 Esc 
	        //要做的事情
	      }
	    if(e && e.keyCode==113){ // 按 F2 
	         //要做的事情
	       }            
	     if(e && e.keyCode==13){ // enter 键
	    	 $.ajax({
	    		url:"/userlist",
	 			type:"get",
	 			dataType:"json",
	 			success:function (data)
	 			{
	 			}
	 	});
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 subForm();
	    }
	}; 
    
    
    
    
    
    function subForm(){
    	$("#userForm").submit();
    }
    
    </script>
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form id="userForm" action="${ctx}/login" method="post" >
              <h1>Login Form</h1>
              ${SPRING_SECURITY_LAST_EXCEPTION}
              <p class="bg-primary" th:text=""></p>
              <div>
                <input type="text" name="username" class="form-control" placeholder="Username" required="" />
              </div>
              <div>
                <input type="password" name="password"  class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                <input type="text" name="verifyCode"  class="form-control" placeholder="验证码" required="" />
                <a href='javascript:void(0);' style="cursor:pointer" title="点击更换图片" onClick="$('#validImg').attr('src','${ctx}/validCode?t='+Math.random());">
                <img id="validImg" src="${ctx}/validCode"/>
              </div>
              <div>
                <a class="btn btn-default submit" href="javascript:void(0)" onClick="subForm();">登陆</a>
                <a class="reset_pass" href="#">忘记密码?</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">New to site?
                  <a href="#signup" class="to_register"> Create Account </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                  <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                </div>
              </div>
            </form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
            <form>
              <h1>Create Account</h1>
              <div>
                <input type="text" class="form-control" placeholder="Username" required="" />
              </div>
              <div>
                <input type="email" class="form-control" placeholder="Email" required="" />
              </div>
              <div>
                <input type="password" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                <a class="btn btn-default submit" href="index.html">Submit</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">Already a member ?
                  <a href="#signin" class="to_register"> Log in </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                  <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>