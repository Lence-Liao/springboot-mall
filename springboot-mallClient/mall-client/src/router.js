import { createRouter, createWebHistory } from 'vue-router';
import homeView from "@/views/homeView";
import loginView from "@/views/loginView";
import signUpView from "@/views/signUpView";
const routes = [
  {
    path: "/",
    name: "homeView",
    component: homeView,
  },
  {
    path: "/login",
    name: "loginView",
    component: loginView,
  },
  {
    path: "/signUp",
    name: "signUpView",
    component: signUpView,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;