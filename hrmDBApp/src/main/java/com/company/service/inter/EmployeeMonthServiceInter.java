/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.EmployeeMonth;

import java.util.List;

/**
 *
 * @author TURAL
 */
public interface EmployeeMonthServiceInter {

    List<EmployeeMonth> getAll();

   //List<EmployeeMonth> findByFirstnameAndLastname(String firstname, String lastname);

    public EmployeeMonth getById(int id);

    public boolean addEmployeeMonth(EmployeeMonth u);

    boolean updateEmployeeMonth(EmployeeMonth u);

    boolean removeEmployeeMonth(Integer id);

}
