package com.company.service.impl;


import com.company.dao.impl.EmployeeMonthHoursRepository;
import com.company.entity.EmployeeMonthHours;
import com.company.service.inter. EmployeeMonthHoursServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeeMonthHoursServiceImpl implements EmployeeMonthHoursServiceInter {


    @Autowired

    private EmployeeMonthHoursRepository entityDao;

    @Override
    public List<EmployeeMonthHours> getAll() {
        return entityDao.findAll();
    }

    @Override
    public EmployeeMonthHours getById(int userId) {
        return entityDao.findById(userId);
    }

    @Override
    public boolean addEmployeeMonthHours(EmployeeMonthHours u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateEmployeeMonthHours(EmployeeMonthHours u) {
        entityDao.save(u);

        return true;
    }

    @Override
    public boolean removeEmployeeMonthHours(Integer id) {
        entityDao.deleteById(id);
        return true;
    }




}