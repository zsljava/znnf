package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfPositionExample() {
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

    public ZnnfPositionExample(int pageIndex, int pageSize) {
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

        public Criteria andPosition_nameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPosition_nameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_nameEqualTo(String value) {
            addCriterion("position_name =", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameGreaterThan(String value) {
            addCriterion("position_name >", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameLessThan(String value) {
            addCriterion("position_name <", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameLike(String value) {
            addCriterion("position_name like", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotLike(String value) {
            addCriterion("position_name not like", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameIn(List<String> values) {
            addCriterion("position_name in", values, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_levelIsNull() {
            addCriterion("position_level is null");
            return (Criteria) this;
        }

        public Criteria andPosition_levelIsNotNull() {
            addCriterion("position_level is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_levelEqualTo(String value) {
            addCriterion("position_level =", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelNotEqualTo(String value) {
            addCriterion("position_level <>", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelGreaterThan(String value) {
            addCriterion("position_level >", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelGreaterThanOrEqualTo(String value) {
            addCriterion("position_level >=", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelLessThan(String value) {
            addCriterion("position_level <", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelLessThanOrEqualTo(String value) {
            addCriterion("position_level <=", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelLike(String value) {
            addCriterion("position_level like", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelNotLike(String value) {
            addCriterion("position_level not like", value, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelIn(List<String> values) {
            addCriterion("position_level in", values, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelNotIn(List<String> values) {
            addCriterion("position_level not in", values, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelBetween(String value1, String value2) {
            addCriterion("position_level between", value1, value2, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_levelNotBetween(String value1, String value2) {
            addCriterion("position_level not between", value1, value2, "position_level");
            return (Criteria) this;
        }

        public Criteria andPosition_descIsNull() {
            addCriterion("position_desc is null");
            return (Criteria) this;
        }

        public Criteria andPosition_descIsNotNull() {
            addCriterion("position_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_descEqualTo(String value) {
            addCriterion("position_desc =", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotEqualTo(String value) {
            addCriterion("position_desc <>", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descGreaterThan(String value) {
            addCriterion("position_desc >", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descGreaterThanOrEqualTo(String value) {
            addCriterion("position_desc >=", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descLessThan(String value) {
            addCriterion("position_desc <", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descLessThanOrEqualTo(String value) {
            addCriterion("position_desc <=", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descLike(String value) {
            addCriterion("position_desc like", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotLike(String value) {
            addCriterion("position_desc not like", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descIn(List<String> values) {
            addCriterion("position_desc in", values, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotIn(List<String> values) {
            addCriterion("position_desc not in", values, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descBetween(String value1, String value2) {
            addCriterion("position_desc between", value1, value2, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotBetween(String value1, String value2) {
            addCriterion("position_desc not between", value1, value2, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_statusIsNull() {
            addCriterion("position_status is null");
            return (Criteria) this;
        }

        public Criteria andPosition_statusIsNotNull() {
            addCriterion("position_status is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_statusEqualTo(Boolean value) {
            addCriterion("position_status =", value, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusNotEqualTo(Boolean value) {
            addCriterion("position_status <>", value, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusGreaterThan(Boolean value) {
            addCriterion("position_status >", value, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("position_status >=", value, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusLessThan(Boolean value) {
            addCriterion("position_status <", value, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("position_status <=", value, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusIn(List<Boolean> values) {
            addCriterion("position_status in", values, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusNotIn(List<Boolean> values) {
            addCriterion("position_status not in", values, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("position_status between", value1, value2, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("position_status not between", value1, value2, "position_status");
            return (Criteria) this;
        }

        public Criteria andPosition_typeIsNull() {
            addCriterion("position_type is null");
            return (Criteria) this;
        }

        public Criteria andPosition_typeIsNotNull() {
            addCriterion("position_type is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_typeEqualTo(Boolean value) {
            addCriterion("position_type =", value, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeNotEqualTo(Boolean value) {
            addCriterion("position_type <>", value, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeGreaterThan(Boolean value) {
            addCriterion("position_type >", value, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("position_type >=", value, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeLessThan(Boolean value) {
            addCriterion("position_type <", value, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("position_type <=", value, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeIn(List<Boolean> values) {
            addCriterion("position_type in", values, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeNotIn(List<Boolean> values) {
            addCriterion("position_type not in", values, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("position_type between", value1, value2, "position_type");
            return (Criteria) this;
        }

        public Criteria andPosition_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("position_type not between", value1, value2, "position_type");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkIsNull() {
            addCriterion("positoin_remark is null");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkIsNotNull() {
            addCriterion("positoin_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkEqualTo(String value) {
            addCriterion("positoin_remark =", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkNotEqualTo(String value) {
            addCriterion("positoin_remark <>", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkGreaterThan(String value) {
            addCriterion("positoin_remark >", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("positoin_remark >=", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkLessThan(String value) {
            addCriterion("positoin_remark <", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkLessThanOrEqualTo(String value) {
            addCriterion("positoin_remark <=", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkLike(String value) {
            addCriterion("positoin_remark like", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkNotLike(String value) {
            addCriterion("positoin_remark not like", value, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkIn(List<String> values) {
            addCriterion("positoin_remark in", values, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkNotIn(List<String> values) {
            addCriterion("positoin_remark not in", values, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkBetween(String value1, String value2) {
            addCriterion("positoin_remark between", value1, value2, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPositoin_remarkNotBetween(String value1, String value2) {
            addCriterion("positoin_remark not between", value1, value2, "positoin_remark");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameIsNull() {
            addCriterion("position_create_name is null");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameIsNotNull() {
            addCriterion("position_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameEqualTo(String value) {
            addCriterion("position_create_name =", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameNotEqualTo(String value) {
            addCriterion("position_create_name <>", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameGreaterThan(String value) {
            addCriterion("position_create_name >", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameGreaterThanOrEqualTo(String value) {
            addCriterion("position_create_name >=", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameLessThan(String value) {
            addCriterion("position_create_name <", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameLessThanOrEqualTo(String value) {
            addCriterion("position_create_name <=", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameLike(String value) {
            addCriterion("position_create_name like", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameNotLike(String value) {
            addCriterion("position_create_name not like", value, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameIn(List<String> values) {
            addCriterion("position_create_name in", values, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameNotIn(List<String> values) {
            addCriterion("position_create_name not in", values, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameBetween(String value1, String value2) {
            addCriterion("position_create_name between", value1, value2, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_nameNotBetween(String value1, String value2) {
            addCriterion("position_create_name not between", value1, value2, "position_create_name");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeIsNull() {
            addCriterion("position_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeIsNotNull() {
            addCriterion("position_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeEqualTo(Date value) {
            addCriterionForJDBCDate("position_create_time =", value, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("position_create_time <>", value, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("position_create_time >", value, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("position_create_time >=", value, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeLessThan(Date value) {
            addCriterionForJDBCDate("position_create_time <", value, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("position_create_time <=", value, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeIn(List<Date> values) {
            addCriterionForJDBCDate("position_create_time in", values, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("position_create_time not in", values, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("position_create_time between", value1, value2, "position_create_time");
            return (Criteria) this;
        }

        public Criteria andPosition_create_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("position_create_time not between", value1, value2, "position_create_time");
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