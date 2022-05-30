package com.service;

import com.entity.RankList;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2022-03-26
 */

public interface RankListService {

    int rankOfSongListId(Long songListId);

    boolean addRank(RankList rankList);
}
