package com.mapper;

import com.entity.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rachel
 * @since 2021-12-19
 */
@Repository
public interface SongMapper {
    Song selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Song record);

    int insertSelective(Song record);


    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKeyWithBLOBs(Song record);

    int updateByPrimaryKey(Song record);

    int updateSongMsg(Song record);

    int updateSongUrl(Song record);

    int updateSongPic(Song record);

    int deleteSong(Integer id);

    List<Song> allSong();

    List<Song> songOfSingerId(Integer singerId);

    List<Song> songOfId(Integer id);

    List<Song> songOfSingerName(String name);

    List<Song> songOfName(String name);
}
