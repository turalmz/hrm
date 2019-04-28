package com.company.service.impl;


import com.company.dao.impl.CountryRepository;
import com.company.dao.impl.JobRepository;
import com.company.entity.Countries;
import com.company.service.inter.CountryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CountryServiceImpl implements CountryServiceInter {


    @Autowired

    private CountryRepository entityDao;

    @Override
    public List<Countries> getAll() {
        return entityDao.findAll();
    }

    @Override
    public Countries getById(int userId) {
        return entityDao.findById(userId);
    }

    @Override
    public boolean addCountry(Countries u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateCountry(Countries u) {
        entityDao.save(u);

        return true;
    }

    @Override
    public boolean removeCountry(Integer id) {
        entityDao.deleteById(id);
        return true;
    }


}