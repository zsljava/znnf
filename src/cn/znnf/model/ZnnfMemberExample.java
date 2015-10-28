package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public ZnnfMemberExample(int pageIndex, int pageSize) {
        this();
        this.pageIndex=pageIndex;
        this.pageSize=pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMember_nameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMember_nameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMember_nameEqualTo(String value) {
            addCriterion("member_name =", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameGreaterThan(String value) {
            addCriterion("member_name >", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameLessThan(String value) {
            addCriterion("member_name <", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameLike(String value) {
            addCriterion("member_name like", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotLike(String value) {
            addCriterion("member_name not like", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameIn(List<String> values) {
            addCriterion("member_name in", values, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_numberIsNull() {
            addCriterion("member_number is null");
            return (Criteria) this;
        }

        public Criteria andMember_numberIsNotNull() {
            addCriterion("member_number is not null");
            return (Criteria) this;
        }

        public Criteria andMember_numberEqualTo(String value) {
            addCriterion("member_number =", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberNotEqualTo(String value) {
            addCriterion("member_number <>", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberGreaterThan(String value) {
            addCriterion("member_number >", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberGreaterThanOrEqualTo(String value) {
            addCriterion("member_number >=", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberLessThan(String value) {
            addCriterion("member_number <", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberLessThanOrEqualTo(String value) {
            addCriterion("member_number <=", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberLike(String value) {
            addCriterion("member_number like", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberNotLike(String value) {
            addCriterion("member_number not like", value, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberIn(List<String> values) {
            addCriterion("member_number in", values, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberNotIn(List<String> values) {
            addCriterion("member_number not in", values, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberBetween(String value1, String value2) {
            addCriterion("member_number between", value1, value2, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_numberNotBetween(String value1, String value2) {
            addCriterion("member_number not between", value1, value2, "member_number");
            return (Criteria) this;
        }

        public Criteria andMember_typeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMember_typeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMember_typeEqualTo(String value) {
            addCriterion("member_type =", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeNotEqualTo(String value) {
            addCriterion("member_type <>", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeGreaterThan(String value) {
            addCriterion("member_type >", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeGreaterThanOrEqualTo(String value) {
            addCriterion("member_type >=", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeLessThan(String value) {
            addCriterion("member_type <", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeLessThanOrEqualTo(String value) {
            addCriterion("member_type <=", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeLike(String value) {
            addCriterion("member_type like", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeNotLike(String value) {
            addCriterion("member_type not like", value, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeIn(List<String> values) {
            addCriterion("member_type in", values, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeNotIn(List<String> values) {
            addCriterion("member_type not in", values, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeBetween(String value1, String value2) {
            addCriterion("member_type between", value1, value2, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_typeNotBetween(String value1, String value2) {
            addCriterion("member_type not between", value1, value2, "member_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeIsNull() {
            addCriterion("member_id_type is null");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeIsNotNull() {
            addCriterion("member_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeEqualTo(String value) {
            addCriterion("member_id_type =", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeNotEqualTo(String value) {
            addCriterion("member_id_type <>", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeGreaterThan(String value) {
            addCriterion("member_id_type >", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_type >=", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeLessThan(String value) {
            addCriterion("member_id_type <", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeLessThanOrEqualTo(String value) {
            addCriterion("member_id_type <=", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeLike(String value) {
            addCriterion("member_id_type like", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeNotLike(String value) {
            addCriterion("member_id_type not like", value, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeIn(List<String> values) {
            addCriterion("member_id_type in", values, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeNotIn(List<String> values) {
            addCriterion("member_id_type not in", values, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeBetween(String value1, String value2) {
            addCriterion("member_id_type between", value1, value2, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_typeNotBetween(String value1, String value2) {
            addCriterion("member_id_type not between", value1, value2, "member_id_type");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberIsNull() {
            addCriterion("member_id_number is null");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberIsNotNull() {
            addCriterion("member_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberEqualTo(String value) {
            addCriterion("member_id_number =", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberNotEqualTo(String value) {
            addCriterion("member_id_number <>", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberGreaterThan(String value) {
            addCriterion("member_id_number >", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_number >=", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberLessThan(String value) {
            addCriterion("member_id_number <", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberLessThanOrEqualTo(String value) {
            addCriterion("member_id_number <=", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberLike(String value) {
            addCriterion("member_id_number like", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberNotLike(String value) {
            addCriterion("member_id_number not like", value, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberIn(List<String> values) {
            addCriterion("member_id_number in", values, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberNotIn(List<String> values) {
            addCriterion("member_id_number not in", values, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberBetween(String value1, String value2) {
            addCriterion("member_id_number between", value1, value2, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_id_numberNotBetween(String value1, String value2) {
            addCriterion("member_id_number not between", value1, value2, "member_id_number");
            return (Criteria) this;
        }

        public Criteria andMember_phoneIsNull() {
            addCriterion("member_phone is null");
            return (Criteria) this;
        }

        public Criteria andMember_phoneIsNotNull() {
            addCriterion("member_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMember_phoneEqualTo(Integer value) {
            addCriterion("member_phone =", value, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneNotEqualTo(Integer value) {
            addCriterion("member_phone <>", value, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneGreaterThan(Integer value) {
            addCriterion("member_phone >", value, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_phone >=", value, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneLessThan(Integer value) {
            addCriterion("member_phone <", value, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneLessThanOrEqualTo(Integer value) {
            addCriterion("member_phone <=", value, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneIn(List<Integer> values) {
            addCriterion("member_phone in", values, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneNotIn(List<Integer> values) {
            addCriterion("member_phone not in", values, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneBetween(Integer value1, Integer value2) {
            addCriterion("member_phone between", value1, value2, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_phoneNotBetween(Integer value1, Integer value2) {
            addCriterion("member_phone not between", value1, value2, "member_phone");
            return (Criteria) this;
        }

        public Criteria andMember_statusIsNull() {
            addCriterion("member_status is null");
            return (Criteria) this;
        }

        public Criteria andMember_statusIsNotNull() {
            addCriterion("member_status is not null");
            return (Criteria) this;
        }

        public Criteria andMember_statusEqualTo(Boolean value) {
            addCriterion("member_status =", value, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusNotEqualTo(Boolean value) {
            addCriterion("member_status <>", value, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusGreaterThan(Boolean value) {
            addCriterion("member_status >", value, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("member_status >=", value, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusLessThan(Boolean value) {
            addCriterion("member_status <", value, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("member_status <=", value, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusIn(List<Boolean> values) {
            addCriterion("member_status in", values, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusNotIn(List<Boolean> values) {
            addCriterion("member_status not in", values, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("member_status between", value1, value2, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("member_status not between", value1, value2, "member_status");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoIsNull() {
            addCriterion("member_id_photo is null");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoIsNotNull() {
            addCriterion("member_id_photo is not null");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoEqualTo(String value) {
            addCriterion("member_id_photo =", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoNotEqualTo(String value) {
            addCriterion("member_id_photo <>", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoGreaterThan(String value) {
            addCriterion("member_id_photo >", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_photo >=", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoLessThan(String value) {
            addCriterion("member_id_photo <", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoLessThanOrEqualTo(String value) {
            addCriterion("member_id_photo <=", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoLike(String value) {
            addCriterion("member_id_photo like", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoNotLike(String value) {
            addCriterion("member_id_photo not like", value, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoIn(List<String> values) {
            addCriterion("member_id_photo in", values, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoNotIn(List<String> values) {
            addCriterion("member_id_photo not in", values, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoBetween(String value1, String value2) {
            addCriterion("member_id_photo between", value1, value2, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_id_photoNotBetween(String value1, String value2) {
            addCriterion("member_id_photo not between", value1, value2, "member_id_photo");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberIsNull() {
            addCriterion("member_landline_number is null");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberIsNotNull() {
            addCriterion("member_landline_number is not null");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberEqualTo(String value) {
            addCriterion("member_landline_number =", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberNotEqualTo(String value) {
            addCriterion("member_landline_number <>", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberGreaterThan(String value) {
            addCriterion("member_landline_number >", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberGreaterThanOrEqualTo(String value) {
            addCriterion("member_landline_number >=", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberLessThan(String value) {
            addCriterion("member_landline_number <", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberLessThanOrEqualTo(String value) {
            addCriterion("member_landline_number <=", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberLike(String value) {
            addCriterion("member_landline_number like", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberNotLike(String value) {
            addCriterion("member_landline_number not like", value, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberIn(List<String> values) {
            addCriterion("member_landline_number in", values, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberNotIn(List<String> values) {
            addCriterion("member_landline_number not in", values, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberBetween(String value1, String value2) {
            addCriterion("member_landline_number between", value1, value2, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_landline_numberNotBetween(String value1, String value2) {
            addCriterion("member_landline_number not between", value1, value2, "member_landline_number");
            return (Criteria) this;
        }

        public Criteria andMember_addressIsNull() {
            addCriterion("member_address is null");
            return (Criteria) this;
        }

        public Criteria andMember_addressIsNotNull() {
            addCriterion("member_address is not null");
            return (Criteria) this;
        }

        public Criteria andMember_addressEqualTo(String value) {
            addCriterion("member_address =", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressNotEqualTo(String value) {
            addCriterion("member_address <>", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressGreaterThan(String value) {
            addCriterion("member_address >", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressGreaterThanOrEqualTo(String value) {
            addCriterion("member_address >=", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressLessThan(String value) {
            addCriterion("member_address <", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressLessThanOrEqualTo(String value) {
            addCriterion("member_address <=", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressLike(String value) {
            addCriterion("member_address like", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressNotLike(String value) {
            addCriterion("member_address not like", value, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressIn(List<String> values) {
            addCriterion("member_address in", values, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressNotIn(List<String> values) {
            addCriterion("member_address not in", values, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressBetween(String value1, String value2) {
            addCriterion("member_address between", value1, value2, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_addressNotBetween(String value1, String value2) {
            addCriterion("member_address not between", value1, value2, "member_address");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeIsNull() {
            addCriterion("member_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeIsNotNull() {
            addCriterion("member_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeEqualTo(Integer value) {
            addCriterion("member_zipcode =", value, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeNotEqualTo(Integer value) {
            addCriterion("member_zipcode <>", value, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeGreaterThan(Integer value) {
            addCriterion("member_zipcode >", value, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_zipcode >=", value, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeLessThan(Integer value) {
            addCriterion("member_zipcode <", value, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeLessThanOrEqualTo(Integer value) {
            addCriterion("member_zipcode <=", value, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeIn(List<Integer> values) {
            addCriterion("member_zipcode in", values, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeNotIn(List<Integer> values) {
            addCriterion("member_zipcode not in", values, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeBetween(Integer value1, Integer value2) {
            addCriterion("member_zipcode between", value1, value2, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_zipcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_zipcode not between", value1, value2, "member_zipcode");
            return (Criteria) this;
        }

        public Criteria andMember_emailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMember_emailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMember_emailEqualTo(String value) {
            addCriterion("member_email =", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailGreaterThan(String value) {
            addCriterion("member_email >", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailLessThan(String value) {
            addCriterion("member_email <", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailLike(String value) {
            addCriterion("member_email like", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailNotLike(String value) {
            addCriterion("member_email not like", value, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailIn(List<String> values) {
            addCriterion("member_email in", values, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_emailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "member_email");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedIsNull() {
            addCriterion("member_recommended is null");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedIsNotNull() {
            addCriterion("member_recommended is not null");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedEqualTo(String value) {
            addCriterion("member_recommended =", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedNotEqualTo(String value) {
            addCriterion("member_recommended <>", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedGreaterThan(String value) {
            addCriterion("member_recommended >", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedGreaterThanOrEqualTo(String value) {
            addCriterion("member_recommended >=", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedLessThan(String value) {
            addCriterion("member_recommended <", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedLessThanOrEqualTo(String value) {
            addCriterion("member_recommended <=", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedLike(String value) {
            addCriterion("member_recommended like", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedNotLike(String value) {
            addCriterion("member_recommended not like", value, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedIn(List<String> values) {
            addCriterion("member_recommended in", values, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedNotIn(List<String> values) {
            addCriterion("member_recommended not in", values, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedBetween(String value1, String value2) {
            addCriterion("member_recommended between", value1, value2, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_recommendedNotBetween(String value1, String value2) {
            addCriterion("member_recommended not between", value1, value2, "member_recommended");
            return (Criteria) this;
        }

        public Criteria andMember_bankIsNull() {
            addCriterion("member_bank is null");
            return (Criteria) this;
        }

        public Criteria andMember_bankIsNotNull() {
            addCriterion("member_bank is not null");
            return (Criteria) this;
        }

        public Criteria andMember_bankEqualTo(String value) {
            addCriterion("member_bank =", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankNotEqualTo(String value) {
            addCriterion("member_bank <>", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankGreaterThan(String value) {
            addCriterion("member_bank >", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankGreaterThanOrEqualTo(String value) {
            addCriterion("member_bank >=", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankLessThan(String value) {
            addCriterion("member_bank <", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankLessThanOrEqualTo(String value) {
            addCriterion("member_bank <=", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankLike(String value) {
            addCriterion("member_bank like", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankNotLike(String value) {
            addCriterion("member_bank not like", value, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankIn(List<String> values) {
            addCriterion("member_bank in", values, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankNotIn(List<String> values) {
            addCriterion("member_bank not in", values, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankBetween(String value1, String value2) {
            addCriterion("member_bank between", value1, value2, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bankNotBetween(String value1, String value2) {
            addCriterion("member_bank not between", value1, value2, "member_bank");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberIsNull() {
            addCriterion("member_bank_card_number is null");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberIsNotNull() {
            addCriterion("member_bank_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberEqualTo(Integer value) {
            addCriterion("member_bank_card_number =", value, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberNotEqualTo(Integer value) {
            addCriterion("member_bank_card_number <>", value, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberGreaterThan(Integer value) {
            addCriterion("member_bank_card_number >", value, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_bank_card_number >=", value, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberLessThan(Integer value) {
            addCriterion("member_bank_card_number <", value, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberLessThanOrEqualTo(Integer value) {
            addCriterion("member_bank_card_number <=", value, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberIn(List<Integer> values) {
            addCriterion("member_bank_card_number in", values, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberNotIn(List<Integer> values) {
            addCriterion("member_bank_card_number not in", values, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberBetween(Integer value1, Integer value2) {
            addCriterion("member_bank_card_number between", value1, value2, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMember_bank_card_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("member_bank_card_number not between", value1, value2, "member_bank_card_number");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameIsNull() {
            addCriterion("menber_crop_name is null");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameIsNotNull() {
            addCriterion("menber_crop_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameEqualTo(String value) {
            addCriterion("menber_crop_name =", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameNotEqualTo(String value) {
            addCriterion("menber_crop_name <>", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameGreaterThan(String value) {
            addCriterion("menber_crop_name >", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameGreaterThanOrEqualTo(String value) {
            addCriterion("menber_crop_name >=", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameLessThan(String value) {
            addCriterion("menber_crop_name <", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameLessThanOrEqualTo(String value) {
            addCriterion("menber_crop_name <=", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameLike(String value) {
            addCriterion("menber_crop_name like", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameNotLike(String value) {
            addCriterion("menber_crop_name not like", value, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameIn(List<String> values) {
            addCriterion("menber_crop_name in", values, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameNotIn(List<String> values) {
            addCriterion("menber_crop_name not in", values, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameBetween(String value1, String value2) {
            addCriterion("menber_crop_name between", value1, value2, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMenber_crop_nameNotBetween(String value1, String value2) {
            addCriterion("menber_crop_name not between", value1, value2, "menber_crop_name");
            return (Criteria) this;
        }

        public Criteria andMember_acreageIsNull() {
            addCriterion("member_acreage is null");
            return (Criteria) this;
        }

        public Criteria andMember_acreageIsNotNull() {
            addCriterion("member_acreage is not null");
            return (Criteria) this;
        }

        public Criteria andMember_acreageEqualTo(String value) {
            addCriterion("member_acreage =", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageNotEqualTo(String value) {
            addCriterion("member_acreage <>", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageGreaterThan(String value) {
            addCriterion("member_acreage >", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageGreaterThanOrEqualTo(String value) {
            addCriterion("member_acreage >=", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageLessThan(String value) {
            addCriterion("member_acreage <", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageLessThanOrEqualTo(String value) {
            addCriterion("member_acreage <=", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageLike(String value) {
            addCriterion("member_acreage like", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageNotLike(String value) {
            addCriterion("member_acreage not like", value, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageIn(List<String> values) {
            addCriterion("member_acreage in", values, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageNotIn(List<String> values) {
            addCriterion("member_acreage not in", values, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageBetween(String value1, String value2) {
            addCriterion("member_acreage between", value1, value2, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_acreageNotBetween(String value1, String value2) {
            addCriterion("member_acreage not between", value1, value2, "member_acreage");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionIsNull() {
            addCriterion("member_cultivate_position is null");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionIsNotNull() {
            addCriterion("member_cultivate_position is not null");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionEqualTo(String value) {
            addCriterion("member_cultivate_position =", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionNotEqualTo(String value) {
            addCriterion("member_cultivate_position <>", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionGreaterThan(String value) {
            addCriterion("member_cultivate_position >", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionGreaterThanOrEqualTo(String value) {
            addCriterion("member_cultivate_position >=", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionLessThan(String value) {
            addCriterion("member_cultivate_position <", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionLessThanOrEqualTo(String value) {
            addCriterion("member_cultivate_position <=", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionLike(String value) {
            addCriterion("member_cultivate_position like", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionNotLike(String value) {
            addCriterion("member_cultivate_position not like", value, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionIn(List<String> values) {
            addCriterion("member_cultivate_position in", values, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionNotIn(List<String> values) {
            addCriterion("member_cultivate_position not in", values, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionBetween(String value1, String value2) {
            addCriterion("member_cultivate_position between", value1, value2, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_cultivate_positionNotBetween(String value1, String value2) {
            addCriterion("member_cultivate_position not between", value1, value2, "member_cultivate_position");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityIsNull() {
            addCriterion("member_soil_fertility is null");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityIsNotNull() {
            addCriterion("member_soil_fertility is not null");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityEqualTo(String value) {
            addCriterion("member_soil_fertility =", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityNotEqualTo(String value) {
            addCriterion("member_soil_fertility <>", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityGreaterThan(String value) {
            addCriterion("member_soil_fertility >", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityGreaterThanOrEqualTo(String value) {
            addCriterion("member_soil_fertility >=", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityLessThan(String value) {
            addCriterion("member_soil_fertility <", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityLessThanOrEqualTo(String value) {
            addCriterion("member_soil_fertility <=", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityLike(String value) {
            addCriterion("member_soil_fertility like", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityNotLike(String value) {
            addCriterion("member_soil_fertility not like", value, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityIn(List<String> values) {
            addCriterion("member_soil_fertility in", values, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityNotIn(List<String> values) {
            addCriterion("member_soil_fertility not in", values, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityBetween(String value1, String value2) {
            addCriterion("member_soil_fertility between", value1, value2, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_soil_fertilityNotBetween(String value1, String value2) {
            addCriterion("member_soil_fertility not between", value1, value2, "member_soil_fertility");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionIsNull() {
            addCriterion("member_crop_historical_production is null");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionIsNotNull() {
            addCriterion("member_crop_historical_production is not null");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionEqualTo(String value) {
            addCriterion("member_crop_historical_production =", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionNotEqualTo(String value) {
            addCriterion("member_crop_historical_production <>", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionGreaterThan(String value) {
            addCriterion("member_crop_historical_production >", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionGreaterThanOrEqualTo(String value) {
            addCriterion("member_crop_historical_production >=", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionLessThan(String value) {
            addCriterion("member_crop_historical_production <", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionLessThanOrEqualTo(String value) {
            addCriterion("member_crop_historical_production <=", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionLike(String value) {
            addCriterion("member_crop_historical_production like", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionNotLike(String value) {
            addCriterion("member_crop_historical_production not like", value, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionIn(List<String> values) {
            addCriterion("member_crop_historical_production in", values, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionNotIn(List<String> values) {
            addCriterion("member_crop_historical_production not in", values, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionBetween(String value1, String value2) {
            addCriterion("member_crop_historical_production between", value1, value2, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_crop_historical_productionNotBetween(String value1, String value2) {
            addCriterion("member_crop_historical_production not between", value1, value2, "member_crop_historical_production");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsIsNull() {
            addCriterion("member_fertilizer_costs is null");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsIsNotNull() {
            addCriterion("member_fertilizer_costs is not null");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsEqualTo(String value) {
            addCriterion("member_fertilizer_costs =", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsNotEqualTo(String value) {
            addCriterion("member_fertilizer_costs <>", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsGreaterThan(String value) {
            addCriterion("member_fertilizer_costs >", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsGreaterThanOrEqualTo(String value) {
            addCriterion("member_fertilizer_costs >=", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsLessThan(String value) {
            addCriterion("member_fertilizer_costs <", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsLessThanOrEqualTo(String value) {
            addCriterion("member_fertilizer_costs <=", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsLike(String value) {
            addCriterion("member_fertilizer_costs like", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsNotLike(String value) {
            addCriterion("member_fertilizer_costs not like", value, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsIn(List<String> values) {
            addCriterion("member_fertilizer_costs in", values, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsNotIn(List<String> values) {
            addCriterion("member_fertilizer_costs not in", values, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsBetween(String value1, String value2) {
            addCriterion("member_fertilizer_costs between", value1, value2, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_fertilizer_costsNotBetween(String value1, String value2) {
            addCriterion("member_fertilizer_costs not between", value1, value2, "member_fertilizer_costs");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costIsNull() {
            addCriterion("member_comprehensive_cost is null");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costIsNotNull() {
            addCriterion("member_comprehensive_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costEqualTo(String value) {
            addCriterion("member_comprehensive_cost =", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costNotEqualTo(String value) {
            addCriterion("member_comprehensive_cost <>", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costGreaterThan(String value) {
            addCriterion("member_comprehensive_cost >", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costGreaterThanOrEqualTo(String value) {
            addCriterion("member_comprehensive_cost >=", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costLessThan(String value) {
            addCriterion("member_comprehensive_cost <", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costLessThanOrEqualTo(String value) {
            addCriterion("member_comprehensive_cost <=", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costLike(String value) {
            addCriterion("member_comprehensive_cost like", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costNotLike(String value) {
            addCriterion("member_comprehensive_cost not like", value, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costIn(List<String> values) {
            addCriterion("member_comprehensive_cost in", values, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costNotIn(List<String> values) {
            addCriterion("member_comprehensive_cost not in", values, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costBetween(String value1, String value2) {
            addCriterion("member_comprehensive_cost between", value1, value2, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_comprehensive_costNotBetween(String value1, String value2) {
            addCriterion("member_comprehensive_cost not between", value1, value2, "member_comprehensive_cost");
            return (Criteria) this;
        }

        public Criteria andMember_remarkIsNull() {
            addCriterion("member_remark is null");
            return (Criteria) this;
        }

        public Criteria andMember_remarkIsNotNull() {
            addCriterion("member_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMember_remarkEqualTo(String value) {
            addCriterion("member_remark =", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkNotEqualTo(String value) {
            addCriterion("member_remark <>", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkGreaterThan(String value) {
            addCriterion("member_remark >", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("member_remark >=", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkLessThan(String value) {
            addCriterion("member_remark <", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkLessThanOrEqualTo(String value) {
            addCriterion("member_remark <=", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkLike(String value) {
            addCriterion("member_remark like", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkNotLike(String value) {
            addCriterion("member_remark not like", value, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkIn(List<String> values) {
            addCriterion("member_remark in", values, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkNotIn(List<String> values) {
            addCriterion("member_remark not in", values, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkBetween(String value1, String value2) {
            addCriterion("member_remark between", value1, value2, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_remarkNotBetween(String value1, String value2) {
            addCriterion("member_remark not between", value1, value2, "member_remark");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameIsNull() {
            addCriterion("member_update_name is null");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameIsNotNull() {
            addCriterion("member_update_name is not null");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameEqualTo(String value) {
            addCriterion("member_update_name =", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameNotEqualTo(String value) {
            addCriterion("member_update_name <>", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameGreaterThan(String value) {
            addCriterion("member_update_name >", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameGreaterThanOrEqualTo(String value) {
            addCriterion("member_update_name >=", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameLessThan(String value) {
            addCriterion("member_update_name <", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameLessThanOrEqualTo(String value) {
            addCriterion("member_update_name <=", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameLike(String value) {
            addCriterion("member_update_name like", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameNotLike(String value) {
            addCriterion("member_update_name not like", value, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameIn(List<String> values) {
            addCriterion("member_update_name in", values, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameNotIn(List<String> values) {
            addCriterion("member_update_name not in", values, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameBetween(String value1, String value2) {
            addCriterion("member_update_name between", value1, value2, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_nameNotBetween(String value1, String value2) {
            addCriterion("member_update_name not between", value1, value2, "member_update_name");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeIsNull() {
            addCriterion("member_update_time is null");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeIsNotNull() {
            addCriterion("member_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeEqualTo(Date value) {
            addCriterionForJDBCDate("member_update_time =", value, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("member_update_time <>", value, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("member_update_time >", value, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_update_time >=", value, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeLessThan(Date value) {
            addCriterionForJDBCDate("member_update_time <", value, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_update_time <=", value, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeIn(List<Date> values) {
            addCriterionForJDBCDate("member_update_time in", values, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("member_update_time not in", values, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_update_time between", value1, value2, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andMember_update_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_update_time not between", value1, value2, "member_update_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idIsNull() {
            addCriterion("commissioner_id is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idIsNotNull() {
            addCriterion("commissioner_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idEqualTo(Integer value) {
            addCriterion("commissioner_id =", value, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idNotEqualTo(Integer value) {
            addCriterion("commissioner_id <>", value, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idGreaterThan(Integer value) {
            addCriterion("commissioner_id >", value, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("commissioner_id >=", value, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idLessThan(Integer value) {
            addCriterion("commissioner_id <", value, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idLessThanOrEqualTo(Integer value) {
            addCriterion("commissioner_id <=", value, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idIn(List<Integer> values) {
            addCriterion("commissioner_id in", values, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idNotIn(List<Integer> values) {
            addCriterion("commissioner_id not in", values, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idBetween(Integer value1, Integer value2) {
            addCriterion("commissioner_id between", value1, value2, "commissioner_id");
            return (Criteria) this;
        }

        public Criteria andCommissioner_idNotBetween(Integer value1, Integer value2) {
            addCriterion("commissioner_id not between", value1, value2, "commissioner_id");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}