/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author TURAL
 */
@Entity
@Table(name = "employee_month_hours")
@NamedQueries({
    @NamedQuery(name = "EmployeeMonthHours.findAll", query = "SELECT e FROM EmployeeMonthHours e")
    , @NamedQuery(name = "EmployeeMonthHours.findById", query = "SELECT e FROM EmployeeMonthHours e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeMonthHours.findByDay", query = "SELECT e FROM EmployeeMonthHours e WHERE e.day = :day")
    , @NamedQuery(name = "EmployeeMonthHours.findByStart", query = "SELECT e FROM EmployeeMonthHours e WHERE e.start = :start")
    , @NamedQuery(name = "EmployeeMonthHours.findByEnd", query = "SELECT e FROM EmployeeMonthHours e WHERE e.end = :end")
    , @NamedQuery(name = "EmployeeMonthHours.findByHours", query = "SELECT e FROM EmployeeMonthHours e WHERE e.hours = :hours")})
public class EmployeeMonthHours implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DAY")
    private Integer day;
    @Column(name = "START")
    private String start;
    @Column(name = "END")
    private String end;
    @Column(name = "HOURS")
    private Integer hours;
    @JoinColumn(name = "EMP_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Employees empId;
    @JoinColumn(name = "MONTH_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Month monthId;
    @JoinColumn(name = "EMP_MONTH_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private EmployeeMonth empMonthId;

    public EmployeeMonthHours() {
    }

    public EmployeeMonthHours(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Employees getEmpId() {
        return empId;
    }

    public void setEmpId(Employees empId) {
        this.empId = empId;
    }

    public Month getMonthId() {
        return monthId;
    }

    public void setMonthId(Month monthId) {
        this.monthId = monthId;
    }

    public EmployeeMonth getEmpMonthId() {
        return empMonthId;
    }

    public void setEmpMonthId(EmployeeMonth empMonthId) {
        this.empMonthId = empMonthId;
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
        if (!(object instanceof EmployeeMonthHours)) {
            return false;
        }
        EmployeeMonthHours other = (EmployeeMonthHours) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return monthId.toString();
    }
    
}
