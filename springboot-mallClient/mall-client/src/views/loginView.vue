<template>
    <layOutWeb>
        <div class="container" style="min-height: 100vh;">
            <div class="row fs-1 justify-content-center align-items-center mt-4">會員登入</div>
            <div class="row justify-content-center">
                <div class="col-6">
                    <div class="row justify-content-center mt-4">
                        <div class="col-3 fs-3 text-start">帳號</div>
                        <input type="text" class="col-9" v-model="account" placeholder="請輸入帳號">
                    </div>
                    <div class="row justify-content-center mt-4">
                        <div class="col-3 fs-3 text-start">密碼</div>
                        <input type="password" class="col-9" v-model="password" placeholder="請輸入8-12位元的密碼">
                    </div>
                    <div class="row">
                        <button type="button" class="btn btn-primary col-12 mt-5" @click="login()">登入</button>
                    </div>
                    <div class="row justify-content-between mt-4">
                        <div class="col-3 fs-5" style="cursor: pointer;">忘記密碼</div>
                        <div class="col-3 fs-5" style="cursor: pointer;">會員註冊</div>
                    </div>
                </div>
            </div>
        </div>
    </layOutWeb>
</template>


<script setup>
import { ref } from 'vue';
const account = ref("");
const password = ref("");

const login =() =>{
    console.log(account);
    console.log(password);
}

</script>