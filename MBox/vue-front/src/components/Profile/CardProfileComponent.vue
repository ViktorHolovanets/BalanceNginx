<template>
  <div class="row">
    <div class="col-6">
      <img
          src="https://play-lh.googleusercontent.com/DTzWtkxfnKwFO3ruybY1SKjJQnLYeuK3KmQmwV5OQ3dULr5iXxeEtzBLceultrKTIUTr"
          class="img-logo-profile"/>
      <p class="asd text-name">Prostou32</p>
    </div>
    <div class="col-6">
      <p class="text-info-1">Level: 100</p>
      <p class="text-info-1">Followers: 100</p>
      <p class="text-info-1">Likes: 10000</p>
      <div v-if="id" >
        <button v-if="user.is_sub==-1"  class="button-sub">
          <p class="text-sub text-success">Subscribe</p>
        </button>
        <button v-else-if="user.is_sub==1"  class="button-sub">
          <p class="text-sub text-danger">Unsubscribe</p>
        </button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "CardProfileComponent",
  props: {
    id: String
  },
  data() {
    return {
      user: [],
    }
  },
  mounted() {
    if (this.id) {
      this.axios
          .get(`api/users/${this.id}`,{
            headers: {
              'Authorization': `Bearer ${this.STATE_TOKEN}`
            }})
          .then(response => this.user=response.data);
    }
  }
}
</script>

<style scoped>

</style>