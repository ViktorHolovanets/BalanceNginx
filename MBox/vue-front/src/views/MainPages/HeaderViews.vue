<template>
    <header class="block-header shadow-lg">
        <div class="block-header-content w-100 ">
            <div class="w-25">
                <h1 class="w-50 p-1">M-box</h1>
            </div>
            <div class="w-100 d-flex justify-content-around">
                <HeaderListComponents></HeaderListComponents>
            </div>
        </div>
    </header>
</template>
<script>
import HeaderListComponents from '../../components/List/HeaderListComponents.vue';


export default {
    components: { HeaderListComponents }
}
</script>
<style lang="">
    
</style>