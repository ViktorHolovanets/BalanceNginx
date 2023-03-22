<template>
  <div class="container">
    <div class="box">
        <span style="--i: 1">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 2">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 3">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 4">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 5">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 6">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 7">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 8">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 9">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 10">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 11">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 12">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 13">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 14">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 15">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
      <span style="--i: 16">
          <i>MUSIC</i>
          <i>BOX</i>
        </span>
    </div>
  </div>
</template>

<script>
export default {
  name: "Text3DComponents"
}
</script>

<style lang="scss" scoped>
@import url('https://fonts.googleapis.com/css2?family=Heebo:wght@400;600&family=Poppins:wght@100;500;600;800;900&family=Lobster+Two:ital,wght@0,400;0,700;1,400&display=swap');

$font1: 'Poppins', sans-serif;
$font2: 'Lobster Two', cursive;
$white:#fff;
$black:#000;
$primary-light: #f9fafb;
$second-light:#f0f0f0;
$third-light:#DADBDB;

$primary-dark:#222;
$second-grey:#4f4f4f;

$first-shadow: rgba(0,0,0,0.3);

$success: rgba(61, 168, 102, 0.6);
$error: rgba(168, 30, 14, 0.6);

$primary-color:#5c5fc4;
$second-color:#c4c15c;

/* GLOBAL CONFIG RESET */
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  font-family: $font1;
}

select:focus, input:focus, button:focus{
  outline:none;
}

/* -------- BODY DISPLAY --------- */

/* -------- TYPE SELECTORS --------- */

/* -------- CLASS --------- */

.container{
  z-index: -1;
  display: flex;
  justify-content: center;
  align-items: center;

  .box{
    transform-style: preserve-3d;
    animation: animate 7s ease-in-out infinite alternate;

    span{
      background: linear-gradient(90deg, rgba(0, 0, 0, 0.1), rgba(0, 0, 0, 0.5) 90%, transparent);
      text-transform: uppercase;
      line-height: 0.76em;
      position: absolute;
      color: $white;
      font-size: 3.5em;
      white-space: nowrap;
      font-weight: bold;
      padding: 0px 10px;
      transform-style: preserve-3d;
      text-shadow: 0 10px 15px $first-shadow;
      transform: translate(-50%, -50%) rotateX(calc(var(--i) * 22.5deg)) translateZ(109px);

      i{
        font-style: initial;

        &:nth-child(1){
          color: $primary-color;
        }

        &:nth-child(2){
          color: $second-color;
        }
      }
    }
  }
}

@keyframes animate {
  0%{
    transform: perspective(500px) rotateX(0deg) rotate(5deg);
  }
  100%{
    transform: perspective(50px) rotateX(360deg) rotate(5deg);
  }
}

/* -------- PSEUDO CLASS --------- */

/* -------- MEDIA QUERY --------- */

@media (max-width: 800px) {

}
</style>