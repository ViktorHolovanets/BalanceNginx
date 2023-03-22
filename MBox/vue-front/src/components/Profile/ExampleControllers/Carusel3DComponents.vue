<template>
  <div class="content-carusel ">
    <div class="container">
      <div class="carousel-content">
        <div class="carousel__face"><span> Legion of the Damned </span></div>
        <div class="carousel__face"><span> Suffocation </span></div>
        <div class="carousel__face"><span>Arch Enemy</span></div>
        <div class="carousel__face"><span>Cannibal Corpse </span></div>
        <div class="carousel__face"><span>Just give it</span></div>
        <div class="carousel__face"><span>A try</span></div>
        <div class="carousel__face"><span>And see</span></div>
        <div class="carousel__face"><span>How IT Works</span></div>
        <div class="carousel__face"><span>Woow</span></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Carusel3DComponents"
}
</script>

<style scoped>
.content-carusel {
  margin: 0;
  background: transparent;
  text-align: center;
  font-family: sans-serif;
  color: #fefefe;
  width: 100%;
  height: 100%;
}

.container {
  position: relative;
  width: 250px;
  margin: auto auto;
  perspective: 1000px;
}

.carousel-content {
  position: relative;
  width: 100%;
  height: 100%;
  transform-style: preserve-3d;
  animation: rotate360 60s infinite forwards linear;
}

.carousel__face {
  position: absolute;
  width: 100%;
  height: 100px;
  top: 20px;
  left: 10px;
  right: 10px;
  background-size: cover;
  box-shadow: inset 0 0 0 2000px rgba(0, 0, 0, 0.5);
  display: flex;
}

span {
  margin: auto;
  font-size: 1.5rem;
}


.carousel__face:nth-child(1) {
  background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyUZ5zqZlJqEOUgKkCPO8ZQII5pycrJ_SSrg&usqp=CAU");
  transform: rotateY(0deg) translateZ(430px);
}

.carousel__face:nth-child(2) {
  background-image: url("https://i.ytimg.com/an/EEYSU4XGLpI/8579954845226845826_mq.jpg?v=6185bbf3");
  transform: rotateY(40deg) translateZ(430px);
}

.carousel__face:nth-child(3) {
  background-image: url("https://is2-ssl.mzstatic.com/image/thumb/Music125/v4/cb/13/a4/cb13a4fa-5805-5ff8-f4ae-3fa8cbfc5af5/886449584031.jpg/600x600bf-60.jpg");
  transform: rotateY(80deg) translateZ(430px);
}

.carousel__face:nth-child(4) {
  background-image: url("https://cdns-images.dzcdn.net/images/artist/46d26181f8e23952fbbdb3eb08dbfc70/500x500.jpg");
  transform: rotateY(120deg) translateZ(430px);
}
.carousel__face:nth-child(5) {
  background-image: url("https://images.pexels.com/photos/969679/pexels-photo-969679.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
  transform: rotateY(160deg) translateZ(430px); }
.carousel__face:nth-child(6) {
  background-image: url("https://images.pexels.com/photos/1834400/pexels-photo-1834400.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
  transform: rotateY(200deg) translateZ(430px); }
.carousel__face:nth-child(7) {
  background-image: url("https://images.pexels.com/photos/1415268/pexels-photo-1415268.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
  transform: rotateY(240deg) translateZ(430px); }
.carousel__face:nth-child(8) {
  background-image: url("https://images.pexels.com/photos/135018/pexels-photo-135018.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
  transform: rotateY(280deg) translateZ(430px); }
.carousel__face:nth-child(9) {
  background-image: url("https://images.pexels.com/photos/1175135/pexels-photo-1175135.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
  transform: rotateY(320deg) translateZ(430px); }

@keyframes rotate360 {
  from {
    transform: rotateY(0deg);
  }
  to {
    transform: rotateY(-360deg);
  }
}

</style>