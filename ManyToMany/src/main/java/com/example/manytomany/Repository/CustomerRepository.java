package com.example.manytomany.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.Entity.CustomerEntity;

@Repository

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {


	Optional<CustomerEntity> findByCusPhno(long cusPhno);


}
