$(function() {
var val = "";
$("#submit").click(function(event){
    event.preventDefault();

    $.ajax({
        type: "GET",
        dataType:"json",
        url:  "https://cors-anywhere.herokuapp.com/http://localhost:8085/demoRest/webapi/myresource",
        success: function(data) {
            console.log("response:" + data);
            //$.each(data, function(j, pdata) {
              //  val= val + "[ "+pdata.title +" " + pdata.author +"]";
           // });
           // $("#data").text(val);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log(' Error in processing! '+textStatus);
        }
    });
});
});