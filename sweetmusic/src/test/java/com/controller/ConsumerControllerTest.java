package com.controller;

import com.entity.Consumer;
import com.service.impl.ConsumerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerControllerTest {
    @Autowired
    private ConsumerServiceImpl consumerService;

    //用户
    @Test
    public void consumerTest() {

        Consumer consumer = new Consumer();
        consumer.setUsername("test");
        consumer.setPassword("123");
        consumer.setSex(new Byte("0"));
        consumer.setPhone("15666412237");
        consumer.setEmail("1239679@qq.com");
        consumer.setBirth(new Date());
        consumer.setIntroduction("");
        consumer.setLocation("");
        consumer.setAvatar("/img/avatarImages/user.jpg");
        consumer.setCreateTime(new Date());
        consumer.setUpdateTime(new Date());
        consumerService.addUser(consumer);
    }

    @Test
    public void consumerTest2() {
        System.out.println(consumerService.allUser());
    }
}