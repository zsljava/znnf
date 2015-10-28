package cn.znnf.model;

import java.util.Date;

public class ZnnfMessageFeedback {
    private Integer id;

    private String commissioner_number;

    private Date feedback_time;

    private Integer send_id;

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

    public Date getFeedback_time() {
        return feedback_time;
    }

    public void setFeedback_time(Date feedback_time) {
        this.feedback_time = feedback_time;
    }

    public Integer getSend_id() {
        return send_id;
    }

    public void setSend_id(Integer send_id) {
        this.send_id = send_id;
    }
}