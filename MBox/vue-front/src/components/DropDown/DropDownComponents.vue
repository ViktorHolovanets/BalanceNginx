<template>
    <div class = "dropdown">
        <button class="dropbutton">
            <img src="https://t3.ftcdn.net/jpg/01/65/63/94/360_F_165639425_kRh61s497pV7IOPAjwjme1btB8ICkV0L.jpg" class="personPhoto">
        </button>
        <div class="dropdown-content">
            <div v-if="false">
              <div class="username">
                <div class="PrimaryUserProperty">
                  <RouterLink to="/Profile" class="linkLeft">Login</RouterLink>
                  <RouterLink to="/Profile" class="linkLeft">Register</RouterLink>
                  <hr>
                </div>
              </div>
            </div>
            <div v-else>
              <div class="Profile">
                <div class="Avatar">
                  <div class="d-flex block-header-drop">
                    <img src="https://t3.ftcdn.net/jpg/01/65/63/94/360_F_165639425_kRh61s497pV7IOPAjwjme1btB8ICkV0L.jpg" id="imgDropdownPhoto">
                    <h1 class="Name">Current user </h1>
                  </div>
                  <div class="username">
                    <div class="PrimaryUserProperty">
                      <RouterLink to="/Profile" class="linkLeft">My profile</RouterLink>
                      <a href="#" class="linkLeft"> Setting</a>
                      <a href="#" class="linkLeft"> Current plan</a>
                      <a href="#" class="linkLeft"> Verification</a>
                      <a href="#" class="linkLeft"> Logout</a>
                      <hr>
                    </div>
                  </div>
                  <div class="PrimaryUserProperty">
                    <h1>Payments & Personallity</h1>
                    <a href="#" class="linkLeft"> Recipment</a>
                    <a href="#" class="linkLeft"> Personalisation</a>
                  </div>
                  <hr>
                  <div class="PrimaryUserProperty">
                    <h1>Localization & Views</h1>
                    <a href="#" class="linkLeft">Themes</a>
                    <a href="#" class="linkLeft">Language: EN(USA)</a>
                    <a href="#" class="linkLeft">Country: Brazil, South America</a>
                    <a href="#" class="linkLeft">Contact us</a>
                    <a href="#" class="linkLeft">About us</a>
                  </div>
                </div>
              </div>
            </div>
        </div>
    </div>
</template>
<script>

export default {

}
</script>
<style lang="">
    
</style>