package cn.znnf.model;

public class ZnnfManager {
    private Integer id;

    private String manager_name;

    private String manager_password;

    private Boolean manager_status;

    private String manager_create_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name == null ? null : manager_name.trim();
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password == null ? null : manager_password.trim();
    }

    public Boolean getManager_status() {
        return manager_status;
    }

    public void setManager_status(Boolean manager_status) {
        this.manager_status = manager_status;
    }

    public String getManager_create_name() {
        return manager_create_name;
    }

    public void setManager_create_name(String manager_create_name) {
        this.manager_create_name = manager_create_name == null ? null : manager_create_name.trim();
    }
}