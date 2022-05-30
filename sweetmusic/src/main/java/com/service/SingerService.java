package com.service;

import com.entity.Singer;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-17
 */
public interface SingerService {
    boolean addSinger(Singer singer);

    boolean updateSingerMsg(Singer singer);

    boolean updateSingerPic(Singer singer);

    boolean deleteSinger(Integer id);

    List<Singer> allSinger();

    List<Singer> singerOfName(String name);

    List<Singer> singerOfSex(Integer sex);
}
