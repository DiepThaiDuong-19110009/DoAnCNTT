
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section id="header">
    <div class="header container">
        <div class="nav-bar">
            <div class="brand">
                <a href="#hero">
                    <!-- <h1><span>Green</span>Market</h1> -->
                    <img class="logo" src="images/Logo.png">
                </a>
            </div>
            <div class="nav-list">
                <div class="hamburger">
                    <div class="bar"></div>
                </div>
                <ul>
                    <c:if test="${sessionScope.usersession.role==1}">
                        <li><a class="login" href="Manager" data-after="Manager">Quản lý</a></li>
                     </c:if> 
                    <li><a href="#" data-after="Home">Trang chủ</a></li>
                    <li><a href="#" data-after="Service">Giới thiệu</a></li>
                    <li><a href="product.html" data-after="Projects">Sản phẩm</a></li>
                    <li><a href="#" data-after="About">Liên hệ</a></li>
                        <c:if test="${sessionScope.usersession!=null}">
                        <li><a class="login" href="logout" data-after="Logout">Đăng xuất</a></li>
                        </c:if>
                        <c:if test="${sessionScope.usersession==null}">
                        <li><a class="login" href="login.jsp" data-after="Login">Đăng nhập</a></li>
                        </c:if>
                </ul>
            </div>
        </div>
    </div>
</section>
