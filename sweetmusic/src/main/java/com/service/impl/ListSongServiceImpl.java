package com.service.impl;

import com.entity.ListSong;
import com.mapper.ListSongMapper;
import com.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-22
 */
@Service
public class ListSongServiceImpl implements ListSongService {
    @Autowired
    private ListSongMapper listSongMapper;

    @Override
    public List<ListSong> allListSong() {
        return listSongMapper.allListSong();
    }

    @Override
    public boolean updateListSongMsg(ListSong listSong) {
        return listSongMapper.updateListSongMsg(listSong) > 0 ? true : false;
    }

    @Override
    public boolean deleteListSong(Integer songId) {
        return listSongMapper.deleteListSong(songId) > 0 ? true : false;
    }

    @Override
    public boolean addListSong(ListSong listSong) {
        return listSongMapper.insertSelective(listSong) > 0 ? true : false;
    }

    @Override
    public List<ListSong> listSongOfSongId(Integer songListId) {
        return listSongMapper.listSongOfSongId(songListId);
    }
}
