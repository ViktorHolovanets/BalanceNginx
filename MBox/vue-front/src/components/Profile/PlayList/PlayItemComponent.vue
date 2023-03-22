<template>
  <div :data-spotify-id="uri" class="col-12 d-flex item-frame align-items-center">
      <img :src="img">
      <p class="m-2 text-white">{{nameItem}}</p>
  </div>
</template>

<script>
export default {
  name: "PlayItemComponent",
  props:{
    img:{
      type:String,
    },
    uri:{
      type:String,
      required:true,
    },
    nameItem:{
      type:String,
      required:true,
    }
  },
}
</script>

<style scoped>
img{
  width:50px;
}
</style>