package cn.znnf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfWebsiteContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfWebsiteContentExample() {
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

    public ZnnfWebsiteContentExample(int pageIndex, int pageSize) {
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

        public Criteria andContent_introduceIsNull() {
            addCriterion("content_introduce is null");
            return (Criteria) this;
        }

        public Criteria andContent_introduceIsNotNull() {
            addCriterion("content_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andContent_introduceEqualTo(String value) {
            addCriterion("content_introduce =", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceNotEqualTo(String value) {
            addCriterion("content_introduce <>", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceGreaterThan(String value) {
            addCriterion("content_introduce >", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceGreaterThanOrEqualTo(String value) {
            addCriterion("content_introduce >=", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceLessThan(String value) {
            addCriterion("content_introduce <", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceLessThanOrEqualTo(String value) {
            addCriterion("content_introduce <=", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceLike(String value) {
            addCriterion("content_introduce like", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceNotLike(String value) {
            addCriterion("content_introduce not like", value, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceIn(List<String> values) {
            addCriterion("content_introduce in", values, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceNotIn(List<String> values) {
            addCriterion("content_introduce not in", values, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceBetween(String value1, String value2) {
            addCriterion("content_introduce between", value1, value2, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_introduceNotBetween(String value1, String value2) {
            addCriterion("content_introduce not between", value1, value2, "content_introduce");
            return (Criteria) this;
        }

        public Criteria andContent_imageIsNull() {
            addCriterion("content_image is null");
            return (Criteria) this;
        }

        public Criteria andContent_imageIsNotNull() {
            addCriterion("content_image is not null");
            return (Criteria) this;
        }

        public Criteria andContent_imageEqualTo(String value) {
            addCriterion("content_image =", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageNotEqualTo(String value) {
            addCriterion("content_image <>", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageGreaterThan(String value) {
            addCriterion("content_image >", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageGreaterThanOrEqualTo(String value) {
            addCriterion("content_image >=", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageLessThan(String value) {
            addCriterion("content_image <", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageLessThanOrEqualTo(String value) {
            addCriterion("content_image <=", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageLike(String value) {
            addCriterion("content_image like", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageNotLike(String value) {
            addCriterion("content_image not like", value, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageIn(List<String> values) {
            addCriterion("content_image in", values, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageNotIn(List<String> values) {
            addCriterion("content_image not in", values, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageBetween(String value1, String value2) {
            addCriterion("content_image between", value1, value2, "content_image");
            return (Criteria) this;
        }

        public Criteria andContent_imageNotBetween(String value1, String value2) {
            addCriterion("content_image not between", value1, value2, "content_image");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorIsNull() {
            addCriterion("connt_operator is null");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorIsNotNull() {
            addCriterion("connt_operator is not null");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorEqualTo(String value) {
            addCriterion("connt_operator =", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorNotEqualTo(String value) {
            addCriterion("connt_operator <>", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorGreaterThan(String value) {
            addCriterion("connt_operator >", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorGreaterThanOrEqualTo(String value) {
            addCriterion("connt_operator >=", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorLessThan(String value) {
            addCriterion("connt_operator <", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorLessThanOrEqualTo(String value) {
            addCriterion("connt_operator <=", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorLike(String value) {
            addCriterion("connt_operator like", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorNotLike(String value) {
            addCriterion("connt_operator not like", value, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorIn(List<String> values) {
            addCriterion("connt_operator in", values, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorNotIn(List<String> values) {
            addCriterion("connt_operator not in", values, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorBetween(String value1, String value2) {
            addCriterion("connt_operator between", value1, value2, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andConnt_operatorNotBetween(String value1, String value2) {
            addCriterion("connt_operator not between", value1, value2, "connt_operator");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeIsNull() {
            addCriterion("content_operate_time is null");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeIsNotNull() {
            addCriterion("content_operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("content_operate_time =", value, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("content_operate_time <>", value, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("content_operate_time >", value, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("content_operate_time >=", value, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeLessThan(Date value) {
            addCriterionForJDBCDate("content_operate_time <", value, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("content_operate_time <=", value, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("content_operate_time in", values, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("content_operate_time not in", values, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("content_operate_time between", value1, value2, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_operate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("content_operate_time not between", value1, value2, "content_operate_time");
            return (Criteria) this;
        }

        public Criteria andContent_remarkIsNull() {
            addCriterion("content_remark is null");
            return (Criteria) this;
        }

        public Criteria andContent_remarkIsNotNull() {
            addCriterion("content_remark is not null");
            return (Criteria) this;
        }

        public Criteria andContent_remarkEqualTo(String value) {
            addCriterion("content_remark =", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkNotEqualTo(String value) {
            addCriterion("content_remark <>", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkGreaterThan(String value) {
            addCriterion("content_remark >", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("content_remark >=", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkLessThan(String value) {
            addCriterion("content_remark <", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkLessThanOrEqualTo(String value) {
            addCriterion("content_remark <=", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkLike(String value) {
            addCriterion("content_remark like", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkNotLike(String value) {
            addCriterion("content_remark not like", value, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkIn(List<String> values) {
            addCriterion("content_remark in", values, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkNotIn(List<String> values) {
            addCriterion("content_remark not in", values, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkBetween(String value1, String value2) {
            addCriterion("content_remark between", value1, value2, "content_remark");
            return (Criteria) this;
        }

        public Criteria andContent_remarkNotBetween(String value1, String value2) {
            addCriterion("content_remark not between", value1, value2, "content_remark");
            return (Criteria) this;
        }

        public Criteria andTitle_idIsNull() {
            addCriterion("title_id is null");
            return (Criteria) this;
        }

        public Criteria andTitle_idIsNotNull() {
            addCriterion("title_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_idEqualTo(Integer value) {
            addCriterion("title_id =", value, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idNotEqualTo(Integer value) {
            addCriterion("title_id <>", value, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idGreaterThan(Integer value) {
            addCriterion("title_id >", value, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_id >=", value, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idLessThan(Integer value) {
            addCriterion("title_id <", value, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idLessThanOrEqualTo(Integer value) {
            addCriterion("title_id <=", value, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idIn(List<Integer> values) {
            addCriterion("title_id in", values, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idNotIn(List<Integer> values) {
            addCriterion("title_id not in", values, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idBetween(Integer value1, Integer value2) {
            addCriterion("title_id between", value1, value2, "title_id");
            return (Criteria) this;
        }

        public Criteria andTitle_idNotBetween(Integer value1, Integer value2) {
            addCriterion("title_id not between", value1, value2, "title_id");
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