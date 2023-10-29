<!-- Layout.vue -->
<template>
    <div>
        <header style="background-color: rgb(238,78,46);">
        <div class="container">
            <div class="row d-flex justify-content-center align-items-center">
                <div class="col-3"><img class="img-fluid" src="@/assets/logo.png"></div>
                <input class="col-6" type="text" placeholder="請輸入關鍵字">
                <button class="col-1">Search</button>
                <div class="col-1 border" style="cursor: pointer;">會員註冊</div>
                <div class="col-1 border" style="cursor: pointer;">登入</div>
            </div>
        </div>
        </header>

        <main>
        <slot></slot>
        </main>

        <footer>
        <div class="container bg-secondary text-white">
            <div class="row">
                <div class="col-4">反詐騙宣導</div>
                <div class="col-4">隱私權政策</div>
            </div>
        </div>
        </footer>
    </div>
</template>
<style>

</style>