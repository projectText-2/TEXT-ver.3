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
  }

function del(i){
  document.getElementById("img" + i).value = "";
  document.getElementsByClassName("thumnail")[i-1].src = "";

  document.getElementById("imginpdiv" + i).style.display = "block";
  document.getElementsByClassName("delete")[i-1].style.display = "none";
}

function imgplus() {
var num1 = 1 + parseInt(count);
var num2 = 2 + parseInt(count);
var num3 = 3 + parseInt(count);
if(count <= 6) {
    $("#row").append(
        `<div class="imgbox">` +
        `<div class="imgcard">` +
        `<div class="">` +
        `<div class="delete" onclick="del(` + num1 + `)">` +
        `<button type="button" class="xi-close"></button>` +
        `</div>` +
        `<label for="img` + num1 + `">` +
        `<div class="imgdiv" id="image_container">` +
        `<img src="" class="thumnail" id="thumnail` + num1 + `">` +
        `<div class="imginpdiv" id="imginpdiv` + num1 + `">` +
        `<div>` +
        `<div class="text-center">` +
        `<img src="https://frip.host/img/add.85e31315.svg" width="48" height="48">` +
        `<div>썸네일 이미지 추가하기</div>` +
        `</div>` +
        `</div>` +
        `</div>` +
        `<input id="img` + num1 + `" type="file" style="display: none;" accept="image/*" onchange="setThumbnail(event,` + num1 + `);">` +
        `</div>` +
        `</label>` +
        `<div class="container"></div>` +
        `</div>` +
        `</div>` +
        `</div>` +

        `<div class="imgbox">` +
        `<div class="imgcard">` +
        `<div class="">` +
        `<div class="delete" onclick="del(` + num2 + `)">` +
        `<button type="button" class="xi-close"></button>` +
        `</div>` +
        `<label for="img` + num2 + `">` +
        `<div class="imgdiv" id="image_container">` +
        `<img src="" class="thumnail" id="thumnail` + num2 + `">` +
        `<div class="imginpdiv" id="imginpdiv` + num2 + `">` +
        `<div>` +
        `<div class="text-center">` +
        `<img src="https://frip.host/img/add.85e31315.svg" width="48" height="48">` +
        `<div>썸네일 이미지 추가하기</div>` +
        `</div>` +
        `</div>` +
        `</div>` +
        `<input id="img` + num2 + `" type="file" style="display: none;" accept="image/*" onchange="setThumbnail(event,` + num2 + `);">` +
        `</div>` +
        `</label>` +
        `<div class="container"></div>` +
        `</div>` +
        `</div>` +
        `</div>` +
        `<div class="imgbox">` +
        `<div class="imgcard">` +
        `<div class="">` +
        `<div class="delete" onclick="del(` + num3 + `)">` +
        `<button type="button" class="xi-close"></button>` +
        `</div>` +
        `<label for="img` + num3 + `">` +
        `<div class="imgdiv" id="image_container">` +
        `<img src="" class="thumnail" id="thumnail` + num3 + `">` +
        `<div class="imginpdiv" id="imginpdiv` + num3 + `">` +
        `<div>` +
        `<div class="text-center">` +
        `<img src="https://frip.host/img/add.85e31315.svg" width="48" height="48">` +
        `<div>썸네일 이미지 추가하기</div>` +
        `</div>` +
        `</div>` +
        `</div>` +
        `<input id="img` + num3 + `" type="file" style="display: none;" accept="image/*" onchange="setThumbnail(event,` + num3 + `);">` +
        `</div>` +
        `</label>` +
        `<div class="container"></div>` +
        `</div>` +
        `</div>` +
        `</div>`
    );
}
count = count + 3;
}