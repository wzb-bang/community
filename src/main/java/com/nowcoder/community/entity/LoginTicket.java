package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author bo
 * @date Created in 17:05 2020/3/2
 * @description
 **/
@Data
public class LoginTicket {
    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
