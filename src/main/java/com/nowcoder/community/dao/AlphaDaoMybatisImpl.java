package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author bo
 * @date Created in 15:00 2020/2/29
 * @description
 **/
@Repository
@Primary
public class AlphaDaoMybatisImpl implements  AlphaDao {
    @Override
    public String select() {
        return "mybatis";
    }
}
