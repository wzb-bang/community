package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author bo
 * @date Created in 17:19 2020/3/4
 * @description
 **/
@Data
public class Message {
    private int id;
    private int fromId;
    private int toId;
    private String conversationId;
    private String content;
    private int status;
    private Date createTime;
}
