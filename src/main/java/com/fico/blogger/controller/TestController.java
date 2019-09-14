package com.fico.blogger.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fico.blogger.entity.Post;
import com.fico.blogger.iservice.IPostSrv;

@RestController
public class TestController {
	@Autowired
	IPostSrv ip;
	@GetMapping("/")
	public String hello() {
		Post p=new Post();
		p.setBlogType("ABC");
		p.setDate(Calendar.getInstance().getTime());
		p.setLikes(4);
		p.setUserId(null);
		
		
		ip.createPost(p);
		return "Hello Wtrl!!";
	}
}
