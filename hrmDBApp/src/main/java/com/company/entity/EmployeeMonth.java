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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author TURAL
 */
@Entity
@Table(name = "employee_month")
@NamedQueries({
    @NamedQuery(name = "EmployeeMonth.findAll", query = "SELECT e FROM EmployeeMonth e")
    , @NamedQuery(name = "EmployeeMonth.findById", query = "SELECT e FROM EmployeeMonth e WHERE e.id = :id")
        , @NamedQuery(name = "EmployeeMonth.findByEmployeesId", query = "SELECT e FROM EmployeeMonth e WHERE e.empId = ?1")
        , @NamedQuery(name = "EmployeeMonth.findByEmployeesAndMonth", query = "SELECT e FROM EmployeeMonth e WHERE e.empId = ?1 and e.monthId = ?2")

        , @NamedQuery(name = "EmployeeMonth.findByHours", query = "SELECT e FROM EmployeeMonth e WHERE e.hours = :hours")})
public class EmployeeMonth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "HOURS")
    private String hours;
    @OneToMany(mappedBy = "empMonthId", fetch = FetchType.EAGER)
    private List<EmployeeMonthHours> employeeMonthHoursList;
    @JoinColumn(name = "EMP_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Employees empId;
    @JoinColumn(name = "MONTH_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Month monthId;

    public EmployeeMonth() {
    }

    public EmployeeMonth(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public List<EmployeeMonthHours> getEmployeeMonthHoursList() {
        return employeeMonthHoursList;
    }

    public void setEmployeeMonthHoursList(List<EmployeeMonthHours> employeeMonthHoursList) {
        this.employeeMonthHoursList = employeeMonthHoursList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeMonth)) {
            return false;
        }
        EmployeeMonth other = (EmployeeMonth) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.entity.EmployeeMonth[ id=" + id + " ]";
    }
    
}
