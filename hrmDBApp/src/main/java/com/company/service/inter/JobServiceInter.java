/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.Jobs;

import java.util.List;


public interface JobServiceInter {

    public List<Jobs> getAll();

    public Jobs getById(int id);

    public boolean addJob(Jobs u);

    public boolean updateJob(Jobs u);

    public boolean removeJob(Integer id);

}