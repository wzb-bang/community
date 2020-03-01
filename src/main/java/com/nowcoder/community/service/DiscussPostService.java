package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.omg.PortableInterceptor.DISCARDING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bo
 * @date Created in 0:11 2020/3/1
 * @description
 **/
@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
