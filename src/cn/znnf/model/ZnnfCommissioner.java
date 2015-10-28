package cn.znnf.model;

import java.util.Date;

public class ZnnfCommissioner {
    private Integer id;

    private String commissioner_number;

    private String commissioner_password;

    private String commissioner_name;

    private String commissioner_id_number;

    private Integer commissioner_phone;

    private String commissioner_workplace;

    private Date commissioner_entrytime;

    private Boolean commissioner_status;

    private String commissioner_remark;

    private String commissioner_create_name;

    private Date commissioner_create_time;

    private Integer position_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommissioner_number() {
        return commissioner_number;
    }

    public void setCommissioner_number(String commissioner_number) {
        this.commissioner_number = commissioner_number == null ? null : commissioner_number.trim();
    }

    public String getCommissioner_password() {
        return commissioner_password;
    }

    public void setCommissioner_password(String commissioner_password) {
        this.commissioner_password = commissioner_password == null ? null : commissioner_password.trim();
    }

    public String getCommissioner_name() {
        return commissioner_name;
    }

    public void setCommissioner_name(String commissioner_name) {
        this.commissioner_name = commissioner_name == null ? null : commissioner_name.trim();
    }

    public String getCommissioner_id_number() {
        return commissioner_id_number;
    }

    public void setCommissioner_id_number(String commissioner_id_number) {
        this.commissioner_id_number = commissioner_id_number == null ? null : commissioner_id_number.trim();
    }

    public Integer getCommissioner_phone() {
        return commissioner_phone;
    }

    public void setCommissioner_phone(Integer commissioner_phone) {
        this.commissioner_phone = commissioner_phone;
    }

    public String getCommissioner_workplace() {
        return commissioner_workplace;
    }

    public void setCommissioner_workplace(String commissioner_workplace) {
        this.commissioner_workplace = commissioner_workplace == null ? null : commissioner_workplace.trim();
    }

    public Date getCommissioner_entrytime() {
        return commissioner_entrytime;
    }

    public void setCommissioner_entrytime(Date commissioner_entrytime) {
        this.commissioner_entrytime = commissioner_entrytime;
    }

    public Boolean getCommissioner_status() {
        return commissioner_status;
    }

    public void setCommissioner_status(Boolean commissioner_status) {
        this.commissioner_status = commissioner_status;
    }

    public String getCommissioner_remark() {
        return commissioner_remark;
    }

    public void setCommissioner_remark(String commissioner_remark) {
        this.commissioner_remark = commissioner_remark == null ? null : commissioner_remark.trim();
    }

    public String getCommissioner_create_name() {
        return commissioner_create_name;
    }

    public void setCommissioner_create_name(String commissioner_create_name) {
        this.commissioner_create_name = commissioner_create_name == null ? null : commissioner_create_name.trim();
    }

    public Date getCommissioner_create_time() {
        return commissioner_create_time;
    }

    public void setCommissioner_create_time(Date commissioner_create_time) {
        this.commissioner_create_time = commissioner_create_time;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }
}