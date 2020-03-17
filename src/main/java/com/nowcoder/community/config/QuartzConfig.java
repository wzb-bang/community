package com.nowcoder.community.config;

import com.nowcoder.community.quartz.AlphaJob;
import com.nowcoder.community.quartz.PostScoreRefreshJob;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * @author bo
 * @date Created in 14:26 2020/3/9
 * @description  配置->数据库->调用
 **/
@Configuration
public class QuartzConfig {
    //FactoryBean 可简化Bean的实例化过程
    //1.通过FactoryBean 封装了Bean的实例化过程
    //2.将FactoryBean装配到Spring容器里
    //3.将FactoryBean注入给其他的Bean
    //4.该Bean得到的是FactoryBean所管理的对象实例

    //配置JobDetail
   // @Bean
    public JobDetailFactoryBean alphaJobDetail(){
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(AlphaJob.class);
        factoryBean.setName("alphaJob");
        //组名
        factoryBean.setGroup("alphaJobGroup");
        //任务将持久保存
        factoryBean.setDurability(true);
        //任务是可恢复的
        factoryBean.setRequestsRecovery(true);

        return factoryBean;
    }

    //配置Trigger(SimpleTriggerFactoryBean,ConTriggerFactoryBean)
   // @Bean
    public SimpleTriggerFactoryBean alphaTrigger(JobDetail alphaJobDetail){
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        // Trigger对应哪个JobDetail
        factoryBean.setJobDetail(alphaJobDetail);
        // Trigger的名字
        factoryBean.setName("alphaTrigger");
        //组名
        factoryBean.setGroup("alphaTriggerGroup");
        //触发器的频率  3000ms
        factoryBean.setRepeatInterval(3000);
        //存储Job的状态
        factoryBean.setJobDataMap(new JobDataMap());
        return factoryBean;
    }

    //刷新帖子分数任务
    @Bean
    public JobDetailFactoryBean postScoreRefreshJobDetail(){
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(PostScoreRefreshJob.class);
        factoryBean.setName("postScoreRefreshJob");
        //组名
        factoryBean.setGroup("communityJobGroup");
        //任务将持久保存
        factoryBean.setDurability(true);
        //任务是可恢复的
        factoryBean.setRequestsRecovery(true);

        return factoryBean;
    }


    @Bean
    public SimpleTriggerFactoryBean postScoreRefreshTrigger(JobDetail postScoreRefreshJobDetail){
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        // Trigger对应哪个JobDetail
        factoryBean.setJobDetail(postScoreRefreshJobDetail);
        // Trigger的名字
        factoryBean.setName("postScoreRefreshTrigger");
        //组名
        factoryBean.setGroup("communityTriggerGroup");
        //触发器的频率  3000ms
        factoryBean.setRepeatInterval(1000*5*60);
        //存储Job的状态
        factoryBean.setJobDataMap(new JobDataMap());
        return factoryBean;
    }
}
