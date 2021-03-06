package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfMessageSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfMessageSendExample() {
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

    public ZnnfMessageSendExample(int pageIndex, int pageSize) {
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

        public Criteria andSend_contentIsNull() {
            addCriterion("send_content is null");
            return (Criteria) this;
        }

        public Criteria andSend_contentIsNotNull() {
            addCriterion("send_content is not null");
            return (Criteria) this;
        }

        public Criteria andSend_contentEqualTo(String value) {
            addCriterion("send_content =", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentNotEqualTo(String value) {
            addCriterion("send_content <>", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentGreaterThan(String value) {
            addCriterion("send_content >", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentGreaterThanOrEqualTo(String value) {
            addCriterion("send_content >=", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentLessThan(String value) {
            addCriterion("send_content <", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentLessThanOrEqualTo(String value) {
            addCriterion("send_content <=", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentLike(String value) {
            addCriterion("send_content like", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentNotLike(String value) {
            addCriterion("send_content not like", value, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentIn(List<String> values) {
            addCriterion("send_content in", values, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentNotIn(List<String> values) {
            addCriterion("send_content not in", values, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentBetween(String value1, String value2) {
            addCriterion("send_content between", value1, value2, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_contentNotBetween(String value1, String value2) {
            addCriterion("send_content not between", value1, value2, "send_content");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameIsNull() {
            addCriterion("send_create_name is null");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameIsNotNull() {
            addCriterion("send_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameEqualTo(String value) {
            addCriterion("send_create_name =", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameNotEqualTo(String value) {
            addCriterion("send_create_name <>", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameGreaterThan(String value) {
            addCriterion("send_create_name >", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameGreaterThanOrEqualTo(String value) {
            addCriterion("send_create_name >=", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameLessThan(String value) {
            addCriterion("send_create_name <", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameLessThanOrEqualTo(String value) {
            addCriterion("send_create_name <=", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameLike(String value) {
            addCriterion("send_create_name like", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameNotLike(String value) {
            addCriterion("send_create_name not like", value, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameIn(List<String> values) {
            addCriterion("send_create_name in", values, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameNotIn(List<String> values) {
            addCriterion("send_create_name not in", values, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameBetween(String value1, String value2) {
            addCriterion("send_create_name between", value1, value2, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_nameNotBetween(String value1, String value2) {
            addCriterion("send_create_name not between", value1, value2, "send_create_name");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeIsNull() {
            addCriterion("send_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeIsNotNull() {
            addCriterion("send_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeEqualTo(Date value) {
            addCriterionForJDBCDate("send_create_time =", value, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("send_create_time <>", value, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("send_create_time >", value, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_create_time >=", value, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeLessThan(Date value) {
            addCriterionForJDBCDate("send_create_time <", value, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_create_time <=", value, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeIn(List<Date> values) {
            addCriterionForJDBCDate("send_create_time in", values, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("send_create_time not in", values, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_create_time between", value1, value2, "send_create_time");
            return (Criteria) this;
        }

        public Criteria andSend_create_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_create_time not between", value1, value2, "send_create_time");
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