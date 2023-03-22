<template>
  <div class="text-content">
    <div class="h1">
      <span>a</span>
      <span>r</span>
      <span>l</span>
      <span>i</span>
      <span>n</span>
      <span>a</span>
      <br>
      <span>c</span>
      <span>o</span>
      <span>d</span>
      <span>e</span>
    </div>
  </div>

</template>

<script>
export default {
  name: "JumptextComponents"
}
</script>

<style scoped>
@import url("https://fonts.googleapis.com/css?family=Luckiest+Guy");
/* BODY */
.text-content {
  overflow: hidden;
  font-family: "Luckiest Guy", cursive;
  -webkit-font-smoothing: antialiased;
}

::selection {
  background: transparent;
}
/* CLOUDS */

/* JUMP */
.h1 {
  cursor: default;
  width: 100%;
  margin: auto;
  display: block;
}

.h1 span {
  position: relative;
  top: 20px;
  display: inline-block;
  -webkit-animation: bounce 0.3s ease infinite alternate;

  color: #fff;
  text-shadow: 0 1px 0 #ccc, 0 2px 0 #ccc, 0 3px 0 #ccc, 0 4px 0 #ccc,
  0 5px 0 #ccc, 0 6px 0 transparent, 0 7px 0 transparent, 0 8px 0 transparent,
  0 9px 0 transparent, 0 10px 10px rgba(0, 0, 0, 0.4);
}

.h1 span:nth-child(odd) {
  -webkit-animation-delay: 0.1s;
}

/* ANIMATION */
@-webkit-keyframes bounce {
  100% {
    top: -20px;
    text-shadow: 0 1px 0 #ccc, 0 2px 0 #ccc, 0 3px 0 #ccc, 0 4px 0 #ccc,
    0 5px 0 #ccc, 0 6px 0 #ccc, 0 7px 0 #ccc, 0 8px 0 #ccc, 0 9px 0 #ccc,
    0 50px 25px rgba(0, 0, 0, 0.2);
  }
}
</style>