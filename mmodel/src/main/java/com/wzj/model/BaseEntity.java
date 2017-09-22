package com.wzj.model;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 2276507391884475616L;

    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
