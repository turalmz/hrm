/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.Departments;
import com.company.entity.EmployeeMonth;
import com.company.entity.Employees;
import com.company.entity.Month;

import java.util.List;

/**
 *
 * @author TURAL
 */
public interface EmployeeMonthServiceInter {

    List<EmployeeMonth> getAll();

    List<EmployeeMonth> getByEmployeesId(Employees EMP_ID);
    
    List<EmployeeMonth> getByEmployeesList(List<Employees> EMP_ID);

    List<EmployeeMonth> getByEmployeesAndMonth(Employees EMP_ID,Month mon);
    
    public EmployeeMonth getById(int id);

    public boolean addEmployeeMonth(EmployeeMonth u);

    boolean updateEmployeeMonth(EmployeeMonth u);

    boolean removeEmployeeMonth(Integer id);

}
