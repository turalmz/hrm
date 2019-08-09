package com.company.service.impl;


import com.company.dao.impl.EmployeeRepository;
import com.company.entity.Departments;
import com.company.entity.Employees;
import com.company.entity.Jobs;
import com.company.service.inter.EmployeesServiceInter;
import com.company.service.inter.JobServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
@Transactional
@Qualifier("employeeService")
public class EmployeeServiceImpl implements EmployeesServiceInter {


    @Autowired
    private EmployeeRepository entityDao;

    @Override
    public List<Employees> getAll() {
        return entityDao.findAll();
    }

    @Override
    public List<Employees> findByFirstnameAndLastname(String firstname, String lastname){
        return entityDao.findByFirstnameAndLastname(firstname,lastname);
    }


    @Override
    public List<Employees> getByDepartment(Departments dep){
        return entityDao.findByDepartment(dep);
    }

    

    @Override
    public Employees getById(int userId) {
        return entityDao.findById(userId);
    }

    @Override
    public boolean addEmployees(Employees u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateEmployees(Employees u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean removeEmployees(int id) {
        entityDao.deleteById(id);
        return true;
    }

}