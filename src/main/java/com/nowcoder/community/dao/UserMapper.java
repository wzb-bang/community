package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author bo
 * @date Created in 23:15 2020/2/29
 * @description
 **/
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String headerUrl);

    int updatePassword(int id,String  password);
}
