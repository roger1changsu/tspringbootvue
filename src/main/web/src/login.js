// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import axios from 'axios'
import VueI18n from 'vue-i18n'
import login from './components/Signin.vue'
import i18nMsg from './common/i18n'

Vue.config.productionTip = false

Vue.use(VueI18n)

Vue.prototype.$http = axios

export const i18n = new VueI18n({
  locale: 'zh-CN',
  messages: i18nMsg
})

/* eslint-disable no-new */
new Vue({
  el: '#login',
  i18n: i18n,
  components: { login },
  template: '<login/>'
})
