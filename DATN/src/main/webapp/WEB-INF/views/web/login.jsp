<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>VMHshop - login</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="template/web/img/favicon.ico">
    
    <!-- CSS 
    ========================= -->
   

    <!-- Plugins CSS -->
    <link rel="stylesheet" href="template/web/css/plugins.css">
    
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="template/web/css/style.css">
</head>

<body>
<%-- Thực hiện thông báo   --%>
    <!--header area start-->
<jsp:include page="fragments/header_area.jsp" />
    <!--header area end-->



    <!--breadcrumbs area start-->
    <div class="breadcrumbs_area">
        <div class="container">   
            <div class="row">
                <div class="col-12">
                    <div class="breadcrumb_content">
                        <ul>
                            <li><a href="/index">home</a></li>
                            <li>login</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>         
    </div>
    <!--breadcrumbs area end-->
    
    
    <!-- customer login start -->
    <div class="customer_login mt-60">
        <div class="container">
            <div class="row">
               <!--login area start-->
                <div class="col-lg-6 col-md-6">
                    <div class="account_form">
                        <h2>login</h2>
                        <%--@elvariable id="model" type=""--%>
                        <form:form action="login" method="post" modelAttribute="model">
                        <p>${model}</p>
                        <p>
                            <p>   
                                <label>Username or email <span>*</span></label>
                                <input type="text" name="userName" required>
                             </p>
                             <p>   
                                <label>Passwords <span>*</span></label>
                                <input type="password" name="password" required>
                             </p>   
                            <div class="login_submit">
                               <a href="#">Lost your password?</a>
                                <label for="remember">
                                    <input id="remember" type="checkbox">
                                    Remember me
                                </label>
                                <button type="submit">login</button>
                                
                            </div>
                        </form:form>
                     </div>    
                </div>
                <!--login area start-->

                <!--register area start-->
                <div class="col-lg-6 col-md-6">
                    <div class="account_form register">
                        <h2>Register</h2>
                        <form action="#">
                            <p>   
                                <label>Email address  <span>*</span></label>
                                <input type="text">
                             </p>
                             <p>   
                                <label>Passwords <span>*</span></label>
                                <input type="password">
                             </p>
                            <div class="login_submit">
                                <button type="submit">Register</button>
                            </div>
                        </form>
                    </div>    
                </div>
                <!--register area end-->
            </div>
        </div>    
    </div>
    <!-- customer login end -->

     <!--brand newsletter area start-->
    <div class="brand_newsletter_area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="brand_container owl-carousel">
                        <div class="single_brand">
                            <a href="#"><img src="tempalte/img/brand/brand.png" alt=""></a>
                        </div>
                    </div>
                    <div class="newsletter_inner">
                        <div class="newsletter_content">
                            <h2>SUBSCRIBE TO OUR NEWSLETTER</h2>
                        </div>
                        <div class="newsletter_form">
                            <form action="#">
                                <input placeholder="Email..." type="text">
                                <button type="submit"><i class="zmdi zmdi-mail-send"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--brand area end-->
<%--Thông báo sau khi đăng nhập--%>
    <!--footer area start-->
<jsp:include page="fragments/footer.jsp"/>
    <!--footer area end-->
<!-- JS
============================================ -->

<!-- Plugins JS -->
<script src="<c:url value="template/web/js/plugins.js" />"></script>

<!-- Main JS -->
<script src="<c:url value="template/web/js/plugins.js" />"></script>



</body>

</html>