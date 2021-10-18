
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="iamges/Logo.png" type="image/x-icon" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="templates/register.css">
        <title>Đăng ký - Green Market</title>
    </head>

    <body>
        <div id="background">
            <div class="register">
                <div class="logo-register">
                    <img src="Logo.png">
                </div>
                <div class="title-register">
                    <h2>Đăng ký với Green Market</h2>
                     <p>${message}</p>
                </div>
                <form action="SignUp" method="post">
                    <div class="input-user">
                        <input name="user" type="text" placeholder="Tên đăng nhập">
                    </div>
                    <div class="input-password">
                        <input name="pass" type="password" placeholder="Mật khẩu">
                    </div>
                    <div class="input-repeat-password">
                        <input name="repass" type="password" placeholder="Nhập lại mật khẩu">
                    </div>
                    <div class="btn-register">
                        <button type="submit">
                            Đăng ký
                        </button>
                    </div>
                    <a class="return" href="login.jsp" data-after="Register">Quay lại</a>
                    <div class="or">
                        Hoặc
                    </div>
                </form>
                <div class="other-register">
                    <ul>
                        <li>
                            <a href="#">
                                <i class="fab fa-facebook"></i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fab fa-twitter"></i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fab fa-google"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>

</html>