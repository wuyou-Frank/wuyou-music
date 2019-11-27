<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>	
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="/wuyou_Music/css/login/style.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<!--//webfonts-->
<script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
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
 <h1>wu忧音乐后台登陆窗口</h1>
<div class="login-form">
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<img src="/wuyou_Music/images/login/avtar.png" />
	</div>
			<form action="/wuyou_Music/admin/view/login" method="post">
					<input type="text" class="text" value="Username" name="aname" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
						<div class="key">
						<input type="password" value="Password" name="apassword" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
						</div>
						<div>
						<input class="Verification_Code_text" type="text" name="vc" class="inputimg"/>
						</div>
						<a class="Verification_Code" href="#" onclick="changeVc()">
							<img class="Verification_Code_img" id="imageVc" src="/wuyou_Music/vc"   />
						</a><br/>
						<a class="register" href="/wuyou_Music/register/index">注  册</a>
						
					<div class="signin">
						<input type="submit" value="登   陆" >
					</div>
			</form>
</div>
<script>
	function changeVc(){
		var image = document.getElementById("imageVc");
		image.setAttribute("src","/wuyou_Music/vc?t=" + new Date());
	}
</script>
</body>
</html>
