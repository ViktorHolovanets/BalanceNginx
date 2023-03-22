<template>
  <div class="d-flex w-100 justify-content-around">
    <nav class="d-flex col-12 w-100 p-2 align-items-center">
      <ul class="d-flex align-items-center w-100 justify-content-between">
        <li>
          <div class="block-searching p-3">
            <form>
              <input class="block-input-search" type="text" name="search" placeholder="Entry artist, album, trackname , etc"/>
            </form>
          </div>
        </li>
        <li class="mt-3"><a href="#" class="text-link p-2">Charts</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Popular</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Podcasts</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Events</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Concert</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Billboard</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Shows</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">News</a></li>
        <li class="mt-3"><a href="#" class="text-link p-2">Music Labels</a></li>
        <li class="mt-1">
          <DropDownComponents></DropDownComponents>
        </li>
      </ul>
    </nav>
  </div>
</template>
<script>
import DropDownComponents from '../DropDown/DropDownComponents.vue';
export default {
    components: {
        DropDownComponents
    }
}
</script>
<style lang="">
    
</style>