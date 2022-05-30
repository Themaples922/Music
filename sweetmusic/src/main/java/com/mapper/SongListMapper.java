package com.mapper;

import com.entity.SongList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rachel
 * @since 2021-12-22
 */
@Repository
public interface SongListMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SongList record);

    int insertSelective(SongList record);

    int updateByPrimaryKeySelective(SongList record);

    int updateByPrimaryKeyWithBLOBs(SongList record);

    int updateByPrimaryKey(SongList record);

    int updateSongListMsg(SongList record);

    int updateSongListImg(SongList record);

    int deleteSongList(Integer id);

    SongList selectByPrimaryKey(Integer id);

    List<SongList> allSongList();

    List<SongList> likeTitle(String title);

    List<SongList> likeStyle(String style);

    List<SongList> songListOfTitle(String title);
}
