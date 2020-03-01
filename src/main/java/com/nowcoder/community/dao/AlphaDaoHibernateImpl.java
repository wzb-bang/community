package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author bo
 * @date Created in 14:57 2020/2/29
 * @description
 **/
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
