<template>
  <ul class="d-flex episodes">
    <li v-for="item in music" :key="item.uri">
      <ButtonFrameComponent :uri="item.uri" :img="item.img"/>
    </li>
  </ul>
</template>

<script>
import ButtonFrameComponent from "@/components/Music/Spotify/ButtonFrameComponent.vue";
import ContentComponents from "../../Content/ContentComponents.vue";

export default {
  name: "ListButtonsFrameComponent",
  components: { ButtonFrameComponent, ContentComponents },
  data() {
    return {
      music: [
        {
          uri:'spotify:track:7J8D1BVioYBaKFUnDAHTak',
          img:'https://i.scdn.co/image/ab67616d00001e02e3a40a64f0473c111cf42b06'
        },
        {
          uri:'spotify:track:1czaCgWLWgqp0eRIZ0BcXh',
          img:'https://i.scdn.co/image/ab67616d00001e02af869954d48d02f3611b4584'
        },
        {
          uri:'spotify:track:5wBLDkxVvclanSitx5jq8e',
          img:'https://i.scdn.co/image/ab67616d00001e02e3a40a64f0473c111cf42b06'
        }
      ],
      hasError: false
    }
  }

}
</script>

<style scoped>
ul{
  display: flex;
}
</style>