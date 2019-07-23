package com.we.security.entity;

import java.io.Serializable;
import java.math.BigInteger;

public class User implements Serializable {
    private long u_id;
    private String u_email;
    private String u_pwd;
    private String u_name;
    private String u_sex;
    private int u_age;
    private long n_id;
    private int u_flag;

    public long getU_id() {
        return u_id;
    }

    public void setU_id(long u_id) {
        this.u_id = u_id;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public int getU_age() {
        return u_age;
    }

    public void setU_age(int u_age) {
        this.u_age = u_age;
    }

    public long getN_id() {
        return n_id;
    }

    public void setN_id(long n_id) {
        this.n_id = n_id;
    }

    public int getU_flag() {
        return u_flag;
    }

    public void setU_flag(int u_flag) {
        this.u_flag = u_flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_email='" + u_email + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_age=" + u_age +
                ", n_id=" + n_id +
                ", u_flag=" + u_flag +
                '}';
    }
}
