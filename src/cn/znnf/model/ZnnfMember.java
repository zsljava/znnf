package cn.znnf.model;

import java.util.Date;

public class ZnnfMember {
    private Integer id;

    private String member_name;

    private String member_number;

    private String member_type;

    private String member_id_type;

    private String member_id_number;

    private Integer member_phone;

    private Boolean member_status;

    private String member_id_photo;

    private String member_landline_number;

    private String member_address;

    private Integer member_zipcode;

    private String member_email;

    private String member_recommended;

    private String member_bank;

    private Integer member_bank_card_number;

    private String menber_crop_name;

    private String member_acreage;

    private String member_cultivate_position;

    private String member_soil_fertility;

    private String member_crop_historical_production;

    private String member_fertilizer_costs;

    private String member_comprehensive_cost;

    private String member_remark;

    private String member_update_name;

    private Date member_update_time;

    private Integer commissioner_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name == null ? null : member_name.trim();
    }

    public String getMember_number() {
        return member_number;
    }

    public void setMember_number(String member_number) {
        this.member_number = member_number == null ? null : member_number.trim();
    }

    public String getMember_type() {
        return member_type;
    }

    public void setMember_type(String member_type) {
        this.member_type = member_type == null ? null : member_type.trim();
    }

    public String getMember_id_type() {
        return member_id_type;
    }

    public void setMember_id_type(String member_id_type) {
        this.member_id_type = member_id_type == null ? null : member_id_type.trim();
    }

    public String getMember_id_number() {
        return member_id_number;
    }

    public void setMember_id_number(String member_id_number) {
        this.member_id_number = member_id_number == null ? null : member_id_number.trim();
    }

    public Integer getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(Integer member_phone) {
        this.member_phone = member_phone;
    }

    public Boolean getMember_status() {
        return member_status;
    }

    public void setMember_status(Boolean member_status) {
        this.member_status = member_status;
    }

    public String getMember_id_photo() {
        return member_id_photo;
    }

    public void setMember_id_photo(String member_id_photo) {
        this.member_id_photo = member_id_photo == null ? null : member_id_photo.trim();
    }

    public String getMember_landline_number() {
        return member_landline_number;
    }

    public void setMember_landline_number(String member_landline_number) {
        this.member_landline_number = member_landline_number == null ? null : member_landline_number.trim();
    }

    public String getMember_address() {
        return member_address;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address == null ? null : member_address.trim();
    }

    public Integer getMember_zipcode() {
        return member_zipcode;
    }

    public void setMember_zipcode(Integer member_zipcode) {
        this.member_zipcode = member_zipcode;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email == null ? null : member_email.trim();
    }

    public String getMember_recommended() {
        return member_recommended;
    }

    public void setMember_recommended(String member_recommended) {
        this.member_recommended = member_recommended == null ? null : member_recommended.trim();
    }

    public String getMember_bank() {
        return member_bank;
    }

    public void setMember_bank(String member_bank) {
        this.member_bank = member_bank == null ? null : member_bank.trim();
    }

    public Integer getMember_bank_card_number() {
        return member_bank_card_number;
    }

    public void setMember_bank_card_number(Integer member_bank_card_number) {
        this.member_bank_card_number = member_bank_card_number;
    }

    public String getMenber_crop_name() {
        return menber_crop_name;
    }

    public void setMenber_crop_name(String menber_crop_name) {
        this.menber_crop_name = menber_crop_name == null ? null : menber_crop_name.trim();
    }

    public String getMember_acreage() {
        return member_acreage;
    }

    public void setMember_acreage(String member_acreage) {
        this.member_acreage = member_acreage == null ? null : member_acreage.trim();
    }

    public String getMember_cultivate_position() {
        return member_cultivate_position;
    }

    public void setMember_cultivate_position(String member_cultivate_position) {
        this.member_cultivate_position = member_cultivate_position == null ? null : member_cultivate_position.trim();
    }

    public String getMember_soil_fertility() {
        return member_soil_fertility;
    }

    public void setMember_soil_fertility(String member_soil_fertility) {
        this.member_soil_fertility = member_soil_fertility == null ? null : member_soil_fertility.trim();
    }

    public String getMember_crop_historical_production() {
        return member_crop_historical_production;
    }

    public void setMember_crop_historical_production(String member_crop_historical_production) {
        this.member_crop_historical_production = member_crop_historical_production == null ? null : member_crop_historical_production.trim();
    }

    public String getMember_fertilizer_costs() {
        return member_fertilizer_costs;
    }

    public void setMember_fertilizer_costs(String member_fertilizer_costs) {
        this.member_fertilizer_costs = member_fertilizer_costs == null ? null : member_fertilizer_costs.trim();
    }

    public String getMember_comprehensive_cost() {
        return member_comprehensive_cost;
    }

    public void setMember_comprehensive_cost(String member_comprehensive_cost) {
        this.member_comprehensive_cost = member_comprehensive_cost == null ? null : member_comprehensive_cost.trim();
    }

    public String getMember_remark() {
        return member_remark;
    }

    public void setMember_remark(String member_remark) {
        this.member_remark = member_remark == null ? null : member_remark.trim();
    }

    public String getMember_update_name() {
        return member_update_name;
    }

    public void setMember_update_name(String member_update_name) {
        this.member_update_name = member_update_name == null ? null : member_update_name.trim();
    }

    public Date getMember_update_time() {
        return member_update_time;
    }

    public void setMember_update_time(Date member_update_time) {
        this.member_update_time = member_update_time;
    }

    public Integer getCommissioner_id() {
        return commissioner_id;
    }

    public void setCommissioner_id(Integer commissioner_id) {
        this.commissioner_id = commissioner_id;
    }
}