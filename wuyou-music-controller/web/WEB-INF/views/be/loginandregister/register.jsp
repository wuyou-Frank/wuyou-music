<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>	
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="/static/css/login/style.css" rel='stylesheet' type='text/css' />
<script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<style>
	.Verification_Code_text{
		width:30%;
		padding: 1em 2em 1em 3em;
		color: #9199aa;
		font-size: 18px;
		outline: none;
		background:  no-repeat 10px 15px;
		border: none;
		font-weight: 100;
		border-bottom: 1px solid#484856;
		margin-bottom: 1em;
		float: left;
		margin-left: 20px;
	}
	.Verification_Code_img{
		display:inline-block;
		margin-right: -10px;
		margin-top: 20px;
	}
	.register{
		display:inline-block;
		float: right;
		width:100px;
		margin-top: 10px;
		font-size: 20px;
		margin-bottom: 0.5em;
	}
	h2{
		text-align: center;
		font-size: 2em;
		margin-top: 1em;
	}
</style>
<body>
 <h1>wu忧音乐后台注册窗口</h1>
<div class="login-form">
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<img src="/static/images/login/avtar.png" />
	</div>
		<form action="/register" method="post">
				<input type="text" class="text" value="Username" name="alname" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
			${alname}
			<div class="key">
				<input type="password" value="Password" name="alpassword" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
			</div>
			<div class="signin">
				<input type="submit" value="注   册" >
			</div>
		</form>
	</div>
</body>
</html>
