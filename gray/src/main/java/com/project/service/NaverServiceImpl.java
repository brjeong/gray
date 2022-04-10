package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.NaverDAO;
import com.project.dao.NaverDAOImpl;

@Service
public class NaverServiceImpl implements NaverService {

	@Autowired
	private NaverDAO naverDAO;

	@Override
	public int insert() {
		int result = naverDAO.insert();
		return result;
	}

}
