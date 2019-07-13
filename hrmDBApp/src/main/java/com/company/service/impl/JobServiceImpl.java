package com.company.service.impl;


import com.company.dao.impl.JobRepository;
import com.company.entity.Jobs;
import com.company.service.inter.JobServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class JobServiceImpl implements JobServiceInter {


    @Autowired

    private JobRepository entityDao;

    @Override
    public List<Jobs> getAll() {
        return entityDao.findAll();
    }

    @Override
    public Jobs getById(int userId) {
        return entityDao.findById(userId);
    }

    @Override
    public boolean addJob(Jobs u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateJob(Jobs u) {
        entityDao.save(u);

        return true;
    }

    @Override
    public boolean removeJob(Integer id) {
        entityDao.deleteById(id);
        return true;
    }


}