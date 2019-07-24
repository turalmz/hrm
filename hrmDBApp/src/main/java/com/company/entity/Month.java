/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author TURAL
 */
@Entity
@Table(name = "month")
@NamedQueries({
    @NamedQuery(name = "Month.findAll", query = "SELECT m FROM Month m")
    , @NamedQuery(name = "Month.findById", query = "SELECT m FROM Month m WHERE m.id = :id")
    , @NamedQuery(name = "Month.findByYear", query = "SELECT m FROM Month m WHERE m.year = :year")
    , @NamedQuery(name = "Month.findByMonth", query = "SELECT m FROM Month m WHERE m.month = :month")})
public class Month implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "YEAR")
    private Integer year;
    @Basic(optional = false)
    @Column(name = "MONTH")
    private int month;
    @OneToMany(mappedBy = "monthId", fetch = FetchType.LAZY)
    private List<EmployeeMonthHours> employeeMonthHoursList;
    @OneToMany(mappedBy = "monthId", fetch = FetchType.LAZY)
    private List<EmployeeMonth> employeeMonthList;

    public Month() {
    }

    public Month(Integer id) {
        this.id = id;
    }

    public Month(Integer id, int month) {
        this.id = id;
        this.month = month;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public List<EmployeeMonthHours> getEmployeeMonthHoursList() {
        return employeeMonthHoursList;
    }

    public void setEmployeeMonthHoursList(List<EmployeeMonthHours> employeeMonthHoursList) {
        this.employeeMonthHoursList = employeeMonthHoursList;
    }

    public List<EmployeeMonth> getEmployeeMonthList() {
        return employeeMonthList;
    }

    public void setEmployeeMonthList(List<EmployeeMonth> employeeMonthList) {
        this.employeeMonthList = employeeMonthList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Month)) {
            return false;
        }
        Month other = (Month) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+year+"." + id + "";
    }
    
}
