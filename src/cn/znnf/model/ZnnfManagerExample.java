package cn.znnf.model;

import java.util.ArrayList;
import java.util.List;

public class ZnnfManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfManagerExample() {
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

    public ZnnfManagerExample(int pageIndex, int pageSize) {
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

        public Criteria andManager_nameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManager_nameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManager_nameEqualTo(String value) {
            addCriterion("manager_name =", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameGreaterThan(String value) {
            addCriterion("manager_name >", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameLessThan(String value) {
            addCriterion("manager_name <", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameLike(String value) {
            addCriterion("manager_name like", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameNotLike(String value) {
            addCriterion("manager_name not like", value, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameIn(List<String> values) {
            addCriterion("manager_name in", values, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_nameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "manager_name");
            return (Criteria) this;
        }

        public Criteria andManager_passwordIsNull() {
            addCriterion("manager_password is null");
            return (Criteria) this;
        }

        public Criteria andManager_passwordIsNotNull() {
            addCriterion("manager_password is not null");
            return (Criteria) this;
        }

        public Criteria andManager_passwordEqualTo(String value) {
            addCriterion("manager_password =", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordNotEqualTo(String value) {
            addCriterion("manager_password <>", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordGreaterThan(String value) {
            addCriterion("manager_password >", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("manager_password >=", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordLessThan(String value) {
            addCriterion("manager_password <", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordLessThanOrEqualTo(String value) {
            addCriterion("manager_password <=", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordLike(String value) {
            addCriterion("manager_password like", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordNotLike(String value) {
            addCriterion("manager_password not like", value, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordIn(List<String> values) {
            addCriterion("manager_password in", values, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordNotIn(List<String> values) {
            addCriterion("manager_password not in", values, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordBetween(String value1, String value2) {
            addCriterion("manager_password between", value1, value2, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_passwordNotBetween(String value1, String value2) {
            addCriterion("manager_password not between", value1, value2, "manager_password");
            return (Criteria) this;
        }

        public Criteria andManager_statusIsNull() {
            addCriterion("manager_status is null");
            return (Criteria) this;
        }

        public Criteria andManager_statusIsNotNull() {
            addCriterion("manager_status is not null");
            return (Criteria) this;
        }

        public Criteria andManager_statusEqualTo(Boolean value) {
            addCriterion("manager_status =", value, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusNotEqualTo(Boolean value) {
            addCriterion("manager_status <>", value, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusGreaterThan(Boolean value) {
            addCriterion("manager_status >", value, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("manager_status >=", value, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusLessThan(Boolean value) {
            addCriterion("manager_status <", value, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("manager_status <=", value, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusIn(List<Boolean> values) {
            addCriterion("manager_status in", values, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusNotIn(List<Boolean> values) {
            addCriterion("manager_status not in", values, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("manager_status between", value1, value2, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("manager_status not between", value1, value2, "manager_status");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameIsNull() {
            addCriterion("manager_create_name is null");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameIsNotNull() {
            addCriterion("manager_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameEqualTo(String value) {
            addCriterion("manager_create_name =", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameNotEqualTo(String value) {
            addCriterion("manager_create_name <>", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameGreaterThan(String value) {
            addCriterion("manager_create_name >", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_create_name >=", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameLessThan(String value) {
            addCriterion("manager_create_name <", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameLessThanOrEqualTo(String value) {
            addCriterion("manager_create_name <=", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameLike(String value) {
            addCriterion("manager_create_name like", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameNotLike(String value) {
            addCriterion("manager_create_name not like", value, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameIn(List<String> values) {
            addCriterion("manager_create_name in", values, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameNotIn(List<String> values) {
            addCriterion("manager_create_name not in", values, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameBetween(String value1, String value2) {
            addCriterion("manager_create_name between", value1, value2, "manager_create_name");
            return (Criteria) this;
        }

        public Criteria andManager_create_nameNotBetween(String value1, String value2) {
            addCriterion("manager_create_name not between", value1, value2, "manager_create_name");
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