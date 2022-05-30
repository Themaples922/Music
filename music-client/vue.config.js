const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
    //报错：组件名不是多个单词组成的
  //加上这个配置,禁用vue的严格模式
  lintOnSave: false,  
  chainWebpack: config => {
    config.plugin('define').tap(definitions => {
        Object.assign(definitions[0]['process.env'], {
          NODE_HOST: '"http://localhost:9000/sweetmusic"',
        });
        return definitions;
    });
  }
})
