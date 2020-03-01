package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author bo
 * @date Created in 23:51 2020/2/29
 * @description
 **/
@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
