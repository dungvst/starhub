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
					<a href="${headerSection.mobileLink}" title="Mobile">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-mobile.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">Mobile</h4>
						</div>
					</a>
				</li>
				<li class="item-2  item-content">
					<a href="${headerSection.broadbandLink}" title="Broadband">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-broadband.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">Broadband</h4>
						</div>
					</a>
				</li>
				<li class="item-3 item-content">
					<a href="${headerSection.tvLink}" title="TV">
						<div class="tab-img-bg" style="background-image: url('static/img/icon-store-tv.png');"></div>
						<div class="tab-copy">
	                              Shop for 
							<h4 class="text-green">TV</h4>
						</div>
					</a>
				</li>
				<li class="item-4 item-content">
					<a href="${headerSection.homehubLink}" title="Homehub">
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

<div class = "mainBanner" style="background-image: url('${banner.imagePath}');">
	<div class="container">
		<div class="row">
	        <div class="col-md-12 bannerTitle">
                  <span>${banner.title}</span>
            </div>
              <div class="col-md-12">
                  <div id="bannerDes">
                      <p>${banner.description}&nbsp;</p>
                  </div>
                  <div id="bannerCta">
                      <a href="${banner.ctaLink}" class="btn btn-sec btn-dark-grey text-dark-grey">${banner.ctaText}   
                      	<img class="btn-arrow-black" src="static/img/btn-black-arrow.png">
                      </a>
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
			                <img src="static/img/tileImage.png" alt="iPhone 7 Plus">
			            </a>
					</div>
					<div class="col-md-6" id="tile-left-desc">
						<div class="inner">
							<div class="inner-info">
								<div class="info-basic">
									<div class="product-name">
										<span class="model-name">${tilesLeft.title}</span>
										<div class="model-desc">${tilesLeft.subtitle}</div>
									</div>
								</div>
								<div class="info-focus">
									<div class="info-focus-inner">
										<div class="product-price">
											<span class="price">${tilesLeft.subtitle2}</span>
										</div>
										<div class="notes">on 
											<span class="blue product-highlight">${tilesLeft.subtitle3}</span>
										</div>
									</div>
									<div id="left-desc">
										<p>${tilesLeft.description}</p>
									</div>
								</div>
							</div>
							
							<a href="${tilesLeft.cta}" class="btn btn-success">
								Buy Now >
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4 ">
				<div class="col-md-12 tileRight">
					<div id="tile-right-img">
						<a href="#" class="link-wrap">
							<img src="static/img/sim.png">
						</a>
					</div>
					<div id="tile-right-desc">
						<div class="product-name">
							<span class="model-name">${tilesRight.title}</span>
							<div class="model-desc">${tilesRight.subtitle}</div>
						</div>
						<a href="${tilesRight.cta}" class="btn btn-success">
							Buy Now >
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


