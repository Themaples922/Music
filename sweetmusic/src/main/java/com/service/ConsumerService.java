package com.service;

import com.entity.Consumer;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-31
 */
public interface ConsumerService {
    boolean addUser(Consumer consumer);

    boolean updateUserMsg(Consumer consumer);

    boolean updateUserAvatar(Consumer consumer);

    boolean existUser(String username);

    boolean veritypasswd(String username, String password);

    boolean deleteUser(Integer id);

    List<Consumer> allUser();

    List<Consumer> userOfId(Integer id);

    List<Consumer> loginStatus(String username);
}
