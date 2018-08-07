<template>
  <div id="login">
    <h1>login</h1>
    <input type="text" name="username" v-model="username">
    <input type="password" name="password" v-model="password">
    <input type="button" value="Login">
  </div>
</template>

<script>
export default {
  name: 'Login'
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
