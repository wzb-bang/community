package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author bo
 * @date Created in 20:31 2020/3/2
 * @description 持有用户信息, 用于代替session对象
 **/
@Component
public class HostHolder  {
    private ThreadLocal<User> users=new ThreadLocal<User>();

    public void setUser(User user){
        users.set(user);
    }
    public User getUser(){
        return users.get();
    }
    public void clear(){
        users.remove();
    }
}
