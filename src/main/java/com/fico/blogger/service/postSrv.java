package com.fico.blogger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fico.blogger.entity.Post;
import com.fico.blogger.idao.IPostDao;
import com.fico.blogger.iservice.IPostSrv;

@Service
public class postSrv implements IPostSrv {
	@Autowired
	IPostDao postDao;
	@Override
	public void createPost(Post p) {
		postDao.create(p);
	}

}
