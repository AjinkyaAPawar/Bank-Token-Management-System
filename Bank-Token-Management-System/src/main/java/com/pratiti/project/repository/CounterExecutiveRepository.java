package com.pratiti.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratiti.project.entity.CounterExecutive;

public interface CounterExecutiveRepository extends JpaRepository<CounterExecutive, Integer> {

}