package com.fico.blogger.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="blog")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer blogId;
	
	private String blogType;
	private Integer userId;
	private Integer likes;
	private Date date;
	@Column(name="file_name")
	private String post;
	public int getIdnt()
	{
		return 0;
	}

}
