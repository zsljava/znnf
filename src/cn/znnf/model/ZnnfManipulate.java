package cn.znnf.model;

import java.util.Date;

public class ZnnfManipulate {
    private Integer id;

    private String manipulate_name;

    private Date manipulate_time;

    private String manipulate_desc;

    private String manipulate_IP;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManipulate_name() {
        return manipulate_name;
    }

    public void setManipulate_name(String manipulate_name) {
        this.manipulate_name = manipulate_name == null ? null : manipulate_name.trim();
    }

    public Date getManipulate_time() {
        return manipulate_time;
    }

    public void setManipulate_time(Date manipulate_time) {
        this.manipulate_time = manipulate_time;
    }

    public String getManipulate_desc() {
        return manipulate_desc;
    }

    public void setManipulate_desc(String manipulate_desc) {
        this.manipulate_desc = manipulate_desc == null ? null : manipulate_desc.trim();
    }

    public String getManipulate_IP() {
        return manipulate_IP;
    }

    public void setManipulate_IP(String manipulate_IP) {
        this.manipulate_IP = manipulate_IP == null ? null : manipulate_IP.trim();
    }
}