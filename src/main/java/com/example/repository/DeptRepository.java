package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Dept;

public interface DeptRepository extends CrudRepository<Dept, Integer> {

}
