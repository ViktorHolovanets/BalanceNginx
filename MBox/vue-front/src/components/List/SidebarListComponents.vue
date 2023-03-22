<template>
    <div class="LinkedNav">
        <ContentNavigatorComponents></ContentNavigatorComponents>
        <div v-if="true">
          <ContentMyAccountComponents></ContentMyAccountComponents>
          <ContentFollowersComponents></ContentFollowersComponents>
        </div>
    </div>
</template>
<script>
import ContentMyAccountComponents from "@/components/Content/ContentMyAccountComponents.vue";
import ContentFollowersComponents from "@/components/Content/ContentFollowersComponents.vue";
import ContentNavigatorComponents from "@/components/Content/ContentNavigatorComponents.vue";

export default {
  components: {ContentNavigatorComponents, ContentFollowersComponents, ContentMyAccountComponents}

}
</script>
<style lang="">
    
</style>