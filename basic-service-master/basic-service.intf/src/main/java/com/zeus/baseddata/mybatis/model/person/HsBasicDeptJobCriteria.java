package com.zeus.baseddata.mybatis.model.person;

import java.util.ArrayList;
import java.util.List;

public class HsBasicDeptJobCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsBasicDeptJobCriteria() {
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

        public Criteria andDeptJobIdIsNull() {
            addCriterion("dept_job_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdIsNotNull() {
            addCriterion("dept_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdEqualTo(Long value) {
            addCriterion("dept_job_id =", value, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdNotEqualTo(Long value) {
            addCriterion("dept_job_id <>", value, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdGreaterThan(Long value) {
            addCriterion("dept_job_id >", value, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dept_job_id >=", value, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdLessThan(Long value) {
            addCriterion("dept_job_id <", value, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdLessThanOrEqualTo(Long value) {
            addCriterion("dept_job_id <=", value, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdIn(List<Long> values) {
            addCriterion("dept_job_id in", values, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdNotIn(List<Long> values) {
            addCriterion("dept_job_id not in", values, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdBetween(Long value1, Long value2) {
            addCriterion("dept_job_id between", value1, value2, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobIdNotBetween(Long value1, Long value2) {
            addCriterion("dept_job_id not between", value1, value2, "deptJobId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Long value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Long value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Long value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Long value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Long> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Long> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Long value1, Long value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameIsNull() {
            addCriterion("dept_job_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameIsNotNull() {
            addCriterion("dept_job_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameEqualTo(String value) {
            addCriterion("dept_job_name =", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameNotEqualTo(String value) {
            addCriterion("dept_job_name <>", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameGreaterThan(String value) {
            addCriterion("dept_job_name >", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_job_name >=", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameLessThan(String value) {
            addCriterion("dept_job_name <", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameLessThanOrEqualTo(String value) {
            addCriterion("dept_job_name <=", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameLike(String value) {
            addCriterion("dept_job_name like", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameNotLike(String value) {
            addCriterion("dept_job_name not like", value, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameIn(List<String> values) {
            addCriterion("dept_job_name in", values, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameNotIn(List<String> values) {
            addCriterion("dept_job_name not in", values, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameBetween(String value1, String value2) {
            addCriterion("dept_job_name between", value1, value2, "deptJobName");
            return (Criteria) this;
        }

        public Criteria andDeptJobNameNotBetween(String value1, String value2) {
            addCriterion("dept_job_name not between", value1, value2, "deptJobName");
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