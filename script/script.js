$('.sns1_page').hide() //sns 첫번째 페이지 안보이게 하기
$('.sns2_page').hide() //sns 두번째 페이지 안보이게 하기
$('.sns3_page').hide() //sns 세번째 페이지 안보이게 하기
$('.sns4_page').hide() //sns 네번째 페이지 안보이게 하기
$('.sns5_page').hide() //sns 다섯번째 페이지 안보이게 하기
$('.sns6_page').hide() //sns 여섯번째 페이지 안보이게 하기

$('.sns_design > li:nth-child(1) > img').on('click',function(){
    $('.sns1_page').show()
})

$('#closer').on('click',function(){
    $('.sns1_page').hide()
})
// -------------------------------------------------
$('.sns_design > li:nth-child(2) > img').on('click',function(){
    $('.sns2_page').show()
})

$('#closer2').on('click',function(){
    $('.sns2_page').hide()
})
// -------------------------------------------------
$('.sns_design > li:nth-child(3) > img').on('click',function(){
    $('.sns3_page').show()
})

$('#closer3').on('click',function(){
    $('.sns3_page').hide()
})
// -------------------------------------------------
$('.sns_design > li:nth-child(4) > img').on('click',function(){
    $('.sns4_page').show()
})

$('#closer4').on('click',function(){
    $('.sns4_page').hide()
})
// -------------------------------------------------
$('.sns_design > li:nth-child(5) > img').on('click',function(){
    $('.sns5_page').show()
})

$('#closer5').on('click',function(){
    $('.sns5_page').hide()
})
// -------------------------------------------------
$('.sns_design > li:nth-child(6) > img').on('click',function(){
    $('.sns6_page').show()
})

$('#closer6').on('click',function(){
    $('.sns6_page').hide()
})

// 작업중
$('.work').hide()
$('.design_link a:first-child').on('mouseover',function(){
    $('.work').show()
})
$('.design_link a:first-child').on('mouseout',function(){
    $('.work').hide()
})
