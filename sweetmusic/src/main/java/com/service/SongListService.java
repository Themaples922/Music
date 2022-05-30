package com.service;

import com.entity.SongList;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-22
 */
public interface SongListService {
    boolean addSongList(SongList songList);

    boolean updateSongListMsg(SongList songList);

    boolean updateSongListImg(SongList songList);

    boolean deleteSongList(Integer id);

    List<SongList> allSongList();

    List<SongList> likeTitle(String title);

    List<SongList> likeStyle(String style);

    List<SongList> songListOfTitle(String title);
}
