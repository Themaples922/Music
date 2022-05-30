package com.service.impl;

import com.mapper.AdminMapper;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Rachel
 * @since 2021-12-9
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean veritypasswd(String username, String password) {
        return adminMapper.verifyPassword(username, password) > 0 ? true : false;
    }
}
