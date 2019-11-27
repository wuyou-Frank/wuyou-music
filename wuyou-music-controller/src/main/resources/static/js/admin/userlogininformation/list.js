$(function(){
	$(document).ajaxError(function(){
		alert("一个错误发生")
	})
	function getAll(){
		$.getJSON("/wuyou_Music/userlogininformation/select",function(data){
			
			$.each(data,function(index,userlogin){
				var $tr=$("<tr><td></td><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(userlogin.lid);
				$tr.find("td:eq(1)").text(userlogin.lname);
				$tr.find("td:eq(2)").text(userlogin.lpassword);
				
				$tr.find("td a:eq(0)").data("lid",userlogin.lid);
				$tr.find("td a:eq(1)").data("lid",userlogin.lid);
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
            $.post("/wuyou_Music/userlogininformation/delete",{lid:$(this).data("lid")},function () {
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
		$("#myModalLabel").html("修改分类信息");
        $("#save").data("op", "update");
        $("#lid").val($(this).data("lid"));
        $("#lname").val($(this).closest("tr").find("td:eq(1)").text());
        $("#lpassword").val($(this).closest("tr").find("td:eq(2)").text());
        $("#lid").prop("disabled", "disabled");
        $("#myModal").modal('show');
    });
	
	$("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="update"){
            return;
        }
        $("#myModal").modal('hide');
        var obj = {lid:$("#lid").val(),lname:$("#lname").val(),lpassword:$("#lpassword").val()};
        console.log(obj);
        $.post("/wuyou_Music/userlogininformation/update",obj,function () {
            //2.第2种刷新方式
            // 修改成功 直接重新加载页面即可，相当于刷新。不要在servlet中进行跳转动作。
            location.href="/wuyou_Music/userlogininformation/index";
        });
    });//修改保存按钮单击事件
	
	//新增操作,打开模式框
    $("#content").on("click",".add",function () {
    	$("#myModalLabel").html("添加信息");
        $("#save").data("op", "insert");
        $("#lid").val("不需要填");
        $("#lid").prop("disabled", "disabled");
        $("#lname").val("");
        $("#lpassword").val("");
        $("#myModal").modal('show');
    });
  //新增操作
    $("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="insert"){
            return;
        }
        $("#myModal").modal('hide');
        var obj = {lname:$("#lname").val(),lpassword:$("#lpassword").val()};
        console.log(obj);
        $.post("/wuyou_Music/userlogininformation/insert",obj,function () {
            // 3.第三种刷新方式，直接清空表格数据，并重新加载数据
            $("tbody").empty();
            getAll();
        });
    });
})

