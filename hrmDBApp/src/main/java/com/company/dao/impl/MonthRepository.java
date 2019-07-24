package com.company.dao.impl;

import com.company.entity.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MonthRepository extends JpaRepository<Month, Integer> {


    List<Month> findAll();

    Month findById(int id);

    @Override
    void deleteById(Integer id);
    
    @Override
    Month save(Month u);
    

}