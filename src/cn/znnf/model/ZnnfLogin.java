package cn.znnf.model;

import java.util.Date;

public class ZnnfLogin {
    private Integer id;

    private String login_name;

    private Date login_time;

    private String login_IP;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name == null ? null : login_name.trim();
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getLogin_IP() {
        return login_IP;
    }

    public void setLogin_IP(String login_IP) {
        this.login_IP = login_IP == null ? null : login_IP.trim();
    }
}