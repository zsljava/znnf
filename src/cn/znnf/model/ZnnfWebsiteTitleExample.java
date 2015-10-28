package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfWebsiteTitleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfWebsiteTitleExample() {
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

    public ZnnfWebsiteTitleExample(int pageIndex, int pageSize) {
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

        public Criteria andTitle_contentIsNull() {
            addCriterion("title_content is null");
            return (Criteria) this;
        }

        public Criteria andTitle_contentIsNotNull() {
            addCriterion("title_content is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_contentEqualTo(String value) {
            addCriterion("title_content =", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentNotEqualTo(String value) {
            addCriterion("title_content <>", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentGreaterThan(String value) {
            addCriterion("title_content >", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentGreaterThanOrEqualTo(String value) {
            addCriterion("title_content >=", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentLessThan(String value) {
            addCriterion("title_content <", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentLessThanOrEqualTo(String value) {
            addCriterion("title_content <=", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentLike(String value) {
            addCriterion("title_content like", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentNotLike(String value) {
            addCriterion("title_content not like", value, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentIn(List<String> values) {
            addCriterion("title_content in", values, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentNotIn(List<String> values) {
            addCriterion("title_content not in", values, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentBetween(String value1, String value2) {
            addCriterion("title_content between", value1, value2, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_contentNotBetween(String value1, String value2) {
            addCriterion("title_content not between", value1, value2, "title_content");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeIsNull() {
            addCriterion("title_operate_time is null");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeIsNotNull() {
            addCriterion("title_operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("title_operate_time =", value, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("title_operate_time <>", value, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("title_operate_time >", value, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("title_operate_time >=", value, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeLessThan(Date value) {
            addCriterionForJDBCDate("title_operate_time <", value, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("title_operate_time <=", value, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("title_operate_time in", values, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("title_operate_time not in", values, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("title_operate_time between", value1, value2, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("title_operate_time not between", value1, value2, "title_operate_time");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorIsNull() {
            addCriterion("title_operator is null");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorIsNotNull() {
            addCriterion("title_operator is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorEqualTo(String value) {
            addCriterion("title_operator =", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorNotEqualTo(String value) {
            addCriterion("title_operator <>", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorGreaterThan(String value) {
            addCriterion("title_operator >", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorGreaterThanOrEqualTo(String value) {
            addCriterion("title_operator >=", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorLessThan(String value) {
            addCriterion("title_operator <", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorLessThanOrEqualTo(String value) {
            addCriterion("title_operator <=", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorLike(String value) {
            addCriterion("title_operator like", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorNotLike(String value) {
            addCriterion("title_operator not like", value, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorIn(List<String> values) {
            addCriterion("title_operator in", values, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorNotIn(List<String> values) {
            addCriterion("title_operator not in", values, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorBetween(String value1, String value2) {
            addCriterion("title_operator between", value1, value2, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_operatorNotBetween(String value1, String value2) {
            addCriterion("title_operator not between", value1, value2, "title_operator");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryIsNull() {
            addCriterion("title_category is null");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryIsNotNull() {
            addCriterion("title_category is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryEqualTo(Boolean value) {
            addCriterion("title_category =", value, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryNotEqualTo(Boolean value) {
            addCriterion("title_category <>", value, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryGreaterThan(Boolean value) {
            addCriterion("title_category >", value, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("title_category >=", value, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryLessThan(Boolean value) {
            addCriterion("title_category <", value, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryLessThanOrEqualTo(Boolean value) {
            addCriterion("title_category <=", value, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryIn(List<Boolean> values) {
            addCriterion("title_category in", values, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryNotIn(List<Boolean> values) {
            addCriterion("title_category not in", values, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryBetween(Boolean value1, Boolean value2) {
            addCriterion("title_category between", value1, value2, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_categoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("title_category not between", value1, value2, "title_category");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkIsNull() {
            addCriterion("title_remark is null");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkIsNotNull() {
            addCriterion("title_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkEqualTo(String value) {
            addCriterion("title_remark =", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkNotEqualTo(String value) {
            addCriterion("title_remark <>", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkGreaterThan(String value) {
            addCriterion("title_remark >", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("title_remark >=", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkLessThan(String value) {
            addCriterion("title_remark <", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkLessThanOrEqualTo(String value) {
            addCriterion("title_remark <=", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkLike(String value) {
            addCriterion("title_remark like", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkNotLike(String value) {
            addCriterion("title_remark not like", value, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkIn(List<String> values) {
            addCriterion("title_remark in", values, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkNotIn(List<String> values) {
            addCriterion("title_remark not in", values, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkBetween(String value1, String value2) {
            addCriterion("title_remark between", value1, value2, "title_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_remarkNotBetween(String value1, String value2) {
            addCriterion("title_remark not between", value1, value2, "title_remark");
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