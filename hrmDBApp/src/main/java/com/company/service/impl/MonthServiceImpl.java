package com.company.service.impl;


import com.company.dao.impl.MonthRepository;
import com.company.entity.Month;
import com.company.service.inter.MonthServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MonthServiceImpl implements MonthServiceInter {


    @Autowired

    private MonthRepository entityDao;

    @Override
    public List<Month> getAll() {
        return entityDao.findAll();
    }

    @Override
    public Month getById(int userId) {
        return entityDao.findById(userId);
    }

    @Override
    public boolean addMonth(Month u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateMonth(Month u) {
        entityDao.save(u);

        return true;
    }

    @Override
    public boolean removeMonth(Integer id) {
        entityDao.deleteById(id);
        return true;
    }


}