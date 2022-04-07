package com.example.Exception.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.Entity.UserEntity;
import com.example.Exception.ExceptionHandle.ExistUserIdException;
import com.example.Exception.ExceptionHandle.ExistUserName;
import com.example.Exception.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepository;

	public String inseruserdetails(List<UserEntity> userentity)
	{
		userrepository.saveAll(userentity);
		return "insert sucessfully";		
	}

	public List<UserEntity>getuser()
	{
		return userrepository.findAll() ;

	}
	public UserEntity getById(Integer userId) throws ExistUserIdException
	{
		Optional<UserEntity>opt=userrepository.findById(userId);
		if (opt.isPresent())
		{
			return  opt.get();
		}
		else 
		{
			
			throw new ExistUserIdException();
		}
	
	}
	
	public UserEntity getByName(String userName) throws ExistUserName
	{
		Optional<UserEntity>opt1=userrepository.findByUserName(userName);
		if(opt1.isPresent())
		{
			return opt1.get();
		}
		else
		{
			throw new ExistUserName();
		}
	
	
		
	}



}