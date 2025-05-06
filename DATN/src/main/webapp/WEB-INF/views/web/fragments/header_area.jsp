<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<header class="header_area">
    <!--header top start-->
    <div class="header_top">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-4">
                    <div class="welcome_text">
                        <p>Welcome to <span>VMHshop</span> </p>
                    </div>
                </div>
                <div class="col-lg-8">
                    <div class="top_right text-right">
                        <ul>
                            <li class="top_links"><a href="#"><i class="zmdi zmdi-account"></i> My account <i class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_links">
                                    <li><a href="checkout.jsp">Checkout </a></li>
                                    <li><a href="my-account.jsp">My Account </a></li>
                                    <li><a href="cart.jsp">Shopping Cart</a></li>
                                    <li><a href="wishlist.jsp">Wishlist</a></li>
                                </ul>
                            </li>

                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--header top start-->
    <!--header center area start-->
    <div class="header_middle">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-3">
                    <div class="logo">
                        <a href="/index"><img src="template/web/img/logo/logo.png" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="header_middle_inner">
                        <div class="search-container">
                            <form action="#">
                                <div class="hover_category">
                                    <select class="select_option" name="select" id="categori">
                                        <option selected value="1">Tất cả loại giày</option>
                                        <option value="2">Nike</option>
                                        <option value="3">Thượn đỉnh</option>
                                        <option value="4">Butters & Eggs</option>
                                        <option value="5">Camera & Video </option>
                                        <option value="6">Mornitors</option>
                                        <option value="7">Tablets</option>
                                        <option value="8">Laptops</option>
                                        <option value="9">Handbags</option>
                                        <option value="10">Headphone & Speaker</option>
                                        <option value="11">Herbs & botanicals</option>
                                        <option value="12">Vegetables</option>
                                        <option value="13">Shop</option>
                                        <option value="14">Laptops & Desktops</option>
                                        <option value="15">Watchs</option>
                                        <option value="16">Electronic</option>
                                    </select>
                                </div>
                                <div class="search_box">
                                    <input placeholder="Search product..." type="text">
                                    <button type="submit"><i class="zmdi zmdi-search"></i></button>
                                </div>
                            </form>
                        </div>
                        <div class="mini_cart_wrapper">
                            <a href="javascript:void(0)"><i class="zmdi zmdi-shopping-basket"></i> <span>1items - $60.00</span> </a>
                            <!--mini cart-->
                            <div class="mini_cart">
                                <div class="cart_item">
                                    <div class="cart_img">
                                        <a href="#"><img src="template/web/img/s-product/product.jpg" alt=""></a>
                                    </div>
                                    <div class="cart_info">
                                        <a href="#">Condimentum Watches</a>

                                        <span class="quantity">Qty: 1</span>
                                        <span class="price_cart">$60.00</span>

                                    </div>
                                    <div class="cart_remove">
                                        <a href="#"><i class="ion-android-close"></i></a>
                                    </div>
                                </div>
                                <div class="mini_cart_table">
                                    <div class="cart_total">
                                        <span>Subtotal:</span>
                                        <span class="price">$60.00</span>
                                    </div>
                                </div>
                                <div class="mini_cart_footer">
                                    <div class="cart_button">
                                        <a href="/cart">View cart</a>
                                        <a href="/heckout">Checkout</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--mini cart end-->
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--header center area end-->

    <!--header middel start-->
    <div class="header_bottom sticky-header">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-12">
                    <div class="main_menu header_position">
                        <nav>
                            <ul>
                                <li><a  href="/index"><i class="zmdi zmdi-home"></i> Home </a></li>
                                <li><a href="shop.jsp"><i class="zmdi zmdi-shopping-basket"></i> Shop </a></li>
                                <li><a href="/contact"><i class="zmdi zmdi-account-box-mail"></i>  Contact Us</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--header middel end-->

</header>