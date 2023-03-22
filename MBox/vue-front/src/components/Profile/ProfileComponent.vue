<template>
  <div>
    <div>
      <HeaderViews></HeaderViews>
    </div>
    <div class="row p-3">
      <div class="col-3 d-flex flex-column">
        <CardProfileComponent :id="id"/>
        <div class="vh-50 flex-grow-1 overflow-hidden">
          <FollowListComponent :title="'Followers'" :url="'api/users/followers'"/>
          <FollowListComponent :title="'Following'" :url="'api/users/followings'"/>
        </div>

      </div>
      <div class="col-9">
        <div class="block-background d-flex">
<!--          <Text3DComponents/>-->
          <Carusel3DComponents class="position-relative"/>
<!--          <BubblesAnimationComponents/>-->
        </div>
        <div class="d-flex content overflow-hidden">
          <div class="block-profile-content">
            <div class="row justify-content-center h-100">
              <div class="col-6 h-100 p-4">
                <FrameComponent :height-frame="400"/>
              </div>
              <div class="col-6 h-100">
                <carousel :items-to-show="1" class="h-100">
                  <slide key="1" class="h-100">
                    <PlayListComponent :title="'Albums'" :url="urlAlbums"/>
                  </slide>
                  <slide key="1">
                    <PlayListComponent :title="'Artists'" :url="urlArtist"/>
                  </slide>
                  <slide key="1">
                    <PlayListComponent :title="'Tracks'" :url="urlTracks"/>
                  </slide>
                  <template #addons>
                    <navigation class="text-info border border-danger rounded-circle"/>
                    <pagination class="bg-white"/>
                  </template>
                </carousel>
              </div>
              <!--            <PlayerComponents/>-->
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>

import FrameComponent from "@/components/Music/Spotify/FrameComponent.vue";
import HeaderViews from "@/views/MainPages/HeaderViews.vue";
import 'vue3-carousel/dist/carousel.css'
import {Carousel, Slide, Pagination, Navigation} from 'vue3-carousel'
import CardProfileComponent from "@/components/Profile/CardProfileComponent.vue";
import PlayListComponent from "@/components/Profile/PlayList/PlayListComponent.vue";
import BubblesAnimationComponents from "@/components/Profile/ExampleControllers/BubblesAnimationComponents.vue";
import PlayerComponents from "@/components/Profile/ExampleControllers/PlayerComponents.vue";
import Carusel3DComponents from "@/components/Profile/ExampleControllers/Carusel3DComponents.vue";
import FollowListComponent from "@/components/Profile/FollowingsFollowers/FollowListComponent.vue";
import Text3DComponents from "@/components/Profile/ExampleControllers/Text3DComponents.vue";

export default {
  name: "ProfileComponent",
  components: {
    Text3DComponents,
    FollowListComponent,
    Carusel3DComponents,
    PlayerComponents,
    BubblesAnimationComponents,
    PlayListComponent, Carousel,
    Slide,
    Pagination,
    Navigation, HeaderViews, FrameComponent, CardProfileComponent
  },
  data() {
    return {
      urlTracks:String,
      urlAlbums:String,
      urlArtist:String,
      isMyAccount:Boolean,
      id:String
    }
  },
  beforeUpdate() {
    this.changeId(this.$route.params.id);
  },
  methods:{
    changeId(id){
      if (id) {
        this.id=this.$route.params.id;
        this.urlTracks=`api/users/${this.id}/tracks`;
        this.urlAlbums=`api/users/${this.id}/albums`;
        this.urlArtist=`api/users/${this.id}/artists`;
        this.isMyAccount=true;
      }
      else {
        this.id=null;
        this.urlTracks='api/tracks';
        this.urlAlbums='api/albums';
        this.urlArtist='api/artists';
        this.isMyAccount=false;
      }
      console.log(this.id)
    }
  }
}
</script>
<style scoped>

.content {
  height: 50ch;
}
.vh-50{
  height: 50ch;
}
</style>