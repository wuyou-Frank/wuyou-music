<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>全部歌单-歌单-wu忧音乐</title>
<link rel="stylesheet" href="/wuyou_Music/css/bootstrap.css">
<link rel="stylesheet" href="/wuyou_Music/css/index.css">
<script src="/wuyou_Music/js/jquery-3.3.1.min.js"></script>
<script src="/wuyou_Music/js/bootstrap.js"></script>
<link rel="stylesheet" href="/wuyou_Music/css/reset.css">

<style>
	.imglogo{
		margin-top:-20px;
		width:200px;
		height: 100px;
	}
	.container{
		margin:0 auto ;
		width:1200px;
		height:1000px;
	}
	.All-classification{
		display:inline-block;
		width:1200px;
		height:300px;
		background-color: #ECFFFF;
	}
	.All-classification-ul li{
		display: inline-block;
		width:1200px;
		height: 60px;
	}
	.All-classification-ul li span:nth-child(1){
		display:inline-block;
		text-align: center;
		line-height: 60px;
		font-size:23px;
		float: left;
	}
	.All-classification-ul li span:nth-child(2) a{
		display:inline-block;
		margin-left:5px;
		margin-top:15px;
		line-height: 30px;
		float: left;
	}
	.ul li{
		display: inline-block;
		width:200px;
		float: left;
		margin: 40px;
		margin-left:50px;
	}
	.img{
		width:200px;
		height:200px;
	}
	.btn{
		margin-left: 210px;
		margin-top: -60px;
	}
</style>
</head>
<body>
 <header class="header">
    <div class="header-container">
      <div class="header-top">
        <a href="/wuyou_Music/index" class="logo"><img class="imglogo" src="/wuyou_Music/images/logo.png"></a>
        <nav class="header-nav">
          <ul>
            <li><a href="javascript:;" class="header-nav__cur">音乐馆</a></li>
            <li><a href="javascript:;">我的音乐</a></li>
            <li><a href="javascript:;">下载客户端</a></li>
            <li><a href="javascript:;">VIP</a></li>
          </ul>
        </nav>
        <div class="header-search">
          <input type="text" class="text" placeholder="here...">
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
          <a href="/wuyou_Music/login/index" class="login">登陆</a>
          <a href="/wuyou_Music/logout" class="open-green">安全退出</a>
          <a href="javascript:;" id="username" class="open-vip">${lname }</a>
        </div>
      </div>
      <ul class="header-subNav">
        <li><a href="/wuyou_Music/index" class="subNav-cur">首页</a></li>
        <li><a href="javascript:;">歌手</a></li>
        <li><a href="javascript:;">排行榜</a></li>
        <li><a href="/wuyou_Music/songsheet">分类歌单</a></li>
        <li><a href="javascript:;">MV</a></li>
      </ul>
    </div>
  </header>
 
  <!--歌单分类-->
  <div class="container">
  	<div class="All-classification">
  		<ul class="All-classification-ul" id="All-ul">
  			<li>
  				<span><a href="">语种:</a></span>
  				<span>
  					<c:forEach var="community" items="${pvo.communityEntities}">
                    <c:choose>
                        <c:when test="${community.cmid == pvo3.currentCmid}" >
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:when>
                        <c:otherwise>
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
  				</span>
  			</li>
  			<li>
  				<span><a href="">风格:</a></span>
  				<span>
  					<c:forEach var="community" items="${pvo2.communityEntities}">
                    <c:choose>
                        <c:when test="${community.cmid == pvo3.currentCmid}" >
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:when>
                        <c:otherwise>
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:otherwise>
                    </c:choose>
                	</c:forEach>
  				</span>
  			</li>
  			<li>
  				<span><a href="">场景:</a></span>
  				<span>
  					<c:forEach var="community" items="${pvo3.communityEntities}">
                    <c:choose>
                        <c:when test="${community.cmid == pvo3.currentCmid}" >
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:when>
                        <c:otherwise>
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:otherwise>
                    </c:choose>
                	</c:forEach>
  				</span>
  			</li>
  			<li>
  				<span><a href="">性格:</a></span>
  				<span>
  					<c:forEach var="community" items="${pvo4.communityEntities}">
                    <c:choose>
                        <c:when test="${community.cmid == pvo4.currentCmid}" >
                               <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:when>
                        <c:otherwise>
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:otherwise>
                    </c:choose>
                	</c:forEach>
  				</span>
  			</li>
  			<li>
  				<span><a href="">主题:</a></span>
  				<span>
  					<c:forEach var="community" items="${pvo5.communityEntities}">
                    <c:choose>
                        <c:when test="${community.cmid == pvo5.currentCmid}" >
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:when>
                        <c:otherwise>
                                <a href="/wuyou_Music/songsheet?cmid=${community.cmid}">${community.cmname}</a>
                        </c:otherwise>
                    </c:choose>
                	</c:forEach>
  				</span>
  			</li>
  		</ul>
  	</div>
	<ul class="ul">
		<c:forEach var="song_sheet" items="${pvo.song_sheetEntities}">
			<li>
				<a href="/wuyou_Music/songlist?ssid=${song_sheet.ssid}" class="a">
		           <!-- <img class="img" src="/wuyou_Music/images/cont/slider_img1.jpg" alt="图片"> -->
		       		<img class="img" src="${song_sheet.simg_address}" alt="图片">
		        </a>
				<h3>
	                     ${song_sheet.ssname}
	            </h3>
			</li>
        </c:forEach>
	</ul>
  </div>
  <!-- 分页 -->
 <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="pagination">
				<li>
					 <a href="/wuyou_Music/songsheet?ssname=${song_sheet.ssname}&cimd=${pvo.currentCmid}&pageno=${pvo.pageInfo.first}">首页</a>
				</li>
				<li>
					 <a href="/wuyou_Music/songsheet?ssname=${song_sheet.ssname}&cimd=${pvo.currentCmid}&pageno=${pvo.pageInfo.prev}">上一页</a>
				</li>
				<li>
					 <a href="/wuyou_Music/songsheet?ssname=${song_sheet.ssname}&cimd=${pvo.currentCmid}&pageno=${pvo.pageInfo.next}">下一页</a>
				</li>
				<li>
					 <a href="/wuyou_Music/songsheet?ssname=${song_sheet.ssname}&cimd=${pvo.currentCmid}&pageno=${pvo.pageInfo.last}">尾页</a>
				</li>
			</ul>
		</div>
	</div>
</div>
</body>
<script type="text/javascript">
		var name = document.getElementById("username").innerText;
		if(name == ""){
			document.getElementById("username").innerText ="用户名";
			name="用户名";
		}
</script>
 <script src="/wuyou_Music/js/jquery.min.js"></script>
  <script src="/wuyou_Music/js/script.js"></script>
</html>