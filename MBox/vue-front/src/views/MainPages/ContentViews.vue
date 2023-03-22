
<template>
    <div class="MainContent">
        <section class="TopContent">
            <!--
            <h1 id="MainTextCentralContent"> Popular </h1>
            <div class="TopChildContent">
              <ListButtonsFrameComponent/>
            </div>
            -->
            <div>
              <div>
                <div>
                  <!-- Ось тут буде іконка -->
                </div>
                <div>
                  <!-- Ось тут буде невеличкий текстовий контент -->
                </div>
              </div>
              <div>
                <div>
                  <!-- Ось тут буде список ListButtonsFrameComponents тільки з переробленими стилями -->
                </div>
              </div>
            </div>
        </section>
    </div>
</template>
<script>
import ListButtonsFrameComponent from "@/components/Music/Spotify/ListButtonsFrameComponent.vue";
import ContentComponents from "../../components/Content/ContentComponents.vue";

export default {
  components: { ListButtonsFrameComponent, ContentComponents }

}
</script>
<style lang="">

</style>