package com.mapper;

import com.entity.RankList;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rachel
 * @since 2022-03-26
 */

@Repository
public interface RankListMapper {

    int insert(RankList record);

    int insertSelective(RankList record);

    /**
     * 查总分
     *
     * @param songListId
     * @return
     */
    int selectScoreSum(Long songListId);

    /**
     * 查总评分人数
     *
     * @param songListId
     * @return
     */
    int selectRankNum(Long songListId);
}
