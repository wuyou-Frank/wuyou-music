
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
<div>
    <c:forEach  var="singerEntity" items="${singerEntity}">
        <img src="${singerEntity.spicture}" alt="图片">
    </c:forEach>
12345678
</div>
<!--歌曲列表-->
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table">
				<thead>
					<tr class="success">
						<th>
							编号
						</th>
						<th>
							歌曲标题
						</th>
						<th>
							歌手
						</th>
						<th>
							专辑
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach  var="singer" items="${result.list}">
						<tr class="info">
						<td>
							${singer.slid}
						</td>
						<td>
							${singer.slname}
                            <a href="/playpages?slid=${singer.slid}">播放</a>
                            <a href="#">下载</a>
						</td>
						<td>
							${singer.sname}
						</td>
						<td>
							${singer.aname}
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="pagination">
				<li>
					 <a href="/songlist?pageNum=1&${id}">首页</a>
				</li>
				<li>
					 <a href="/songlist?pageNum=${songlist.prePage}&${id}">上一页</a>
				</li>
				<li>
					 <a href="/songlist?pageNum=${songlist.nextPage}&${id}">下一页</a>
				</li>
				<li>
					 <a href="/songlist?pageNum=${songlist.pages}&${id}">尾页</a>
				</li>
			</ul>
		</div>
	</div>
</div>
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
</html>