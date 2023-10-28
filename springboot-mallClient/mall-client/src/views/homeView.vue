<template>
    <div class="p-0">
      <div class="row p-0 m-0">
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
        class="p-0 h-10"
        >
          <swiper-slide><img class="img-fluid" src="@/assets/slider1.jpg" width="100%"></swiper-slide>
          <swiper-slide><img class="img-fluid" src="@/assets/slider2.jpg"></swiper-slide>
          <swiper-slide><img class="img-fluid" src="@/assets/slider3.jpg"></swiper-slide>
        </swiper>
      </div>
      <div class="row mx-0 my-3">
        <div class="text-center fs-1">
          產品分類
        </div>
      </div>
    </div>
</template>

<script>
  // Import Swiper Vue.js components
  import { Swiper, SwiperSlide } from 'swiper/vue';

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

</style>
