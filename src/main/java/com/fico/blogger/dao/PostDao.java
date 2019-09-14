package com.fico.blogger.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fico.blogger.entity.Post;
import com.fico.blogger.idao.IPostDao;

@Repository
public class PostDao implements IPostDao{
	private EntityManager em;
	
	@Autowired
	public PostDao(EntityManager theEntityManager) {
		em=theEntityManager;
		
	}

	@Override
	public void create(Post post) {
		Session currentSession = em.unwrap(Session.class);
		currentSession.saveOrUpdate(post);
		
		
	}

}
