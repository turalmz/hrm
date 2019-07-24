package com.company.dao.impl;

import com.company.entity.EmployeeMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeMonthRepository extends JpaRepository<EmployeeMonth, Integer> {


    List<EmployeeMonth> findAll();

    EmployeeMonth findById(int id);

    @Override
    void deleteById(Integer id);
    
    @Override
    EmployeeMonth save(EmployeeMonth u);
    

}