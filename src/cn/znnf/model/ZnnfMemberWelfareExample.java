package cn.znnf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZnnfMemberWelfareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfMemberWelfareExample() {
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

    public ZnnfMemberWelfareExample(int pageIndex, int pageSize) {
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

        public Criteria andWelfare_rankIsNull() {
            addCriterion("welfare_rank is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankIsNotNull() {
            addCriterion("welfare_rank is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankEqualTo(String value) {
            addCriterion("welfare_rank =", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankNotEqualTo(String value) {
            addCriterion("welfare_rank <>", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankGreaterThan(String value) {
            addCriterion("welfare_rank >", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankGreaterThanOrEqualTo(String value) {
            addCriterion("welfare_rank >=", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankLessThan(String value) {
            addCriterion("welfare_rank <", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankLessThanOrEqualTo(String value) {
            addCriterion("welfare_rank <=", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankLike(String value) {
            addCriterion("welfare_rank like", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankNotLike(String value) {
            addCriterion("welfare_rank not like", value, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankIn(List<String> values) {
            addCriterion("welfare_rank in", values, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankNotIn(List<String> values) {
            addCriterion("welfare_rank not in", values, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankBetween(String value1, String value2) {
            addCriterion("welfare_rank between", value1, value2, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_rankNotBetween(String value1, String value2) {
            addCriterion("welfare_rank not between", value1, value2, "welfare_rank");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitIsNull() {
            addCriterion("welfare_integral_lowerlimit is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitIsNotNull() {
            addCriterion("welfare_integral_lowerlimit is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitEqualTo(Integer value) {
            addCriterion("welfare_integral_lowerlimit =", value, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitNotEqualTo(Integer value) {
            addCriterion("welfare_integral_lowerlimit <>", value, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitGreaterThan(Integer value) {
            addCriterion("welfare_integral_lowerlimit >", value, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("welfare_integral_lowerlimit >=", value, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitLessThan(Integer value) {
            addCriterion("welfare_integral_lowerlimit <", value, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitLessThanOrEqualTo(Integer value) {
            addCriterion("welfare_integral_lowerlimit <=", value, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitIn(List<Integer> values) {
            addCriterion("welfare_integral_lowerlimit in", values, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitNotIn(List<Integer> values) {
            addCriterion("welfare_integral_lowerlimit not in", values, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitBetween(Integer value1, Integer value2) {
            addCriterion("welfare_integral_lowerlimit between", value1, value2, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_lowerlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("welfare_integral_lowerlimit not between", value1, value2, "welfare_integral_lowerlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitIsNull() {
            addCriterion("welfare_integral_upperlimit is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitIsNotNull() {
            addCriterion("welfare_integral_upperlimit is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitEqualTo(Integer value) {
            addCriterion("welfare_integral_upperlimit =", value, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitNotEqualTo(Integer value) {
            addCriterion("welfare_integral_upperlimit <>", value, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitGreaterThan(Integer value) {
            addCriterion("welfare_integral_upperlimit >", value, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("welfare_integral_upperlimit >=", value, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitLessThan(Integer value) {
            addCriterion("welfare_integral_upperlimit <", value, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitLessThanOrEqualTo(Integer value) {
            addCriterion("welfare_integral_upperlimit <=", value, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitIn(List<Integer> values) {
            addCriterion("welfare_integral_upperlimit in", values, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitNotIn(List<Integer> values) {
            addCriterion("welfare_integral_upperlimit not in", values, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitBetween(Integer value1, Integer value2) {
            addCriterion("welfare_integral_upperlimit between", value1, value2, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_integral_upperlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("welfare_integral_upperlimit not between", value1, value2, "welfare_integral_upperlimit");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountIsNull() {
            addCriterion("welfare_discount is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountIsNotNull() {
            addCriterion("welfare_discount is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountEqualTo(BigDecimal value) {
            addCriterion("welfare_discount =", value, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountNotEqualTo(BigDecimal value) {
            addCriterion("welfare_discount <>", value, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountGreaterThan(BigDecimal value) {
            addCriterion("welfare_discount >", value, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("welfare_discount >=", value, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountLessThan(BigDecimal value) {
            addCriterion("welfare_discount <", value, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("welfare_discount <=", value, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountIn(List<BigDecimal> values) {
            addCriterion("welfare_discount in", values, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountNotIn(List<BigDecimal> values) {
            addCriterion("welfare_discount not in", values, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("welfare_discount between", value1, value2, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_discountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("welfare_discount not between", value1, value2, "welfare_discount");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkIsNull() {
            addCriterion("welfare_remark is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkIsNotNull() {
            addCriterion("welfare_remark is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkEqualTo(String value) {
            addCriterion("welfare_remark =", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkNotEqualTo(String value) {
            addCriterion("welfare_remark <>", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkGreaterThan(String value) {
            addCriterion("welfare_remark >", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("welfare_remark >=", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkLessThan(String value) {
            addCriterion("welfare_remark <", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkLessThanOrEqualTo(String value) {
            addCriterion("welfare_remark <=", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkLike(String value) {
            addCriterion("welfare_remark like", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkNotLike(String value) {
            addCriterion("welfare_remark not like", value, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkIn(List<String> values) {
            addCriterion("welfare_remark in", values, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkNotIn(List<String> values) {
            addCriterion("welfare_remark not in", values, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkBetween(String value1, String value2) {
            addCriterion("welfare_remark between", value1, value2, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_remarkNotBetween(String value1, String value2) {
            addCriterion("welfare_remark not between", value1, value2, "welfare_remark");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameIsNull() {
            addCriterion("welfare_create_name is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameIsNotNull() {
            addCriterion("welfare_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameEqualTo(String value) {
            addCriterion("welfare_create_name =", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameNotEqualTo(String value) {
            addCriterion("welfare_create_name <>", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameGreaterThan(String value) {
            addCriterion("welfare_create_name >", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameGreaterThanOrEqualTo(String value) {
            addCriterion("welfare_create_name >=", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameLessThan(String value) {
            addCriterion("welfare_create_name <", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameLessThanOrEqualTo(String value) {
            addCriterion("welfare_create_name <=", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameLike(String value) {
            addCriterion("welfare_create_name like", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameNotLike(String value) {
            addCriterion("welfare_create_name not like", value, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameIn(List<String> values) {
            addCriterion("welfare_create_name in", values, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameNotIn(List<String> values) {
            addCriterion("welfare_create_name not in", values, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameBetween(String value1, String value2) {
            addCriterion("welfare_create_name between", value1, value2, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_nameNotBetween(String value1, String value2) {
            addCriterion("welfare_create_name not between", value1, value2, "welfare_create_name");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeIsNull() {
            addCriterion("welfare_create_time is null");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeIsNotNull() {
            addCriterion("welfare_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeEqualTo(Date value) {
            addCriterionForJDBCDate("welfare_create_time =", value, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("welfare_create_time <>", value, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("welfare_create_time >", value, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("welfare_create_time >=", value, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeLessThan(Date value) {
            addCriterionForJDBCDate("welfare_create_time <", value, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("welfare_create_time <=", value, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeIn(List<Date> values) {
            addCriterionForJDBCDate("welfare_create_time in", values, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("welfare_create_time not in", values, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("welfare_create_time between", value1, value2, "welfare_create_time");
            return (Criteria) this;
        }

        public Criteria andWelfare_create_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("welfare_create_time not between", value1, value2, "welfare_create_time");
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