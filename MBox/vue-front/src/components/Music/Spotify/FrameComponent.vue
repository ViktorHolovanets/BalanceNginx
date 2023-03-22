<template>
  <div class="iframe-spotify"></div>
</template>

<script>
export default {
  name: "FrameComponent",
  props:{
    heightFrame:{
      type:String,
    },
  },
  mounted() {
    const insertScript = document.createElement('script')
    insertScript.setAttribute('src', 'https://open.spotify.com/embed-podcast/iframe-api/v1')
    document.body.appendChild(insertScript)

    window.onSpotifyIframeApiReady = (IFrameAPI) => {
      let element = document.getElementsByClassName('iframe-spotify')[0];
      let options = {
        width: '100%',
        height: this.heightFrame,
        uri: 'spotify:track:1aV5C36f5ipZodx6ocKslc'
      };
      let callback = (EmbedController) => {
        document.querySelectorAll('ul.episodes > li>.item-frame').forEach(
            episode => {
              episode.addEventListener('click', () => {
                EmbedController.loadUri(episode.dataset.spotifyId)
              });
            })
      };
      IFrameAPI.createController(element, options, callback);
    };
  }

}




</script>

<style scoped>
</style>