<%@ page  pageEncoding="utf-8"%>

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