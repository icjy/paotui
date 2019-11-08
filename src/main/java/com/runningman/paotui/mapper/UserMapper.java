package com.runningman.paotui.mapper;


import com.runningman.paotui.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    User getUserByUsername(String username);

    /**
     * 插入新的用户记录
     *
     * @param user
     */
    void insert(User user);


    /**
     * 更新认证信息
     *
     * @param username
     * @param authId
     */
    void updateAuth(@Param("username") String username, @Param("authId") Integer authId);

    /**
     * 根据用户名获取其认证信息
     * @param username
     * @return
     */
    int getUserAuth(String username);
}

