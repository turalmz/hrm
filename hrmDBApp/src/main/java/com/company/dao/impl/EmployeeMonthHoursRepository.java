package com.company.dao.impl;

import com.company.entity.EmployeeMonthHours;
import com.company.entity.EmployeeMonth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeMonthHoursRepository extends JpaRepository<EmployeeMonthHours, Integer> {


    List<EmployeeMonthHours> findAll();

    EmployeeMonthHours findById(int id);
    

    EmployeeMonthHours findByDay(int day);

    
    
    @Override
    void deleteById(Integer id);
    
    @Override
    EmployeeMonthHours save(EmployeeMonthHours u);
    

}