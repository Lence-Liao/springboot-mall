import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import 'bootstrap/dist/css/bootstrap.min.css';
import layOutWeb from './components/layOutWeb.vue';
const app = createApp(App);

// 使用Vue Router插件
app.use(router);
app.component('layOutWeb', layOutWeb);
// 其他代码...

app.mount('#app');