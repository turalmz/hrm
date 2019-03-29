package com.company.dao.impl;

import com.company.entity.Employees;
import com.company.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

    List<Employees> findByFirstnameAndLastname(String firstname, String lastname);

    List<Employees> getAll();

    List<Employees> findByEmail(String email);

    Employees findById(int id);

    @Override
    void deleteById(Integer id);
    
    @Override
    Employees save(Employees u);
    
    List<Employees> findByJob(Jobs firstname);


}