import { createRouter, createWebHistory } from 'vue-router'
import MainPage from '../views/MainPage.vue'
import StandartProfile from '../views/StandartProfile.vue';
import GeneralViews from "@/views/ProfilePages/GeneralViews.vue";

import ProfileComponent from "@/components/Profile/ProfileComponent.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: MainPage,
    },
    {
      path: '/Profile',
      name: 'profile',
      component: StandartProfile
    },
    {
      path: '/profile/:id?',
      name: 'profile',
      component: ProfileComponent
    },
    {
      path: '/Profile/General',
      component: GeneralViews,
      children: [
        {
          path: 'test',
          /* component: testa */
        }
      ]
    }
  ]
})

export default router
