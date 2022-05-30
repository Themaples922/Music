<template>
  <div class="login-wrap">
    <div class="ms-title">{{musicName}}</div>
    <div class="ms-login">
      <el-form ref="ruleForm"
               class="demo-ruleForm"
               :model="ruleForm"
               :rules="rules">
        <el-form-item prop="username">
          <el-input v-model="ruleForm.username"
                    placeholder="username"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input type="password"
                    placeholder="password"
                    v-model="ruleForm.password"
                    @keyup.enter="submitForm('ruleForm')"
                    show-password></el-input>
        </el-form-item>
        <div class="login-btn">
          <el-button type="primary"
                     @click="submitForm">登录</el-button>
          <el-button type="info"
                     @click="resetLoginForm()">重置</el-button>
        </div>
        <p style="font-size:12px;line-height:30px;color:#999;">Tips : 用户名和密码要写数据库里的。</p>
      </el-form>
    </div>
  </div>
</template>

<script>
import { mixin } from '../mixins'
import { HttpManager } from '../api/index'
import { INFO, MUSICNAME } from '../enums'

export default {
  mixins: [mixin],
  data: function () {
    return {
      musicName: MUSICNAME,
      ruleForm: {
        username: 'admin',
        password: '123456',
      },
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
        ],
        password: [{ required: true, message: '请输入密码', trigger: 'blur' }],
      },
    }
  },
  methods: {
    //重置表单内容
    //必须放在前面，否则会报错TypeError: _vm.resetLoginForm is not a function"
    resetLoginForm() {
      this.$refs.ruleForm.resetFields()
    },
    //登录方法
    submitForm() {
      let params = new URLSearchParams()
      params.append('username', this.ruleForm.username)
      params.append('password', this.ruleForm.password)
      HttpManager.getLoginStatus(params)
        .then((res) => {
          if (res.code === 1) {
            this.routerManager(INFO, { path: INFO })
            this.$notify({
              title: '登录成功',
              type: 'success',
            })
          } else {
            this.$notify({
              title: '用户名或密码错误',
              type: 'error',
            })
          }
        })
        .catch((err) => {
          console.error(err)
        })
    },
  },
}
</script>

<style scoped>
.login-wrap {
  position: relative;
  background: url('../assets/img/background.png');
  background-attachment: fixed;
  background-position: center;
  background-size: cover;
  width: 100%;
  height: 100%;
}

.ms-title {
  position: absolute;
  top: 50%;
  width: 100%;
  margin-top: -230px;
  text-align: center;
  font-size: 30px;
  font-weight: 600;
  color: #fff;
}

.ms-login {
  position: absolute;
  left: 50%;
  top: 50%;
  width: 300px;
  height: 160px;
  margin: -150px 0 0 -190px;
  padding: 40px;
  border-radius: 5px;
  background: #fff;
  border-radius: 25px;
}

.login-btn {
  text-align: center;
}

.login-btn button {
  width: 40%;
  height: 36px;
}
.ms-login p {
  margin-top: 10px;
}
</style>
