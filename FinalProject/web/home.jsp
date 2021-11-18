<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html>

    <%@include file="common/head.jsp" %>

    <body>
        <!--begin of menu-->
        <%@include file="common/header.jsp" %>
        <section class="jumbotron">
            <div class="slideshow">
                <div class="slide-wrapper">
                    <div class="slide"><img
                            src="https://scontent.fsgn2-2.fna.fbcdn.net/v/t1.15752-9/p1080x2048/246453680_425861735800680_7732418682761041744_n.jpg?_nc_cat=103&ccb=1-5&_nc_sid=ae9488&_nc_ohc=_oZ6hiTbIcYAX_-JNXE&_nc_ht=scontent.fsgn2-2.fna&oh=1f67e96409c34c5d9fd0a6189334470a&oe=61986FBF"
                            width=100%>
                    </div>
                    <div class="slide"><img
                            src="https://scontent.fsgn2-6.fna.fbcdn.net/v/t1.15752-9/246835500_245408687559467_1114441656000584112_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=ae9488&_nc_ohc=oPokZAvlolQAX-iwBCk&_nc_ht=scontent.fsgn2-6.fna&oh=8a0a147f70ce1c3eedceba367a3570b8&oe=619752D7"
                            width=100%>
                    </div>
                    <div class="slide"><img
                            src="https://scontent.fsgn2-6.fna.fbcdn.net/v/t1.15752-9/246682941_261848942622108_2072794959335265524_n.jpg?_nc_cat=110&ccb=1-5&_nc_sid=ae9488&_nc_ohc=pvKXtz9nO1IAX86Gbb-&_nc_ht=scontent.fsgn2-6.fna&oh=5b2b2b613447c26c7eafa9eb26f0cf98&oe=61981119"
                            width=100%>
                    </div>
                    <div class="slide"><img
                            src="https://images-ext-2.discordapp.net/external/aLSQAkCpdLtTxBehieEmzLvie1ZQ3aAfcaaCvcTjesU/%3F_nc_cat%3D111%26ccb%3D1-5%26_nc_sid%3Dae9488%26_nc_ohc%3DYfItzlL8l9YAX-RfHHP%26_nc_ht%3Dscontent.fsgn2-6.fna%26oh%3D24f862b8294edf7172ee48dd087a0ddd%26oe%3D61ADDD5D/https/scontent.fsgn2-6.fna.fbcdn.net/v/t1.15752-9/247183993_601467981036666_5725549659488666589_n.jpg?width=883&height=585"
                            width=100%>
                    </div>
                </div>
            </div>
        </section>
        <!--end of menu-->
        <div class="container">
            <div class="row">
                <div class="col">
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="HomeControl">Trang chủ</a></li>
                            <li class="breadcrumb-item"><a href="CategoryDetail?categoryid=${tag}">${cname}</a></li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <div class="card bg-light mb-3">
                        <div class="card-header text-white text-uppercase"><i class="fa fa-list"></i> Danh mục</div>
                        <ul class="list-group category_block">
                            <c:forEach items="${listC}" var="c"> 
                                <li class="list-group-item text-white ${tag==c.categoryid ?"active bg-success":""}">
                                    <a href="CategoryDetail?categoryid=${c.categoryid}">${c.name}</a>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>

                <div class="col-sm-9">
                    <div class="row" id="content">
                        <c:forEach items="${listP}" var="p"> 
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top"
                                         src="images/${p.image}">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt">${p.name}</h4>
                                        <p class="card-text show_txt"><fmt:formatNumber value="${p.price}" type="currency"/></p>
                                        <div class="row">
                                            <div class="col">
                                                <a href="detail?productid=${p.productid}" class="btn detail btn-danger btn-block">Chi tiết</a>
                                            </div>
                                            <c:if test="${sessionScope.usersession==null}">
                                                <div class="col">
                                                    <a href="login.jsp" class="btn btn-success btn-block">Thêm vào giỏ hàng</a>
                                                </div>
                                            </c:if>
                                            <c:if test="${sessionScope.usersession!=null}">
                                                <div class="col">
                                                    <a href="addcart?id=${p.productid}" class="btn btn-success btn-block">Thêm vào giỏ hàng</a>
                                                </div>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
<!--        <div>
            <button onclick="LoadMore()"class="btn-success">Xem thêm các mặt hàng khác</button>
        </div>-->
<div class="d-flex justify-content-center">
<c:forEach begin="1" end="${endpage}" var="o">
    <a href="HomeControl?index=${o}" class="pl-20 pr-20 btn btn-light" >${o}</a> 
</c:forEach>
</div>
    </body>
    <button id="myBtn"><i class="fas fa-chevron-up"></i></button>
    <script>
        window.onscroll = function () {
            scrollFunction()
        };
        function scrollFunction() {

            if (document.body.scrollTop > 600 || document.documentElement.scrollTop > 600) {
                document.getElementById("myBtn").style.display = "block";
            } else {
                document.getElementById("myBtn").style.display = "none";
            }
        }

        document.getElementById('myBtn').addEventListener("click", function () {
            document.body.scrollTop = 0;
            document.documentElement.scrollTop = 0;
        });
    </script>
    <script src="templates/functionWeb.js"></script>
    <%@include file="common/footer.jsp" %>
</html>
