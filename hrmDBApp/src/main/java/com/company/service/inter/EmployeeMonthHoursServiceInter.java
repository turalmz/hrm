/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.EmployeeMonth;
import com.company.entity.EmployeeMonthHours;

import java.util.List;

/**
 *
 * @author TURAL
 */
public interface EmployeeMonthHoursServiceInter {

    List<EmployeeMonthHours> getAll();

   //List<EmployeeMonth> findByFirstnameAndLastname(String firstname, String lastname);
    
    public EmployeeMonthHours getById(int id);
    
    
    public EmployeeMonthHours findByDay(int day);

    public boolean addEmployeeMonthHours(EmployeeMonthHours u);

    boolean updateEmployeeMonthHours(EmployeeMonthHours u);

    boolean removeEmployeeMonthHours(Integer id);

}
