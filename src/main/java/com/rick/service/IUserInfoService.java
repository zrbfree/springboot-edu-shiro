package com.rick.service;

import com.rick.entity.UserInfo;

public interface IUserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
