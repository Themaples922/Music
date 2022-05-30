<template>
  <div class="header">
    <!-- 折叠按钮 -->
    <div class="collapse-btn"
         @click="collapseChage">
      <el-icon>
        <expand />
      </el-icon>
    </div>
    <div class="logo">{{nusicName}}</div>
    <div class="header-right">
      <div class="header-user-con">
        <!-- 用户头像 -->
        <div class="user-avatar">
          <img :src="userPic" />
        </div>
        <!-- 用户名下拉菜单 -->
        <el-dropdown class="user-name"
                     trigger="click"
                     @command="handleCommand">
          <span class="el-dropdown-link">
            {{username}}
            <i class="el-icon-caret-bottom"></i>
          </span>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item command="loginout">退出登录</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
      </div>
    </div>
  </div>
</template>
<script>
import { Expand } from '@element-plus/icons-vue'
import emitter from '../../utils/emitter'
import { SIGN_IN, MUSICNAME } from '../../enums'
import { mixin } from '../../mixins'

export default {
  mixins: [mixin],
  components: {
    Expand,
  },
  data() {
    return {
      collapse: true,
      username: 'admin',
      userPic: require('@/assets/img/user.jpg'),
      nusicName: MUSICNAME,
    }
  },
  mounted() {
    if (document.body.clientWidth < 1500) {
      this.collapseChage()
    }
  },
  methods: {
    // 用户名下拉菜单选择事件
    handleCommand(command) {
      if (command === 'loginout') {
        this.routerManager(SIGN_IN, { path: SIGN_IN })
      }
    },
    // 侧边栏折叠
    collapseChage() {
      this.collapse = !this.collapse
      emitter.emit('collapse', this.collapse)
    },
  },
}
</script>
<style scoped>
.header {
  position: absolute;
  z-index: 100;
  width: 100%;
  height: 70px;
  display: flex;
  align-items: center;
  font-size: 20px;
  color: #ffffff;
  background-image: linear-gradient(135deg, #ffd3a5 10%, #fd6585 100%);
  box-shadow: 0px 0px 8px 2px rgb(249, 137, 137);
}

.collapse-btn {
  float: left;
  padding: 0 21px;
  cursor: pointer;
}

.header .logo {
  width: 250px;
  font-weight: bold;
}

.header-right {
  position: absolute;
  right: 0;
  padding-right: 30px;
}

.header-user-con {
  display: flex;
  align-items: center;
}

.user-name {
  margin-left: 10px;
}

.user-avatar img {
  display: block;
  width: 40px;
  height: 40px;
  border-radius: 50%;
}

.el-dropdown-link {
  color: #ffffff;
  cursor: pointer;
}

.el-dropdown-menu__item {
  text-align: center;
}
</style>
