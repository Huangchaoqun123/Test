/**
 * 
 */
package com.waylau.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.boot.blog.domain.Authority;
import com.waylau.spring.boot.blog.repository.AuthorityRepository;

/**
 * Authority 服务.
 * 
 * @since 1.0.0 2017年3月30日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Service
public class AuthorityServiceImpl implements AuthorityService  {

	@Autowired
	AuthorityRepository authorityRepo;
	@Override
	public Authority getAuthorityById(Long id) {
		// TODO Auto-generated method stub
		Authority authority = authorityRepo.findOne(id);
		return authority;
	}
	
	
	

}
