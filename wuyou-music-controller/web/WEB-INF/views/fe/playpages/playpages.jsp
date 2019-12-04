<%--
  Created by IntelliJ IDEA.
  User: WU忧
  Date: 2019/12/3
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>wuyou音乐播放</title>
    <link rel="stylesheet" href="/static/css/playpages/dmaku.css">
    <script src="/static/js/user/playpages/jquery-3.3.1.min.js"></script>
</head>
<body class="keBody" style="min-height: 650px;">
<div class="kePublic">
    <!--效果html开始-->
    <div id="background"></div>
    <div id="player">
        <div class="cover"></div>
        <div class="ctrl">
            <div class="tag">
                <strong>Title</strong>
                <span class="artist">Artist</span>
                <span class="album">Album</span>
            </div>
            <div class="control">
                <div class="left">
                    <div class="rewind icon"></div>
                    <div class="playback icon"></div>
                    <div class="fastforward icon"></div>
                </div>
                <div class="volume right">
                    <div class="mute icon left"></div>
                    <div class="slider left">
                        <div class="pace"></div>
                    </div>
                </div>
            </div>
            <div class="progress">
                <div class="slider">
                    <div class="loaded"></div>
                    <div class="pace"></div>
                </div>
                <div class="timer left">0:00</div>
                <div class="right">
                    <div class="repeat icon"></div>
                    <div class="shuffle icon"></div>
                </div>
            </div>
        </div>
    </div>
    <ul id="playlist" ></ul>
    <table >
        <tr></tr>
    </table>
    <script src="/static/js/user/playpages/jquery-ui-1.8.17.custom.min.js"></script>
    <script src="/static/js/user/playpages/dmaku.js"></script>

    <!--效果html结束-->

</div>

</body>
</html>
