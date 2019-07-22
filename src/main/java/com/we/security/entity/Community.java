package com.we.security.entity;

import java.io.Serializable;

/**
 * @program: we-security
 * @description: 社区实体类
 * @author: Mr.YangXin
 * @create: 2019-07-22 10:48
 * @return
 **/

public class Community implements Serializable {
    /**
     * 社区编号
     */
    private long CId;
    /**
     * 社区名称
     */
    private String CName;
    /**
     * 详细位置
     */
    private String CSite;
    /**
     * 状态值
     */
    private int CFlag;

    public long getCId() {
        return CId;
    }

    public void setCId(long CId) {
        this.CId = CId;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCSite() {
        return CSite;
    }

    public void setCSite(String CSite) {
        this.CSite = CSite;
    }

    public int getCFlag() {
        return CFlag;
    }

    public void setCFlag(int CFlag) {
        this.CFlag = CFlag;
    }
}
