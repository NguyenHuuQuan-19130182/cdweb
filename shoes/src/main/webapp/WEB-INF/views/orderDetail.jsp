<%--
  Created by IntelliJ IDEA.
  User: tfska
  Date: 4/18/2023
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Shop Giày Thể Thao - Sneaker Nam, Nữ Replica </title>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
    <link rel="preload" as="style"
          href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;display=swap">
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;display=swap"
          media="all" onload="this.media='all'">
    <script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script>
    <script async="" src="//www.googletagmanager.com/gtm.js?id=GTM-WFWV3XZ"></script>
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
          integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
          crossorigin="anonymous"/>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet'
          type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;display=swap" media="all" onload="this.media='all'">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
          integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
          crossorigin="anonymous"/>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body id="content" >
<header>
    <div class="head">
        <div class="container">
            <h1>Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ</h1>
            <div class="texttop">
                <ul class="text">
                    <li><p>Free ship</p> <span>Toàn quốc</span></li>
                    <li><p>Check hàng</p> <span>Mới thanh toán</span></li>
                    <li><p>Bảo hành</p> <span>Trong 6 tháng</span></li>
                </ul>
                <ul class="top">
                    <li>
                        <a href="/wishlist" title="Danh sách yêu thích">
                            <div class="img">
                                <img src="/images/wish-list.png" alt="Cập nhật danh sách yêu thích" width="24"
                                     height="24">
                            </div>
                            <p>Wish List</p>
                        </a>
                    </li>

                </ul>
                <a href="/cart" id="cart">
                    <i><img src="/images/ico_cart.svg" alt="Thông tin đơn hàng" width="15" height="15"></i><span>( ${myCartNum} sản phẩm )</span>
                </a>
            </div>
            <div class="clear"></div>
            <div class="header">
                <div class="logo">
                    <a href="/" title="Trang chủ | Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ">
                        <img src="/images/logo.png" alt="Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ"
                             width="261"
                             height="50">
                    </a>
                </div>
                <div class="logomb">
                    <a href="/" title="Trang chủ | Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ">
                        <img src="/images/logomb.png" alt="Shop Giày Thể Thao - Sneaker Nam, Nữ Replica Đẹp Giá Rẻ"
                             width="47" height="36">
                    </a>
                </div>
                <div class="account">
                    <c:if test="${not empty sessionScope.user}">
                        <a href=""><p>Xin chào, ${sessionScope.user.username}!</p></a>
                        <a href="/logout">Đăng xuất</a>
                    </c:if>
                    <c:if test="${empty sessionScope.user}">
                        <a href="/login" title="Đăng ký &amp; tạo tài khoản">
                            <img src="images/user.svg" alt="Tài khoản thành viên" height="36" width="36"
                                 class="default"><span>Đăng ký / đăng nhập</span>
                            <p class="capdo"><i>Nhận ngay ưu đãi</i></p>
                        </a>
                    </c:if>
                </div>
                <div class="search">
                    <form action="/product/search" method="get" target="_top"><input type="text" name="key"
                                                                              placeholder="Nhập gợi ý từ khóa...">
                        <input type="submit" value="Tìm kiếm">
                        <ul class="search_result"></ul>
                    </form>
                </div>
                <a href="/cart" title="Giỏ hàng của bạn" class="cartmb"><span>0</span></a>
                <a class="togglemenu">Menu</a>
                <nav class="subnav">
                    <ul class="navigation">
                        <c:forEach var="categories" items="${menuItems}">
                            <c:if test="${categories.getParent_id() == 0}">
                                <li class="category" title="Shop giày thể thao Adidas nam nữ mới nhất 2022">
                                    <a href="/parent/${item.getId_category()}/products">${categories.getName()}</a>
                                </li>
                            </c:if>
                        </c:forEach>
                        <ul class="linknews">
                            <li><a href="/" title="Thông tin giới thiệu">Giới thiệu</a></li>
                            <li><a href="/" title="Chia sẻ kinh nghiệm hay về giày thể thao">
                                Chia sẻ kinh nghiệm hay <label>Mới</label></a>
                            </li>
                            <li><a href="/" title="Tin tức - tư vấn giày thể thao">Tin tức - tư
                                vấn </a></li>
                            <li><a href="/" title="Thông tin liên hệ">Liên hệ</a></li>
                        </ul>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="menufix no-scroll">
        <nav id="menu" class="menu">
            <div class="container">
                <ul>
                    <li><a href="/" title="Giới thiệu"><span class="brand"><img
                            src="/images/gioi-thieu.png" alt="Giới thiệu" width="33" height="24"></span>Trang chủ</a>
                    </li>
                    <c:forEach var="item" items="${menuItems}">
                        <c:if test="${item.getParent_id() == 0}">
                            <li>
                                <a href="/parent/${item.getId_category()}/products">
                                    <span class="brand">
                                        <img src="/images/${item.getImg()}" width="40"
                                             height="24"></span>${item.getName()}
                                </a>

                                <ul><c:forEach var="submenu" items="${menuItems}">
                                    <c:if test="${submenu.getParent_id() == item.getId_category()}">
                                        <li>
                                            <a href="/categories/${submenu.getId_category()}/products">${submenu.getName()}</a>
                                        </li>
                                    </c:if>
                                </c:forEach></ul>
                            </li>
                        </c:if>
                    </c:forEach>
                    <li>
                        <a href="/" title="Sale Off" class="sale"><span class="brand"><img
                                src="/images/sale-off.png" alt="Sale Off" width="40" height="24"></span>Sale Off</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</header>
<span id="element_slide"></span>

<div class="row d-flex justify-content-center">
    <div class="col-md-10 col-lg-8 col-xl-7">
        <div class="card card-stepper" style="border-radius: 16px;">
            <div class="card-header p-4">
                <div class="d-flex justify-content-between align-items-center">
                    <div>
                        <p class="text-muted mb-2"> ID đơn đặt hàng : <span class="fw-bold text-body"> 1222528743</span></p>
                        <p class="text-muted mb-0"> Diễn ra vào : <span class="fw-bold text-body"> 12,March 2019</span> </p>
                    </div>
                    <div>
                        <h6 class="mb-0"> <a href="#">Xem chi tiết</a> </h6>
                    </div>
                </div>
            </div>
            <div class="card-body p-4">
                <div class="d-flex flex-row mb-4 pb-2">
                    <div class="flex-fill">
                        <h5 class="bold">Headphones Bose 35 II</h5>
                        <p class="text-muted"> Qt: 1 item</p>
                        <h4 class="mb-3"> $ 299 <span class="small text-muted"> via (COD) </span></h4>
                        <p class="text-muted">Tracking Status on: <span class="text-body">11:30pm, Today</span></p>
                    </div>
                    <div>
                        <img class="align-self-center img-fluid" src="../../../resources/static/images/sp/adidas-adilette-22-slide-grey.jpg" width="250">
                    </div>
                </div>
                <ul id="progressbar-1" class="mx-0 mt-0 mb-5 px-0 pt-0 pb-4">
                    <li class="step0 active" id="step1"><span style="margin-left: 22px; margin-top: 12px;">ĐẶT</span>
                    </li>
                    <li class="step0 active text-center" id="step2"><span>VẬN CHUYỂN</span></li>
                    <li class="step0 text-muted text-end" id="step3"><span style="margin-right: 22px ;padding-left: 50px;;">ĐÃ GIAO HÀNG</span></li>

                </ul>
            </div>
            <div class="card-footer p-4">
                <div class="d-flex justify-content-between">
                    <h5 class="fw-normal mb-0 " ><a href="#!">ĐẶT</a></h5>
                    <div class="border-start h-100"></div>
                    <h5 class="fw-normal mb-0"><a href="#!">Hủy bỏ</a></h5>
                    <div class="border-start h-100"></div>
                    <h5 class="fw-normal mb-0"><a href="#!">Trả trước</a></h5>
                    <div class="border-start h-100"></div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="clear"></div>
<footer>
    <div class="container">
        <div class="col listkey"><p>Bạn nên xem thêm</p>
            <ul>
                <li>
                    <a href="#" title="Hướng dẫn chọn cỡ giày">Hướng dẫn chọn cỡ giày</a>
                </li>
                <li>
                    <a href="#" title="Chính sách đổi trả/ hoàn tiền">Chính sách đổi trả/ hoàn tiền</a>
                </li>
                <li>
                    <a href="#" title="Chính sách bảo mật thông tin">Chính sách bảo mật thông tin</a>
                </li>
                <li>
                    <a href="#" title="Chính sách bảo hành">Chính sách bảo hành</a></li>
                <li>
                    <a href="#" title="Hướng dẫn mua hàng">Hướng dẫn mua hàng</a>
                </li>
                <li>
                    <a href="#" title="Chính sách&nbsp;thanh toán">Chính sách vận chuyển &amp;&nbsp;thanh toán</a>
                </li>
            </ul>
        </div>
        <div class="col listkey small">
            <p>Thông tin khác</p>
            <ul>
                <li><a href="#" title="Giới thiệu">Giới thiệu</a></li>
                <li><a href="#" title="Liên hệ">Liên hệ</a></li>
            </ul>
            <div class="clear10"></div>
        </div>
        <div class="col phot">
            <b>Gọi mua hàng (08:30-21:30)</b>
            <p><img src="../../../resources/static/images/phone.svg" alt="Liên hệ đặt hàng" width="22" height="22">0344660857</p>
            <span>Tất cả các ngày trong tuần</span>
        </div>
        <div class="col large">
            <div class="fb-page fb_iframe_widget" data-small-header="false" data-adapt-container-width="true"
                 data-hide-cover="false"
                 data-show-facepile="true" data-width="500" height="400" fb-xfbml-state="rendered">
            </div>
        </div>
    </div>
</footer>
<div class="footer">
    <a class="btn-top" href="javascript:void(0);" title="Top" style="display: inline;">
        <i class="fa fa-arrow-up" aria-hidden="true"></i>
    </a>
</div>

<<script>
    $(document).ready(function($){
        if($(".btn-top").length > 0){
            $(window).scroll(function () {
                var e = $(window).scrollTop();
                if (e > 500) {
                    $(".btn-top").show()
                } else {
                    $(".btn-top").hide()
                }
            });
            $(".btn-top").click(function () {
                $('body,html').animate({scrollTop: 0},1000)
            })
        }
    });
</script>

<script>
    $(document).ready(function () {
        $('#toggle').click(function () {
            $('nav').slideToggle();
        });
    })
</script>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script
        src="https://code.jquery.com/jquery-3.6.3.js"
        integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
        crossorigin="anonymous">
</script>
<!-- Latest jQuery form server -->
<script src="https://code.jquery.com/jquery.min.js"></script>

<!-- Bootstrap JS form CDN -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!-- Slider -->
<script type="text/javascript" src="js/script.slider.js"></script>
<script src="js/test.js"></script>

</body>
</html>
