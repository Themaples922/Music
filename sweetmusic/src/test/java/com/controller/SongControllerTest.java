package com.controller;

import com.entity.Song;
import com.service.impl.SongServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SongControllerTest {

    @Autowired
    private SongServiceImpl songService;

    //歌曲
    @Test
    public void songTest() {
        Song song = new Song();
        song.setName("Sanna Nielsen-Undo");
        song.setPic("/img/songPic/1775711278864263.jpg");
        song.setSingerId(42);
        song.setCreateTime(new Date());
        song.setUpdateTime(new Date());
        song.setIntroduction("Undo");
        song.setLyric("[00:00:00]暂无歌词");
        song.setUrl("/song/Sanna Nielsen-Undo.mp3");
        songService.addSong(song);
        System.out.println(song.getUrl());
    }

    @Test
    public void songTest2() {
        System.out.println(songService.allSong());
    }

}