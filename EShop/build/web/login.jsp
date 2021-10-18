<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/Logo.png" type="image/x-icon" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="templates/login.css">
        <title>Đăng nhập - Green Market</title>
    </head>

    <body>
        <div id="background">
            <div class="login">
                <div class="logo-login">
                    <img src="Logo.png">
                </div>
                <div class="title-login">
                    <h2>Chào mừng đến với Green Market</h2>
                     <p>${message}</p>
                </div>
                <form action="login" method="post">
                    <div class="input-user">
                        <i class="fas fa-user"></i>
                        <input name ="user"type="text" placeholder="Tên đăng nhập">
                    </div>
                    <div class="input-password">
                        <i class="fas fa-key"></i>
                        <input name="password" type="password" placeholder="Mật khẩu">
                    </div>
                    <div class="btn-login">
                        <button type="submit">
                            Đăng nhập
                        </button>
                    </div>
                    <div class="link-register">
                        Bạn chưa có tài khoản?
                        <a href="register.jsp">Đăng ký</a>
                    </div>
                    <div class="or">
                        Hoặc
                    </div>
                </form>
                <div class="other-login">
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