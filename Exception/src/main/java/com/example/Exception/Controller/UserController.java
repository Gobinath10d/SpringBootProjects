package com.example.Exception.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.Entity.UserEntity;
import com.example.Exception.ExceptionHandle.ExistUserIdException;
import com.example.Exception.ExceptionHandle.ExistUserName;
import com.example.Exception.Service.UserService;

@RestController

public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/userinsert")
	public String insertuserdetails(@RequestBody List<UserEntity>userentity) 
	{
		return userservice.inseruserdetails(userentity);
	}
	
	@GetMapping("/userview")
	public  List<UserEntity> getuser()
	{
		return userservice.getuser();
	}
	

	//Exception
	
	@GetMapping("/user/{userId}")
	public  UserEntity getuserById(@PathVariable Integer userId) throws  ExistUserIdException
	{
		return userservice.getById(userId);
	}
	
	@GetMapping("/user1/{userName}")
	public  UserEntity getuserByName(@PathVariable String userName) throws  ExistUserName
	{
		return userservice.getByName(userName);
	}
	

}
