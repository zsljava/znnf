package cn.znnf.model;

import java.util.Date;

public class ZnnfPosition {
    private Integer id;

    private String position_name;

    private String position_level;

    private String position_desc;

    private Boolean position_status;

    private Boolean position_type;

    private String positoin_remark;

    private String position_create_name;

    private Date position_create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name == null ? null : position_name.trim();
    }

    public String getPosition_level() {
        return position_level;
    }

    public void setPosition_level(String position_level) {
        this.position_level = position_level == null ? null : position_level.trim();
    }

    public String getPosition_desc() {
        return position_desc;
    }

    public void setPosition_desc(String position_desc) {
        this.position_desc = position_desc == null ? null : position_desc.trim();
    }

    public Boolean getPosition_status() {
        return position_status;
    }

    public void setPosition_status(Boolean position_status) {
        this.position_status = position_status;
    }

    public Boolean getPosition_type() {
        return position_type;
    }

    public void setPosition_type(Boolean position_type) {
        this.position_type = position_type;
    }

    public String getPositoin_remark() {
        return positoin_remark;
    }

    public void setPositoin_remark(String positoin_remark) {
        this.positoin_remark = positoin_remark == null ? null : positoin_remark.trim();
    }

    public String getPosition_create_name() {
        return position_create_name;
    }

    public void setPosition_create_name(String position_create_name) {
        this.position_create_name = position_create_name == null ? null : position_create_name.trim();
    }

    public Date getPosition_create_time() {
        return position_create_time;
    }

    public void setPosition_create_time(Date position_create_time) {
        this.position_create_time = position_create_time;
    }
}