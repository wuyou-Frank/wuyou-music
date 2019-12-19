


$(function(){
	$(document).ajaxError(function(){
		alert("一个错误发生")
	})
	
	function getAll(){
		$.getJSON("/be/songsheet/select",function(data){
			$.each(data,function(index,song_sheet){
				var $tr=$(
				    "<tr>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td><img class='i' alt='图片'/></td>" +
                    "<td></td>" +
                    "<td><a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a>" +
                    "</td></tr>")
				
				$tr.find("td:first").text(song_sheet.ssid);
				$tr.find("td:eq(1)").text(song_sheet.ssname);
				// $tr.find("td:eq(2)").text(song_sheet.simgAddress);
                $tr.find(".i").attr('src',song_sheet.simgAddress);
				$tr.find("td:eq(3)").text(song_sheet.cmname);
				$tr.find("td a:eq(0)").data("ssid",song_sheet.ssid);
				$tr.find("td a:eq(1)").data("ssid",song_sheet.ssid);
				$tr.appendTo("tbody");
			})
		})
	}
	getAll();
	
	//删除
	$("tbody").on("click",".delete",function (e) {
        e.preventDefault();
        //记录下当前引发单击事件的元素，以便删除成功后利用它找到所在行，并删除行。
        var $that = $(this);
        if (confirm("确定要删除吗?")) {
            $.post("/be/songsheet/delete",{ssid:$(this).data("ssid")},function () {
                //1.第一种刷新方式
                // 删除成功 直接用脚本删除当前行。相当于刷新页面了。
                // 因为这是成功后调用的函数，数据库对应的记录已经删除
                console.log($that);
                $that.closest("tr").remove();
            });
        }
    });
	//修改
	$("tbody").on("click",".edit",function () {
		$("#myModalLabel").html("修改信息");
        $("#save").data("op", "update");
        $("#ssid").val($(this).data("ssid"));
        $("#ssname").val($(this).closest("tr").find("td:eq(1)").text());
        $("#cmid").val($(this).closest("tr").find("td:eq(3)").text());
        $("#ssid").prop("disabled", "disabled");
        $("#myModal").modal('show');
    });
	
	
	$("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="update"){
            return;
        }
        $("#myModal").modal('hide');
        $.getJSON("/be/community/select",function(data){
        	var cmid = 0;
        	for(var i=0;i<data.length;i++){
        		if($("#cmid").val()==data[i].cmname){
        			var cmid=data[i].cmid;
        			break;
        		}
        	}
        var obj = {ssid:$("#ssid").val(),ssname:$("#ssname").val(),simgAddress:$("#simg_address").val(),communityid:cmid};
        console.log(obj);
        $.post("/be/songsheet/update",obj,function () {
            //2.第2种刷新方式
            // 修改成功 直接重新加载页面即可，相当于刷新。不要在servlet中进行跳转动作。
            location.href="/songsheet/index";
        });
    });})//修改保存按钮单击事件
	//新增操作,打开模式框

    $("#content").on("click",".add",function () {
    	$("#myModalLabel").html("添加信息");
        $("#save").data("op", "insert");
        $("#ssid").val("");
        $("#ssid").prop("disabled", "");
        $("#ssname").val("");
        $("#simg_address").val("");

        $("#myModal").modal('show');
    });
  //新增操作
    $("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="insert"){
            return;
        }
        $("#myModal").modal('hide');

        $("#simg_address").bind('change',function () {
            var formData = new FormData();
            formData.append("simg_address",$("#simg_address")[0].files[0]);
        })


        // alert(formData.get("simg_address"));


        $.getJSON("/be/community/select",function(data){
        	var cmid = 0;
            for(var i=0;i<data.length;i++){
                if($("#cmid").val()==data[i].cmname){
                    var cmid=data[i].cmid;
                    break;
                }
            }
        	alert($("input[name='simg_address']").val());
        var obj = {ssid:$("#ssid").val(),ssname:$("#ssname").val(),simgAddress:formData.get("simg_address"),communityid:cmid};
        console.log(obj);
        $.post("/be/songsheet/insert",obj,function () {
            // 3.第三种刷新方式，直接清空表格数据，并重新加载数据
            $("tbody").empty();
            getAll();
        });

    });
})})

