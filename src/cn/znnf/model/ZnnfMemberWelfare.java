package cn.znnf.model;

import java.math.BigDecimal;
import java.util.Date;

public class ZnnfMemberWelfare {
    private Integer id;

    private String welfare_rank;

    private Integer welfare_integral_lowerlimit;

    private Integer welfare_integral_upperlimit;

    private BigDecimal welfare_discount;

    private String welfare_remark;

    private String welfare_create_name;

    private Date welfare_create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWelfare_rank() {
        return welfare_rank;
    }

    public void setWelfare_rank(String welfare_rank) {
        this.welfare_rank = welfare_rank == null ? null : welfare_rank.trim();
    }

    public Integer getWelfare_integral_lowerlimit() {
        return welfare_integral_lowerlimit;
    }

    public void setWelfare_integral_lowerlimit(Integer welfare_integral_lowerlimit) {
        this.welfare_integral_lowerlimit = welfare_integral_lowerlimit;
    }

    public Integer getWelfare_integral_upperlimit() {
        return welfare_integral_upperlimit;
    }

    public void setWelfare_integral_upperlimit(Integer welfare_integral_upperlimit) {
        this.welfare_integral_upperlimit = welfare_integral_upperlimit;
    }

    public BigDecimal getWelfare_discount() {
        return welfare_discount;
    }

    public void setWelfare_discount(BigDecimal welfare_discount) {
        this.welfare_discount = welfare_discount;
    }

    public String getWelfare_remark() {
        return welfare_remark;
    }

    public void setWelfare_remark(String welfare_remark) {
        this.welfare_remark = welfare_remark == null ? null : welfare_remark.trim();
    }

    public String getWelfare_create_name() {
        return welfare_create_name;
    }

    public void setWelfare_create_name(String welfare_create_name) {
        this.welfare_create_name = welfare_create_name == null ? null : welfare_create_name.trim();
    }

    public Date getWelfare_create_time() {
        return welfare_create_time;
    }

    public void setWelfare_create_time(Date welfare_create_time) {
        this.welfare_create_time = welfare_create_time;
    }
}