package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author bo
 * @date Created in 0:36 2020/3/3
 * @description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {
    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testsensitiveFilter(){
        String text="这可以赌~!@#$%博,可以嫖娼,可以吸毒,可以开票,哈哈哈";
        text =sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
