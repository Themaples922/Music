package com.service;

import com.entity.ListSong;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-22
 */
public interface ListSongService {
    boolean addListSong(ListSong listSong);

    boolean updateListSongMsg(ListSong listSong);

    boolean deleteListSong(Integer songId);

    List<ListSong> allListSong();

    List<ListSong> listSongOfSongId(Integer songListId);
}
