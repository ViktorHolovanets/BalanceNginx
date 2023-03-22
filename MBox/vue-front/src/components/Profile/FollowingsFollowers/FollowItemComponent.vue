<template>
  <div>
    <router-link :to="{ name: 'profile', params: { id: this.id } }" >
      <div class="col-12 d-flex item-frame align-items-center">
        <img :src="img" class="rounded-circle">
        <p class="m-2 text-white">{{nameItem}}</p>
      </div>
    </router-link>
  </div>

</template>

<script>
import {onMounted} from "vue";

export default {
  name: "FollowItemComponent",
  props:{
    id:{

    },img:{},nameItem:{}
  }
}
</script>

<style scoped>
img{
  width:50px;
}
</style>