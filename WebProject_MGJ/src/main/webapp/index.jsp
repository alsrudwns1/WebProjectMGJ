<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <link rel="apple-touch-icon-precomposed" href="./images/common/favicon.ico" />

  <meta property="og:title" content="빙그레" />
  <meta property="og:description" content="다양한 맛과 행복으로 모두 하나되는 세상." />
  <meta property="og:image" content="http://alsrudwns.dothome.co.kr/test/images/og_img_binggrae.jpg" />
  <meta property="og:url" content="http://alsrudwns.dothome.co.kr/test/">

  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
  <!-- 셀프클로징규칙: <link />(xhtml 1.0) -> <link>(html5)
  html5에선 둘 다 가능하고 호환성때문에 전자를 사용하는 경우가 있음(리액트) -->

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

  <!-- 라이브러리는 먼저 연결함 -->
  <link rel="stylesheet" href="css/jquery-ui.min.css">
  <link rel="stylesheet" href="css/swiper-bundle.min.css">
  <link rel ="stylesheet" href="css/aos.css">
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
          <li>
            <a href="#" target="_blank" class="flex_item1">
              <span>구매포털시스템</span>
              <img src="./images/header/link_arrow.png" alt="구매">
            </a>
          </li>
          <li>
            <a href="#" target="_blank" class="flex_item2">
              <span>인재채용</span>
              <img src="./images/header/link_arrow.png" alt="구매">
            </a>
          </li>
        </ul>
      </div>
      <div class="header_main">
        <h2 class="main_logo">
          <a href="index.jsp">
            <img src="./images/header/logo-pc.png" alt="logo" class="pc_logo">
            <img src="./images/header/m_logo.png" alt="m_logo" class="m_logo">
          </a>
        </h2>
        <div class="main_gnb">
          <div class="hover_box"></div>
          <nav class="gnb_wrap">
            <ul class="gnb">
              <li>
                <a href="#">회사소개</a>
                <ul class="depth2">
                  <li>
                    <a href="./release-list.do">CEO인사말</a>
                  </li>
                  <li>
                    <a href="#">경영이념</a>
                  </li>
                  <li>
                    <a href="#">사업분야</a>
                  </li>
                  <li>
                    <a href="#">히스토리</a>
                  </li>
                </ul>
              </li>
              <li>
                <a href="#">제품소개</a>
                <ul class="depth2">
                  <li>
                    <a href="#">아이스크림</a>
                  </li>
                  <li>
                    <a href="#">우유/치즈</a>
                  </li>
                  <li>
                    <a href="#">발효유</a>
                  </li>
                  <li>
                    <a href="#">커피</a>
                  </li>
                  <li>
                    <a href="#">주스</a>
                  </li>
                  <li>
                    <a href="#">음료</a>
                  </li>
                  <li>
                    <a href="#">스낵/디저트</a>
                  </li>
                  <li>
                    <a href="#">건강지향</a>
                  </li>
                  <li>
                    <a href="#">수출제품</a>
                  </li>
                </ul>
              </li>
              <li>
                <a href="#">지속가능경영</a>
                <ul class="depth2">
                  <li>
                    <a href="#">지속가능경영체계</a>
                  </li>
                  <li>
                    <a href="#">Eco-Friendly</a>
                  </li>
                  <li>
                    <a href="#">Shared Value</a>
                  </li>
                  <li>
                    <a href="#">Global Integrity</a>
                  </li>
                  <li>
                    <a href="#">윤리준법경영</a>
                  </li>
                  <li>
                    <a href="#">사회공헌</a>
                  </li>
                  <li>
                    <a href="#">보고서 및 정책</a>
                  </li>
                </ul>
              </li>
              <li>
                <a href="#">투자정보</a>
                <ul class="depth2">
                  <li>
                    <a href="#">재무정보</a>
                  </li>
                  <li>
                    <a href="#">주식정보</a>
                  </li>
                  <li>
                    <a href="#">전자정보</a>
                  </li>
                  <li>
                    <a href="#">공식정보</a>
                  </li>
                  <li>
                    <a href="#">IR자료실</a>
                  </li>
                </ul>
              </li>
              <li>
                <a href="#">뉴스룸</a>
                <ul class="depth2">
                  <li>
                    <a href="#">새소식</a>
                  </li>
                  <li>
                    <a href="release-list.jsp">보도자료</a>
                  </li>
                  <li>
                    <a href="#">빙그레스토리</a>
                  </li>
                  <li>
                    <a href="#">미디어<br>라이브러리</a>
                  </li>
                </ul>
              </li>
              <li>
                <a href="#">고객센터</a>
                <ul class="depth2">
                  <li>
                    <a href="#">고객상담</a>
                  </li>
                  <li>
                    <a href="#">제품공급문의</a>
                  </li>
                  <li>
                    <a href="#">사이버 신고센터</a>
                  </li>
                  <li>
                    <a href="#">안전신문고</a>
                  </li>
                  <li>
                    <a href="#">개인정보처리방침</a>
                  </li>
                </ul>
              </li>
            </ul>
          </nav>
        </div>
        <div class="main_etc">
          <div class="lang_wrap">
            <p class="lang">
              <span class="lang_lang">KR</span>
              <span class="lang_btn"><img src="./images/header/lang_btn.png" alt="lang"></span>
            </p>
          </div>
          <div class="hamberger">
            <a href="#">
              <span></span>
              <span></span>
              <span></span>
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
            <li>
              <a href="#" target="_blank" class="m_flex_item1">
                <span>구매포털시스템</span>
                <img src="./images/header/link_arrow.png" alt="모바일메뉴">
              </a>
            </li>
            <li>
              <a href="#" target="_blank" class="m_flex_item2">
                <span>인재채용</span>
                <img src="./images/header/link_arrow.png" alt="모바일메뉴2">
              </a>
            </li>
          </ul>
          <button class="hm_close">
            <img src="./images/header/ham_close.png" alt="엑스">
          </button>
        </div>
        <div class="hm_menu2">
          <ul class="depth01">
            <li class="flex1">
              <a href="#" class="flex_center">
                <span class="font_bingbold">회사소개</span>
                <img src="./images/header/m_ham_menu_btn.png" alt="binggrae" class="m_menu_btn">
              </a>
              <ul class="depth02">
                <li>
                  <a href="release-list.jsp">CEO인사말</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">경영이념</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">사업분야</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">히스토리</a>
                  <span class="m_circle"></span>
                </li>
              </ul>
            </li>
            <li class="flex2">
              <a href="#" class="flex_center">
                <span class="font_bingbold">제품소개</span>
                <img src="./images/header/m_ham_menu_btn.png" alt="binggrae" class="m_menu_btn">
              </a>
              <ul class="depth02">
                <li>
                  <a href="#">전체보기</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">아이스크림</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">우유/치즈</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">발효유</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">커피</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">주스</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">음료</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">스낵/디저트</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">건강지향</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">수출제품</a>
                  <span class="m_circle"></span>
                </li>
              </ul>
            </li>
            <li class="flex3">
              <a href="#" class="flex_center">
                <span class="font_bingbold">지속가능경영</span>
                <img src="./images/header/m_ham_menu_btn.png" alt="binggrae" class="m_menu_btn">
              </a>
              <ul class="depth02">
                <li>
                  <a href="#">지속가능경영체계</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">Eco-Friendly</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">Shared Value</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">Global Integrity</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">윤리준법경영</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">사회공헌</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">보고서 및 정책</a>
                  <span class="m_circle"></span>
                </li>
              </ul>
            </li>
            <li class="flex4">
              <a href="#" class="flex_center">
                <span class="font_bingbold">투자정보</span>
                <img src="./images/header/m_ham_menu_btn.png" alt="binggrae" class="m_menu_btn">
              </a>
              <ul class="depth02">
                <li>
                  <a href="#">재무정보</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">주식정보</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">전자공고</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">공시정보</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">IR자료실</a>
                  <span class="m_circle"></span>
                </li>
              </ul>
            </li>
            <li class="flex5">
              <a href="#" class="flex_center">
                <span class="font_bingbold">뉴스룸</span>
                <img src="./images/header/m_ham_menu_btn.png" alt="binggrae" class="m_menu_btn">
              </a>
              <ul class="depth02">
                <li>
                  <a href="#">전체보기</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">새소식</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="release-list.jsp">보도자료</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">빙그레 스토리</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">미디어 라이브러리</a>
                  <span class="m_circle"></span>
                </li>
              </ul>
            </li>
            <li class="flex6">
              <a href="#" class="flex_center">
                <span class="font_bingbold">고객센터</span>
                <img src="./images/header/m_ham_menu_btn.png" alt="binggrae" class="m_menu_btn">
              </a>
              <ul class="depth02">
                <li>
                  <a href="#">고객상담</a>
                  <span class="m_circle"></span>
                  <ul class="FAQ">
                    <li><a href="#">FAQ</a></li>
                    <li><a href="#">1:1 문의하기</a></li>
                  </ul>
                </li>
                <li>
                  <a href="#">제품공급문의</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">사이버 신고센터</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">안전신문고</a>
                  <span class="m_circle"></span>
                </li>
                <li>
                  <a href="#">개인정보처리방침</a>
                  <span class="m_circle"></span>
                </li>
              </ul>
            </li>
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
          <a href="./release-list.do" target="_blank" class="shop_btn">게시판</a>
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

    <main id="container">
      <section class="main_container">
        <h2 class="blind">메인화면</h2>
        <div class="logo_box">
          <img src="images/main/sec01_logo_5.png" alt="메인로고" class="pc_logo">
          <img src="images/main/m_sec01_logo_5.png" alt="메인로고" class="m_logo">
        </div>
          <div class="search_area">
            <form>
              <fieldset>
                <legend>검색</legend>
                <div class="search_wrap">
                  <input type="search" id="query" title="제품명을 입력해주세요" placeholder="제품명을 입력해주세요" autocomplete="off">
                  <button type="submit" class="search_btn">
                    <span>SEARCH</span>
                  </button>
                </div>
              </fieldset>
            </form>
          </div>
          <ul class="keyword_box">
            <a href="#">
              <li class="keyword">#바나나맛우유</li>
              <li class="keyword">#더단백</li>
              <li class="keyword">#슈퍼콘</li>
              <li class="keyword">#요플레</li>
              <li class="keyword">#아카페라</li>
            </a>
          </ul>
      </section>
      <section class="main_product">
        <div class="inner">
          <h2 class="product_tit">
            행복한 빙그레의 맛!
          </h2>
          <div class="swiper" data-aos="fade-up">
            <div class="swiper-wrapper">
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/ice.png" alt="ice">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>아이스크림</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide bottom_slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/milk.png" alt="milk">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>우유/치즈</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/yo.png" alt="yo">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>발효유</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/coffee.png" alt="coffee">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap bottom_slide">
                    <span>커피</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/juice.png" alt="juice">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>주스</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide bottom_slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/drink.png" alt="drink">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>음료</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/sneak.png" alt="sneak">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>스낵/디저트</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide bottom_slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/health.png" alt="health">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>건강지향</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img src="images/main/earth.png" alt="health">
                  </div>
                </a>
                <a href="#">
                  <div class="txt_wrap">
                    <span>수출제품</span>
                    <span class="hover_txt">VIEW MORE</span>
                  </div>
                </a>
              </div>
            </div>
            <div class="swiper-pagination"></div>
          </div>
          <div class="swiper-button-prev"></div>
          <div class="swiper-button-next"></div>
        </div>
      </section>
      <section class="main_product2">
        <div class="inner">
          <h2 class="product2_tit">BRAND SHOP</h2>
          <div class="swiper" data-aos="fade-up">
            <div class="swiper-wrapper">
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/more.png" alt="more">
                    <img class="m_slide2" src="images/main/m_more.png" alt="m_more">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/more.png">
                  <div class="txt_slide">
                    빙그레 건강 tft의<br>단백질 전문 브랜드
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/acafela.png" alt="acafela">
                    <img class="m_slide2" src="images/main/m_acafela.png" alt="m_acafela">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/acafela.png">
                  <div class="txt_slide">
                    부담없는 캐주얼한 커피
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/yofle.png" alt="yofle">
                    <img class="m_slide2" src="images/main/m_yofle.png" alt="m_yofle">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/yofle.png">
                  <div class="txt_slide">
                    39년 전통의<br>대한민국 Heritage
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/bananamilk.png" alt="bananamilk">
                    <img class="m_slide2" src="images/main/m_bananamilk.png" alt="m_bananamilk">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/bananamilk.png">
                  <div class="txt_slide">
                    대한민국을 대표하는<br>No.1 가공우유
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/cledor.png" alt="cledor">
                    <img class="m_slide2" src="images/main/m_cledor.png" alt="m_cledor">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/cledor.png">
                  <div class="txt_slide">
                    진한 맛의 감동<br>프리미엄 아이스크림
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/monoplan.png" alt="monoplan">
                    <img class="m_slide2" src="images/main/m_monoplan.png" alt="m_monoplan">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/monoplan.png">
                  <div class="txt_slide">
                    남자를 위한 건강플랜,<br>마노플랜
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
              <div class="swiper-slide">
                <a href="#">
                  <div class="img_wrap">
                    <img class="pc_slide2" src="images/main/vivacity.png" alt="vivacity">
                    <img class="m_slide2" src="images/main/m_vivacity.png" alt="m_vivacity">
                  </div>
                </a>
                <div class="hover_slide">
                  <img src="images/main/vivacity.png">
                  <div class="txt_slide">
                    맛과 건강의 완벽한 조화,<br>비바시티
                  </div>
                </div>
                <a class="hover_slide_btn" href="#" target="_blank">구입하기</a>
              </div>
            </div>
            <div class="swiper-pagination"></div>
          </div>
          <div class="swiper-button-prev"></div>
          <div class="swiper-button-next"></div>
        </div>
      </section>
      <section class="main_product3">
        <div class="inner" >
          <h2 class="product3_tit" data-aos="fade-up">고객문의 및 불편사항</h2>
          <div class="qna_wrap" data-aos="fade-up">
            <div class="counsol_wrap">
              <div class="email_slide">
                <h3>이메일 상담</h3>
                <p>
                  빙그레에 궁금한 사항을<br class="m_br">
                  문의해주세요<br>
                </p>
                <span>
                   최대한 빠른 시일 내에<br class="m_br">
                  친절하게 답변해드리겠습니다.
                </span>
                <a href="#" class="email_btn">
                  <span class="btn_txt">
                    상담하기
                  </span>
                </a>
              </div>
              <div class="phone_slide">
               <h3>전화 상담</h3>
                <p class="phone_num">080.022.0056</p>
                <p class="time">월~금(공휴일 제외)
                  <span>09:00~17:30</span>
                </p>
              </div>
            </div>
            <div class="qna_tit">
              <h4>자주 묻는 질문에 내용이 없을 경우, 이메일 및 전화 상담 바랍니다.
              </h4>
              <button class="qna_more" type="button">
                더보기
              </button>
            </div>
            <ul class="qna_list">
              <li>
                <p>
                  <i class="font_bing">Q.</i>
                  <span>빙그레 건강기능식품을 주문할 수 있는 몰이 따로 있나요?</span>
                </p>
                <a href="#" class="link_arrow">
                  <img src="/images/main/link_arrow.png" alt="link_arrow" class="pc_link_arrow">
                  <img src="/images/main/m_linkarrow.png" alt="m_linkarrow" class="m_link_arrow">
                </a>
              </li>
              <li>
                <p>
                  <i class="font_bing">Q.</i>
                  <span>아이스크림에는 왜 소비기한이 없나요?</span>
                </p>
                <a href="#" class="link_arrow">
                  <img src="/images/main/link_arrow.png" alt="link_arrow" class="pc_link_arrow">
                  <img src="/images/main/m_linkarrow.png" alt="m_linkarrow" class="m_link_arrow">
                </a>
              </li>
              <li>
                <p>
                  <i class="font_bing">Q.</i>
                  <span>제품 소비기한 뒤에 있는 알파벳 기호는 무엇인가요?</span>
                </p>
                <a href="#" class="link_arrow">
                  <img src="/images/main/link_arrow.png" alt="link_arrow" class="pc_link_arrow">
                  <img src="/images/main/m_linkarrow.png" alt="m_linkarrow" class="m_link_arrow">
                </a>
              </li>
              <li>
                <p>
                  <i class="font_bing">Q.</i>
                  <span>아이스크림, 음료 등 제품 공급(납품) 관련 문의드리고 싶어요.</span>
                </p>
                <a href="#" class="link_arrow">
                  <img src="/images/main/link_arrow.png" alt="link_arrow" class="pc_link_arrow">
                  <img src="/images/main/m_linkarrow.png" alt="m_linkarrow" class="m_link_arrow">
                </a>
              </li>
              <li>
                <p>
                  <i class="font_bing">Q.</i>
                  <span>요플레 분리배출(라벨 제거) 방법 알려주세요.</span>
                </p>
                <a href="#" class="link_arrow">
                  <img src="/images/main/link_arrow.png" alt="link_arrow" class="pc_link_arrow">
                  <img src="/images/main/m_linkarrow.png" alt="m_linkarrow" class="m_link_arrow">
                </a>
              </li>
              <li>
                <p>
                  <i class="font_bing">Q.</i>
                  <span>빙그레 제품을 구입할 수 있는 온라인 몰이 있나요? </span>
                </p>
                <a href="#" class="link_arrow">
                  <img src="/images/main/link_arrow.png" alt="link_arrow" class="pc_link_arrow">
                  <img src="/images/main/m_linkarrow.png" alt="m_linkarrow" class="m_link_arrow">
                </a>
              </li>
            </ul>
          </div>
          <div class="report_wrap" data-aos="fade-up">
            <h2 class="report_tit">
              빙그레 임직원 및 종사자 온라인제보
            </h2>
            <div class="online_report">
              <div class="online_slide">
                <p>빙그레 임직원의 부당한 요구 또는 업무처리, <br>인권고충, 기타 부정행위 제보</p>
                <a href="#" class="online_btn">사이버 신고센터</a>
              </div>
              <div class="report_slide">
                <p>빙그레 종사자의 유해·위험요소 및 안전·보건에 관한 의견 제보</p>
                <a href="#" class="report_btn">안전신문고</a>
              </div>
            </div>
          </div>
        </div>
      </section>

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
            <li>
              <span class="company_name">회사명 : </span>
              <span class="company_name2">빙그레</span>
            </li>
            <li>
              <span class="footer_address">경기도 남양주시 다산동 4344-3 / 경기도 남양주시 다산순환로 45(다산동)</span>
            </li>           
          </ul>
        </div>
      </div>
      <div class="footer_bottom">
        <p class="copyright">ⓒ Binggrae all rights reserved.
        </p>
        <div class="sns_wrap">
          <div class="footer_sns">
            <ul>
              <li>
                <a href="#" target="_blank">
                  <img
                    src="/images/footer/blog.png" alt="blog"></a>
              </li>
              <li>
                <a href="#" target="_blank">
                  <img
                    src="/images/footer/instar.png" alt="instar"></a>
              </li>
              <li>
                <a href="#" target="_blank">
                  <img
                    src="images/footer/youtube.png" alt="youtube"></a>
              </li>
              <li>
                <a href="#" target="_blank">
                  <img src="images/footer/ttt.png" alt="ttt"></a>
              </li>
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