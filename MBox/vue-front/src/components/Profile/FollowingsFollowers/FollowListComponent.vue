<template>
  <div class="h-50 overflow-hidden">
      <div class="h3 text-success">{{ title }}</div>
      <hr>
      <ul class="d-flex flex-column overflow-auto h-75">
        <li v-for="item in follows" :key="item.uri">
          <FollowItemComponent :id="item.uri" :img="item.img" :name-item="item.name"/>
        </li>
      </ul>
  </div>

</template>

<script>
import FollowItemComponent from "@/components/Profile/FollowingsFollowers/FollowItemComponent.vue";

export default {
  name: "FollowListComponent",
  components: {FollowItemComponent},
  props: {
    title: {
      type: String
    },
    url: {
      type: URL
    }
  },
  data(){
    return{
      follows:[
        {
          "uri": "spotify:album:2UYxjXHKm1JDT6JA7OSeR6",
          "name": "Swan Songs",
          "img": "https://i.scdn.co/image/ab67616d00001e02e3a40a64f0473c111cf42b06"
        },
        {
          "uri": "spotify:album:05ofL0H4dSj3jCuzEtVzZN",
          "name": "Notes From The Underground",
          "img": "https://i.scdn.co/image/ab67616d00001e02af869954d48d02f3611b4584"
        },
        {
          "uri": "spotify:album:00LaE2YT3EkPBED8vLyFvp",
          "name": "American Tragedy (Deluxe Edition)",
          "img": "https://i.scdn.co/image/ab67616d00001e021f267bd335e93b41e56da619"
        },
        {
          "uri": "spotify:album:56CWTHCr8ZBZ1ojmppH5br",
          "name": "Five",
          "img": "https://i.scdn.co/image/ab67616d00001e029d9ad06a0afeb368cdab1067"
        },
        {
          "uri": "spotify:album:15lJDiNH3kFh7uY3E9TEqM",
          "name": "Notes From The Underground - Unabridged (Deluxe)",
          "img": "https://i.scdn.co/image/ab67616d00001e0229f572882f1c5513f16064db"
        },
        {
          "uri": "spotify:album:5EdJlD6ASMACKDLhczcwhb",
          "name": "Evil",
          "img": "https://i.scdn.co/image/ab67616d00001e0272bb86f60ac85549e18c2164"
        },
        {
          "uri": "spotify:album:2lgWazCOy1TJflfqXiy01v",
          "name": "Swan Songs (Edited Version)",
          "img": "https://i.scdn.co/image/ab67616d00001e022000b18f3f00356e534daa50"
        },
        {
          "uri": "spotify:album:5vz3PvKA4yReWpzLVwG1WW",
          "name": "Day Of The Dead (Deluxe Version)",
          "img": "https://i.scdn.co/image/ab67616d00001e02eeb9d927f8b79492e716fc47"
        },
        {
          "uri": "spotify:album:4LbLIANVeJ8JQ9i5V3c05s",
          "name": "Hotel Kalifornia",
          "img": "https://i.scdn.co/image/ab67616d00001e023a7d4b3be37ab6e15a3074ca"
        },
        {
          "uri": "spotify:album:4ltnRU2rPIbK3RPdtQFAWm",
          "name": "Day Of The Dead",
          "img": "https://i.scdn.co/image/ab67616d00001e02e5991792ed23a15c8c8927d5"
        }
      ]
    }
  },
  mounted() {
    this.axios
        .post(this.url,{
          headers: {
            'Authorization': `Bearer ${this.STATE_TOKEN}`
          }})
        .then(response => this.follows=response.data);
  }
}
</script>

<style scoped>
::-webkit-scrollbar {
  width: 10px;
}

/* Track */
::-webkit-scrollbar-track {
  box-shadow: inset 0 0 5px #efeac9;
  border-radius: 5px;
}

/* Handle */
::-webkit-scrollbar-thumb {
  background: #BFC9CA;
  border-radius: 5px;
}

/* Handle on hover */
::-webkit-scrollbar-thumb:hover {
  background: #06cff3;
}
</style>