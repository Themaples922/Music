package com.mapper;

import com.entity.Singer;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rachel
 * @since 2021-12-17
 */
public interface SingerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    int updateSingerMsg(Singer record);

    int updateSingerPic(Singer record);

    int deleteSinger(Integer id);

    List<Singer> allSinger();

    List<Singer> singerOfName(String name);

    List<Singer> singerOfSex(Integer sex);
}
