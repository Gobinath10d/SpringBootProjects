package com.example.Exception.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Exception.Entity.UserEntity;

@Repository

public interface UserRepository extends JpaRepository<UserEntity, Integer>{


	Optional<UserEntity> findByUserName(String userName);

}
