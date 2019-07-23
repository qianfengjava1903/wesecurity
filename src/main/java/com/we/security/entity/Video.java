package com.we.security.entity;

import java.io.Serializable;
import java.util.Date;

public class Video implements Serializable {
    private long v_id;
    private String v_name;
    private long n_id;
    private Date v_upload;
    private Date v_alter;
    private int v_flag;

    public long getV_id() {
        return v_id;
    }

    public void setV_id(long v_id) {
        this.v_id = v_id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public long getN_id() {
        return n_id;
    }

    public void setN_id(long n_id) {
        this.n_id = n_id;
    }

    public Date getV_upload() {
        return v_upload;
    }

    public void setV_upload(Date v_upload) {
        this.v_upload = v_upload;
    }

    public Date getV_alter() {
        return v_alter;
    }

    public void setV_alter(Date v_alter) {
        this.v_alter = v_alter;
    }

    public int getV_flag() {
        return v_flag;
    }

    public void setV_flag(int v_flag) {
        this.v_flag = v_flag;
    }

    @Override
    public String toString() {
        return "Video{" +
                "v_id=" + v_id +
                ", v_name='" + v_name + '\'' +
                ", n_id=" + n_id +
                ", v_upload=" + v_upload +
                ", v_alter=" + v_alter +
                ", v_flag=" + v_flag +
                '}';
    }
}
