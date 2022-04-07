package com.example.onetomany.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.Entity.CourseEntity;

@Repository

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

	Optional<CourseEntity> findBycoursename(String coursename);

}
