/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume;

import com.company.entity.Employees;
import java.text.SimpleDateFormat;

/**
 *
 * @author TURAL
 */
public class Config {
    public static Employees loggedInUser;
        public static Employees curUser;

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

}
