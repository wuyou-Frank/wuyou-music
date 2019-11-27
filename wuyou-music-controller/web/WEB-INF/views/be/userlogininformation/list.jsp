<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/wuyou_Music/css/bootstrap.css" rel="stylesheet">

<script src="/wuyou_Music/js/jquery-3.3.1.min.js" ></script>

<script src="/wuyou_Music/js/bootstrap.js"></script>

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
					<a href="/wuyou_Music/userlogininformation/index">用户信息管理</a>
				</li>
				<li>
					<a href="/wuyou_Music/classification/index">分类管理</a>
				</li>
				<li>
					<a href="/wuyou_Music/community/index">风格分类</a>
				</li>
				<li>
					<a href="/wuyou_Music/songsheet/index">歌单</a>
				</li>
				<li>
					<a href="/wuyou_Music/songlist/index">歌曲列表</a>
				</li>
			</ul>
		</div>
		<div class="col-md-10 column" id="content">
			<table class ="table table-bordered table-hover">
				<thead>
					<tr>
						<th>编号</th>
						<th>账号</th>
						<th>密码</th>
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
				<form class="form-horizontal" role="form">

                    <div class="form-group">
                        <label for="lid" class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="lid" name="lid" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="lname" class="col-sm-2 control-label">用户账号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="lname" name="lname" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="lpassword" class="col-sm-2 control-label">用户密码</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="lpassword" name="lpassword" />
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

<script>

</script>


<script src="/wuyou_Music/js/admin/userlogininformation/list.js"></script>
</body>
</html>