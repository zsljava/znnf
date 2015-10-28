package cn.znnf.model;

import java.util.Date;

public class ZnnfMessageSend {
    private Integer id;

    private String send_content;

    private String send_create_name;

    private Date send_create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSend_content() {
        return send_content;
    }

    public void setSend_content(String send_content) {
        this.send_content = send_content == null ? null : send_content.trim();
    }

    public String getSend_create_name() {
        return send_create_name;
    }

    public void setSend_create_name(String send_create_name) {
        this.send_create_name = send_create_name == null ? null : send_create_name.trim();
    }

    public Date getSend_create_time() {
        return send_create_time;
    }

    public void setSend_create_time(Date send_create_time) {
        this.send_create_time = send_create_time;
    }
}