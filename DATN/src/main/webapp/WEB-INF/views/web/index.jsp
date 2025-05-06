<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!doctype html>
<html class="no-js">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>VMHShop - HomePage</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="template/web/img/favicon.ico">
    


    <!-- Plugins CSS -->
    <link rel="stylesheet" href="template/web/css/plugins.css">
    
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="template/web/css/style.css">

</head>

<body>

    <!--header area start-->
    <jsp:include page="fragments/header_area.jsp" />
    <!--header area end-->
    
    <!--Offcanvas menu area start-->
    <jsp:include page="fragments/menu.jsp"/>
    <!--Offcanvas menu area end-->
    

    <!--slider area start-->
    <section class="slider_section mt-20">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                   <div class="categories_menu">
                        <div class="categories_title">
                            <h2 class="categori_toggle">Categories</h2>
                        </div>
                        <div class="categories_menu_toggle">
                            <ul> 
                                <li class="menu_item_children categorie_list"><a href="#"><span><i class="zmdi zmdi-desktop-mac"></i></span> Electronic <i class="fa fa-angle-right"></i></a>
                                    <ul class="categories_mega_menu">
                                        <li class="menu_item_children"><a href="#">Wheel Bearings</a>
                                            <ul class="categorie_sub_menu">
                                                <li><a href="">Bower</a></li>
                                                <li><a href="">Flipbac</a></li>
                                                <li><a href="">Gary Fong</a></li>
                                                <li><a href="">GigaPan</a></li>
                                            </ul>
                                        </li>
                                        <li class="menu_item_children"><a href="#">Wheel Rim Screws</a>
                                            <ul class="categorie_sub_menu">
                                                <li><a href="">Accessories</a></li>
                                                <li><a href="">2-Stroke</a></li>
                                                <li><a href="">Handbag</a></li>
                                                <li><a href="">Clothing</a></li>
                                            </ul>
                                        </li>
                                        <li class="menu_item_children last_child"><a href="#">Wheel Simulators</a>
                                                <ul class="categorie_sub_menu">
                                                    <li><a href="">Bags & Cases</a></li>
                                                    <li><a href="">Binoculars & Scopes</a></li>
                                                    <li><a href="">Film Photography</a></li>
                                                    <li><a href="">Lighting & Studio</a></li>
                                                </ul>
                                        </li>

                                    </ul>
                                </li>
                                <li class="menu_item_children"><a href="#"><span><i class="zmdi zmdi-image"></i></span>  Fashion & Beauty <i class="fa fa-angle-right"></i></a>
                                    <ul class="categories_mega_menu column_3">
                                        <li class="menu_item_children"><a href="#">Chair</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Dining room</a></li>
                                                    <li><a href="">bedroom</a></li>
                                                    <li><a href=""> Home & Office</a></li>
                                                    <li><a href="">living room</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                        <li class="menu_item_children"><a href="#">Lighting</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Ceiling Lighting</a></li>
                                                    <li><a href="">Wall Lighting</a></li>
                                                    <li><a href="">Outdoor Lighting</a></li>
                                                    <li><a href="">Smart Lighting</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                        <li class="menu_item_children"><a href="#">Sofa</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Fabric Sofas</a></li>
                                                    <li><a href="">Leather Sofas</a></li>
                                                    <li><a href="">Corner Sofas</a></li>
                                                    <li><a href="">Sofa Beds</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li class="menu_item_children"><a href="#"><span><i class="zmdi zmdi-camera"></i></span> Camera & Photo <i class="fa fa-angle-right"></i></a>
                                    <ul class="categories_mega_menu column_2">
                                        <li class="menu_item_children"><a href="#">Brake Tools</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Driveshafts</a></li>
                                                    <li><a href="">Spools</a></li>
                                                    <li><a href="">Diesel </a></li>
                                                    <li><a href="">Gasoline</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                        <li class="menu_item_children"><a href="#">Emergency Brake</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Dolls for Girls</a></li>
                                                    <li><a href="">Girls' Learning Toys</a></li>
                                                    <li><a href="">Arts and Crafts for Girls</a></li>
                                                    <li><a href="">Video Games for Girls</a></li>
                                                </ul>
                                            </div>
                                        </li>

                                    </ul>
                                </li>
                                <li class="menu_item_children"><a href="#"><span><i class="zmdi zmdi-dribbble"></i></span> Sport & Outdoor <i class="fa fa-angle-right"></i></a>
                                    <ul class="categories_mega_menu column_2">
                                        <li class="menu_item_children"><a href="#">Check Trousers</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Building</a></li>
                                                    <li><a href="">Electronics</a></li>
                                                    <li><a href="">action figures </a></li>
                                                    <li><a href="">specialty & boutique toy</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                        <li class="menu_item_children"><a href="#">Calculators</a>
                                            <div class="categorie_sub_menu">
                                                <ul>
                                                    <li><a href="">Dolls for Girls</a></li>
                                                    <li><a href="">Girls' Learning Toys</a></li>
                                                    <li><a href="">Arts and Crafts for Girls</a></li>
                                                    <li><a href="">Video Games for Girls</a></li>
                                                </ul>
                                            </div>
                                        </li>

                                    </ul>
                                </li>
                                <li><a href="#"><span><i class="zmdi zmdi-tv"></i></span> TV & Audio</a></li>
                                <li><a href="#"><span><i class="zmdi zmdi-tv-list"></i></span> home funiture</a></li>
                                <li><a href="#"><span><i class="zmdi zmdi-cake"></i></span> toys for kids</a></li>
                                <li><a href="#"><span><i class="zmdi zmdi-memory"></i></span> Memory Cards</a></li>
                                <li><a href="#"><span><i class="zmdi zmdi-case-download"></i></span> Living Room</a></li>
                                <li class="hidden"><a href="shop-left-sidebar.html">New Sofas</a></li>
                                <li class="hidden"><a href="shop-left-sidebar.html">Sleight Sofas</a></li>
                                <li><a href="#" id="more-btn"><i class="fa fa-plus" aria-hidden="true"></i> More Categories</a></li>
                            </ul>
                        </div>
                    </div>
               </div>
                <div class="col-lg-9">
                    <!--shipping area start-->
                    <div class="shipping_area">
                        <div class="single_shipping">
                            <div class="shipping_icone">
                                <i class="zmdi zmdi-local-shipping zmdi-hc-fw"></i>
                            </div>
                            <div class="shipping_content">
                                <p>Free Shipping On Orders Over $99</p>
                            </div>
                        </div>
                        <div class="single_shipping">
                            <div class="shipping_icone">
                                <i class="zmdi zmdi-replay-5"></i>
                            </div>
                            <div class="shipping_content">
                                <p>30 – Day Returns Moneyback Guarantee</p>
                            </div>
                        </div>                
                        <div class="single_shipping last_child">
                            <div class="shipping_icone">
                                <i class="zmdi zmdi-phone-in-talk"></i>
                            </div>
                            <div class="shipping_content">
                                <p>24/7 Support Online Consultations</p>
                            </div>
                        </div>           
                    </div>
                    <!--shipping area end-->
                    <div class="slider_area owl-carousel">
                        <div class="single_slider" data-bgimg="/img/slider/slider1.jpg">
                            <div class="slider_content content_position_center">
                                <h1>New</h1>
                                <h2>Designer Funiture! </h2>
                                <span>elite collections! </span>
                                <a href="/shop">shop now</a>
                            </div>
                        </div>
                        <div class="single_slider d-flex align-items-center" data-bgimg="/img/slider/slider2.jpg">
                            <div class="slider_content content_position_left">
                                <h1>New</h1>
                                <h2>Designer Funiture! </h2>
                                <span>elite collections! </span>
                                <a href="/shop">shop now</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>   
        
    </section>

    <!--slider area end-->

    <!--category product area start-->
    <section class="category_product_area mt-30 mb-50">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="category_product_carousel category_column4 owl-carousel">
                        <div class="single_category_product">
                            <div class="category_product_thumb">
                                <a href="/shop"><img src="template/web/img/category/category1.jpg" alt=""></a>
                            </div>
                            <div class="category_product_name">
                                <h2><a href="/shop">television</a></h2>
                            </div>
                        </div>
                        <div class="single_category_product">
                            <div class="category_product_thumb">
                                <a href="/shop"><img src="template/web/img/category/category2.jpg" alt=""></a>
                            </div>
                            <div class="category_product_name">
                                <h2><a href="/shop">audio</a></h2>
                            </div>
                        </div>
                        <div class="single_category_product">
                            <div class="category_product_thumb">
                                <a href="/shop"><img src="template/web/img/category/category3.jpg" alt=""></a>
                            </div>
                            <div class="category_product_name">
                                <h2><a href="/shop">Camera</a></h2>
                            </div>
                        </div>
                        <div class="single_category_product">
                            <div class="category_product_thumb">
                                <a href="/shop"><img src="template/web/img/category/category4.jpg" alt=""></a>
                            </div>
                            <div class="category_product_name">
                                <h2><a href="/shop">lundry</a></h2>
                            </div>
                        </div>
                        <div class="single_category_product">
                            <div class="category_product_thumb">
                                <a href="/shop"><img src="template/web/img/category/category5.jpg" alt=""></a>
                            </div>
                            <div class="category_product_name">
                                <h2><a href="/shop">cooling</a></h2>
                            </div>
                        </div>
                        <div class="single_category_product">
                            <div class="category_product_thumb">
                                <a href="/shop"><img src="template/web/img/category/category2.jpg" alt=""></a>
                            </div>
                            <div class="category_product_name">
                                <h2><a href="/shop">audio</a></h2>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--category product area end-->
    
    <!--deals product section area start-->
    <section class="deals_product_section mb-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-9">
                    <div class="deals_product_container">
                        <div class="section_title">
                            <h2>Today's <span>Deals</span></h2>
                        </div>
                        <div class="deals_product_inner">
                            <div class="deals_tab_list">
                                <ul class="nav" role="tablist">
                                    <li>
                                        <a class="active" data-bs-toggle="tab" href="#Funiture" role="tab" aria-controls="Funiture" aria-selected="true"> 
                                            <i class="zmdi zmdi-boat"></i>
                                            <h3>Funiture</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#laptop" role="tab" aria-controls="laptop" aria-selected="false">
                                            <i class="zmdi zmdi-laptop-mac"></i>
                                            <h3>laptop</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#mobile" role="tab" aria-controls="mobile" aria-selected="false">
                                            <i class="zmdi zmdi-smartphone"></i>
                                            <h3>mobile</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#Fridge" role="tab" aria-controls="Fridge" aria-selected="false">
                                            <i class="zmdi zmdi-toys"></i>
                                            <h3>Fridge</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#Camera" role="tab" aria-controls="Camera" aria-selected="false">
                                            <i class="zmdi zmdi-camera"></i>
                                            <h3>Camera</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#tv" role="tab" aria-controls="tv" aria-selected="false">
                                            <i class="zmdi zmdi-tv"></i>
                                            <h3>tv</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#speaker" role="tab" aria-controls="speaker" aria-selected="false">
                                            <i class="zmdi zmdi-collection-speaker"></i>
                                            <h3>speaker</h3>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-bs-toggle="tab" href="#Toys" role="tab" aria-controls="Toys" aria-selected="false">
                                            <i class="zmdi zmdi-cutlery"></i>
                                            <h3>Toys</h3>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="deals_product_wrapper">
                                <div class="tab-content">
                                    <div class="tab-pane fade show active" id="Funiture" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product1.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product2.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade" id="laptop" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product3.jpg" alt=""></a>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product4.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div> 
                                    <div class="tab-pane fade" id="mobile" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product010.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product011.jpg" alt=""></a>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 
                                    </div> 
                                    <div class="tab-pane fade" id="Fridge" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product5.jpg" alt=""></a>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product6.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 
                                    </div>
                                    <div class="tab-pane fade" id="Camera" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product08.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product09.jpg" alt=""></a>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>                                 
                                    </div> 
                                    <div class="tab-pane fade" id="tv" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product012.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product012.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>         
                                    </div> 
                                    <div class="tab-pane fade" id="speaker" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product013.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product014.jpg" alt=""></a>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 
                                    </div> 
                                    <div class="tab-pane fade" id="Toys" role="tabpanel">
                                        <div class="deals_product_list">
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product7.jpg" alt=""></a>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Impulse Duffle</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="single_deals_product">
                                                <div class="product_thumb">
                                                    <a href="#"><img src="template/web/img/product/product8.jpg" alt=""></a>
                                                    <div class="label_product">
                                                        <span class="label_sale">sale</span>
                                                    </div>
                                                    <div class="quick_button">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                                    </div>
                                                    <div class="product_timing">
                                                        <div data-countdown="2030/12/15"></div>
                                                    </div>
                                                </div>
                                                <div class="product_content">
                                                    <div class="product_name">
                                                        <h3><a href="#">Driven Backpack	</a></h3>
                                                    </div>
                                                    <div class="product_rating">
                                                        <ul>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                                        </ul>
                                                    </div>
                                                     <div class="price_box">
                                                        <span class="current_price">$65.00</span>
                                                        <span class="old_price">$70.00</span>   
                                                    </div>
                                                    <div class="action_links">
                                                        <ul>
                                                           <li class="wishlist"><a href="/wishlist" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                                            <li class="add_to_cart"><a href="/cart" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>     
                                    </div>   
                                </div> 
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="small_product_area">
                        <div class="section_title">
                            <h2>BEST  <span>SELLERS</span></h2>
                        </div>
                        <div class="small_product_wrapper">
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product3.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Aliquam lobortis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product4.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Donec eu libero</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product5.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Auctor gravida enim</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product6.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Dignissim venenatis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product7.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Cras neque metus</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product8.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product3.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="template/web/img/s-product/product4.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="#"><img src="/img/s-product/product5.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="#">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="sidebar_banner_thumb mt-30">
                            <a href="/shop"><img src="/img/bg/banner1.jpg" alt=""></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--deals product section area end-->
    
    <!--new product area start-->
    <div class="new_product_area mb-50">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="section_title">
                        <h2>New   <span>Products</span></h2>
                    </div>
                </div>
            </div>
            <div class="new_product_wrapper">
                <div class="row">
                    <div class="col-lg-3 col-md-12">
                       <div class="single_product_left_sidebar">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product9.jpg" alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                           <li class="wishlist"><a href="wishlist.jsp" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                            <li class="add_to_cart"><a href="cart.jsp" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product10.jpg" alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Condimentum Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                           <li class="wishlist"><a href="wishlist.jsp" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                            <li class="add_to_cart"><a href="cart.jsp" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-12">
                        <div class="single_product product_center">
                            <div class="product_thumb">
                                <a href="product-details.jsp"><img src="/img/product/product11.jpg" alt=""></a>
                                <div class="quick_button">
                                    <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                </div>
                            </div>
                            <div class="product_content">
                                <div class="product_name">
                                    <h3><a href="product-details.jsp">Dignissim venenatis</a></h3>
                                </div>
                                <div class="product_rating">
                                    <ul>
                                        <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                    </ul>
                                </div>
                                 <div class="price_box">
                                    <span class="current_price">$65.00</span>
                                    <span class="old_price">$70.00</span>   
                                </div>
                                <div class="action_links">
                                    <ul>
                                       <li class="wishlist"><a href="wishlist.jsp" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                        <li class="add_to_cart"><a href="cart.jsp" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                        <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-12">
                       <div class="single_product_right_sidebar">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product12.jpg" alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Headphone ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                           <li class="wishlist"><a href="wishlist.jsp" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                            <li class="add_to_cart"><a href="cart.jsp" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product13.jpg" alt=""></a>
                                    <div class="quick_button">
                                        <a href="#" data-bs-toggle="modal" data-bs-target="#modal_box"  title="quick view"> <i class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Vulputate justo Camera</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                           <li class="wishlist"><a href="wishlist.jsp" title="Add to Wishlist"><i class="fa fa-heart-o" aria-hidden="true"></i></a></li>
                                            <li class="add_to_cart"><a href="cart.jsp" title="add to cart"><i class="zmdi zmdi-shopping-cart-plus"></i> add to cart</a></li>
                                            <li class="compare"><a href="#" title="compare"><i class="zmdi zmdi-swap"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--new product area end-->
    
    <!--banner area start-->
    <div class="banner_area banner_column2 mb-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="single_banner">
                        <div class="banner_thumb">
                            <a href="shop.jsp"><img src="/img/bg/banner2.jpg" alt=""></a>
                        </div>
                       
                    </div>
                </div> 
                <div class="col-lg-6 col-md-6">
                    <div class="single_banner">
                        <div class="banner_thumb">
                            <a href="shop.jsp"><img src="/img/bg/banner3.jpg" alt=""></a>
                        </div>
                       
                    </div>
                </div>         
            </div>
        </div>
    </div>
    
    <!--banner area start-->
    <div class="banner_area mb-50">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="single_banner">
                        <div class="banner_thumb">
                            <a href="shop.jsp"><img src="/img/bg/banner6.jpg" alt=""></a>
                        </div>
                       
                    </div>
                </div>         
            </div>
        </div>
    </div>
    <!--banner area end-->

    <!--custom product area start-->
    <section class="custom_product_area mb-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <div class="small_product_area">
                        <div class="section_title">
                            <h2>Featured  <span>Products</span></h2>
                        </div>
                        <div class="small_product_wrapper">
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product15.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product16.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Donec eu libero</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product17.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Auctor gravida enim</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product18.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim venenatis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product19.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Cras neque metus</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product20.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product21.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product22.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product23.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="small_product_area">
                        <div class="section_title">
                            <h2>Bestseller <span>Products</span></h2>
                        </div>
                        <div class="small_product_wrapper">
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product21.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Donec eu libero</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product22.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Donec eu libero</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product23.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Donec tempus</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product24.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim venenatis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product25.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Condimentum posuere</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product20.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim Camera</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product21.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim Camera</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product22.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim Camera</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product23.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim Camera</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="small_product_area">
                        <div class="section_title">
                            <h2>top rated <span>Products</span></h2>
                        </div>
                        <div class="small_product_wrapper">
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product25.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Convallis quam sit</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product24.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis est</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product23.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Dignissim venenatis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product22.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Aliquam lobortis</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product21.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Cras neque metus</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product20.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Condimentum posuere</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product21.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Condimentum posuere</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product22.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Condimentum posuere</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                            <div class="small_product_items">
                                <div class="product_thumb">
                                    <a href="product-details.jsp"><img src="/img/product/product23.jpg" alt=""></a>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3><a href="product-details.jsp">Condimentum posuere</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                            <li><a href="#"><i class="zmdi zmdi-star-outline"></i></a></li>
                                        </ul>
                                    </div>
                                     <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>   
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--custom product area end-->
    
    
    <!--brand newsletter area start-->
    <div class="brand_newsletter_area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="brand_container owl-carousel">
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand.png" alt=""></a>
                        </div>
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand1.png" alt=""></a>
                        </div>
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand2.png" alt=""></a>
                        </div>
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand3.png" alt=""></a>
                        </div>
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand4.png" alt=""></a>
                        </div>
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand5.png" alt=""></a>
                        </div>
                        <div class="single_brand">
                            <a href="#"><img src="/img/brand/brand1.png" alt=""></a>
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

    
    <!--footer area start-->
    <jsp:include page="fragments/footer.jsp"/>
    <!--footer area end-->
   
    <!-- modal area start-->
    <div class="modal fade" id="modal_box" tabindex="-1" role="dialog"  aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                <div class="modal_body">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-5 col-md-5 col-sm-12">
                                <div class="modal_tab">  
                                    <div class="tab-content product-details-large">
                                        <div class="tab-pane fade show active" id="tab1" role="tabpanel" >
                                            <div class="modal_tab_img">
                                                <a href="#"><img src="/img/product/product37.jpg" alt=""></a>
                                            </div>
                                        </div>
                                        <div class="tab-pane fade" id="tab2" role="tabpanel">
                                            <div class="modal_tab_img">
                                                <a href="#"><img src="/img/product/product24.jpg" alt=""></a>
                                            </div>
                                        </div>
                                        <div class="tab-pane fade" id="tab3" role="tabpanel">
                                            <div class="modal_tab_img">
                                                <a href="#"><img src="/img/product/product25.jpg" alt=""></a>
                                            </div>
                                        </div>
                                        <div class="tab-pane fade" id="tab4" role="tabpanel">
                                            <div class="modal_tab_img">
                                                <a href="#"><img src="/img/product/product22.jpg" alt=""></a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal_tab_button">    
                                        <ul class="nav product_navactive owl-carousel" role="tablist">
                                            <li >
                                                <a class="nav-link active" data-bs-toggle="tab" href="#tab1" role="tab" aria-controls="tab1" aria-selected="false"><img src="/img/product/productbig1.jpg" alt=""></a>
                                            </li>
                                            <li>
                                                 <a class="nav-link" data-bs-toggle="tab" href="#tab2" role="tab" aria-controls="tab2" aria-selected="false"><img src="/img/product/productbig2.jpg" alt=""></a>
                                            </li>
                                            <li>
                                               <a class="nav-link button_three" data-bs-toggle="tab" href="#tab3" role="tab" aria-controls="tab3" aria-selected="false"><img src="/img/product/productbig4.jpg" alt=""></a>
                                            </li>
                                            <li>
                                               <a class="nav-link" data-bs-toggle="tab" href="#tab4" role="tab" aria-controls="tab4" aria-selected="false"><img src="/img/product/productbig5.jpg" alt=""></a>
                                            </li>

                                        </ul>
                                    </div>    
                                </div>  
                            </div> 
                            <div class="col-lg-7 col-md-7 col-sm-12">
                                <div class="modal_right">
                                    <div class="modal_title mb-10">
                                        <h2>Handbag feugiat</h2> 
                                    </div>
                                    <div class="modal_price mb-10">
                                        <span class="new_price">$64.99</span>    
                                        <span class="old_price" >$78.99</span>    
                                    </div>
                                    <div class="modal_description mb-15">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia iste laborum ad impedit pariatur esse optio tempora sint ullam autem deleniti nam in quos qui nemo ipsum numquam, reiciendis maiores quidem aperiam, rerum vel recusandae </p>    
                                    </div> 
                                    <div class="variants_selects">
                                        <div class="variants_size">
                                           <h2>size</h2>
                                           <select class="select_option">
                                               <option selected value="1">s</option>
                                               <option value="1">m</option>
                                               <option value="1">l</option>
                                               <option value="1">xl</option>
                                               <option value="1">xxl</option>
                                           </select>
                                        </div>
                                        <div class="variants_color">
                                           <h2>color</h2>
                                           <select class="select_option">
                                               <option selected value="1">purple</option>
                                               <option value="1">violet</option>
                                               <option value="1">black</option>
                                               <option value="1">pink</option>
                                               <option value="1">orange</option>
                                           </select>
                                        </div>
                                        <div class="modal_add_to_cart">
                                            <form action="#">
                                                <input min="0" max="100" step="2" value="1" type="number">
                                                <button type="submit">add to cart</button>
                                            </form>
                                        </div>   
                                    </div>
                                    <div class="modal_social">
                                        <h2>Share this product</h2>
                                        <ul>
                                            <li class="facebook"><a href="#"><i class="fa fa-facebook"></i></a></li>
                                            <li class="twitter"><a href="#"><i class="fa fa-twitter"></i></a></li>
                                            <li class="pinterest"><a href="#"><i class="fa fa-pinterest"></i></a></li>
                                            <li class="google-plus"><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                            <li class="linkedin"><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                        </ul>    
                                    </div>      
                                </div>    
                            </div>    
                        </div>     
                    </div>
                </div>    
            </div>
        </div>
    </div>
    <!-- modal area end-->
    
    <!--news letter popup start-->
     <div class="newletter-popup">
        <div id="boxes" class="newletter-container">
            <div id="dialog" class="window">
                <div id="popup2">
                    <span class="b-close"><span>close</span></span>
                </div>
                <div class="box">
                    <div class="newletter-title">
                        <h2>Newsletter</h2>
                    </div>
                    <div class="box-content newleter-content">
                        <label class="newletter-label">Enter your email address to subscribe our notification of our new post &amp; features by email.</label>
                        <div id="frm_subscribe">
                            <form name="subscribe" id="subscribe_popup">
                                    <!-- <span class="required">*</span><span>Enter you email address here...</span>-->
                                    <input type="text" value="" name="subscribe_pemail" id="subscribe_pemail" placeholder="Enter you email address here...">
                                    <input type="hidden" value="" name="subscribe_pname" id="subscribe_pname">
                                    <div id="notification"></div>
                                    <a class="theme-btn-outlined" onclick="email_subscribepopup()"><span>Subscribe</span></a>
                            </form>
                            <div class="subscribe-bottom">
                                <input type="checkbox" id="newsletter_popup_dont_show_again">
                                <label for="newsletter_popup_dont_show_again">Don't show this popup again</label>
                            </div>
                        </div>
                        <!-- /#frm_subscribe -->
                    </div>
                    <!-- /.box-content -->
                </div>
            </div>

        </div>
        <!-- /.box -->
    </div>
 
    <!--news letter popup start-->


<!-- Plugins JS -->
<script src="template/web/js/plugins.js"></script>

<!-- Main JS -->
<script src="template/web/js/main.js"></script>



</body>

</html>