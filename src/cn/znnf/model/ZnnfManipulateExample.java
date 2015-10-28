package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfManipulateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfManipulateExample() {
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

    public ZnnfManipulateExample(int pageIndex, int pageSize) {
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

        public Criteria andManipulate_nameIsNull() {
            addCriterion("manipulate_name is null");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameIsNotNull() {
            addCriterion("manipulate_name is not null");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameEqualTo(String value) {
            addCriterion("manipulate_name =", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameNotEqualTo(String value) {
            addCriterion("manipulate_name <>", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameGreaterThan(String value) {
            addCriterion("manipulate_name >", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameGreaterThanOrEqualTo(String value) {
            addCriterion("manipulate_name >=", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameLessThan(String value) {
            addCriterion("manipulate_name <", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameLessThanOrEqualTo(String value) {
            addCriterion("manipulate_name <=", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameLike(String value) {
            addCriterion("manipulate_name like", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameNotLike(String value) {
            addCriterion("manipulate_name not like", value, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameIn(List<String> values) {
            addCriterion("manipulate_name in", values, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameNotIn(List<String> values) {
            addCriterion("manipulate_name not in", values, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameBetween(String value1, String value2) {
            addCriterion("manipulate_name between", value1, value2, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_nameNotBetween(String value1, String value2) {
            addCriterion("manipulate_name not between", value1, value2, "manipulate_name");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeIsNull() {
            addCriterion("manipulate_time is null");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeIsNotNull() {
            addCriterion("manipulate_time is not null");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("manipulate_time =", value, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("manipulate_time <>", value, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("manipulate_time >", value, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("manipulate_time >=", value, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeLessThan(Date value) {
            addCriterionForJDBCDate("manipulate_time <", value, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("manipulate_time <=", value, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("manipulate_time in", values, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("manipulate_time not in", values, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("manipulate_time between", value1, value2, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("manipulate_time not between", value1, value2, "manipulate_time");
            return (Criteria) this;
        }

        public Criteria andManipulate_descIsNull() {
            addCriterion("manipulate_desc is null");
            return (Criteria) this;
        }

        public Criteria andManipulate_descIsNotNull() {
            addCriterion("manipulate_desc is not null");
            return (Criteria) this;
        }

        public Criteria andManipulate_descEqualTo(String value) {
            addCriterion("manipulate_desc =", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descNotEqualTo(String value) {
            addCriterion("manipulate_desc <>", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descGreaterThan(String value) {
            addCriterion("manipulate_desc >", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descGreaterThanOrEqualTo(String value) {
            addCriterion("manipulate_desc >=", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descLessThan(String value) {
            addCriterion("manipulate_desc <", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descLessThanOrEqualTo(String value) {
            addCriterion("manipulate_desc <=", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descLike(String value) {
            addCriterion("manipulate_desc like", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descNotLike(String value) {
            addCriterion("manipulate_desc not like", value, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descIn(List<String> values) {
            addCriterion("manipulate_desc in", values, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descNotIn(List<String> values) {
            addCriterion("manipulate_desc not in", values, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descBetween(String value1, String value2) {
            addCriterion("manipulate_desc between", value1, value2, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_descNotBetween(String value1, String value2) {
            addCriterion("manipulate_desc not between", value1, value2, "manipulate_desc");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPIsNull() {
            addCriterion("manipulate_IP is null");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPIsNotNull() {
            addCriterion("manipulate_IP is not null");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPEqualTo(String value) {
            addCriterion("manipulate_IP =", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPNotEqualTo(String value) {
            addCriterion("manipulate_IP <>", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPGreaterThan(String value) {
            addCriterion("manipulate_IP >", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPGreaterThanOrEqualTo(String value) {
            addCriterion("manipulate_IP >=", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPLessThan(String value) {
            addCriterion("manipulate_IP <", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPLessThanOrEqualTo(String value) {
            addCriterion("manipulate_IP <=", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPLike(String value) {
            addCriterion("manipulate_IP like", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPNotLike(String value) {
            addCriterion("manipulate_IP not like", value, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPIn(List<String> values) {
            addCriterion("manipulate_IP in", values, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPNotIn(List<String> values) {
            addCriterion("manipulate_IP not in", values, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPBetween(String value1, String value2) {
            addCriterion("manipulate_IP between", value1, value2, "manipulate_IP");
            return (Criteria) this;
        }

        public Criteria andManipulate_IPNotBetween(String value1, String value2) {
            addCriterion("manipulate_IP not between", value1, value2, "manipulate_IP");
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