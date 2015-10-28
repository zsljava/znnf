package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfIntegrationOriginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfIntegrationOriginExample() {
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

    public ZnnfIntegrationOriginExample(int pageIndex, int pageSize) {
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

        public Criteria andOrigin_modeIsNull() {
            addCriterion("origin_mode is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeIsNotNull() {
            addCriterion("origin_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeEqualTo(String value) {
            addCriterion("origin_mode =", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeNotEqualTo(String value) {
            addCriterion("origin_mode <>", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeGreaterThan(String value) {
            addCriterion("origin_mode >", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeGreaterThanOrEqualTo(String value) {
            addCriterion("origin_mode >=", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeLessThan(String value) {
            addCriterion("origin_mode <", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeLessThanOrEqualTo(String value) {
            addCriterion("origin_mode <=", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeLike(String value) {
            addCriterion("origin_mode like", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeNotLike(String value) {
            addCriterion("origin_mode not like", value, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeIn(List<String> values) {
            addCriterion("origin_mode in", values, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeNotIn(List<String> values) {
            addCriterion("origin_mode not in", values, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeBetween(String value1, String value2) {
            addCriterion("origin_mode between", value1, value2, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_modeNotBetween(String value1, String value2) {
            addCriterion("origin_mode not between", value1, value2, "origin_mode");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeIsNull() {
            addCriterion("origin_type is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeIsNotNull() {
            addCriterion("origin_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeEqualTo(Boolean value) {
            addCriterion("origin_type =", value, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeNotEqualTo(Boolean value) {
            addCriterion("origin_type <>", value, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeGreaterThan(Boolean value) {
            addCriterion("origin_type >", value, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("origin_type >=", value, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeLessThan(Boolean value) {
            addCriterion("origin_type <", value, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("origin_type <=", value, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeIn(List<Boolean> values) {
            addCriterion("origin_type in", values, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeNotIn(List<Boolean> values) {
            addCriterion("origin_type not in", values, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("origin_type between", value1, value2, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("origin_type not between", value1, value2, "origin_type");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeIsNull() {
            addCriterion("origin_consume is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeIsNotNull() {
            addCriterion("origin_consume is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeEqualTo(Float value) {
            addCriterion("origin_consume =", value, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeNotEqualTo(Float value) {
            addCriterion("origin_consume <>", value, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeGreaterThan(Float value) {
            addCriterion("origin_consume >", value, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeGreaterThanOrEqualTo(Float value) {
            addCriterion("origin_consume >=", value, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeLessThan(Float value) {
            addCriterion("origin_consume <", value, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeLessThanOrEqualTo(Float value) {
            addCriterion("origin_consume <=", value, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeIn(List<Float> values) {
            addCriterion("origin_consume in", values, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeNotIn(List<Float> values) {
            addCriterion("origin_consume not in", values, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeBetween(Float value1, Float value2) {
            addCriterion("origin_consume between", value1, value2, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_consumeNotBetween(Float value1, Float value2) {
            addCriterion("origin_consume not between", value1, value2, "origin_consume");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeIsNull() {
            addCriterion("origin_time is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeIsNotNull() {
            addCriterion("origin_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeEqualTo(Date value) {
            addCriterion("origin_time =", value, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeNotEqualTo(Date value) {
            addCriterion("origin_time <>", value, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeGreaterThan(Date value) {
            addCriterion("origin_time >", value, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("origin_time >=", value, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeLessThan(Date value) {
            addCriterion("origin_time <", value, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeLessThanOrEqualTo(Date value) {
            addCriterion("origin_time <=", value, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeIn(List<Date> values) {
            addCriterion("origin_time in", values, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeNotIn(List<Date> values) {
            addCriterion("origin_time not in", values, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeBetween(Date value1, Date value2) {
            addCriterion("origin_time between", value1, value2, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_timeNotBetween(Date value1, Date value2) {
            addCriterion("origin_time not between", value1, value2, "origin_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkIsNull() {
            addCriterion("origin_remark is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkIsNotNull() {
            addCriterion("origin_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkEqualTo(String value) {
            addCriterion("origin_remark =", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkNotEqualTo(String value) {
            addCriterion("origin_remark <>", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkGreaterThan(String value) {
            addCriterion("origin_remark >", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("origin_remark >=", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkLessThan(String value) {
            addCriterion("origin_remark <", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkLessThanOrEqualTo(String value) {
            addCriterion("origin_remark <=", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkLike(String value) {
            addCriterion("origin_remark like", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkNotLike(String value) {
            addCriterion("origin_remark not like", value, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkIn(List<String> values) {
            addCriterion("origin_remark in", values, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkNotIn(List<String> values) {
            addCriterion("origin_remark not in", values, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkBetween(String value1, String value2) {
            addCriterion("origin_remark between", value1, value2, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_remarkNotBetween(String value1, String value2) {
            addCriterion("origin_remark not between", value1, value2, "origin_remark");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameIsNull() {
            addCriterion("origin_create_name is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameIsNotNull() {
            addCriterion("origin_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameEqualTo(String value) {
            addCriterion("origin_create_name =", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameNotEqualTo(String value) {
            addCriterion("origin_create_name <>", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameGreaterThan(String value) {
            addCriterion("origin_create_name >", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameGreaterThanOrEqualTo(String value) {
            addCriterion("origin_create_name >=", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameLessThan(String value) {
            addCriterion("origin_create_name <", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameLessThanOrEqualTo(String value) {
            addCriterion("origin_create_name <=", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameLike(String value) {
            addCriterion("origin_create_name like", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameNotLike(String value) {
            addCriterion("origin_create_name not like", value, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameIn(List<String> values) {
            addCriterion("origin_create_name in", values, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameNotIn(List<String> values) {
            addCriterion("origin_create_name not in", values, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameBetween(String value1, String value2) {
            addCriterion("origin_create_name between", value1, value2, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_nameNotBetween(String value1, String value2) {
            addCriterion("origin_create_name not between", value1, value2, "origin_create_name");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeIsNull() {
            addCriterion("origin_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeIsNotNull() {
            addCriterion("origin_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeEqualTo(Date value) {
            addCriterionForJDBCDate("origin_create_time =", value, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("origin_create_time <>", value, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("origin_create_time >", value, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("origin_create_time >=", value, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeLessThan(Date value) {
            addCriterionForJDBCDate("origin_create_time <", value, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("origin_create_time <=", value, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeIn(List<Date> values) {
            addCriterionForJDBCDate("origin_create_time in", values, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("origin_create_time not in", values, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("origin_create_time between", value1, value2, "origin_create_time");
            return (Criteria) this;
        }

        public Criteria andOrigin_create_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("origin_create_time not between", value1, value2, "origin_create_time");
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