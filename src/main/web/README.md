# tspringbootvue-web

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report

# run unit tests
npm run unit

# run e2e tests
npm run e2e

# run all tests
npm test
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).



## Unit Test

### Test HTTP Request to backend

axios mock: https://github.com/ctimmerm/axios-mock-adapter


## Request Signature

  let base64Body = Buffer.from(JSON.stringify(config.data)).toString('base64')
  let signStr = config.method.toUpperCase() + base64Body + timestamp + nonce
  let hmac = crypto.createHmac('sha1', nonce)
  hmac.update(signStr)
  let sign = hmac.digest('base64')
