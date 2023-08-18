//팔로우 상태 값
let fStatus = 0;
//좋아요 상태 값
let like = 0;

console.log(fStatus);

function heart() {
    if (fStatus == 0) {
        fStatus = 1;

        $('.heart').addClass("heartOn");
        $('.heart').text('팔로우 중');
    }else {
        fStatus = 0;

        $('.heart').removeClass("heartOn");
        $('.heart').text('팔로우');
    }
}

function likeOn() {
    if (like == 0) {
        like = 1;
        $('.xi-heart-o').attr("class","xi-heart");
    } else {
        like = 0;
        $('.xi-heart').attr("class","xi-heart-o");
    }
}



// /////////////////////////////////////////////////
$(document).ready(function () {
    $(".slick-slide").not(".active").hide(); //화면 로딩 후 첫번째 div를 제외한 나머지 숨김

    HTMLCollection.prototype.forEach = Array.prototype.forEach;
    let count = 0;

    const bannerWrap = document.querySelector('.slick-track');
    const banners = document.querySelectorAll('.imgs');
    banners.forEach((banner, i) => {
        banner.src=`../../static/img/togetherImg/${i + 1}.jpg`;
    });
});

//이전 슬라이드
function prevSlide() {
    console.log("bbbb");
    $(".slick-slide").hide(); //모든 div 숨김
    var allSlide = $(".slick-slide"); //모든 div 객체를 변수에 저장
    var currentIndex = 0; //현재 나타난 슬라이드의 인덱스 변수

    //반복문으로 현재 active클래스를 가진 div를 찾아 index 저장
    $(".slick-slide").each(function(index,item){
        if($(this).hasClass("active")) {
            currentIndex = index;
        }

    });

    //새롭게 나타낼 div의 index
    var newIndex = 0;

    if(currentIndex <= 0) {
        //현재 슬라이드의 index가 0인 경우 마지막 슬라이드로 보냄(무한반복)
        newIndex = allSlide.length-1;
    } else {
        //현재 슬라이드의 index에서 한 칸 만큼 뒤로 간 index 지정
        newIndex = currentIndex-1;
    }

    //모든 div에서 active 클래스 제거
    $(".slick-slide").removeClass("active");

    //새롭게 지정한 index번째 슬라이드에 active 클래스 부여 후 show()
    $(".slick-slide").eq(newIndex).addClass("active");
    $(".slick-slide").eq(newIndex).show();

}

//다음 슬라이드
function nextSlide() {
    console.log("aaa");
    $(".slick-slide").hide();
    var allSlide = $(".slick-slide");
    var currentIndex = 0;

    $(".slick-slide").each(function(index,item){
        if($(this).hasClass("active")) {
            currentIndex = index;
        }

    });

    var newIndex = 0;

    if(currentIndex >= allSlide.length-1) {
        //현재 슬라이드 index가 마지막 순서면 0번째로 보냄(무한반복)
        newIndex = 0;
    } else {
        //현재 슬라이드의 index에서 한 칸 만큼 앞으로 간 index 지정
        newIndex = currentIndex+1;
    }

    $(".slick-slide").removeClass("active");
    $(".slick-slide").eq(newIndex).addClass("active");
    $(".slick-slide").eq(newIndex).show();

}


