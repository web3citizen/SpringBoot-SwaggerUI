/**
 * 
 */
package com.liuwp.appserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liuwp.appserver.bean.User;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * @author clevo
 *
 */
@RestController
@RequestMapping(value="/users")
public class UserController {
	
	
	@ApiOperation(value="Get all users",notes="requires noting")
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getUsers(){
		List<User> list=new ArrayList<User>();
		
		User user=new User();
		user.setId("1");
		user.setName("hello");
		list.add(user);
		
		User user2=new User();
		user2.setId("2");
		user.setName("world");
		list.add(user2);
		return list;
	}
	
	
	@ApiOperation(value="Get user with id",notes="requires the id of user")
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public User getUserById(@PathVariable String id){
		User user=new User();
		user.setId(id);
		user.setName("hello world");
		return user;
	}
	

}
