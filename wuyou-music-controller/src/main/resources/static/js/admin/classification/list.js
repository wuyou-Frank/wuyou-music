


$(function(){
	$(document).ajaxError(function(){
		alert("一个错误发生")
	})
	function getAll(){
		$.getJSON("/be/classification/select",function(data){
			
			$.each(data,function(index,classification){
				var $tr=$("<tr><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(classification.cid);
				$tr.find("td:eq(1)").text(classification.cname);
				
				$tr.find("td a:eq(0)").data("cid",classification.cid);
				$tr.find("td a:eq(1)").data("cid",classification.cid);
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
            $.post("/be/classification/delete",{cid:$(this).data("cid")},function () {
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
        //把cid的值从data中取出来，并赋值给模式窗口中的隐藏域中
        $("#cid").val($(this).data("cid"));
        $("#cname").val($(this).closest("tr").find("td:eq(1)").text());

        $("#cid").prop("disabled", "disabled");
        $("#myModal").modal('show');
    });
	
	
	$("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="update"){
            return;
        }
        $("#myModal").modal('hide');
        var obj = {cid:$("#cid").val(),cname:$("#cname").val()};
        console.log(obj);
        $.post("/be/classification/update",obj,function () {
            //2.第2种刷新方式
            // 修改成功 直接重新加载页面即可，相当于刷新。不要在servlet中进行跳转动作。
            location.href="/be/classification/index";
        });
    });//修改保存按钮单击事件
	//新增操作,打开模式框

    $("#content").on("click",".add",function () {
    	$("#myModalLabel").html("添加信息");
        $("#save").data("op", "insert");
        $("#cid").val("");
        $("#cid").prop("disabled", "");
        $("#cname").val("");

        $("#myModal").modal('show');
    });
  //新增操作
    $("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="insert"){
            return;
        }
        $("#myModal").modal('hide');
        var obj = {cid:$("#cid").val(),cname:$("#cname").val()};
        console.log(obj);
        $.post("/be/classification/insert",obj,function () {
            // 3.第三种刷新方式，直接清空表格数据，并重新加载数据
            $("tbody").empty();
            getAll();
        });
    });
})

