package com.lcl.ssm.conn;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ConnTest {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConn() throws SQLException {
		assertNotNull(dataSource.getConnection());
	}
	
	@Test
	public void testSqlSessionFactory() throws SQLException {
		assertNotNull(sqlSessionFactory.openSession().getConnection());
	}

}
