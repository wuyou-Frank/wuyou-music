


$(function(){
	$(document).ajaxError(function(){
		alert("一个错误发生")
	})
	function getAll(){
		$.getJSON("/wuyou_Music/community/select",function(data){
			
			$.each(data,function(index,community){
				var $tr=$("<tr><td></td><td></td><td></td><td>"+
					"<a href='#' class='delete btn btn-danger'>删除</a>"+
					"<a href='#' class='edit btn btn-info'>编辑</a></td></tr>")
				
				$tr.find("td:first").text(community.cmid);
				$tr.find("td:eq(1)").text(community.cmname);
				$tr.find("td:eq(2)").text(community.cname);
				
				$tr.find("td a:eq(0)").data("cmid",community.cmid);
				$tr.find("td a:eq(1)").data("cmid",community.cmid);
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
            $.post("/wuyou_Music/community/delete",{cmid:$(this).data("cmid")},function () {
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
        $("#cmid").val($(this).data("cmid"));
        $("#cmname").val($(this).closest("tr").find("td:eq(1)").text());
        $("#cid").val($(this).closest("tr").find("td:eq(2)").text());
        $("#cmid").prop("disabled", "disabled");
        $("#myModal").modal('show');
    });
	
	
	$("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="update"){
            return;
        }
        $("#myModal").modal('hide');
        $.getJSON("/wuyou_Music/classification/select",function(data){
        	var cid = 0;
        	for(var i=0;i<data.length;i++){
        		if($("#cid").val()==data[i].cname){
        			var cid=data[i].cid;
        			break;
        		}
        	}
        var obj = {cmid:$("#cmid").val(),cmname:$("#cmname").val(),cid:cid};
        
        console.log(obj);
        $.post("/wuyou_Music/community/update",obj,function () {
            //2.第2种刷新方式
            // 修改成功 直接重新加载页面即可，相当于刷新。不要在servlet中进行跳转动作。
            location.href="/wuyou_Music/community/index";
        });
    });})//修改保存按钮单击事件
	//新增操作,打开模式框

    $("#content").on("click",".add",function () {
    	$("#myModalLabel").html("添加信息");
        $("#save").data("op", "insert");
        $("#cmid").val("");
        $("#cmid").prop("disabled", "");
        $("#cmname").val("");
        $("#myModal").modal('show');
    });
  //新增操作
    $("#save").click(function(){
        var op = $("#save").data("op");
        if(op!="insert"){
            return;
        }
        $("#myModal").modal('hide');
        $.getJSON("/wuyou_Music/classification/select",function(data){
        	var cid = 0;
        	for(var i=0;i<data.length;i++){
        		if($("#cid").val()==data[i].cname){
        			var cid=data[i].cid;
        			break;
        		}
        	}
        var obj = {cmid:$("#cmid").val(),cmname:$("#cmname").val(),cid:cid};
        console.log(obj);
        $.post("/wuyou_Music/community/insert",obj,function () {
            // 3.第三种刷新方式，直接清空表格数据，并重新加载数据
            $("tbody").empty();
            getAll();
        });
    });
})});

