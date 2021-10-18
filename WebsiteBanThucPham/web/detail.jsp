
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <title>JavaWeb</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="templates/details.css" />

  <body>
    <div class="main">
      <div class="product">
        <div class="product-img">
          <img src="images/${detail.image}" alt="" />
          <span class="tag">new</span>
        </div>
        <div class="product-listing">
          <div class="content">
            <h3 class="name">(Loại sản phẩm:) Trái cây</h3>
            <br />
            <h2 class="name">(Tên sản phẩm:) Cam</h2>
            <br />
            <h3 class="name">Tình trạng: còn hàng</h3>
            <p class="info">
              (Thông tin sản phẩm: ) Lorem ipsum dolor sit amet consectetur
              adipisicing elit.
            </p>
            <p class="price">20000 đ</p>
            <div class="btn-and-rating-box">
              <div class="rating">
                <img src="img/star.png" alt="" />
                <img src="img/star.png" alt="" />
                <img src="img/star.png" alt="" />
                <img src="img/star.png" alt="" />
                <img src="img/star-stroke.png" alt="" />
              </div>
              <button class="btn">Yêu thích</button>
              <button class="btn">Mua ngay</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
