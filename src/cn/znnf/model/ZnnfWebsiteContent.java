package cn.znnf.model;

import java.util.Date;

public class ZnnfWebsiteContent {
    private Integer id;

    private String content_introduce;

    private String content_image;

    private String connt_operator;

    private Date content_operate_time;

    private String content_remark;

    private Integer title_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent_introduce() {
        return content_introduce;
    }

    public void setContent_introduce(String content_introduce) {
        this.content_introduce = content_introduce == null ? null : content_introduce.trim();
    }

    public String getContent_image() {
        return content_image;
    }

    public void setContent_image(String content_image) {
        this.content_image = content_image == null ? null : content_image.trim();
    }

    public String getConnt_operator() {
        return connt_operator;
    }

    public void setConnt_operator(String connt_operator) {
        this.connt_operator = connt_operator == null ? null : connt_operator.trim();
    }

    public Date getContent_operate_time() {
        return content_operate_time;
    }

    public void setContent_operate_time(Date content_operate_time) {
        this.content_operate_time = content_operate_time;
    }

    public String getContent_remark() {
        return content_remark;
    }

    public void setContent_remark(String content_remark) {
        this.content_remark = content_remark == null ? null : content_remark.trim();
    }

    public Integer getTitle_id() {
        return title_id;
    }

    public void setTitle_id(Integer title_id) {
        this.title_id = title_id;
    }
}