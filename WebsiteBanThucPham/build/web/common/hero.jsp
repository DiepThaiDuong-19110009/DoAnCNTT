<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section id="hero">
    <div class="search-box">
        <input class="search-txt" type="text" placeholder="Tìm kiếm trên Green Market..." name="search-mobile">
        <a href="#" class="search-btn">
            <i class="fas fa-search"></i>
        </a>
    </div>
    <div class="hero container">
        <!-- Start Sub_header -->
        <div class="sub_header">
            <ul class="category">
                <li>
                    <a href="">
                        Danh mục <i class="fas fa-angle-down"></i>
                    </a>
                    <ul class="sub_category">
                        <c:forEach items="${ListC}" var="c">
                            <li><a href="CategoryDetail?categoryId=${c.categoryId}">${c.name}</a></li>
                        </c:forEach>
                    </ul>
                </li>
            </ul>
            <div class="search">
                <form action="search" method="get">
                    <input type="text" placeholder="Tìm kiếm" name="search" value="${txtsearch}">
                    <input type="submit" value="Tìm kiếm" class="search-pc">
                </form>
            </div>
            <div class="icon">
                <ul>
                    <li>
                        <a href=""><i class="fas fa-shopping-cart"></i></a>
                    </li>
                    <li>
                        <a href=""><i class="fas fa-heart"></i></a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- End Sub_header -->
        <div>
            <h1 class="hero-title">Chào mừng bạn đến với <span>GREEN</span>MARKET</h1>
            <a href="product.html" type="button" class="btn_buynow">Mua ngay</a>
        </div>
    </div>
</section>