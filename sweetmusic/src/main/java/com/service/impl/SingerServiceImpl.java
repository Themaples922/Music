package com.service.impl;

import com.entity.Singer;
import com.mapper.SingerMapper;
import com.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-17
 */
@Service
public class SingerServiceImpl implements SingerService {
    @Autowired(required = false)
    SingerMapper singerMapper;

    //增加歌手
    @Override
    public boolean addSinger(Singer singer) {
        return singerMapper.insertSelective(singer) > 0 ? true : false;
    }

    //更新歌手信息
    @Override
    public boolean updateSingerMsg(Singer singer) {
        return singerMapper.updateSingerMsg(singer) > 0 ? true : false;
    }

    //更新歌手图片
    @Override
    public boolean updateSingerPic(Singer singer) {
        return singerMapper.updateSingerPic(singer) > 0 ? true : false;
    }

    //删除歌手
    @Override
    public boolean deleteSinger(Integer id) {
        return singerMapper.deleteSinger(id) > 0 ? true : false;
    }

    //查询所有歌手
    @Override
    public List<Singer> allSinger() {
        return singerMapper.allSinger();
    }

    //根据名字查询歌手
    @Override
    public List<Singer> singerOfName(String name) {
        return singerMapper.singerOfName(name);
    }

    //根据性别查询歌手
    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerMapper.singerOfSex(sex);
    }
}
