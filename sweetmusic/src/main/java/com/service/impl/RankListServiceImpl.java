package com.service.impl;

import com.entity.RankList;
import com.mapper.RankListMapper;
import com.service.RankListService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Rachel
 * @since 2022-03-26
 */
@Service
public class RankListServiceImpl implements RankListService {

    private static final Logger logger = LogManager.getLogger(RankListServiceImpl.class);

    @Autowired
    private RankListMapper rankMapper;

    @Override
    public int rankOfSongListId(Long songListId) {
        // 评分总人数如果为 0，则返回0；否则返回计算出的结果
        int rankNum = rankMapper.selectRankNum(songListId);
        return (rankNum <= 0) ? 0 : rankMapper.selectScoreSum(songListId) / rankNum;
    }

    @Override
    public boolean addRank(RankList rankList) {

        return rankMapper.insertSelective(rankList) > 0;
    }
}
