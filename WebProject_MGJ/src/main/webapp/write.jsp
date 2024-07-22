<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="format-detection" content="telephone=no">
<meta name="description" content="다양한 맛과 행복으로 모두 하나되는 세상" />
<!-- <meta name="viewport" content="width=1004" />  -->

<title>빙그레반응형</title>

<!-- 파비콘 -->
<link rel="icon" href="./images/common/favicon.ico" />
<link rel="apple-touch-icon-precomposed"
	href="./images/common/favicon.ico" />

<meta property="og:title" content="빙그레" />
<meta property="og:description" content="다양한 맛과 행복으로 모두 하나되는 세상." />
<meta property="og:image"
	content="http://alsrudwns.dothome.co.kr/test/images/og_img_binggrae.jpg" />
<meta property="og:url" content="http://alsrudwns.dothome.co.kr/test/">

<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">
<!-- 셀프클로징규칙: <link />(xhtml 1.0) -> <link>(html5)
  html5에선 둘 다 가능하고 호환성때문에 전자를 사용하는 경우가 있음(리액트) -->

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">

<!-- 라이브러리는 먼저 연결함 -->
<link rel="stylesheet" href="css/jquery-ui.min.css">
<link rel="stylesheet" href="css/swiper-bundle.min.css">
<link rel="stylesheet" href="css/aos.css">
<link rel="stylesheet" href="css/common.css?v=<?php echo time(); ?>">
<link rel="stylesheet" href="css/main.css?v=<?php echo time(); ?>">
<link rel="stylesheet" href="css/sub.css">

<script src="js/jquery-3.7.1.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/swiper-bundle.min.js"></script>
<script src="js/aos.js"></script>
<script src="js/ui-common.js"></script>

<style></style>
</head>

<body>
	<div id="skip_navi">
		<a href="#container">본문바로가기</a>
	</div>
	<div id="wrap">
		<header id="header" class="header">
			<div class="header_top">
				<ul class="flex_center">
					<li><a href="#" target="_blank" class="flex_item1"> <span>구매포털시스템</span>
							<img src="./images/header/link_arrow.png" alt="구매">
					</a></li>
					<li><a href="#" target="_blank" class="flex_item2"> <span>인재채용</span>
							<img src="./images/header/link_arrow.png" alt="구매">
					</a></li>
				</ul>
			</div>
			<div class="header_main">
				<h2 class="main_logo">
					<a href="index.jsp"> <img src="./images/header/logo-pc.png"
						alt="logo" class="pc_logo"> <img
						src="./images/header/m_logo.png" alt="m_logo" class="m_logo">
					</a>
				</h2>
				<div class="main_gnb">
					<div class="hover_box"></div>
					<nav class="gnb_wrap">
						<ul class="gnb">
							<li><a href="#">회사소개</a>
								<ul class="depth2">
									<li><a href="release-list.jsp">CEO인사말</a></li>
									<li><a href="#">경영이념</a></li>
									<li><a href="#">사업분야</a></li>
									<li><a href="#">히스토리</a></li>
								</ul></li>
							<li><a href="#">제품소개</a>
								<ul class="depth2">
									<li><a href="#">아이스크림</a></li>
									<li><a href="#">우유/치즈</a></li>
									<li><a href="#">발효유</a></li>
									<li><a href="#">커피</a></li>
									<li><a href="#">주스</a></li>
									<li><a href="#">음료</a></li>
									<li><a href="#">스낵/디저트</a></li>
									<li><a href="#">건강지향</a></li>
									<li><a href="#">수출제품</a></li>
								</ul></li>
							<li><a href="#">지속가능경영</a>
								<ul class="depth2">
									<li><a href="#">지속가능경영체계</a></li>
									<li><a href="#">Eco-Friendly</a></li>
									<li><a href="#">Shared Value</a></li>
									<li><a href="#">Global Integrity</a></li>
									<li><a href="#">윤리준법경영</a></li>
									<li><a href="#">사회공헌</a></li>
									<li><a href="#">보고서 및 정책</a></li>
								</ul></li>
							<li><a href="#">투자정보</a>
								<ul class="depth2">
									<li><a href="#">재무정보</a></li>
									<li><a href="#">주식정보</a></li>
									<li><a href="#">전자정보</a></li>
									<li><a href="#">공식정보</a></li>
									<li><a href="#">IR자료실</a></li>
								</ul></li>
							<li><a href="#">뉴스룸</a>
								<ul class="depth2">
									<li><a href="#">새소식</a></li>
									<li><a href="release-list.jsp">보도자료</a></li>
									<li><a href="#">빙그레스토리</a></li>
									<li><a href="#">미디어<br>라이브러리
									</a></li>
								</ul></li>
							<li><a href="#">고객센터</a>
								<ul class="depth2">
									<li><a href="#">고객상담</a></li>
									<li><a href="#">제품공급문의</a></li>
									<li><a href="#">사이버 신고센터</a></li>
									<li><a href="#">안전신문고</a></li>
									<li><a href="#">개인정보처리방침</a></li>
								</ul></li>
						</ul>
					</nav>
				</div>
				<div class="main_etc">
					<div class="lang_wrap">
						<p class="lang">
							<span class="lang_lang">KR</span> <span class="lang_btn"><img
								src="./images/header/lang_btn.png" alt="lang"></span>
						</p>
					</div>
					<div class="hamberger">
						<a href="#"> <span></span> <span></span> <span></span>
						</a>
					</div>
					<ul class="lang_menu">
						<li><a href="#">KR</a></li>
						<li><a href="#">EN</a></li>
					</ul>
				</div>
			</div>
		</header>

		<nav class="hamberger_menu">
			<div class="ham_bg"></div>
			<div class="hm_container">
				<div class="hm_menu1">
					<ul class="moblie_menu">
						<li><a href="#" target="_blank" class="m_flex_item1"> <span>구매포털시스템</span>
								<img src="./images/header/link_arrow.png" alt="모바일메뉴">
						</a></li>
						<li><a href="#" target="_blank" class="m_flex_item2"> <span>인재채용</span>
								<img src="./images/header/link_arrow.png" alt="모바일메뉴2">
						</a></li>
					</ul>
					<button class="hm_close">
						<img src="./images/header/ham_close.png" alt="엑스">
					</button>
				</div>
				<div class="hm_menu2">
					<ul class="depth01">
						<li class="flex1"><a href="#" class="flex_center"> <span
								class="font_bingbold">회사소개</span> <img
								src="./images/header/m_ham_menu_btn.png" alt="binggrae"
								class="m_menu_btn">
						</a>
							<ul class="depth02">
								<li><a href="release-list.jsp">CEO인사말</a> <span
									class="m_circle"></span></li>
								<li><a href="#">경영이념</a> <span class="m_circle"></span></li>
								<li><a href="#">사업분야</a> <span class="m_circle"></span></li>
								<li><a href="#">히스토리</a> <span class="m_circle"></span></li>
							</ul></li>
						<li class="flex2"><a href="#" class="flex_center"> <span
								class="font_bingbold">제품소개</span> <img
								src="./images/header/m_ham_menu_btn.png" alt="binggrae"
								class="m_menu_btn">
						</a>
							<ul class="depth02">
								<li><a href="#">전체보기</a> <span class="m_circle"></span></li>
								<li><a href="#">아이스크림</a> <span class="m_circle"></span></li>
								<li><a href="#">우유/치즈</a> <span class="m_circle"></span></li>
								<li><a href="#">발효유</a> <span class="m_circle"></span></li>
								<li><a href="#">커피</a> <span class="m_circle"></span></li>
								<li><a href="#">주스</a> <span class="m_circle"></span></li>
								<li><a href="#">음료</a> <span class="m_circle"></span></li>
								<li><a href="#">스낵/디저트</a> <span class="m_circle"></span></li>
								<li><a href="#">건강지향</a> <span class="m_circle"></span></li>
								<li><a href="#">수출제품</a> <span class="m_circle"></span></li>
							</ul></li>
						<li class="flex3"><a href="#" class="flex_center"> <span
								class="font_bingbold">지속가능경영</span> <img
								src="./images/header/m_ham_menu_btn.png" alt="binggrae"
								class="m_menu_btn">
						</a>
							<ul class="depth02">
								<li><a href="#">지속가능경영체계</a> <span class="m_circle"></span>
								</li>
								<li><a href="#">Eco-Friendly</a> <span class="m_circle"></span>
								</li>
								<li><a href="#">Shared Value</a> <span class="m_circle"></span>
								</li>
								<li><a href="#">Global Integrity</a> <span class="m_circle"></span>
								</li>
								<li><a href="#">윤리준법경영</a> <span class="m_circle"></span></li>
								<li><a href="#">사회공헌</a> <span class="m_circle"></span></li>
								<li><a href="#">보고서 및 정책</a> <span class="m_circle"></span>
								</li>
							</ul></li>
						<li class="flex4"><a href="#" class="flex_center"> <span
								class="font_bingbold">투자정보</span> <img
								src="./images/header/m_ham_menu_btn.png" alt="binggrae"
								class="m_menu_btn">
						</a>
							<ul class="depth02">
								<li><a href="#">재무정보</a> <span class="m_circle"></span></li>
								<li><a href="#">주식정보</a> <span class="m_circle"></span></li>
								<li><a href="#">전자공고</a> <span class="m_circle"></span></li>
								<li><a href="#">공시정보</a> <span class="m_circle"></span></li>
								<li><a href="#">IR자료실</a> <span class="m_circle"></span></li>
							</ul></li>
						<li class="flex5"><a href="#" class="flex_center"> <span
								class="font_bingbold">뉴스룸</span> <img
								src="./images/header/m_ham_menu_btn.png" alt="binggrae"
								class="m_menu_btn">
						</a>
							<ul class="depth02">
								<li><a href="#">전체보기</a> <span class="m_circle"></span></li>
								<li><a href="#">새소식</a> <span class="m_circle"></span></li>
								<li><a href="release-list.jsp">보도자료</a> <span
									class="m_circle"></span></li>
								<li><a href="#">빙그레 스토리</a> <span class="m_circle"></span>
								</li>
								<li><a href="#">미디어 라이브러리</a> <span class="m_circle"></span>
								</li>
							</ul></li>
						<li class="flex6"><a href="#" class="flex_center"> <span
								class="font_bingbold">고객센터</span> <img
								src="./images/header/m_ham_menu_btn.png" alt="binggrae"
								class="m_menu_btn">
						</a>
							<ul class="depth02">
								<li><a href="#">고객상담</a> <span class="m_circle"></span>
									<ul class="FAQ">
										<li><a href="#">FAQ</a></li>
										<li><a href="#">1:1 문의하기</a></li>
									</ul></li>
								<li><a href="#">제품공급문의</a> <span class="m_circle"></span></li>
								<li><a href="#">사이버 신고센터</a> <span class="m_circle"></span>
								</li>
								<li><a href="#">안전신문고</a> <span class="m_circle"></span></li>
								<li><a href="#">개인정보처리방침</a> <span class="m_circle"></span>
								</li>
							</ul></li>
					</ul>
				</div>
				<div class="hm_menu3">
					<ul class="m_lang">
						<li class="lang_kr"><a href="#">KR</a></li>
						<li class="lang_en"><a href="#">EN</a></li>
					</ul>
					<a href="#">오시는길</a>
				</div>
			</div>
		</nav>

		<aside>
			<div class="sidemenu_wrap">
				<div class="help_btn">
					<img src="images/footer/help_character.png" alt="help_character">
					<p class="help_message">무엇을 도와드릴까요?</p>
				</div>
				<div class="login_btn_wrap">
					<a href="login.do" class="login_btn">로그인</a>
				</div>
				<div class="shop_btn_wrap">
					<a href="#" target="_blank" class="shop_btn">SHOP</a>
				</div>
				<div class="down_top_btn">
					<button class="down_btn">
						<img src="images/footer/top_arrow.png" alt="top_arrow">
					</button>
					<button class="top_btn">
						<img src="images/footer/top_arrow.png" alt="top_arrow">
					</button>
				</div>
			</div>
		</aside>

		<main id="container" class="release sub_container">
			<div class="sub_top">
				<h2>자유게시판</h2>
			</div>

			<div class="contents">
				<div class="inner">
					<div class="board_view">
						<form action="./write.do" method="post">
							<div>
								<label>제목: <input class="write_tit" type="text" name="title" required></label>
							</div>
							<div>
								<label>내용: <textarea class="write_content" name="content" required></textarea></label>
							</div>
							<div class="login_btn_wrap">
								<input class="login_btn" type="submit" value="작성">
							</div>
						</form>
					</div>
				</div>
				<div class="btn_wrap">
					<a class="point_btn3" href="./release-list.do">목록</a>
				</div>
			</div>
		</main>

		<footer id="footer">
			<div class="footer_top">
				<div class="footer_logo">
					<img src="images/footer/f_logo.png" alt="f_logo">
				</div>
				<ul class="footer_top_right">
					<li><a href="#">개인정보처리방침</a></li>
					<li><a href="#">오시는길</a></li>
				</ul>
			</div>
			<div class="footer_main">
				<div class="footer_main_wrap">
					<ul>
						<li><span class="company_name">회사명 : </span> <span
							class="company_name2">빙그레</span></li>
						<li><span class="footer_address">경기도 남양주시 다산동 4344-3 /
								경기도 남양주시 다산순환로 45(다산동)</span></li>
					</ul>
				</div>
			</div>
			<div class="footer_bottom">
				<p class="copyright">ⓒ Binggrae all rights reserved.</p>
				<div class="sns_wrap">
					<div class="footer_sns">
						<ul>
							<li><a href="#" target="_blank"> <img
									src="/images/footer/blog.png" alt="blog"></a></li>
							<li><a href="#" target="_blank"> <img
									src="/images/footer/instar.png" alt="instar"></a></li>
							<li><a href="#" target="_blank"> <img
									src="images/footer/youtube.png" alt="youtube"></a></li>
							<li><a href="#" target="_blank"> <img
									src="images/footer/ttt.png" alt="ttt"></a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="footer_m_bottom">
				<ul>
					<li><a href="#">고객센터</a></li>
					<li><a href="#">1:1이메일문의</a></li>
				</ul>
				<p class="m_copyright">ⓒ Binggrae all rights reserved.</p>
			</div>
		</footer>
	</div>
</body>
</html>