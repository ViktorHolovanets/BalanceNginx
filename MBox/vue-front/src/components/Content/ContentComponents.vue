<template>
    <div class="Contents">
        <div class="Band">
            <img :src="_storage_image" :alt="_name" id="AvatarContent">
            <div class="Bio">
                <h1 id="ParagraphColor">{{ _name }}</h1>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    props: {
        _name: String,
        _storage_image: String,
        _alt: String
    }
}
</script>
<style lang="">
    
</style>