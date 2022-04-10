package com.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NaverDAOImpl implements NaverDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert() {
		int result = sqlSession.insert("naver.insert");
		return result;
	}

}
