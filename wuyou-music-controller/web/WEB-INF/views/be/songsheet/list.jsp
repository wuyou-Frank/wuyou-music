<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/static/css/bootstrap.css" rel="stylesheet">

<script src="/static/js/jquery-3.3.1.min.js" ></script>

<script src="/static/js/bootstrap.js"></script>
<style>
	img{
		width:100px;
		height: 100px;
	}
</style>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-4 column">
			<h1>后台管理</h1>
		</div>
		<div class="col-md-8 column">
			<h1 class="pull-right usernaem">当前用户：${aname}</h1>
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
				<li>
					<a href="/songlist/index">MV</a>
				</li>
			</ul>
		</div>
		<div class="col-md-10 column" id="content">
			<table class ="table table-bordered table-hover">
				<thead>
					<tr>
						<th>编号</th>
						<th>歌单</th>
						<th>图片</th>
						<th>风格分类名称</th>
						<th>操作</th>
					</tr>	
				</thead>
				<tbody>

				</tbody>
			</table>
			<button href="#" class="btn btn-info add">新增<tton>
		</div>
	</div>

	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="center-block style="width:400px;max-width:100%;background-color:#ccc;">
				
			</div>
		</div>
	</div>
</div>
<!--分页-->
<%--<a id="first" href="#" >首页</a>--%>
<%-- <a id="prev" href="#" >上一页</a>--%>
<%-- <a id="next" href="#" >下一页</a>--%>
<%-- <a id="last" href="#" >尾页</a>--%>
<!--非ajax分页-->
<%-- <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="pagination">
				<li>
					 <a href="/wuyou_Music/songsheet/index?pageno=${pvo.pageInfo.first}">首页</a>
				</li>
				<li>
					 <a href="/wuyou_Music/songsheet/index?pageno=${pvo.pageInfo.prev}">上一页</a>
				</li>
				<li>
					 <a href="/wuyou_Music/songsheet/index?pageno=${pvo.pageInfo.next}">下一页</a>
				</li>
				<li>
					 <a href="/wuyou_Music/songsheet/index?pageno=${pvo.pageInfo.last}">尾页</a>
				</li>
			</ul>
		</div>
	</div>
</div> --%>
<!-- 模态框(Modal)-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content" id="content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    修改信息
                </h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" role="form" enctype="multipart/form-data">

					<div class="form-group">
                        <label for="ssid" class="col-sm-2 control-label">歌单编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="ssid" name="ssid" />
                        </div>
                    </div>
                   <div class="form-group">
                        <label for="ssname" class="col-sm-2 control-label">歌单名字</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="ssname" name="ssname" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="simg_address" class="col-sm-2 control-label">图片地址</label>
                        <div class="col-sm-10">
	                            <input type="file" id="simg_address" name="simg_address" />
                        </div>
                    </div>

					 <div class="form-group">
                        <label for="cmid" class="col-sm-2 control-label">风格分类</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cmid" name="cmid" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                            </button>
                            <button type="button" id="save" class="btn btn-default">保存</button>
                        </div>
                    </div>
                </form>
			</div>
		</div>
	</div>
</div>
<script src="/static/js/admin/songsheet/list.js"></script>
<!-- <script>
$("#first").click(function(){
	 var json={pageNo:"first"};
	$.get("/wuyou_Music/songsheetlist",json,function(data){
		var $tbody  = $("tbody");
		//self: 清空tbody处的内容
		$tbody.empty();
		//self:function()中索引，和元素
		$.each(data,function(index,song_sheet){
				var $tr=$("<tr><td></td><td></td><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(song_sheet.ssid);
				$tr.find("td:eq(1)").text(song_sheet.ssname);
				$tr.find("td:eq(2)").text(song_sheet.simg_address);
				$tr.find("td:eq(3)").text(song_sheet.cmname);
				$tr.find("td a:eq(0)").data("ssid",song_sheet.ssid);
				$tr.find("td a:eq(1)").data("ssid",song_sheet.ssid);
				$tr.appendTo("tbody");
		});
	});
}) 
$("#prev").click(function(){
	var json={pageNo:"prev"};
	$.get("/wuyou_Music/songsheetlist",json,function(data){
		var $tbody  = $("tbody");
		//self: 清空tbody处的内容
		$tbody.empty();
		//self:function()中索引，和元素
		$.each(data,function(index,song_sheet){
				var $tr=$("<tr><td></td><td></td><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(song_sheet.ssid);
				$tr.find("td:eq(1)").text(song_sheet.ssname);
				$tr.find("td:eq(2)").text(song_sheet.simg_address);
				$tr.find("td:eq(3)").text(song_sheet.cmname);
				$tr.find("td a:eq(0)").data("ssid",song_sheet.ssid);
				$tr.find("td a:eq(1)").data("ssid",song_sheet.ssid);
				$tr.appendTo("tbody");
		});
	});
}) 
$("#next").click(function(){
	var json={pageNo:"next"};
	$.get("/wuyou_Music/songsheetlist",json,function(data){
		var $tbody  = $("tbody");
		//self: 清空tbody处的内容
		$tbody.empty();
		//self:function()中索引，和元素
		$.each(data,function(index,song_sheet){
				var $tr=$("<tr><td></td><td></td><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(song_sheet.ssid);
				$tr.find("td:eq(1)").text(song_sheet.ssname);
				$tr.find("td:eq(2)").text(song_sheet.simg_address);
				$tr.find("td:eq(3)").text(song_sheet.cmname);
				$tr.find("td a:eq(0)").data("ssid",song_sheet.ssid);
				$tr.find("td a:eq(1)").data("ssid",song_sheet.ssid);
				$tr.appendTo("tbody");
		});
	});
}) 
$("#last").click(function(){
	var json={pageNo:"last"};
	$.get("/wuyou_Music/songsheetlist",json,function(data){
		var $tbody  = $("tbody");
		//self: 清空tbody处的内容
		$tbody.empty();
		//self:function()中索引，和元素
		$.each(data,function(index,song_sheet){
				var $tr=$("<tr><td></td><td></td><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(song_sheet.ssid);
				$tr.find("td:eq(1)").text(song_sheet.ssname);
				$tr.find("td:eq(2)").text(song_sheet.simg_address);
				$tr.find("td:eq(3)").text(song_sheet.cmname);
				$tr.find("td a:eq(0)").data("ssid",song_sheet.ssid);
				$tr.find("td a:eq(1)").data("ssid",song_sheet.ssid);
				$tr.appendTo("tbody");
		});
	});
}) 
</script> -->
</body>
<script type="text/javascript">
	var name = document.getElementById("username").innerText;
	if(name == ""){
		document.getElementById("username").innerText ="用户名";
		name="用户名";
	}
</script>
</html>