<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>无忧音乐</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <script src="/static/js/jquery-3.3.1.min.js"></script>
  <link href="/static/css/reset.css" type="text/css" rel="stylesheet"/>
  <link href="/static/css/index.css" type="text/css" rel="stylesheet"/>
</head>
<style>
	.imglogo{
		margin-top:-20px;
		width:200px;
		height: 100px;
	}
	.login{
		margin-top: -20px;
	}
</style>

<body>

  <header class="header">
    <div class="header-container">
      <div class="header-top">
        <a href="" class="logo"><img class="imglogo" src="/static/images/logo.png"></a>
        <nav class="header-nav">
          <ul>
            <li><a href="javascript:;" class="header-nav__cur">音乐馆</a></li>
            <li><a href="https://www.baidu.com/">我的音乐</a></li>
            <li><a href="javascript:;">下载客户端</a></li>
            <li><a href="javascript:;">VIP</a></li>
          </ul>
        </nav>
        <div class="header-search">
          <input type="text" class="text" id="text" placeholder="here...">
          <div class="btn"><i class="icon-sprite"></i></div>
          <div class="result">
            <a href="javascript:;" class="result-item">
              <span class="rank">1</span>
              <span class="title">默</span>
              <span class="num">3.4万</span>
            </a>
            <a href="javascript:;" class="result-item">
              <span class="rank">2</span>
              <span class="title">侧田</span>
              <span class="num">3.4万</span>
            </a>
            <a href="javascript:;" class="result-item">
              <span class="rank">3</span>
              <span class="title">让我留在你身边</span>
              <span class="num">3.4万</span>
            </a>
            <a href="javascript:;" class="result-item">
              <span class="rank">4</span>
              <span class="title">皮皮虾我们走</span>
              <span class="num">3.4万</span>
            </a>
            <a href="javascript:;" class="result-item">
              <span class="rank">5</span>
              <span class="title">欢乐好声音</span>
              <span class="num">3.4万</span>
            </a>
            <div class="history">
              <span>搜索历史</span>
              <i class="icon-sprite"></i>
            </div>
          </div>
        </div>
        <div class="header-login">
          <a href="/fe/login" class="login">登陆</a>
          <a href="/logout" class="open-green">安全退出</a>
          <a href="javascript:;" id="username" class="open-vip">${username}</a>
        </div>
      </div>
      <ul class="header-subNav">
        <li><a href="/index" class="subNav-cur">首页</a></li>
        <li><a href="/discover/singer">歌手</a></li>
        <li><a href="">排行榜</a></li>
        <li><a href="/songsheet">分类歌单</a></li>
        <li><a href="/mv">MV</a></li>
      </ul>
    </div>
  </header>

  <!-- 新歌首发 -->
  <div class="main" id="newSong">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <a href="javascript:;" class="readAll">全部<i class="icon-sprite"></i></a>
      <div class="main-tab tab-title">
        <a href="javascript:;" class="item item-cur">全部</a>
        <a href="javascript:;" class="item">华语</a>
        <a href="javascript:;" class="item">欧美</a>
        <a href="javascript:;" class="item">韩国</a>
        <a href="javascript:;" class="item">日本</a>
      </div>
      <div class="main-slider tab-cont">
        <ul class="slider-wrapper">
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img1.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img2.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img3.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img4.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img1.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img2.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img3.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img4.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img1.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img2.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img3.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img4.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">范玮琪</a>
            </div>
          </li>
        </ul>
        <div class="slider-btns">
          <span class="cur"><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
        </div>
      </div>
    </div>
    <div class="main-operate">
      <a href="javascript:;" class="slider-prev"><i class="icon-sprite"></i></a>
      <a href="javascript:;" class="slider-next"><i class="icon-sprite"></i></a>
    </div>
  </div>

  <!-- 精彩推荐 -->
  <div class="main" id="recommend">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <div class="carousel">
        <div class="carousel-slider">
          <a href="javascript:;" class="item item-pic1"><img src="/static/images/cont/carousel_img1.jpg" alt="#"></a>
          <a href="javascript:;" class="item item-pic2"><img src="/static/images/cont/carousel_img2.jpg" alt="#"></a>
          <a href="javascript:;" class="item item-pic3"><img src="/static/images/cont/carousel_img3.jpg" alt="#"></a>
          <a href="javascript:;" class="item item-pic4"><img src="/static/images/cont/carousel_img4.jpg" alt="#"></a>
          <a href="javascript:;" class="item item-pic5"><img src="/static/images/cont/carousel_img5.jpg" alt="#"></a>
          <a href="javascript:;" class="item item-pic6"><img src="/static/images/cont/carousel_img6.jpg" alt="#"></a>
        </div>
      </div>
    </div>
    <div class="main-operate">
      <a href="javascript:;" class="slider-prev"><i class="icon-sprite"></i></a>
      <a href="javascript:;" class="slider-next"><i class="icon-sprite"></i></a>
    </div>
  </div>

  <!-- 排行榜 -->
  <div class="main" id="rank">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <a href="javascript:;" class="readAll">全部<i class="icon-sprite"></i></a>
      <ul class="rank-list">
        <li class="rank-list__item rank-list__1">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>流行指数</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="javascript:;"><span>1</span>默 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>2</span>月亮粑粑 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>3</span>Uptown Funk (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>4</span>你永远不知道 (Live)</a>
              <span>张杰</span>
            </li>
          </ul>
        </li>
        <li class="rank-list__item rank-list__2">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>热歌</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="javascript:;"><span>1</span>默 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>2</span>月亮粑粑 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>3</span>Uptown Funk (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>4</span>你永远不知道 (Live)</a>
              <span>张杰</span>
            </li>
          </ul>
        </li>
        <li class="rank-list__item rank-list__3">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>新歌</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="javascript:;"><span>1</span>默 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>2</span>月亮粑粑 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>3</span>Uptown Funk (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>4</span>你永远不知道 (Live)</a>
              <span>张杰</span>
            </li>
          </ul>
        </li>
        <li class="rank-list__item rank-list__4">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>欧美歌曲</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="javascript:;"><span>1</span>默 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>2</span>月亮粑粑 (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>3</span>Uptown Funk (Live)</a>
              <span>张杰</span>
            </li>
            <li class="song-list__item">
              <a href="javascript:;"><span>4</span>你永远不知道 (Live)</a>
              <span>张杰</span>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </div>

  <!-- 热门歌单 -->
  <div class="main" id="hotSong">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <div class="main-slider">
        <ul class="slider-wrapper">
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img1.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <!-- <a href="javascript:;">那个静默的阳光午后</a> -->
                <a href="javascript:;">殿堂金钻认证：BIGBANG最热歌曲大合集</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img2.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img3.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img4.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img5.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img6.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img7.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img8.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img9.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img10.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img11.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="javascript:;" class="img">
              <img src="/static/images/cont/slider_img12.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="javascript:;">那个静默的阳光午后</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="javascript:;" class="author">播放量：179.7万</a>
            </div>
          </li>
        </ul>
        <div class="slider-btns">
          <span class="cur"><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
        </div>
      </div>
    </div>
    <div class="main-operate">
      <a href="javascript:;" class="slider-prev"><i class="icon-sprite"></i></a>
      <a href="javascript:;" class="slider-next"><i class="icon-sprite"></i></a>
    </div>
  </div>


  <!-- MV -->
  <div class="main" id="mv">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <a href="javascript:;" class="readAll">全部<i class="icon-sprite"></i></a>
      <div class="main-tab tab-title">
        <a href="javascript:;" class="item item-cur">全部</a>
        <a href="javascript:;" class="item">华语</a>
        <a href="javascript:;" class="item">欧美</a>
        <a href="javascript:;" class="item">港台</a>
        <a href="javascript:;" class="item">韩国</a>
        <a href="javascript:;" class="item">日本</a>
      </div>
      <ul class="mv-list tab-cont">
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img1.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img2.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img3.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img4.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img5.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img6.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img7.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="javascript:;" class="img"><img src="/static/images/cont/mv_img8.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="javascript:;" class="title">Let Me Love You</a>
            <a href="javascript:;" class="author">刘惜君</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
      </ul>
    </div>
  </div>

  <!-- footer -->
  <footer class="footer">
    <div class="footer-inner">
      <div class="footer-info">
        <div class="footer-info__download">
          <h3>下载KK音乐客户端</h3>
          <ul class="list">
            <li><a href="javascript:;">
              <i class="footer-icon icon-pc"></i>
              PC版
            </a></li>
            <li><a href="javascript:;">
              <i class="footer-icon icon-mac"></i>
              Mac版
            </a></li>
            <li><a href="javascript:;">
              <i class="footer-icon icon-android"></i>
              Android版
            </a></li>
            <li><a href="javascript:;">
              <i class="footer-icon icon-iphone"></i>
              iPhone版
            </a></li>
          </ul>
        </div>
        <div class="footer-info__product">
          <h3>特色产品</h3>
          <ul class="list">
            <li class="hasPic"><a href="javascript:;">
              <i class="footer-icon icon-kg"></i>
              全民K歌
            </a></li>
            <li class="hasPic"><a href="javascript:;">
              <i class="footer-icon icon-ss"></i>
              全民K歌
            </a></li>
            <li class="hasPic"><a href="javascript:;">
              <i class="footer-icon icon-qp"></i>
              全民K歌
            </a></li>
            <li><a href="javascript:;">KK音乐原创音乐平台</a></li>
            <li><a href="javascript:;">上传视频</a></li>
            <li><a href="javascript:;">上传视频</a></li>
            <li><a href="javascript:;">上传视频</a></li>
          </ul>
        </div>
        <div class="footer-info__link">
          <h3>特色产品</h3>
          <ul class="list">
            <li><a href="javascript:;">CJ E&M</a></li>
            <li><a href="javascript:;">我们视频</a></li>
            <li><a href="javascript:;">手机KK空间</a></li>
            <li><a href="javascript:;">CJ E&M</a></li>
            <li><a href="javascript:;">我们视频</a></li>
            <li><a href="javascript:;">手机KK空间</a></li>
            <li><a href="javascript:;">CJ E&M</a></li>
            <li><a href="javascript:;">我们视频</a></li>
            <li><a href="javascript:;">手机KK空间</a></li>
            <li><a href="javascript:;">CJ E&M</a></li>
            <li><a href="javascript:;">我们视频</a></li>
            <li><a href="javascript:;">手机KK空间</a></li>
          </ul>
        </div>
      </div>
      <div class="footer-copyright">
        <p><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a><span>|</span><a href="javascript:;">关于我们</a></p>
        <p>Copyright ? 1998 - 2017 kk. All Rights Reserved.</p>
        <p>我们公司 版权所有 我们网络文化经营许可证</p>
      </div>
    </div>
  </footer>


  <!-- 分享到 -->
  <ul class="slider-share">
    <li><a href="javascript:;">
      <i class="icon-sprite icon-add"></i>
      添加到
      <i class="icon-sprite icon-arrow"></i>
    </a></li>
    <li><a href="javascript:;">
      <i class="icon-sprite icon-share"></i>
      分享
      <i class="icon-sprite icon-arrow"></i>
    </a></li>
    <li><a href="javascript:;">
      <i class="icon-sprite icon-download"></i>
      下载
    </a></li>
  </ul>

  <script src="/static/js/jquery.min.js"></script>
  <script src="/static/js/script.js"></script>
  <script src="/static/js/user/index/index.js"></script>
<script type="text/javascript">
		var name = document.getElementById("username").innerText;
		if(name == ""){
			document.getElementById("username").innerText ="用户名";
			name="用户名";
		}
</script>
</body>
</html>