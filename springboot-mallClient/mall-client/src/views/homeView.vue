<template>
  <layOutWeb>
  <div class="container p-0">
    <div class="row p-0 m-0 ">
      <swiper
      :slidesPerView="1"
      :spaceBetween="30"
      :loop="true"
      :pagination="{
        clickable: true,
      }"
      :autoplay="{
        delay: 4000, 
        disableOnInteraction: false
      }"
      :navigation="true"
      :modules="modules"
      class="p-0 h-10 mt-2"
      >
        <swiper-slide><img class="img-fluid" src="@/assets/slider1.jpg"></swiper-slide>
        <swiper-slide><img class="img-fluid" src="@/assets/slider2.jpg"></swiper-slide>
        <swiper-slide><img class="img-fluid" src="@/assets/slider3.jpg"></swiper-slide>
      </swiper>
    </div>
    <div class="row mx-0 my-3">
      <div class="text-center fs-1">
        產品分類
      </div>
    </div>
    <div class="row mx-0 my-3">
      <div class="col-2"><img class="img-fluid border" src="@/assets/boyWear.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/girlWear.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/boyBag.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/shoes.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/makeups.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/baby.png"></div>
    </div>
    <div class="row mx-0 my-3">
      <div class="col-2"><img class="img-fluid border" src="@/assets/home.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/phone.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/play.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/sport.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/food.png"></div>
      <div class="col-2"><img class="img-fluid border" src="@/assets/outdoor.png"></div>
    </div>
    <div class="row mx-0 my-3">
      <img class="img-fluid p-0" src="@/assets/firstAds.jpg">
    </div>
    <div class="row my-3">
      <img class="img-fluid col-4" src="@/assets/secondAds.jpg">
      <img class="img-fluid col-4" src="@/assets/secondAds2.jpg">
      <img class="img-fluid col-4" src="@/assets/secondAds3.jpg">
    </div>
  </div>
</layOutWeb>
</template>

<script>
  // Import Swiper Vue.js components
  import { Swiper, SwiperSlide } from 'swiper/vue';
  // import layOutWeb from '@/components/layOutWeb.vue';
  // Import Swiper styles
  import 'swiper/css';

  import 'swiper/css/pagination';
  import 'swiper/css/navigation';
  // import required modules
  import { Pagination, Navigation, Autoplay} from 'swiper/modules';


  export default {
    components: {
      Swiper,
      SwiperSlide,
    },
    setup() {
      return {
        modules: [Pagination, Navigation, Autoplay]
      };
    },
  };
</script>
<style scoped>
#app {
  height: 100%;
}
html,
body {
  position: relative;
  height: 100%;
}

body {
  background: #eee;
  font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
  font-size: 14px;
  color: #000;
  margin: 0;
  padding: 0;
}

.swiper {
  width: 100%;
  height: 100%;
}

.swiper-slide {
  text-align: center;
  font-size: 18px;
  background: #fff;

  /* Center slide text vertically */
  display: flex;
  justify-content: center;
  align-items: center;
}

.swiper-slide img {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.swiper {
  margin-left: auto;
  margin-right: auto;
}
img{
cursor: pointer;  
}
</style>
