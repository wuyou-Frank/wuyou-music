$(function () {
    $(".btn").click(function () {
        var data = $("#text").val()
        location.replace("/songlist/select?name=" + data);
        // $.ajax({
        //     url:"/songlist/select",
        //     data:data,
        //     type:"get",
        //     success:function (result) {
        //     }
        // })
    })
})