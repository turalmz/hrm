/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.inter;

import com.company.entity.Countries;
import java.util.List;

/**
 *
 * @author TURAL
 */
public interface CountryServiceInter {
    public List<Countries> getAll();

    public Countries getById(int id);

    public boolean addCountry(Countries u);

    public boolean updateCountry(Countries u);

    public boolean removeCountry(Integer id);
}
