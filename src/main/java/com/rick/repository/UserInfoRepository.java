package com.rick.repository;

import com.rick.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
