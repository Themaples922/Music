package com.service;

import com.entity.Collect;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-16
 */
public interface CollectService {
    boolean addCollection(Collect collect);

    boolean existSongId(Integer userId, Integer songId);

    boolean updateCollectMsg(Collect collect);

    boolean deleteCollect(Integer userId, Integer songId);

    List<Collect> allCollect();

    List<Collect> collectionOfUser(Integer userId);

}
