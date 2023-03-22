<template>
    <div>
        <div>
            <HeaderViews></HeaderViews>
        </div>
        <div class="block-container">
            <div class="block-background d-flex">
                <div class="block-full-info-profile">
                    <div class="block-logo block-flex">
                      <img src="https://play-lh.googleusercontent.com/DTzWtkxfnKwFO3ruybY1SKjJQnLYeuK3KmQmwV5OQ3dULr5iXxeEtzBLceultrKTIUTr" class="img-logo-profile" />
                        <p class="asd text-name">Prostou32</p>
                    </div>
                </div>
                <img src="https://wallpaperaccess.com/full/5650406.jpg" class="image-background"/>
            </div>
            <div class="d-flex">
              <div class="block-info">
                <p class="text-info-1">Level: 100</p>
                <p class="text-info-1">Followers: 100</p>
                <p class="text-info-1">Likes: 10000</p>
                <button class="button-sub">
                  <p class="text-sub">Subscribe</p>
                </button>
              </div>
                <div class="block-profile-content">
                    <div class="block-menu-profile-content">
                        <ul class="d-flex w-100 justify-content-between align-items-center">
                            <li><RouterLink class="menu-item-prof-content" to="/Profile/General">General</RouterLink></li>
                            <li><a href="#" class="menu-item-prof-content">Music</a></li>
                            <li><a href="#" class="menu-item-prof-content">Playlist</a></li>
                            <li><a href="#" class="menu-item-prof-content">Clips</a></li>
                            <li><a href="#" class="menu-item-prof-content">Community</a></li>
                        </ul>
                    </div>
                    <div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import HeaderViews from './MainPages/HeaderViews.vue';
    import GeneralViews from './ProfilePages/GeneralViews.vue';
export default {
    components: { 
        HeaderViews, 
        GeneralViews 
    }
}
</script>