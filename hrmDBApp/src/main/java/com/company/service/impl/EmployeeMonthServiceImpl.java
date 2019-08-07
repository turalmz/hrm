package com.company.service.impl;


import com.company.dao.impl.EmployeeMonthRepository;
import com.company.entity.EmployeeMonth;
import com.company.entity.Employees;
import com.company.entity.Month;
import com.company.service.inter.EmployeeMonthServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeeMonthServiceImpl implements EmployeeMonthServiceInter {


    @Autowired

    private EmployeeMonthRepository entityDao;

    @Override
    public List<EmployeeMonth> getAll() {
        return entityDao.findAll();
    }

    @Override
    public EmployeeMonth getById(int userId) {
        return entityDao.findById(userId);
    }

    @Override
    public List<EmployeeMonth> getByEmployeesId(int EMP_ID) {
        return entityDao.findByEmployeesId(EMP_ID);
    }
    
    
    @Override
    public List<EmployeeMonth> getByEmployeesAndMonth(Employees EMP_ID,Month mon) {
        return entityDao.findByEmployeesAndMonth(EMP_ID,mon);
    }
    
    
    @Override
    public boolean addEmployeeMonth(EmployeeMonth u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateEmployeeMonth(EmployeeMonth u) {
        entityDao.save(u);

        return true;
    }

    @Override
    public boolean removeEmployeeMonth(Integer id) {
        entityDao.deleteById(id);
        return true;
    }






}