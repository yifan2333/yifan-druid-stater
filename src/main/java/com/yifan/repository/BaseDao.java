package com.yifan.repository;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

/**
 * 数据查询通用DAO
 * 
 * @author caowuchao
 * @since 2017年9月4日
 * @version 1.0
 */
@Repository
public class BaseDao extends AbstractDao {

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
}
