package com.example.rabbitmqconsumers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rabbitmqconsumers.Model.ConsumersModel;

@Repository
public interface ConsumerRepo extends JpaRepository<ConsumersModel, Integer> {

}
