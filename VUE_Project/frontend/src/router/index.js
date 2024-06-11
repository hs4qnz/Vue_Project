import { createRouter, createWebHistory } from 'vue-router'
import ViewUsers from '../views/ViewUsers.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: ViewUsers
    },
    {
      path: '/add',
      name: 'add',
      component: () => import('../views/AddUser.vue')
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: () => import('../views/UpdateUser.vue')
    }
  ]
})

export default router
