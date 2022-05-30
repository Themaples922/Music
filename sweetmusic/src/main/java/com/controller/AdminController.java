package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Rachel
 * @since 2021-12-9
 */
@RestController
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    //判断是否登录成功
    @ResponseBody
    @RequestMapping(value = "/admin/login/status", method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest req, HttpSession session) {
        JSONObject jsonObject = new JSONObject();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean res = adminService.veritypasswd(username, password);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "登录成功");
            System.out.println(username + "   " + password);
            session.setAttribute("username", username);
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "用户名或密码错误");
        }
        return jsonObject;

    }
}
