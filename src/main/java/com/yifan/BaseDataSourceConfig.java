package com.yifan;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.pagehelper.PageInterceptor;

@Configuration
@EnableTransactionManagement
public class BaseDataSourceConfig {

	private static final Logger log = LoggerFactory.getLogger(BaseDataSourceConfig.class);

	@Primary
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		log.info("Initialize sqlSessionFactoryBean");

		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		// 数据源
		sessionFactoryBean.setDataSource(dataSource);

		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

		// mapper路径
		try {
			Resource[] mapperLocations = resolver.getResources("classpath:**/*Mapper*.xml");
			sessionFactoryBean.setMapperLocations(mapperLocations);
		} catch (IOException e) {
			log.error("未找到mapper文件", e);
		}

		// 配置通用分页拦截器
		PageInterceptor pageInterceptor = new PageInterceptor();
		Properties properties = new Properties();
		properties.setProperty("helperDialect", "mysql");
		properties.setProperty("reasonable", "false");
		pageInterceptor.setProperties(properties);
		sessionFactoryBean.setPlugins(pageInterceptor);

		return sessionFactoryBean.getObject();  
	}

}
