<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<div class ="headerSection">
	<div class="container">
		<ul class="breadcrumb">	
			<li class="first"><span>You are in</span></li>
			<li><a href="#">Personal</a></li>
			<li><a href="#">Store</a></li>
			<li class="last"><span>Mobile</span></li>		
		</ul>
				 
		<div class="nav-tabs-track">
			<ul class="nav nav-tabs multi-tabs with-highlight " data-tab-active="6">
				<li class="item-1 active item-content">
					<a href="#" title="Mobile">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-mobile.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">Mobile</h4>
						</div>
					</a>
				</li>
				<li class="item-2  item-content">
					<a href="#" title="Broadband">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-broadband.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">Broadband</h4>
						</div>
					</a>
				</li>
				<li class="item-3 item-content">
					<a href="#" title="TV">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-tv.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">TV</h4>
						</div>
					</a>
				</li>
				<li class="item-4 item-content">
					<a href="#" title="Homehub">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-hubbing.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">Homehub</h4>
						</div>
					</a>
				</li>
			</ul>
		</div>
	</div>
</div>

<div class = "mainBanner">
	<div class="container">
		<div class="row">
	        <div class="col-md-12 bannerTitle">
                  <span>iPhone SE </span>
            </div>
              <div class="col-md-12">
                  <div id="bannerDes">
                      <p>Get it today at $0 with 4G 4 and above plans.&nbsp;</p>
                  </div>
                  <div id="bannerCta">
                      <a href="#" class="btn btn-sec btn-dark-grey text-dark-grey">Buy now   <img class="btn-arrow-black" src="static/img/btn-black-arrow.png"></a>
                  </div>
              </div> 
		</div>
	</div>
</div>
		
<div class = "tilesSection">
	<div class="container">
		<div class="row">
			<div class="col-md-8 ">
				<div class="col-md-12 tileLeft">
					<div class="col-md-6" id="tile-left-img">
			            <a href="#" class="link-wrap">
			                <img src="static/img/tileImage.png" alt="iPhone 7 Plus" onload="productImageLoaded()">
			            </a>
					</div>
					<div class="col-md-6" id="tile-left-desc">
						<div class="inner">
							<div class="inner-info">
								<div class="info-basic">
									<div class="product-name">
										<span class="model-name">iPhone 7 Plus</span>
										<div class="model-desc">128GB</div>
									</div>
								</div>
								<div class="info-focus">
									<div class="info-focus-inner">
										<div class="product-price">
											<small class="currency-symbol">$</small>
											<span class="price">560</span>
										</div>
										<div class="notes">on 
											<span class="blue product-highlight">4G 4</span>
										</div>
									</div>
									<div class="info-promo-box-container">
										<div class="product-promo-box">
											<h5>Get 128GB for the price of 32GB</h5>
											<p>Or, get a 256GB iPhone 7 for the price of 128GB</p>
											<p class="grid-footer">Select 128GB or 256GB on checkout to enjoy offer. Applicable with sign-up to a 2-year 4G 4 or above plan. Price featured is after discount.</p>
										</div>
									</div>
								</div>
							</div>
							<a href="#" class="btn-secondaryGreen-rarrow btn-view-details" title="Buy Now">Buy Now
								<span class="icon"></span>
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4 ">
				<div class="col-md-12 tileRight">
					<div id="tile-right-img">
						<a href="#" class="link-wrap">
							<img src="static/img/sim.png" alt="SIM Only Plans " onload="productImageLoaded()">
						</a>
					</div>
					<div id="tile-right-desc">
						<div class="inner">
							<div class="inner-info">
								<div class="info-basic">
									<div class="product-name">
										<span class="model-name">SIM Only Plans </span>
										<div class="model-desc">Get the no contract, hassle-free and best value SIM Only plans. </div>
									</div>
								</div>
								<div class="info-focus">
									<div class="info-focus-inner">
										<div class="product-price"></div>
										<div class="notes">
											<span class="blue product-highlight"></span>
										</div>
									</div>
								</div>
							</div>
							<a href="#" class="btn-secondaryGreen-rarrow btn-view-details" title="Buy Now">Buy Now
								<span class="icon"></span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


