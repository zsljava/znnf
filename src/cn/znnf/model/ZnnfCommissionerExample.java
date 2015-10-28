package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfCommissionerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfCommissionerExample() {
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

    public ZnnfCommissionerExample(int pageIndex, int pageSize) {
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

        public Criteria andCommissioner_numberIsNull() {
            addCriterion("commissioner_number is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberIsNotNull() {
            addCriterion("commissioner_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberEqualTo(String value) {
            addCriterion("commissioner_number =", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberNotEqualTo(String value) {
            addCriterion("commissioner_number <>", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberGreaterThan(String value) {
            addCriterion("commissioner_number >", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_number >=", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberLessThan(String value) {
            addCriterion("commissioner_number <", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberLessThanOrEqualTo(String value) {
            addCriterion("commissioner_number <=", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberLike(String value) {
            addCriterion("commissioner_number like", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberNotLike(String value) {
            addCriterion("commissioner_number not like", value, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberIn(List<String> values) {
            addCriterion("commissioner_number in", values, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberNotIn(List<String> values) {
            addCriterion("commissioner_number not in", values, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberBetween(String value1, String value2) {
            addCriterion("commissioner_number between", value1, value2, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_numberNotBetween(String value1, String value2) {
            addCriterion("commissioner_number not between", value1, value2, "commissioner_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordIsNull() {
            addCriterion("commissioner_password is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordIsNotNull() {
            addCriterion("commissioner_password is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordEqualTo(String value) {
            addCriterion("commissioner_password =", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordNotEqualTo(String value) {
            addCriterion("commissioner_password <>", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordGreaterThan(String value) {
            addCriterion("commissioner_password >", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_password >=", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordLessThan(String value) {
            addCriterion("commissioner_password <", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordLessThanOrEqualTo(String value) {
            addCriterion("commissioner_password <=", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordLike(String value) {
            addCriterion("commissioner_password like", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordNotLike(String value) {
            addCriterion("commissioner_password not like", value, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordIn(List<String> values) {
            addCriterion("commissioner_password in", values, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordNotIn(List<String> values) {
            addCriterion("commissioner_password not in", values, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordBetween(String value1, String value2) {
            addCriterion("commissioner_password between", value1, value2, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_passwordNotBetween(String value1, String value2) {
            addCriterion("commissioner_password not between", value1, value2, "commissioner_password");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameIsNull() {
            addCriterion("commissioner_name is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameIsNotNull() {
            addCriterion("commissioner_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameEqualTo(String value) {
            addCriterion("commissioner_name =", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameNotEqualTo(String value) {
            addCriterion("commissioner_name <>", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameGreaterThan(String value) {
            addCriterion("commissioner_name >", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_name >=", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameLessThan(String value) {
            addCriterion("commissioner_name <", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameLessThanOrEqualTo(String value) {
            addCriterion("commissioner_name <=", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameLike(String value) {
            addCriterion("commissioner_name like", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameNotLike(String value) {
            addCriterion("commissioner_name not like", value, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameIn(List<String> values) {
            addCriterion("commissioner_name in", values, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameNotIn(List<String> values) {
            addCriterion("commissioner_name not in", values, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameBetween(String value1, String value2) {
            addCriterion("commissioner_name between", value1, value2, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_nameNotBetween(String value1, String value2) {
            addCriterion("commissioner_name not between", value1, value2, "commissioner_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberIsNull() {
            addCriterion("commissioner_id_number is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberIsNotNull() {
            addCriterion("commissioner_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberEqualTo(String value) {
            addCriterion("commissioner_id_number =", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberNotEqualTo(String value) {
            addCriterion("commissioner_id_number <>", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberGreaterThan(String value) {
            addCriterion("commissioner_id_number >", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_id_number >=", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberLessThan(String value) {
            addCriterion("commissioner_id_number <", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberLessThanOrEqualTo(String value) {
            addCriterion("commissioner_id_number <=", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberLike(String value) {
            addCriterion("commissioner_id_number like", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberNotLike(String value) {
            addCriterion("commissioner_id_number not like", value, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberIn(List<String> values) {
            addCriterion("commissioner_id_number in", values, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberNotIn(List<String> values) {
            addCriterion("commissioner_id_number not in", values, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberBetween(String value1, String value2) {
            addCriterion("commissioner_id_number between", value1, value2, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_id_numberNotBetween(String value1, String value2) {
            addCriterion("commissioner_id_number not between", value1, value2, "commissioner_id_number");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneIsNull() {
            addCriterion("commissioner_phone is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneIsNotNull() {
            addCriterion("commissioner_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneEqualTo(Integer value) {
            addCriterion("commissioner_phone =", value, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneNotEqualTo(Integer value) {
            addCriterion("commissioner_phone <>", value, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneGreaterThan(Integer value) {
            addCriterion("commissioner_phone >", value, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("commissioner_phone >=", value, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneLessThan(Integer value) {
            addCriterion("commissioner_phone <", value, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneLessThanOrEqualTo(Integer value) {
            addCriterion("commissioner_phone <=", value, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneIn(List<Integer> values) {
            addCriterion("commissioner_phone in", values, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneNotIn(List<Integer> values) {
            addCriterion("commissioner_phone not in", values, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneBetween(Integer value1, Integer value2) {
            addCriterion("commissioner_phone between", value1, value2, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_phoneNotBetween(Integer value1, Integer value2) {
            addCriterion("commissioner_phone not between", value1, value2, "commissioner_phone");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceIsNull() {
            addCriterion("commissioner_workplace is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceIsNotNull() {
            addCriterion("commissioner_workplace is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceEqualTo(String value) {
            addCriterion("commissioner_workplace =", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceNotEqualTo(String value) {
            addCriterion("commissioner_workplace <>", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceGreaterThan(String value) {
            addCriterion("commissioner_workplace >", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_workplace >=", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceLessThan(String value) {
            addCriterion("commissioner_workplace <", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceLessThanOrEqualTo(String value) {
            addCriterion("commissioner_workplace <=", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceLike(String value) {
            addCriterion("commissioner_workplace like", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceNotLike(String value) {
            addCriterion("commissioner_workplace not like", value, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceIn(List<String> values) {
            addCriterion("commissioner_workplace in", values, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceNotIn(List<String> values) {
            addCriterion("commissioner_workplace not in", values, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceBetween(String value1, String value2) {
            addCriterion("commissioner_workplace between", value1, value2, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_workplaceNotBetween(String value1, String value2) {
            addCriterion("commissioner_workplace not between", value1, value2, "commissioner_workplace");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeIsNull() {
            addCriterion("commissioner_entrytime is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeIsNotNull() {
            addCriterion("commissioner_entrytime is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_entrytime =", value, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_entrytime <>", value, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commissioner_entrytime >", value, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_entrytime >=", value, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeLessThan(Date value) {
            addCriterionForJDBCDate("commissioner_entrytime <", value, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_entrytime <=", value, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeIn(List<Date> values) {
            addCriterionForJDBCDate("commissioner_entrytime in", values, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commissioner_entrytime not in", values, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commissioner_entrytime between", value1, value2, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_entrytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commissioner_entrytime not between", value1, value2, "commissioner_entrytime");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusIsNull() {
            addCriterion("commissioner_status is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusIsNotNull() {
            addCriterion("commissioner_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusEqualTo(Boolean value) {
            addCriterion("commissioner_status =", value, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusNotEqualTo(Boolean value) {
            addCriterion("commissioner_status <>", value, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusGreaterThan(Boolean value) {
            addCriterion("commissioner_status >", value, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("commissioner_status >=", value, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusLessThan(Boolean value) {
            addCriterion("commissioner_status <", value, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("commissioner_status <=", value, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusIn(List<Boolean> values) {
            addCriterion("commissioner_status in", values, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusNotIn(List<Boolean> values) {
            addCriterion("commissioner_status not in", values, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("commissioner_status between", value1, value2, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("commissioner_status not between", value1, value2, "commissioner_status");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkIsNull() {
            addCriterion("commissioner_remark is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkIsNotNull() {
            addCriterion("commissioner_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkEqualTo(String value) {
            addCriterion("commissioner_remark =", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkNotEqualTo(String value) {
            addCriterion("commissioner_remark <>", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkGreaterThan(String value) {
            addCriterion("commissioner_remark >", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_remark >=", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkLessThan(String value) {
            addCriterion("commissioner_remark <", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkLessThanOrEqualTo(String value) {
            addCriterion("commissioner_remark <=", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkLike(String value) {
            addCriterion("commissioner_remark like", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkNotLike(String value) {
            addCriterion("commissioner_remark not like", value, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkIn(List<String> values) {
            addCriterion("commissioner_remark in", values, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkNotIn(List<String> values) {
            addCriterion("commissioner_remark not in", values, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkBetween(String value1, String value2) {
            addCriterion("commissioner_remark between", value1, value2, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_remarkNotBetween(String value1, String value2) {
            addCriterion("commissioner_remark not between", value1, value2, "commissioner_remark");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameIsNull() {
            addCriterion("commissioner_create_name is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameIsNotNull() {
            addCriterion("commissioner_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameEqualTo(String value) {
            addCriterion("commissioner_create_name =", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameNotEqualTo(String value) {
            addCriterion("commissioner_create_name <>", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameGreaterThan(String value) {
            addCriterion("commissioner_create_name >", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner_create_name >=", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameLessThan(String value) {
            addCriterion("commissioner_create_name <", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameLessThanOrEqualTo(String value) {
            addCriterion("commissioner_create_name <=", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameLike(String value) {
            addCriterion("commissioner_create_name like", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameNotLike(String value) {
            addCriterion("commissioner_create_name not like", value, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameIn(List<String> values) {
            addCriterion("commissioner_create_name in", values, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameNotIn(List<String> values) {
            addCriterion("commissioner_create_name not in", values, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameBetween(String value1, String value2) {
            addCriterion("commissioner_create_name between", value1, value2, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_nameNotBetween(String value1, String value2) {
            addCriterion("commissioner_create_name not between", value1, value2, "commissioner_create_name");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeIsNull() {
            addCriterion("commissioner_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeIsNotNull() {
            addCriterion("commissioner_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_create_time =", value, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_create_time <>", value, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("commissioner_create_time >", value, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_create_time >=", value, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeLessThan(Date value) {
            addCriterionForJDBCDate("commissioner_create_time <", value, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commissioner_create_time <=", value, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeIn(List<Date> values) {
            addCriterionForJDBCDate("commissioner_create_time in", values, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commissioner_create_time not in", values, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commissioner_create_time between", value1, value2, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andCommissioner_create_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commissioner_create_time not between", value1, value2, "commissioner_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_idIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPosition_idIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_idEqualTo(Integer value) {
            addCriterion("position_id =", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idNotEqualTo(Integer value) {
            addCriterion("position_id <>", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idGreaterThan(Integer value) {
            addCriterion("position_id >", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_id >=", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idLessThan(Integer value) {
            addCriterion("position_id <", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idLessThanOrEqualTo(Integer value) {
            addCriterion("position_id <=", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idIn(List<Integer> values) {
            addCriterion("position_id in", values, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idNotIn(List<Integer> values) {
            addCriterion("position_id not in", values, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idBetween(Integer value1, Integer value2) {
            addCriterion("position_id between", value1, value2, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idNotBetween(Integer value1, Integer value2) {
            addCriterion("position_id not between", value1, value2, "position_id");
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