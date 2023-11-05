<template>
    <layOutWeb>
        <div class="container">
            <div class="container" style="min-height: 100vh;">
                <div class="row fs-1 justify-content-center align-items-center mt-4">會員註冊</div>
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
                        <div class="row justify-content-center mt-4">
                            <div class="col-3 fs-3 text-start">確認密碼</div>
                            <input type="password" class="col-9" v-model="passwordCheck" placeholder="請輸入8-12位元的密碼">
                        </div>
                        <div class="row justify-content-center mt-4">
                            <div class="col-3 fs-3 text-start">姓名</div>
                            <input type="text" class="col-9" v-model="name" placeholder="請輸入帳號">
                        </div>
                        <div class="row justify-content-center mt-4">
                            <div class="col-3 fs-3 text-start">手機</div>
                            <input type="text" class="col-9" v-model="phoneNumber" placeholder="請輸入帳號">
                        </div>
                        <div class="row justify-content-center mt-4">
                            <div class="col-3 fs-3 text-start">生日</div>
                            <input type="text" class="col-9" v-model="birthday" placeholder="請輸入帳號">
                        </div>
                        <div class="row justify-content-center mt-4">
                            <div class="col-3 fs-3 text-start">地址</div>
                            <input type="text" class="col-9" v-model="address" placeholder="請輸入帳號">
                        </div>
                        <div class="row justify-content-center mt-4">
                            <div class="col-3 fs-3 text-start">信箱</div>
                            <input type="text" class="col-9" v-model="eMail" placeholder="請輸入帳號">
                        </div>
                        <div class="row">
                            <button type="button" class="btn btn-primary col-12 mt-5" @click="signUp()">會員註冊</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </layOutWeb>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios';
const account = ref("");
const password = ref("");
const passwordCheck = ref("");
const name = ref("");
const phoneNumber = ref("");
const birthday = ref("");
const address = ref("");
const eMail = ref("");

const signUp = async() => {
    let err = "";
    if (account.value == "") err += "請輸入帳號\n";
    if (password.value == "") err += "請輸入密碼\n";
    if(password.value != passwordCheck.value)err += "輸入的密碼不相同\n";
    if (name.value == "") err += "請輸入姓名\n";
    if (phoneNumber.value == "") err += "請輸入手機\n";
    if (birthday.value == "") err += "請輸入生日\n";
    if (address.value == "") err += "請輸入地址\n";
    if (eMail.value == "") err += "請輸入信箱\n";
    if (err.length > 0) {
        alert(err);
    }else{
        const data = {
            account: account.value,
            password: password.value,
            name: name.value,
            phoneNumber: phoneNumber.value,
            birthday: birthday.value,
            address: address.value,
            eMail: eMail.value
        };
        try{
            const response = await axios.post("/member/signUp",data);
            alert(response.data);
        }catch(error){
            console.log(error);
        }
        
    }

}

</script>