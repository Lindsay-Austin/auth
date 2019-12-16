package com.authservice.dao;

import com.authservice.entity.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepository {
    /**
     * 根据用户名查找账户信息
     * @param username 用户名
     * @return 账户信息
     */
    Account findByUserName(String username);
}
