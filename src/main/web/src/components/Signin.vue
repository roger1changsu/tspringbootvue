<template>
  <div id="login">
    <h1>{{ $t('login.pageTitle') }}</h1>
    <p v-show="hasError">{{ errmsg }}</p>
    <input type="text" name="username" v-model="username" :placeholder="$t('login.usernamePlaceholder')">
    <input type="password" name="password" v-model="password" :placeholder="$t('login.passwordPlacehplder')">
    <button v-on:click="loginChk">{{ $t('login.btnLoginLabel') }}</button>
  </div>
</template>

<script>
import api from '../common/api'
export default {
  name: 'login',
  data () {
    return {
      hasError: false,
      errmsg: '',
      username: '',
      password: ''
    }
  },
  methods: {
    loginChk () {
      api.loginChk(this.username, this.password).then(resp => {
        this.hasError = true
        this.errmsg = 'Login successfully.'
        // TODO - Go to index.html
      }, error => {
        this.hasError = true
        let errtag = 'err.' + error.name
        this.errmsg = this.$t(errtag)
      })
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
