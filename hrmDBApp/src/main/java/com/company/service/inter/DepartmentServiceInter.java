/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.Departments;


import java.util.List;


public interface DepartmentServiceInter {

    public List<Departments> getAll();

    public Departments getById(int id);

    public boolean addDepartments(Departments u);

    public boolean updateDepartments(Departments u);

    public boolean removeDepartments(Integer id);


}