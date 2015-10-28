package cn.znnf.model;

import java.util.ArrayList;
import java.util.List;

public class ZnnfPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    public ZnnfPermissionExample() {
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

    public ZnnfPermissionExample(int pageIndex, int pageSize) {
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

        public Criteria andPermission_submenuIsNull() {
            addCriterion("permission_submenu is null");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuIsNotNull() {
            addCriterion("permission_submenu is not null");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuEqualTo(String value) {
            addCriterion("permission_submenu =", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuNotEqualTo(String value) {
            addCriterion("permission_submenu <>", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuGreaterThan(String value) {
            addCriterion("permission_submenu >", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuGreaterThanOrEqualTo(String value) {
            addCriterion("permission_submenu >=", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuLessThan(String value) {
            addCriterion("permission_submenu <", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuLessThanOrEqualTo(String value) {
            addCriterion("permission_submenu <=", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuLike(String value) {
            addCriterion("permission_submenu like", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuNotLike(String value) {
            addCriterion("permission_submenu not like", value, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuIn(List<String> values) {
            addCriterion("permission_submenu in", values, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuNotIn(List<String> values) {
            addCriterion("permission_submenu not in", values, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuBetween(String value1, String value2) {
            addCriterion("permission_submenu between", value1, value2, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_submenuNotBetween(String value1, String value2) {
            addCriterion("permission_submenu not between", value1, value2, "permission_submenu");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathIsNull() {
            addCriterion("permission_filepath is null");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathIsNotNull() {
            addCriterion("permission_filepath is not null");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathEqualTo(String value) {
            addCriterion("permission_filepath =", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathNotEqualTo(String value) {
            addCriterion("permission_filepath <>", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathGreaterThan(String value) {
            addCriterion("permission_filepath >", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathGreaterThanOrEqualTo(String value) {
            addCriterion("permission_filepath >=", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathLessThan(String value) {
            addCriterion("permission_filepath <", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathLessThanOrEqualTo(String value) {
            addCriterion("permission_filepath <=", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathLike(String value) {
            addCriterion("permission_filepath like", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathNotLike(String value) {
            addCriterion("permission_filepath not like", value, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathIn(List<String> values) {
            addCriterion("permission_filepath in", values, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathNotIn(List<String> values) {
            addCriterion("permission_filepath not in", values, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathBetween(String value1, String value2) {
            addCriterion("permission_filepath between", value1, value2, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andPermission_filepathNotBetween(String value1, String value2) {
            addCriterion("permission_filepath not between", value1, value2, "permission_filepath");
            return (Criteria) this;
        }

        public Criteria andManager_idIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManager_idIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManager_idEqualTo(Integer value) {
            addCriterion("manager_id =", value, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idLessThan(Integer value) {
            addCriterion("manager_id <", value, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idIn(List<Integer> values) {
            addCriterion("manager_id in", values, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "manager_id");
            return (Criteria) this;
        }

        public Criteria andManager_idNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "manager_id");
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