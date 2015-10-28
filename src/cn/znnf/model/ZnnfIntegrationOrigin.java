package cn.znnf.model;

import java.util.Date;

public class ZnnfIntegrationOrigin {
    private Integer id;

    private String origin_mode;

    private Boolean origin_type;

    private Float origin_consume;

    private Date origin_time;

    private String origin_remark;

    private String origin_create_name;

    private Date origin_create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigin_mode() {
        return origin_mode;
    }

    public void setOrigin_mode(String origin_mode) {
        this.origin_mode = origin_mode == null ? null : origin_mode.trim();
    }

    public Boolean getOrigin_type() {
        return origin_type;
    }

    public void setOrigin_type(Boolean origin_type) {
        this.origin_type = origin_type;
    }

    public Float getOrigin_consume() {
        return origin_consume;
    }

    public void setOrigin_consume(Float origin_consume) {
        this.origin_consume = origin_consume;
    }

    public Date getOrigin_time() {
        return origin_time;
    }

    public void setOrigin_time(Date origin_time) {
        this.origin_time = origin_time;
    }

    public String getOrigin_remark() {
        return origin_remark;
    }

    public void setOrigin_remark(String origin_remark) {
        this.origin_remark = origin_remark == null ? null : origin_remark.trim();
    }

    public String getOrigin_create_name() {
        return origin_create_name;
    }

    public void setOrigin_create_name(String origin_create_name) {
        this.origin_create_name = origin_create_name == null ? null : origin_create_name.trim();
    }

    public Date getOrigin_create_time() {
        return origin_create_time;
    }

    public void setOrigin_create_time(Date origin_create_time) {
        this.origin_create_time = origin_create_time;
    }
}