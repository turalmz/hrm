package com.company.dao.impl;

import com.company.entity.Departments;
import com.company.entity.Employees;
import com.company.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepository extends JpaRepository<Jobs, Integer> {


    List<Jobs> findAll();

    Jobs findById(int id);

    @Override
    void deleteById(Integer id);
    
    @Override
    Jobs save(Jobs u);
    

}