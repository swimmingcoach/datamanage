package com.emg.datamanage.pojo;

import java.util.Date;

public class MaskIteminfoModel {
    private Long id;

    private String oid;

    private String name;

    private String errorremark;

    private Integer enable;

    private Date updatetime;

    private Long errortype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getErrorremark() {
        return errorremark;
    }

    public void setErrorremark(String errorremark) {
        this.errorremark = errorremark == null ? null : errorremark.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getErrortype() {
        return errortype;
    }

    public void setErrortype(Long errortype) {
        this.errortype = errortype;
    }
}