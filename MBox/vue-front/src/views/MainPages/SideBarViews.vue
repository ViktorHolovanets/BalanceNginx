<template>
    <main class="block-main-container">
        <div class="MainContentItems">
            <div class="LeftPanel">
                <div class="LeftPanelContext">
                    <nav class="navLeft">
                        <SidebarListComponents></SidebarListComponents>
                    </nav>
                    <div class="AudioPlayer">
                        <FrameComponent/>
                    </div>
                </div>
            </div>
            <ContentViews></ContentViews>
        </div>   
    </main>
</template>

<script>
import ContentViews from './ContentViews.vue';
import FrameComponent from "@/components/Music/Spotify/FrameComponent.vue";
import ListButtonsFrameComponent from "@/components/Music/Spotify/ListButtonsFrameComponent.vue";
import SidebarListComponents from '../../components/List/SidebarListComponents.vue';
export default {
    components: { ListButtonsFrameComponent, FrameComponent, ContentViews, SidebarListComponents }
}
</script>

<style>

</style>