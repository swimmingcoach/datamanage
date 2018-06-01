package com.emg.datamanage.pojo;

import java.util.Date;

public class OKErrorIteminfoModel {
    private Long id;

    private String qid;

    private Long errortype;

    private String errorremark;

    private Integer enable;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    public Long getErrortype() {
        return errortype;
    }

    public void setErrortype(Long errortype) {
        this.errortype = errortype;
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
}