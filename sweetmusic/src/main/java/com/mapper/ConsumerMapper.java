package com.mapper;

import com.entity.Consumer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rachel
 * @since 2021-12-31
 */
@Repository
public interface ConsumerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consumer record);

    int insertSelective(Consumer record);

    Consumer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consumer record);

    int updateByPrimaryKey(Consumer record);

    int verifyPassword(String username, String password);

    int existUsername(String username);

    int addUser(Consumer consumer);

    int updateUserMsg(Consumer record);

    int updateUserAvatar(Consumer record);

    int deleteUser(Integer id);

    List<Consumer> allUser();

    List<Consumer> userOfId(Integer id);

    List<Consumer> loginStatus(String username);
}
