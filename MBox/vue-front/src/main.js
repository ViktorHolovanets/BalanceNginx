import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import './assets/css/block.css'
import './assets/css/text.css'
import './assets/css/animation.css'

import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import store from './store/store'
import axios from 'axios'
import VueAxios from 'vue-axios'

const app = createApp(App)
app.use(VueAxios, axios)
app.provide('axios', app.config.globalProperties.axios)
app.use(router)
app.use(store)

app.mount('#app')
