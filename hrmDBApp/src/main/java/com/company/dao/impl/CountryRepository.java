package com.company.dao.impl;

import com.company.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CountryRepository extends JpaRepository<Countries, Integer> {


    List<Countries> findAll();

    Countries findById(int id);

    @Override
    void deleteById(Integer id);
    
    @Override
    Countries save(Countries u);
    

}