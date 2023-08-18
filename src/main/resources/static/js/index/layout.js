/* 슬라이드 */

// 슬라이드 gallery의 넓이를 img의 개수만큼 설정
const $gallery = $(".main-visual ul");
const $galleryLi = $(".main-visual li");
const $galleryWidth = 100 * ($galleryLi.length) + "%";

$gallery.css("width",$galleryWidth);


// 버튼 엘리먼트 선택하기
 let count = 0;
 const $btnPrev = $(".arrow.left");
 const $btnNext = $(".arrow.right");

 /* 페이지네이션 */
 const $galleryTotal = $gallery.find("li").length;
 const $totalCount = $(".max");
 const $currCount = $(".curr");

/* 총 페이지 수 */
$totalCount.text($galleryLi.length);

 $btnNext.on("click",function(){
    if(count >= $galleryLi.length-1)count = -1;
    ++ count;
    const $gap = $galleryLi.eq(1).offset().left - $galleryLi.eq(0).offset().left;
    const $goto = (-$gap * count) + "px";
    $gallery.css("left", $goto);
    $currCount.text(count + 1);
 })

 $btnPrev.on("click",function(){
    if(count <= 0) count = $galleryLi.length;
    -- count;
    const $gap = $galleryLi.eq(1).offset().left - $galleryLi.eq(0).offset().left;
    const $goto = (-$gap * count) + "px";
    $gallery.css("left", $goto);
    $currCount.text(count + 1);
 })

// 좋아요
$(".like-btn").on("click",function(){
    if($(this).find("i").hasClass("xi-heart")){
        $(this).find("i").attr("class","xi-heart-o");
        $(this).removeClass("active");
    }else{
        $(this).find("i").attr("class","xi-heart");
        $(this).addClass("active");
    }
});
