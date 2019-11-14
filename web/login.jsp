<%-- 
    Document   : login
    Created on : Nov 5, 2019, 3:13:45 PM
    Author     : NhanNT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String warning = "";
    if (session.getAttribute("warning") != null) {
        warning = (String) session.getAttribute("warning");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/style.css" rel="stylesheet">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            /* 
                Created on : Nov 5, 2019, 3:16:00 PM
                Author     : NhanNT
            */
            *{
                font-family:  Candara;
            }
            .login-block{
                background: #DE6262;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to bottom, #FFB88C, #DE6262);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to bottom, #FFB88C, #DE6262); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                float:left;
                width:100%;
                padding : 50px 0;
            }
            .banner-sec{background:url(https://static.pexels.com/photos/33972/pexels-photo.jpg)  no-repeat left bottom; background-size:cover; min-height:500px; border-radius: 0 10px 10px 0; padding:0;}
            .container{background:#fff; border-radius: 10px; box-shadow:15px 20px 0px rgba(0,0,0,0.1);}
            .carousel-inner{border-radius:0 10px 10px 0;}
            .carousel-caption{text-align:left; left:5%;}
            .login-sec{padding: 50px 30px; position:relative;}
            .login-sec .copy-text{position:absolute; width:80%; bottom:20px; font-size:13px; text-align:center;}
            .login-sec .copy-text i{color:#FEB58A;}
            .login-sec .copy-text a{color:#E36262;}
            .login-sec h2{margin-bottom:30px; font-weight:800; font-size:30px; color: #DE6262;}
            .login-sec h2:after{content:" "; width:100px; height:5px; background:#FEB58A; display:block; margin-top:20px; border-radius:3px; margin-left:auto;margin-right:auto}
            .btn-login{background: #DE6262; color:#fff; font-weight:600;}
            .banner-text{width:70%; position:absolute; bottom:40px; padding-left:20px;}
            .banner-text h2{color:#fff; font-weight:600;}
            .banner-text h2:after{content:" "; width:100px; height:5px; background:#FFF; display:block; margin-top:20px; border-radius:3px;}
            .banner-text p{color:#fff;}

        </style>
    </head>
    <body>
        <section class="login-block">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 login-sec">
                        <h2 class="text-center">Login Now</h2>
                        <form class="login-form" action="login-process.jsp" method="post">
                            <div class="form-group">
                                <label for="exampleInputEmail1" class="text-uppercase">Username</label>
                                <input type="text" class="form-control" placeholder="" name="txtUsername">

                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1" class="text-uppercase">Password</label>
                                <input type="password" class="form-control" placeholder="" name="txtPassword">
                            </div>

                            <p style="color: #f00;"><%=warning%>  </p>
                            <div class="form-check">
                                <button type="submit" class="btn btn-login float-right">Submit</button>
                            </div>

                        </form>
                        <div class="copy-text">Created with <i class="fa fa-heart"></i> by <a href="http://grafreez.com">Grafreez.com</a></div>
                    </div>
                    <div class="col-md-8 banner-sec">
                        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                            
                            <div class="carousel-inner" role="listbox">
                                <div class="carousel-item active">
                                    <img class="d-block img-fluid" src="https://static.pexels.com/photos/33972/pexels-photo.jpg" alt="First slide">
                                    <div class="carousel-caption d-none d-md-block">
                                        
                                    </div>
                                </div>
                                
                            </div>	   

                        </div>
                    </div>
                </div>
        </section>
    </body>
</html>
