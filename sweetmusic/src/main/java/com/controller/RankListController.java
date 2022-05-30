package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.entity.RankList;
import com.service.impl.RankListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Rachel
 * @since 2022-03-26
 */

@RestController
@Controller
public class RankListController {

    @Autowired
    private RankListServiceImpl rankListService;

    //    提交评分
    @ResponseBody
    @RequestMapping(value = "/rankList/add", method = RequestMethod.POST)
    public Object addRank(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();
        String songListId = req.getParameter("songListId").trim();
        String consumerId = req.getParameter("consumerId").trim();
        String score = req.getParameter("score").trim();

        RankList rank_list = new RankList();
        rank_list.setSongListId(Long.parseLong(songListId));
        rank_list.setConsumerId(Long.parseLong(consumerId));
        rank_list.setScore(Integer.parseInt(score));

        boolean res = rankListService.addRank(rank_list);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "评价成功");
            return jsonObject;
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "评价失败");
            return jsonObject;
        }
    }

    //    获取指定歌单的评分
    @RequestMapping(value = "/rankList", method = RequestMethod.GET)
    public Object rankOfSongListId(HttpServletRequest req) {
        String songListId = req.getParameter("songListId");
        return rankListService.rankOfSongListId(Long.parseLong(songListId));
    }
}
