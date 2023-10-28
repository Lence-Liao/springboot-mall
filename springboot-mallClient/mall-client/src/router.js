import { createRouter, createWebHistory } from 'vue-router';
import homeView from "@/views/homeView";

const routes = [
  {
    path: "/",
    name: "homeView",
    component: homeView,
  },
  // 其他路由...
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;