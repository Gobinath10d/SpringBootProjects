package com.example.onetomany.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.Entity.StudentEntity;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {


	Optional<StudentEntity> findByemailid(String emailid);

}
