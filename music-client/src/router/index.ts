import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
const routes: Array<RouteRecordRaw> = [
  {
    path: '/:pathMatch(.*)*',
    redirect: '/404'
  },
  {
    path: '/404',
    component: () => import('@/views/error/404.vue')
  },
  {
    path: '/',
    name: 'yin-container',
    component: () => import('@/views/YinContainer.vue'),
    children: [
      {
        path: '/',
        name: 'home',
        component: () => import('@/views/Home.vue')
      },
      {
        path: '/sign-in',
        name: 'sign-in',
        component: () => import('@/views/SignIn.vue')
      },
      {
        path: '/sign-up',
        name: 'sign-up',
        component: () => import('@/views/SignUp.vue')
      },
      {
        path: '/personal',
        name: 'personal',
        meta: {
          requireAuth: true // 添加该字段，表示进入这个路由是需要登录的
        },
        component: () => import('@/views/personal/Personal.vue')
      },
      {
        path: '/song-sheet',
        name: 'song-sheet',
        component: () => import('@/views/song-sheet/SongSheet.vue')
      },
      {
        path: '/song-sheet-detail/:id',
        name: 'song-sheet-detail',
        component: () => import('@/views/song-sheet/SongSheetDetail.vue')
      },
      {
        path: '/singer',
        name: 'singer',
        component: () => import('@/views/singer/Singer.vue')
      },
      {
        path: '/singer-detail/:id',
        name: 'singer-detail',
        component: () => import('@/views/singer/SingerDetail.vue')
      },
      {
        path: '/lyric/:id',
        name: 'lyric',
        component: () => import('@/views/Lyric.vue')
      },
      {
        path: '/search',
        name: 'search',
        component: () => import('@/views/search/Search.vue')
      },
      {
        path: '/personal-data',
        name: 'personal-data',
        component: () => import('@/views/personal/PersonalData.vue')
      },
      {
        path: '/setting',
        name: 'setting',
        meta: {
          requireAuth: true
        },
        component: () => import('@/views/setting/Setting.vue')
      }
    ]
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
