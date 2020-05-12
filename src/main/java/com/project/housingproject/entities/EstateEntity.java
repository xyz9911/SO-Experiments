package com.project.housingproject.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "estate", schema = "housing_system", catalog = "")
public class EstateEntity {
    private int eid;
    private String ename;
    private BigDecimal eavgprice;
    private String eaddress;
    private String eimage;
    private String ebriefinfo;
    private String einfo;

    @Id
    @Column(name = "EID", nullable = false)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "ENAME", nullable = false, length = 255)
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "EAVGPRICE", nullable = false, precision = 2)
    public BigDecimal getEavgprice() {
        return eavgprice;
    }

    public void setEavgprice(BigDecimal eavgprice) {
        this.eavgprice = eavgprice;
    }

    @Basic
    @Column(name = "EADDRESS", nullable = false, length = 255)
    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    @Basic
    @Column(name = "EIMAGE", nullable = true, length = 255)
    public String getEimage() {
        return eimage;
    }

    public void setEimage(String eimage) {
        this.eimage = eimage;
    }

    @Basic
    @Column(name = "EBRIEFINFO", nullable = true, length = 255)
    public String getEbriefinfo() {
        return ebriefinfo;
    }

    public void setEbriefinfo(String ebriefinfo) {
        this.ebriefinfo = ebriefinfo;
    }

    @Basic
    @Column(name = "EINFO", nullable = true, length = 2000)
    public String getEinfo() {
        return einfo;
    }

    public void setEinfo(String einfo) {
        this.einfo = einfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstateEntity that = (EstateEntity) o;

        if (eid != that.eid) return false;
        if (ename != null ? !ename.equals(that.ename) : that.ename != null) return false;
        if (eavgprice != null ? !eavgprice.equals(that.eavgprice) : that.eavgprice != null) return false;
        if (eaddress != null ? !eaddress.equals(that.eaddress) : that.eaddress != null) return false;
        if (eimage != null ? !eimage.equals(that.eimage) : that.eimage != null) return false;
        if (ebriefinfo != null ? !ebriefinfo.equals(that.ebriefinfo) : that.ebriefinfo != null) return false;
        if (einfo != null ? !einfo.equals(that.einfo) : that.einfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eid;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (eavgprice != null ? eavgprice.hashCode() : 0);
        result = 31 * result + (eaddress != null ? eaddress.hashCode() : 0);
        result = 31 * result + (eimage != null ? eimage.hashCode() : 0);
        result = 31 * result + (ebriefinfo != null ? ebriefinfo.hashCode() : 0);
        result = 31 * result + (einfo != null ? einfo.hashCode() : 0);
        return result;
    }
}
