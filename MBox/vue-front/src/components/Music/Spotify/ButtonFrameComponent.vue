<template>
  <button :data-spotify-id="uri" class="item-frame">
    <img :src="img">
  </button>
</template>

<script>
export default {
  name: "ButtonFrameComponent",
 props:{
    img:{
      type:String,
    },
   uri:{
      type:String,
      required:true,
   },
  },
}
</script>

<style scoped>
  button{
    border-radius: 100%;
    overflow-x:hidden;
  }
  img{
    width: 150px;
  }
</style>