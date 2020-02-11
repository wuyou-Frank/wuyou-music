<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/static/css/index.css">
<link rel="stylesheet" href="/static/css/reset.css">
<link rel="stylesheet" href="/static/css/bootstrap.css">
<script src="/static/js/jquery-3.3.1.min.js"></script>
<script src="/static/js/bootstrap.js"></script>
<style>
	.imglogo{
		margin-top:-20px;
		width:200px;
		height: 100px;
	}
	.info a{
		display: inline-block;
	}
	.btn{
		margin-left: 210px;
		margin-top: -60px;
	}
    .dbody{
        display: inline-block;
        background-color: #e8e8e8;
        margin-left: 180px;
        width: 702px;
        height: 1000px;
        position: relative;

    }
    .dbody>.song{
      /*background-color: #5bc0de;*/
      width: 600px;
      height: 600px;
      position: relative;
      margin-left: 50px;
    }
    .dbody>.song>div:nth-child(1) img{
      position: absolute;
      /*background-color: yellow;*/
      width: 200px;
      height:200px ;
    }
    .dbody>.song>div:nth-child(2){
      position: absolute;
      /*background-color: green;*/
      margin-left: 200px;
      width: 400px;
      height:200px ;
    }
    .a{
      display: inline-block;
      width: 400px;
      height: 30px;
      /*background-color: gainsboro;*/
    }
    .a li{
      width: 60px;
      height: 20px;
      font-size:18px;
      float: left;
    }
    .comment{
      /*background-color: yellow;*/
      position: absolute;
      margin-left: 50px;
      width: 600px;
      height: 500px;
    }
    .comment>div:nth-child(1){
      width: 600px;
      height: 100px;
    }
    .comment>div:nth-child(1)>textarea{
      width: 500px;
      height: 60px;
    }
    .comment>div:nth-child(1)>input{
      background-color: #66afe9;
    }
    .comment>div:nth-child(2){
      /*background-color: #d6e9c6;*/
      width: 600px;
      height: 100px;
    }
    .comment>div:nth-child(2)>div{
      background-color: #d6e9c6;
      margin-left: 35px;
      width: 500px;
      height: 80px;
    }
    .dbody2{
      display: inline-block;
      /*background-color: #5bc0de;*/
      width: 300px;
      height: 1000px;
    }
</style>
</head>
<body>
<header class="header">
    <div class="header-container">
      <div class="header-top">
        <a href="/index" class="logo"><img class="imglogo" src="/static/images/logo.png"></a>
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
          <a href="/login/index" class="login">登陆</a>
          <a href="/logout" class="open-green">安全退出</a>
          <a href="javascript:;" id="username" class="open-vip">${lname}</a>
        </div>
      </div>
      <ul class="header-subNav">
        <li><a href="/index" class="subNav-cur">首页</a></li>
        <li><a href="javascript:;">歌手</a></li>
        <li><a href="javascript:;">排行榜</a></li>
        <li><a href="/songsheet">分类歌单</a></li>
        <li><a href="javascript:;">MV</a></li>
      </ul>
    </div>
</header>
<div class="dbody">
  <!--歌曲信息-->
  <div class="song">
      <div >
        <img src="/static/images/play_pages/img/1.jpg" alt="图片">
      </div>
      <div>
        <div>
          <span>歌名:${songListEntity.slname}</span>
        </div>
        <p>歌手:${songListEntity.sname}</p>
        <p>专辑:${songListEntity.aname}</p>
        <div class="a">
          <ul>
            <li><a>播放</a></li>
            <li><a>收藏</a></li>
            <li><a>分享</a></li>
            <li><a>下载</a></li>
          </ul>
        </div>
        <div>
          写信告诉我今天 海是什么颜色<br/>
          夜夜陪著你的海 心情又如何<br/>
          灰色是不想说 蓝色是忧郁<br/>
          而漂泊的你 狂浪的心 停在哪里<br/>
          写信告诉我今夜 你想要梦什么<br/>
          梦里外的我是否 都让你无从选择<br/>
          我揪著一颗心 整夜都闭不了眼睛<br/>
          为何你明明动了情 却又不靠近<br/>
          听 海哭的声音<br/>
          叹惜著谁又被伤了心<br/>
          却还不清醒<br/>
          一定不是我 至少我很冷静<br/>
          可是泪水 就连泪水也都不相信<br/>
          我揪著一颗心 整夜都闭不了眼睛<br/>
          为何你明明动了情 却又不靠近<br/>
          听 海哭的声音<br/>
          叹惜著谁又被伤了心<br/>
          却还不清醒<br/>
          一定不是我 至少我很冷静<br/>
          可是泪水 就连泪水也都不相信<br/>
          </div>
      </div>
  </div>
  <!--评论-->

  <div class="comment">
      <!--输入框-->
    评论
      <div>
        <textarea placeholder="评论"></textarea>
        <input type="button" value="评论">
      </div>
      <!--显示框-->
    精彩评论
    <c:forEach items="${commentEntities}" var="commentEntities">
      <div>
          ${commentEntities.ulname}：${commentEntities.commentcontent}
            <div>
              <c:forEach items="${commentreplyEntities}" var="commentreplyEntities" >
                ${commentreplyEntities.ulname}：
                ${commentreplyEntities.commentreplycontent}
              </c:forEach>
            </div>
      </div>

    </c:forEach>
  </div>
</div>
<div class="dbody2"></div>



</body>

<script type="text/javascript">
		var name = document.getElementById("username").innerText;
		if(name == ""){
			document.getElementById("username").innerText ="用户名";
			name="用户名";
		}
</script>
</html>