package com.example.webclients2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webclients2.Entity.CarEntity;

@Repository

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
