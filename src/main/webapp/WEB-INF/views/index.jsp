<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>

	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/style.css">

	
</head>
<body>

	<div class="header">
		<div class="row" style="background: #ececec;">

			<div class="container" style="max-width: 1000px !important;">
				<div class="list" style="margin-left: 220px;">
					<ul style="list-style: none; margin-top: -10px;">
						<li style="float: left;">
							<i class="fa fa-phone" aria-hidden="true"></i>
							<a href="#" title="">1900 54 54 81  | </a>
						</li>
						<li style="float: left; margin-left: 12px;">
							<a href="#" title="">vanphong@vnpost.vn</a>
						</li>
					</ul>
				</div>
				
			</div>
			<div class="dropdown" id="userDropdownMenu">
				<button class="btn btn-sm btn-primary dropdown-toggle" type="button" id="userDropdownMenuBtn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					<i class="fa fa-sign-in"></i> &nbsp; Đăng nhập
				</button>
				<div class="dropdown-menu" aria-labelledby="userDropdownMenuBtn" x-placement="bottom-start" style="position: absolute; transform: translate3d(0px, 30px, 0px); top: 0px; left: 0px; will-change: transform;">
					<a style="color: #0060aa; font-weight: bold; display: none" class="dropdown-item" href="/security/ssoVnpt" title="Đăng nhập bằng email nội bộ">Sử dụng Email nội bộ</a>
					<a style="font-size: 90%;" class="dropdown-item" href="#" data-toggle="modal" data-target="#loginModal" title="Đăng nhập bằng email cá nhân">Sử dụng Tên đăng nhập</a>
				</div>
			</div>
		</div>


		<!-- top bar -->

		<div class="row" style="background: #fff;"> <!-- top bar -->
			<div class="container">

				<nav class="navbar navbar-expand-lg bg-white">
					<a class="navbar-brand" href="#"><img src="/image/trangchu.png" alt=""></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-icon" style="background: #f6821f;"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin-left: 40%;">

						<ul class="navbar-nav mr-right">
							<li class="nav-item">
								<a class="nav-link" href="#">Giới thiệu</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Khóa học</a>
							</li>
							<li class="nav-item dropdown">
								<a class="nav-link" href="#">Cuộc thi</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Tài liệu</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Tin tức</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Hỗ trợ</a>
							</li>
						</ul>
					</nav>
				</div>
			</div>

		</div>
		<div class="slide-show">
			<div >
				<div id="demo" class="carousel slide" data-ride="carousel">

					<!-- Indicators -->

					<ul class="carousel-indicators">
						<li data-target="#demo" data-slide-to="0" class="active"></li>
						<li data-target="#demo" data-slide-to="1"></li>
						<li data-target="#demo" data-slide-to="2"></li>
					</ul>
					<!-- The slideshow -->
					<div class="carousel-inner" >
						<div class="carousel-item active" >
							<img class="img-responsive center-block" src="/New folder/image/ơ.jpg" alt="Los Angeles"  >
						</div>
						<div class="carousel-item">
							<img class="img-responsive center-block" src="/New folder/image/ơ.jpg" alt="Chicago"  >
						</div>
						<div class="carousel-item">
							<img class="img-responsive center-block" src="/New folder/image/t3.jpg" alt="New York" >
						</div>
					</div>

					<!-- Left and right controls -->
					<a class="carousel-control-prev" href="#demo" data-slide="prev">
						<span class="carousel-control-prev-icon"></span>
					</a>
					<a class="carousel-control-next" href="#demo" data-slide="next">
						<span class="carousel-control-next-icon"></span>
					</a>
				</div>
			</div>
		</div>

		<!--hien thi thong tin khoa hoc-->
		<div class="sanphams" style="background:#F3F3F3;">
			<div class="row">
				<div class="container text-center">
					<h2 class="text-center">KHÓA HỌC CỦA TÔI</h2>
				</div>
			</div>
			<div class="row">
				<div class="container">
					<nav class="navbar navbar-expand-sm  justify-content-center" style="background: #F3F3F3;">
						<ul class="navbar-nav">
							<li class="nav-item">
								<a class="nav-link" href="#">Đang học</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Khuyến nghị</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Kế hoạch</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Đã kết thúc</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">Tất cả</a>
							</li>
						</ul>
					</nav>
				</div>
			</div>
			<div class="row">
				<div class="container" style="background: #F3F3F3;">
					<div class="courses_search_container_home">
						<form id="courses_search_form" class="">
							<div class="courses_search_form d-flex flex-row align-items-center justify-content-start">
								<input style="width:100%" name="keyword" type="search" class="courses_search_input" placeholder="Từ khóa" value="">
								<button action="submit" class="courses_search_button  ml-auto"><i class="fa fa-search"></i> Tìm kiếm</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="container cards">
				<div class="row">
					<div class="col-sm-3">
						<div class="card">
							<div class="card-header"><img src="/New folder/image/ơ.jpg" alt=""></div>
							<div class="card-body">
								<h1 style="margin-top: 0px;"><a href="#">test dung thử chức năng hihi</a></h1>
								<div class="card-text">
									<div class="course_teacher">Nguyễn Anh Tuấn</div>
									<div class="course_text">
										<small class="text-info"><i class="fa fa-building-o"></i> Bưu điện việt nam</small>
									</div>
								</div>
							</div> 
							<div class="card-footer">
								<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
									<div class="course_info">
										<i class="fa fa-book" aria-hidden="true"></i>
										<span>2 chương mục</span>
									</div>
									<div class="course_info">
										<i class="fa fa-star" aria-hidden="true"></i>
										<span>4</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<div class="col-sm-3">
						<div class="card">
							<div class="card-header"><img src="/New folder/image/ơ.jpg" alt=""></div>
							<div class="card-body">
								<h1 style="margin-top: 0px;"><a href="#">test dung thử chức năng hihi</a></h1>
								<div class="card-text">
									<div class="course_teacher">Nguyễn Anh Tuấn</div>
									<div class="course_text">
										<small class="text-info"><i class="fa fa-building-o"></i> Bưu điện việt nam</small>
									</div>
								</div>
							</div> 
							<div class="card-footer">
								<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
									<div class="course_info">
										<i class="fa fa-book" aria-hidden="true"></i>
										<span>2 chương mục</span>
									</div>
									<div class="course_info">
										<i class="fa fa-star" aria-hidden="true"></i>
										<span>4</span>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-sm-3">
						<div class="card">
							<div class="card-header"><img src="/New folder/image/ơ.jpg" alt=""></div>
							<div class="card-body">
								<h1 style="margin-top: 0px;"><a href="#">test dung thử chức năng hihi</a></h1>
								<div class="card-text">
									<div class="course_teacher">Nguyễn Anh Tuấn</div>
									<div class="course_text">
										<small class="text-info"><i class="fa fa-building-o"></i> Bưu điện việt nam</small>
									</div>
								</div>
							</div> 
							<div class="card-footer">
								<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
									<div class="course_info">
										<i class="fa fa-book" aria-hidden="true"></i>
										<span>2 chương mục</span>
									</div>
									<div class="course_info">
										<i class="fa fa-star" aria-hidden="true"></i>
										<span>4</span>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-sm-3">
						<div class="card">
							<div class="card-header"><img src="/New folder/image/ơ.jpg" alt=""></div>
							<div class="card-body">
								<h1 style="margin-top: 0px;"><a href="#">test dung thử chức năng hihi</a></h1>
								<div class="card-text">
									<div class="course_teacher">Nguyễn Anh Tuấn</div>
									<div class="course_text">
										<small class="text-info"><i class="fa fa-building-o"></i> Bưu điện việt nam</small>
									</div>
								</div>
							</div> 
							<div class="card-footer">
								<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
									<div class="course_info">
										<i class="fa fa-book" aria-hidden="true"></i>
										<span>2 chương mục</span>
									</div>
									<div class="course_info">
										<i class="fa fa-star" aria-hidden="true"></i>
										<span>4</span>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>

			<!--phan khoa hoc noi bat5-->

			<div class="bodys">
				
				<div class="container text-center">
					<h2 class="text-center">Cuộc thi nổi bật</h2>
				</div>
				<div class="container cards">
					<div class="row khoahoc" style="background: white !important;">
						<div class="col-sm-3">
							<div class="card">
								<div class="card-header"><img src="/New folder/image/ơ.jpg" alt=""></div>
								<div class="card-body">
									<h1 style="margin-top: 0px;"><a href="#">test dung thử chức năng hihi</a></h1>
									<div class="card-text">
										<div class="course_teacher">Nguyễn Anh Tuấn</div>
										<div class="course_text">
											<small class="text-info"><i class="fa fa-building-o"></i> Bưu điện việt nam</small>
										</div>
									</div>
								</div> 
								<div class="card-footer">
									<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
										<div class="course_info">
											<i class="fa fa-book" aria-hidden="true"></i>
											<span>2 chương mục</span>
										</div>
										<div class="course_info">
											<i class="fa fa-star" aria-hidden="true"></i>
											<span>4</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!--phan khoa hoc noi bat5-->

		</div>
		<div class="row-footer" style="background: #FCB71E; margin: 0px;">
			<div class="container">
				<nav class="navbar navbar-expand-lg navbar-dark" style="margin:24px 0;  background: #FCB71E;">

					<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navb">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navb">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item">

								<div class="a" style="display: block;">
									<p>Đăng ký để nhận được thông tin mới nhất</p>
								</div>
								<div class="b" style="display: block;">
									<p>Những tin tức mới nhất và ưu đãi tuyệt vời mà chúng tôi cung cấp</p>
								</div>
							</li>


						</ul>
						<form class="form-inline my-2 my-lg-0">
							<input class="form-control mr-sm-1" type="text" placeholder="nhập emial của bạn">
							<button class="btn bg-primary my-2 my-sm-0" type="button">Đăng ký</button>
						</form>
					</div>
				</nav>
			</div>
		</div>

		<!--fotter-->
		<div class="footer">
			<div>
				<footer class="footer">
					<div class="footer_background" style="background-image:url(/theme/unicat/images/footer_background.png)"></div>
					<div class="container">
						<div class="row footer_row">
							<div class="col">
								<div class="footer_content">
									<div class="row" style="background: blue;">

										<div class="col-lg-4 footer_col">
											<!-- Footer About -->
											<div class="footer_section footer_about">
												<div class="footer_logo_container">
													<a href="/">
														<div class="footer_logo_text"><small>VNPOST <span>E-Learning</span></small></div>
													</a>
												</div>
												<div class="footer_about_text">
													<p>CHUYÊN BIỆT- KHÁC BIỆT - HIỆU QUẢ</p>
												</div>
												<a href="" class="d-block">
													<img src="/theme/vnptit/images/icon-download/Group%202.svg" alt="">
												</a>
												<a href="" class="mt-1 d-block">
													<img src="/theme/vnptit/images/icon-download/Group%2078.svg" alt="">
												</a>
											</div>

										</div>

										<div class="col-lg-4 footer_col">
											<!-- Footer Contact -->
											<div class="footer_section footer_contact">
												<div class="footer_title">Thông tin liên hệ</div>
												<div class="footer_contact_info">
													<ul>
														<li>Email: vanphong@vnpost.vn</li>
														<li>Phone: 1900 54 54 81 | </li>
														<li>Địa chỉ: Số 05 đường Phạm Hùng - Mỹ Đình 2 - Nam Từ Liêm - Hà Nội - Việt Nam</li>
													</ul>
												</div>
											</div>

										</div>

										<div class="col-lg-4 footer_col">

											<!-- Footer links -->
											<div class="footer_section footer_links">
												<div class="footer_title">Danh mục</div>
												<div class="footer_links_container">
													<ul>
														<li><a href="/">Trang chủ</a></li>
														<li><a href="/default/about">Giới thiệu</a></li>
														<li><a href="/default/contact">Liên hệ</a></li>
														<li><a href="/course/index">Khóa học</a></li>
														<li><a href="/news/index">Tin tức</a></li>
													</ul>
												</div>
											</div>

										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
					
				</footer>
			</div>
		</div>

	</body>
	</html>