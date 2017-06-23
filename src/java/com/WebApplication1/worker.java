/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebApplication1;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marwan
 */
@Entity
@XmlRootElement
public class worker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    @Column(name="PlateID")
    private String PlateID;

    /**
     * Get the value of PlateID
     *
     * @return the value of PlateID
     */
    public String getPlateID() {
        return PlateID;
    }

    /**
     * Set the value of PlateID
     *
     * @param PlateID new value of PlateID
     */
    public void setPlateID(String PlateID) {
        this.PlateID = PlateID;
    }
     @Column(name="PositionRow")
    private String PositionRow;

    /**
     * Get the value of PositionRow
     *
     * @return the value of PositionRow
     */
    public String getPositionRow() {
        return PositionRow;
    }

    /**
     * Set the value of PositionRow
     *
     * @param PositionRow new value of PositionRow
     */
    public void setPositionRow(String PositionRow) {
        this.PositionRow = PositionRow;
    }
     @Column(name="PoitionColumn")
    private int PoitionColumn;

    /**
     * Get the value of PoitionColumn
     *
     * @return the value of PoitionColumn
     */
    public int getPoitionColumn() {
        return PoitionColumn;
    }

    /**
     * Set the value of PoitionColumn
     *
     * @param PoitionColumn new value of PoitionColumn
     */
    public void setPoitionColumn(int PoitionColumn) {
        this.PoitionColumn = PoitionColumn;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof worker)) {
            return false;
        }
        worker other = (worker) object; 
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))  {
            return false;
        }
        if (this.PositionRow == null ? !PositionRow.equals(other.PositionRow) : PositionRow == null  ){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.WebApplication1.worker[ id=" + id + " ]";
    }
    
}
