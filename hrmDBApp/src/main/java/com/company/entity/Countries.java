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
@Table(name = "countries")
@NamedQueries({
    @NamedQuery(name = "Countries.findAll", query = "SELECT c FROM Countries c")
    , @NamedQuery(name = "Countries.findById", query = "SELECT c FROM Countries c WHERE c.id = :id")
    , @NamedQuery(name = "Countries.findByName", query = "SELECT c FROM Countries c WHERE c.name = :name")})
public class Countries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "countryId")
    private List<Locations> locationsList;
    @JoinColumn(name = "REGION_ID", referencedColumnName = "id")
    @ManyToOne
    private Regions regionId;

    public Countries() {
    }

    public Countries(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Locations> getLocationsList() {
        return locationsList;
    }

    public void setLocationsList(List<Locations> locationsList) {
        this.locationsList = locationsList;
    }

    public Regions getRegionId() {
        return regionId;
    }

    public void setRegionId(Regions regionId) {
        this.regionId = regionId;
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
        if (!(object instanceof Countries)) {
            return false;
        }
        Countries other = (Countries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.Countries[ id=" + id + " ]";
    }
    
}
