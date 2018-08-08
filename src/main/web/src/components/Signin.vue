<template>
  <div id="login">
    <h1>{{ $t('login.pageTitle') }}</h1>
    <input type="text" name="username" v-model="username" :placeholder="$t('login.usernamePlaceholder')">
    <input type="password" name="password" v-model="password" :placeholder="$t('login.passwordPlacehplder')">
    <button @click="loginChk">{{ $t('login.btnLoginLabel') }}</button>
  </div>
</template>

<script>
export default {
  name: 'login',
  data () {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    loginChk () {
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
