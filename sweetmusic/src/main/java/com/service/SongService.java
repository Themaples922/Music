package com.service;

import com.entity.Song;

import java.util.List;

/**
 * @author Rachel
 * @since 2021-12-19
 */
public interface SongService {
    boolean addSong(Song song);

    boolean updateSongMsg(Song song);

    boolean updateSongUrl(Song song);

    boolean updateSongPic(Song song);

    boolean deleteSong(Integer id);

    List<Song> allSong();

    List<Song> songOfSingerId(Integer singerId);

    List<Song> songOfId(Integer id);

    List<Song> songOfSingerName(String name);

    List<Song> songOfName(String name);
}
