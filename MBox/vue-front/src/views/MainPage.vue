<template>
    <section>
      <div class="container-fluid p-0 block-main-background">
          <HeaderViews/>
          <SidebarViews/>
      </div>
    </section>
</template>
<script>
import HeaderViews from './MainPages/HeaderViews.vue';
import SidebarViews from './MainPages/SideBarViews.vue';
export default {
    components: {
        HeaderViews,
        SidebarViews,
    }
}
</script>
<style>
</style>