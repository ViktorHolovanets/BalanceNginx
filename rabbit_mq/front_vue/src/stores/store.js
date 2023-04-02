import {defineStore} from "pinia";
import myLocalStorage from "@/services/myLocalStorage";
export const useAuthStore = defineStore('post', {
    state: () => ({
        token: myLocalStorage.getItem('token'),
        isAuth:myLocalStorage.getItem('isAuth')==='true'
    }),
    actions: {
        setToken(token) {
            myLocalStorage.setItem('token', token)
            myLocalStorage.setItem('isAuth', true)
            this.token = token
            this.isAuth = true
        },
        deleteToken() {
            myLocalStorage.removeItem('token')
            myLocalStorage.removeItem('isAuth')
            this.token = null
            this.isAuth = false
        },
    }
})