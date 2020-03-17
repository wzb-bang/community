package com.nowcoder.community;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.service.DiscussPostService;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author bo
 * @date Created in 23:46 2020/3/9
 * @description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class CaffeineTests {
    @Autowired
    private DiscussPostService discussPostService;

    @Test
    public void initDataForTest(){
        for(int i=0;i<300000;i++){
            DiscussPost post =new DiscussPost();
            post.setUserId(111);
            post.setTitle("互联网求职暖暖计划");
            post.setContent("今年就业形势,确实不容乐观,过了个年,仿佛跳水一般");
            post.setCreateTime(new Date());
            post.setScore(Math.random()*2000);
            discussPostService.addDiscussPost(post);
        }
    }
    @Test
    public void testCache(){
        System.out.println(discussPostService.findDiscussPosts(0,0,10,1));
        System.out.println(discussPostService.findDiscussPosts(0,0,10,1));
        System.out.println(discussPostService.findDiscussPosts(0,0,10,1));
        System.out.println(discussPostService.findDiscussPosts(0,0,10,0));


    }
}
