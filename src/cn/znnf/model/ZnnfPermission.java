package cn.znnf.model;

public class ZnnfPermission {
    private Integer id;

    private String permission_submenu;

    private String permission_filepath;

    private Integer manager_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission_submenu() {
        return permission_submenu;
    }

    public void setPermission_submenu(String permission_submenu) {
        this.permission_submenu = permission_submenu == null ? null : permission_submenu.trim();
    }

    public String getPermission_filepath() {
        return permission_filepath;
    }

    public void setPermission_filepath(String permission_filepath) {
        this.permission_filepath = permission_filepath == null ? null : permission_filepath.trim();
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }
}