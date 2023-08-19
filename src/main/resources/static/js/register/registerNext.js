function checkid() {
    var id = document.getElementById("idOrEmail").value;
    if (id != ""){
        $.ajax({
            async: false,
            url: "/register/checkid?ID=" + id,
            success: function(result){
                if(result){
                    $(".fail").css("display", "block");
                    $(".succes").css("display", "none");
                    $(".SubmitButton").attr("disabled", true);
                }else{
                    $(".fail").css("display", "none");
                    $(".succes").css("display", "block");
                    $(".SubmitButton").attr("disabled", false);
                }
            }
        });
    }
    else {
        $(".fail").css("display", "block");
        $(".succes").css("display", "none");
        $(".SubmitButton").attr("disabled", true);
    }
}

function regist() {
    document.getElementById("sort").value = "n";
    document.join.submit();
}