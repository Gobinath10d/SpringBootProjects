package com.example.manytomany.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.Entity.ProductEntity;

@Repository

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {




	Optional<ProductEntity> findByprodName(String prodName);

}
