package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author bo
 * @date Created in 14:04 2020/3/9
 * @description
 **/
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {

}
