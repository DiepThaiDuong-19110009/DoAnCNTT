<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
    <%@include file="common/head.jsp" %>
    <body>
        <%@include file="common/header.jsp" %>
        <%@include file="common/hero.jsp" %>
        <section id="cards">
            <div class="cards container">
                <div class="card-top">
                    <h1 class="card-title">Sản phẩm nổi bật</h1>
                    <p>
                        Các sản phẩm được tìm kiếm nhiều nhất trong thời gian qua
                    </p>
                </div>
                <!-- Card -->
                <div class="card-bottom">
                    <c:forEach items="${listP}" var="o">
                        <div class="card-item">
                            <div class="card_image">
                                <a href="/detail"><img src="images/${o.image}" /></a>
                            </div>
                            <div class="card_content">
                                <h2 class="card_title">Tên sản phẩm</h2>
<!--                                <p class="card_text">Miêu tả ngắn sản phẩm, hoặc loại sản phẩm</p>-->
                                <p class="card_text">Giá: 20K</p>
                                <div class="btns">
                                    <button class="btn card_btn">
                                        <a href="ProductDetail?productId=${o.productId}">Chi tiết</a>
                                    </button>
                                    <button class="btn card_btn">
                                        <a href="Cart.jsp">Thêm vào giỏ hàng</a>
                                    </button>
                                </div>
                            </div>
                        </div>  
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="see_all">
    <a href="">Xem tất cả</a>
</div>
<%@include file="common/about.jsp" %>
<%@include file="common/contact.jsp" %>
<%@include file="common/footer.jsp" %>
<script src="templates/app.js"></script>
</body>
</html>
