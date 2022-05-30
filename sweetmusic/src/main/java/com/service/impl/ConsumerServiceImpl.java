package com.service.impl;

import com.entity.Consumer;
import com.mapper.ConsumerMapper;
import com.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-31
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private ConsumerMapper consumerMapper;

    @Override
    public boolean addUser(Consumer consumer) {
        return consumerMapper.insertSelective(consumer) > 0 ? true : false;
    }

    @Override
    public boolean updateUserMsg(Consumer consumer) {
        return consumerMapper.updateUserMsg(consumer) > 0 ? true : false;
    }

    @Override
    public boolean updateUserAvatar(Consumer consumer) {

        return consumerMapper.updateUserAvatar(consumer) > 0 ? true : false;
    }

    @Override
    public boolean existUser(String username) {
        return consumerMapper.existUsername(username) > 0 ? true : false;
    }

    @Override
    public boolean veritypasswd(String username, String password) {

        return consumerMapper.verifyPassword(username, password) > 0 ? true : false;
    }

    //    删除用户
    @Override
    public boolean deleteUser(Integer id) {
        return consumerMapper.deleteUser(id) > 0 ? true : false;
    }

    @Override
    public List<Consumer> allUser() {
        return consumerMapper.allUser();
    }

    @Override
    public List<Consumer> userOfId(Integer id) {

        return consumerMapper.userOfId(id);
    }

    @Override
    public List<Consumer> loginStatus(String username) {

        return consumerMapper.loginStatus(username);
    }

}