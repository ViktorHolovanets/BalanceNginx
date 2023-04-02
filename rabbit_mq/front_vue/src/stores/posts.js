import {defineStore} from "pinia";
import {toast} from "vue3-toastify";
import myFetch from "@/services/myFetch";
import myLocalStorage from "@/services/myLocalStorage";
import MySocketIo from "@/services/MySocketIo";

export const usePostsStore = defineStore('post', {
    state: () => ({
        isLoaded: false,

        posts: []
    }),
    actions: {
        loadFromServer() {
            this.isLoaded = false

            if (myLocalStorage.getItem("posts")) {
                this.posts = myLocalStorage.getItem("posts")
                this.isLoaded = true
                return
            }

            myFetch('/nodejs-producer/test')
                .then(data => {
                    this.posts = data
                    myLocalStorage.setItem("posts", data)
                    this.isLoaded = true
                })
        },

        updatePosts(data) {
            this.posts.push(JSON.parse(data))
            toast.info('New Post')
            myLocalStorage.setItem("posts", this.posts)
        },

        startSocket() {
            MySocketIo.on('new-post', this.updatePosts)
        },

        stopSocket() {
            MySocketIo.off('new-post', this.updatePosts)
        }
    }
})
