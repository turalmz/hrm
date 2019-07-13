/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.Month;

import java.util.List;


public interface MonthServiceInter {

    public List<Month> getAll();

    public Month getById(int id);

    public boolean addMonth(Month u);

    public boolean updateMonth(Month u);

    public boolean removeMonth(Integer id);

}