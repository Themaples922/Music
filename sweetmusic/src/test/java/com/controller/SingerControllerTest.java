package com.controller;

import com.entity.Singer;
import com.service.impl.SingerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingerControllerTest {

    @Autowired
    private SingerServiceImpl singerService;

    //歌手
    @Test
    public void singerTest() {
        Singer singer = new Singer();
        singer.setName("Álvaro Soler");
        singer.setSex(new Byte("1"));
        singer.setPic("/img/singerPic/soler.jpg");
        singer.setBirth(new Date());
        singer.setLocation("西班牙");
        singer.setIntroduction("全名是Álvaro Tauchert Soler，是一位新晋西班牙歌手，流行音乐作曲家。出生于1991年，西班牙巴塞罗纳。");
        singerService.addSinger(singer);
    }

    @Test
    public void singerTest2() {
        System.out.println(singerService.allSinger());
    }
}