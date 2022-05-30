package com.controller;

import com.entity.SongList;
import com.service.impl.SongListServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongListControllerTest {

    @Autowired
    private SongListServiceImpl songListService;

    //歌单
    @Test
    public void songListTest() {

        SongList songList = new SongList();
        songList.setTitle("国风传统器乐赏~~♪");
        songList.setPic("/img/songListPic/19169985230816413.jpg");
        songList.setIntroduction(" 都是自己很喜欢的吉他指弹");
        songList.setStyle("乐器");
        songListService.addSongList(songList);
    }

    @Test
    public void songListTest2() {
        System.out.println(songListService.allSongList());
    }

}