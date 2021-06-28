package com.wangwei.database.entity;

import java.io.Serializable;

/**
 * @author wangwei
 * @date 2021-06-24 13:24
 * @since 1.0
 */

public class Student implements Serializable {
    private Integer id;
    private String realname;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname;
    }
}

