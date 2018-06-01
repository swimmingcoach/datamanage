package com.emg.datamanage.pojo;

import java.util.Date;

public class OKErrorSetsRelatedModel {
    private Long id;

    private Long errorid;

    private Integer type;

    private Long featureid;

    private Integer layerid;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getErrorid() {
        return errorid;
    }

    public void setErrorid(Long errorid) {
        this.errorid = errorid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }

    public Integer getLayerid() {
        return layerid;
    }

    public void setLayerid(Integer layerid) {
        this.layerid = layerid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}