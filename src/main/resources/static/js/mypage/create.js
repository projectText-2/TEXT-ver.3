function setThumbnail(event,i) {
    var reader = new FileReader();
    reader.onload = function(event) {
      var img = document.getElementById("thumnail" + i);
      img.setAttribute("src", event.target.result);
      img.style.display = "block";
      document.getElementById("imginpdiv" + i).style.display = "none";
      document.getElementsByClassName("delete")[i-1].style.display = "block";
    };
    reader.readAsDataURL(event.target.files[0]);
    // if(i < 10){
    // $("#row").append(
    //                      "<div class='imgbox'>" +
    //                      "<div class='imgcard'>" +
    //                      "<div class=''>" +
    //                      "<label for='img'>" +
    //                      "<div class='imgdiv' id='image_container'>" +
    //                      "<img src='' class='thumnail' id='thumnail"+ i +"'>" +
    //                      "<div class='imginpdiv' id='imginpdiv"+ i +"'>" +
    //                      "<div>" +
    //                      "<div class='text-center'>" +
    //                      "<img src='https://frip.host/img/add.85e31315.svg' width='48' height='48'>" +
    //                      "<div>" + '이미지 추가하기' + "</div>" +
    //                      "</div>" +
    //                      "</div>" +
    //                      "</div>" +
    //                      "<input id='img' type='file' style='display: none;' accept='image/*' onchange='setThumbnail(event);'>" +
    //                      "</div>" +
    //                      "</label>" +
    //                      "<div class='container'></div>" +
    //                      "</div>" +
    //                      "</div>" +
    //                      "</div>"
    //                 );
    // }
  }

function del(i){
  document.getElementById("img" + i).value = "";
  document.getElementsByClassName("thumnail")[i-1].src = "";

  document.getElementById("imginpdiv" + i).style.display = "block";
  document.getElementsByClassName("delete")[i-1].style.display = "none";
}

  