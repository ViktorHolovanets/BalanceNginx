import { createApp } from 'vue'
import { createPinia } from 'pinia'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

import App from './App.vue'
import router from './router'

// Подключение моего сокет сервиса
import './services/MySocketIo'

import './assets/main.css'
import 'vue3-toastify/dist/index.css';

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
