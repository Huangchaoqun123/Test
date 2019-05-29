package com.waylau.spring.boot.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

/**
 * 权限.
 * 
 * @since 1.0.0 2017年3月14日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Entity // 标注为这是一个实体类
public class Authority implements GrantedAuthority {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 主键自增长
	private Long id;
	@Column(nullable = false) // 映射为字段，非空
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
