package com.zeus.baseddata.mybatis.model.based;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HsBasicConfigCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsBasicConfigCriteria() {
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

        public Criteria andGlobalConfigIdIsNull() {
            addCriterion("global_config_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdIsNotNull() {
            addCriterion("global_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdEqualTo(Long value) {
            addCriterion("global_config_id =", value, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdNotEqualTo(Long value) {
            addCriterion("global_config_id <>", value, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdGreaterThan(Long value) {
            addCriterion("global_config_id >", value, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("global_config_id >=", value, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdLessThan(Long value) {
            addCriterion("global_config_id <", value, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("global_config_id <=", value, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdIn(List<Long> values) {
            addCriterion("global_config_id in", values, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdNotIn(List<Long> values) {
            addCriterion("global_config_id not in", values, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdBetween(Long value1, Long value2) {
            addCriterion("global_config_id between", value1, value2, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("global_config_id not between", value1, value2, "globalConfigId");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeIsNull() {
            addCriterion("global_config_code is null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeIsNotNull() {
            addCriterion("global_config_code is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeEqualTo(String value) {
            addCriterion("global_config_code =", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeNotEqualTo(String value) {
            addCriterion("global_config_code <>", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeGreaterThan(String value) {
            addCriterion("global_config_code >", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("global_config_code >=", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeLessThan(String value) {
            addCriterion("global_config_code <", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeLessThanOrEqualTo(String value) {
            addCriterion("global_config_code <=", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeLike(String value) {
            addCriterion("global_config_code like", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeNotLike(String value) {
            addCriterion("global_config_code not like", value, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeIn(List<String> values) {
            addCriterion("global_config_code in", values, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeNotIn(List<String> values) {
            addCriterion("global_config_code not in", values, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeBetween(String value1, String value2) {
            addCriterion("global_config_code between", value1, value2, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigCodeNotBetween(String value1, String value2) {
            addCriterion("global_config_code not between", value1, value2, "globalConfigCode");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameIsNull() {
            addCriterion("global_config_name is null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameIsNotNull() {
            addCriterion("global_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameEqualTo(String value) {
            addCriterion("global_config_name =", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameNotEqualTo(String value) {
            addCriterion("global_config_name <>", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameGreaterThan(String value) {
            addCriterion("global_config_name >", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("global_config_name >=", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameLessThan(String value) {
            addCriterion("global_config_name <", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameLessThanOrEqualTo(String value) {
            addCriterion("global_config_name <=", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameLike(String value) {
            addCriterion("global_config_name like", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameNotLike(String value) {
            addCriterion("global_config_name not like", value, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameIn(List<String> values) {
            addCriterion("global_config_name in", values, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameNotIn(List<String> values) {
            addCriterion("global_config_name not in", values, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameBetween(String value1, String value2) {
            addCriterion("global_config_name between", value1, value2, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigNameNotBetween(String value1, String value2) {
            addCriterion("global_config_name not between", value1, value2, "globalConfigName");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueIsNull() {
            addCriterion("global_config_value is null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueIsNotNull() {
            addCriterion("global_config_value is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueEqualTo(String value) {
            addCriterion("global_config_value =", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueNotEqualTo(String value) {
            addCriterion("global_config_value <>", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueGreaterThan(String value) {
            addCriterion("global_config_value >", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueGreaterThanOrEqualTo(String value) {
            addCriterion("global_config_value >=", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueLessThan(String value) {
            addCriterion("global_config_value <", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueLessThanOrEqualTo(String value) {
            addCriterion("global_config_value <=", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueLike(String value) {
            addCriterion("global_config_value like", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueNotLike(String value) {
            addCriterion("global_config_value not like", value, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueIn(List<String> values) {
            addCriterion("global_config_value in", values, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueNotIn(List<String> values) {
            addCriterion("global_config_value not in", values, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueBetween(String value1, String value2) {
            addCriterion("global_config_value between", value1, value2, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andGlobalConfigValueNotBetween(String value1, String value2) {
            addCriterion("global_config_value not between", value1, value2, "globalConfigValue");
            return (Criteria) this;
        }

        public Criteria andBlUserIsNull() {
            addCriterion("bl_user is null");
            return (Criteria) this;
        }

        public Criteria andBlUserIsNotNull() {
            addCriterion("bl_user is not null");
            return (Criteria) this;
        }

        public Criteria andBlUserEqualTo(Integer value) {
            addCriterion("bl_user =", value, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserNotEqualTo(Integer value) {
            addCriterion("bl_user <>", value, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserGreaterThan(Integer value) {
            addCriterion("bl_user >", value, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("bl_user >=", value, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserLessThan(Integer value) {
            addCriterion("bl_user <", value, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserLessThanOrEqualTo(Integer value) {
            addCriterion("bl_user <=", value, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserIn(List<Integer> values) {
            addCriterion("bl_user in", values, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserNotIn(List<Integer> values) {
            addCriterion("bl_user not in", values, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserBetween(Integer value1, Integer value2) {
            addCriterion("bl_user between", value1, value2, "blUser");
            return (Criteria) this;
        }

        public Criteria andBlUserNotBetween(Integer value1, Integer value2) {
            addCriterion("bl_user not between", value1, value2, "blUser");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRdStatusIsNull() {
            addCriterion("rd_status is null");
            return (Criteria) this;
        }

        public Criteria andRdStatusIsNotNull() {
            addCriterion("rd_status is not null");
            return (Criteria) this;
        }

        public Criteria andRdStatusEqualTo(Integer value) {
            addCriterion("rd_status =", value, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusNotEqualTo(Integer value) {
            addCriterion("rd_status <>", value, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusGreaterThan(Integer value) {
            addCriterion("rd_status >", value, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rd_status >=", value, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusLessThan(Integer value) {
            addCriterion("rd_status <", value, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rd_status <=", value, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusIn(List<Integer> values) {
            addCriterion("rd_status in", values, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusNotIn(List<Integer> values) {
            addCriterion("rd_status not in", values, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusBetween(Integer value1, Integer value2) {
            addCriterion("rd_status between", value1, value2, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andRdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rd_status not between", value1, value2, "rdStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("modified_by is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(Long value) {
            addCriterion("modified_by =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(Long value) {
            addCriterion("modified_by <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(Long value) {
            addCriterion("modified_by >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(Long value) {
            addCriterion("modified_by >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(Long value) {
            addCriterion("modified_by <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(Long value) {
            addCriterion("modified_by <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<Long> values) {
            addCriterion("modified_by in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<Long> values) {
            addCriterion("modified_by not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(Long value1, Long value2) {
            addCriterion("modified_by between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(Long value1, Long value2) {
            addCriterion("modified_by not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
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