<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/static/css/bootstrap.css" rel="stylesheet">
<script src="/static/js/jquery-3.3.1.min.js" ></script>
<script src="/static/js/bootstrap.js"></script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-4 column">
			<h1>wuyou音乐后台管理</h1>
		</div>
		<div class="col-md-8 column">
			<h1 class="pull-right usernaem">当前用户：${aname}</h1>
			<a href="#">安全退出</a>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-2 column">
			<ul class="nav nav-pills nav-stacked">
				<li>
					<a href="/userlogininformation/index">用户信息管理</a>
				</li>
				<li>
					<a href="/classification/index">分类管理</a>
				</li>
				<li>
					<a href="/community/index">风格分类</a>
				</li>
				<li>
					<a href="/songsheet/index">歌单</a>
				</li>
				<li>
					<a href="/songlist/index">歌曲列表</a>
				</li>
			</ul>
		</div>
		<div class="col-md-10 column">
			<h1>数据显示</h1>
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="center-block style= width:400px;max-width:100%;background-color:#ccc;">
				<h1></h1>
			</div>
		</div>
	</div>
</div>
</body>
</html>