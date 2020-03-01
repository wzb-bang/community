package com.nowcoder.community.entity;

/**
 * @author bo
 * @date Created in 23:13 2020/2/29
 * @description
 **/

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
