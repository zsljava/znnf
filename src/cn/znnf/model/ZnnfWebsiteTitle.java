package cn.znnf.model;

import java.util.Date;

public class ZnnfWebsiteTitle {
    private Integer id;

    private String title_content;

    private Date title_operate_time;

    private String title_operator;

    private Boolean title_category;

    private String title_remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle_content() {
        return title_content;
    }

    public void setTitle_content(String title_content) {
        this.title_content = title_content == null ? null : title_content.trim();
    }

    public Date getTitle_operate_time() {
        return title_operate_time;
    }

    public void setTitle_operate_time(Date title_operate_time) {
        this.title_operate_time = title_operate_time;
    }

    public String getTitle_operator() {
        return title_operator;
    }

    public void setTitle_operator(String title_operator) {
        this.title_operator = title_operator == null ? null : title_operator.trim();
    }

    public Boolean getTitle_category() {
        return title_category;
    }

    public void setTitle_category(Boolean title_category) {
        this.title_category = title_category;
    }

    public String getTitle_remark() {
        return title_remark;
    }

    public void setTitle_remark(String title_remark) {
        this.title_remark = title_remark == null ? null : title_remark.trim();
    }
}