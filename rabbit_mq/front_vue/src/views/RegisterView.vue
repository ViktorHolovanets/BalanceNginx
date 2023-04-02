<template>

      <div class="container">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12">
            <div class="card" style="border-radius: 15px; background: dimgray">
              <div class="card-body p-5">
                <div class="text-uppercase text-center mb-5 text-info h2">Create an account</div>

                <form @submit.prevent="register">

                  <div class="form-outline mb-4">
                    <input type="text" id="form3Example1cg" class="form-control form-control-lg" v-model="name"/>
                    <label class="form-label" for="form3Example1cg">Your Name</label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="email" id="form3Example3cg" class="form-control form-control-lg" v-model="email"/>
                    <label class="form-label" for="form3Example3cg">Your Email</label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" id="form3Example4cg" class="form-control form-control-lg" v-model="password"/>
                    <label class="form-label" for="form3Example4cg">Password</label>
                  </div>

                  <div class="d-flex justify-content-center">
                    <input type="submit"
                            class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" value="Register"/>
                  </div>

                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
</template>

<script>
import {useAuthStore} from '@/stores/store';
import axios from "axios";
import myLocalStorage from "@/services/myLocalStorage";
export default {
  name: "SignInView",
  data(){
    return {
      name:'',
      email:'',
      password:'',
    }
  },
  methods:{
    register(){
      const body = {
        name: this.name,
        email: this.email,
        password: this.password
      };
      axios.post('http://localhost/api/auth/login',body).then(data=>{
        const authStore = useAuthStore();
        authStore.setToken(data.data.token);
        myLocalStorage.setItem('user',data.data.user)
        console.log(data)
      }).catch(ex=>{console.log(ex)})
    }
  }
}
</script>

<style scoped>

</style>