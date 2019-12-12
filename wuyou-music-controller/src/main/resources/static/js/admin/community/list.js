


$(function(){
	$(document).ajaxError(function(){
		alert("一个错误发生")
	})
	function getAll(){

		$.getJSON("/be/community/select",function(data){
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
        var $that = $(this);
        if (confirm("确定要删除吗?")) {
            $.post("/be/community/delete",{cmid:$(this).data("cmid")},function () {
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
        $.getJSON("/be/classification/select",function(data){
            var cid = 0;
            for(var i=0;i<data.length;i++){
                if($("#cid").val()==data[i].cname){
                    alert($("#cid").val());
                    var cid=data[i].cid;
                    break;
                }
            }
            var obj = {cmid:$("#cmid").val(),cmname:$("#cmname").val(),classificationid:cid};
        
        console.log(obj);
        $.post("/be/community/update",obj,function () {
            location.href="/community/index";
        });
    });})

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
        $.getJSON("/be/classification/select",function(data){
        	var cid = 0;
        	for(var i=0;i<data.length;i++){
        		if($("#cid").val()==data[i].cname){
        			var cid=data[i].cid;
        			break;
        		}
        	}
        var obj = {cmid:$("#cmid").val(),cmname:$("#cmname").val(),classificationid:cid};
        console.log(obj);
        $.post("/be/community/insert",obj,function () {
            $("tbody").empty();
            getAll();
        });
    });
})});

