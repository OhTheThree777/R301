$(function(){
$('#submit').click(function(){
        var r=$("#userloginform").serialize();
        $.ajax({
            url:'userController/userlogin',
            data:r,
            datatype:"json",
            type:'POST',
            async:true,
            cache:false,
            success:function(data){}



})




})