package com.yifan.repository;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 通用抽象DAO
 * 
 * @author caowuchao
 * @since 2017年9月4日
 * @version 1.0
 */
public abstract class AbstractDao extends SqlSessionDaoSupport {

	private static final String COUNT = "count";
	private static final String SELECT_ONE = "selectOne";
	private static final String INSERT = "insert";
	private static final String UPDATE = "update";
	private static final String SELECT_LIST = "selectList";


	private static String getStatement(Class<?> clazz, String methodName) {
		return clazz.getName() + "." + methodName;
	}

	/**
	 * 查询统计 根据对象条件统计
	 * 
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public Integer count(Object parameter) {
		return getSqlSession().selectOne(getStatement(parameter.getClass(), COUNT), parameter);
	}

	/**
	 * 自定义查询统计
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public Integer count(Class<?> statementClazz, String methodName, Object parameter) {
		return getSqlSession().selectOne(getStatement(statementClazz, methodName), parameter);
	}

	/**
	 * 根据 T 查询单条
	 * 
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public <T> T selectOne(T parameter) {
		return getSqlSession().selectOne(getStatement(parameter.getClass(), SELECT_ONE), parameter);
	}

	/**
	 * 根据 T 查询单条
	 * 
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public <T> T selectOne(Class<?> statementClazz, String methodName, Object parameter) {
		return getSqlSession().selectOne(getStatement(statementClazz, methodName), parameter);
	}

	/**
	 * 根据 T 查询单条
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @return
	 * @author caowuchao
	 * @since 2018年5月17日
	 */
	public <T> T selectOne(Class<?> statementClazz, String methodName) {
		return getSqlSession().selectOne(getStatement(statementClazz, methodName));
	}

	/**
	 * 根据主键查询单条数据
	 * 
	 * @param statementClazz
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月11日
	 */
	public <T> T selectById(Class<T> statementClazz, Object parameter) {
		return getSqlSession().selectOne(getStatement(statementClazz, "selectById"), parameter);
	}

	/**
	 * 插入一条数据
	 * 
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public int insert(Object parameter) {
		return getSqlSession().insert(getStatement(parameter.getClass(), INSERT), parameter);
	}

	/**
	 * 插入多条数据
	 * 
	 * @param list
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public int insert(List<?> list) {
		int i = 0;
		for (Object obj : list) {
			i += insert(obj);
		}
		return i;
	}

	/**
	 * 更新数据
	 * 
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public int update(Object parameter) {
		return getSqlSession().update(getStatement(parameter.getClass(), UPDATE), parameter);
	}

	/**
	 * 自定义更新
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public int update(Class<?> statementClazz, String methodName) {
		return getSqlSession().update(getStatement(statementClazz, methodName));
	}

	/**
	 * 自定义更新
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public int update(Class<?> statementClazz, String methodName, Object parameter) {
		return getSqlSession().update(getStatement(statementClazz, methodName), parameter);
	}

	/**
	 * 根据主键删除一条数据
	 * 
	 * @param statementClazz
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月11日
	 */
	public int deleteById(Class<?> statementClazz, Object parameter) {
		return getSqlSession().delete(getStatement(statementClazz, "deleteById"), parameter);
	}

	/**
	 * 查询多条数据
	 * 
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public <E> List<E> selectList(Object parameter) {
		return getSqlSession().selectList(getStatement(parameter.getClass(), SELECT_LIST), parameter);
	}

	/**
	 * 排序查询列表数据
	 * 
	 * @param parameter
	 * @param orderBy
	 * @return
	 * @author caowuchao
	 * @since 2018年7月12日
	 */
	public <E> List<E> selectList(E parameter, String orderBy) {
		PageHelper.orderBy(orderBy);
		return selectList(parameter);
	}

	/**
	 * 查询多条数据
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @return
	 * @author caowuchao
	 * @since 2018年1月8日
	 */
	public <E> List<E> selectList(Class<?> statementClazz, String methodName) {
		return getSqlSession().selectList(getStatement(statementClazz, methodName));
	}

	/**
	 * 查询多条数据
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @param parameter
	 * @return
	 * @author caowuchao
	 * @since 2017年9月4日
	 */
	public <E> List<E> selectList(Class<?> statementClazz, String methodName, Object parameter) {
		return getSqlSession().selectList(getStatement(statementClazz, methodName), parameter);
	}

	/**
	 * 查询多条数据，支持排序
	 * 
	 * @param statementClazz
	 * @param methodName
	 * @param parameter
	 * @param orderBy
	 * @return
	 * @author caowuchao
	 * @since 2018年7月11日
	 */
	public <E> List<E> selectList(Class<?> statementClazz, String methodName, Object parameter, String orderBy) {
		PageHelper.orderBy(orderBy);
		return selectList(statementClazz, methodName, parameter);
	}

	/**
	 * 分页查询，支持排序
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param orderBy
	 * @return
	 * @author caowuchao
	 * @since 2018年7月11日
	 */
	public <E> List<E> selectPageList(Object parameter, int pageNum, int pageSize, String orderBy) {
		PageHelper.startPage(pageNum, pageSize, false);
		PageHelper.orderBy(orderBy);

		return selectList(parameter);
	}

	/**
	 * 分页查询
	 *
	 * @param parameter parameter
	 * @param pageNum pageNum
	 * @param pageSize pageSize
	 * @return java.util.List
	 * @author wuyifan
	 * @date 2019年6月13日 16:28
	 */
	public <E> List<E> selectPageList(Object parameter, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize, false);
		return selectList(parameter);
	}
	
	/**
	 * 分页查询
	 * 
	 * @param <E>
	 * @param statementClazz
	 * @param methodName
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author caowuchao
	 * @since 2019年11月21日
	 */
	public <E> List<E> selectPageList(Class<?> statementClazz, String methodName, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize, false);
		return selectList(statementClazz, methodName);
	}

	/**
	 * 分页查询
	 * 
	 * @param pageNum  页码
	 * @param pageSize 分页大小
	 * @return
	 * @author caowuchao
	 * @since 2018年5月17日
	 */
	public <E> List<E> selectPageList(Class<?> statementClazz, String methodName, Object parameter, 
			int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize, false);

		return selectList(statementClazz, methodName, parameter);
	}

	/**
	 * 分页查询，支持排序
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param orderBy
	 * @return
	 * @author caowuchao
	 * @since 2018年7月11日
	 */
	public <E> List<E> selectPageList(Class<?> statementClazz, String methodName, Object parameter, 
			int pageNum, int pageSize, String orderBy) {
		PageHelper.startPage(pageNum, pageSize, false);
		PageHelper.orderBy(orderBy);

		return selectList(statementClazz, methodName, parameter);
	}

	/**
	 * 分页查询并统计记录条数
	 * 返回分页数据及分页信息
	 * 
	 * @param pageNum  页码
	 * @param pageSize 分页大小
	 * @return
	 * @author caowuchao
	 * @since 2018年5月17日
	 */
	public <T> PageInfo<T> selectPageListAndCount(Class<?> statementClazz, String methodName, Object parameter, 
			int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		List<T> list = selectList(statementClazz, methodName, parameter);
		return new PageInfo<>(list);
	}

}
