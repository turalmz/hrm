/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.Departments;
import com.company.entity.Employees;

import java.util.List;

/**
 *
 * @author TURAL
 */
public interface EmployeesServiceInter {

    List<Employees> getAll();

    List<Employees> findByFirstnameAndLastname(String firstname, String lastname);
    
    List<Employees> getByDepartment(Departments dep);

    public Employees getById(int id);

    public boolean addEmployees(Employees u);

    boolean updateEmployees(Employees u);

    boolean removeEmployees(int id);

}
