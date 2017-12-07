package com.zeus.baseddata.mybatis.model.based;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HsBasicCacheCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsBasicCacheCriteria() {
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

        public Criteria andCacheIdIsNull() {
            addCriterion("cache_id is null");
            return (Criteria) this;
        }

        public Criteria andCacheIdIsNotNull() {
            addCriterion("cache_id is not null");
            return (Criteria) this;
        }

        public Criteria andCacheIdEqualTo(Long value) {
            addCriterion("cache_id =", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotEqualTo(Long value) {
            addCriterion("cache_id <>", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdGreaterThan(Long value) {
            addCriterion("cache_id >", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cache_id >=", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdLessThan(Long value) {
            addCriterion("cache_id <", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdLessThanOrEqualTo(Long value) {
            addCriterion("cache_id <=", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdIn(List<Long> values) {
            addCriterion("cache_id in", values, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotIn(List<Long> values) {
            addCriterion("cache_id not in", values, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdBetween(Long value1, Long value2) {
            addCriterion("cache_id between", value1, value2, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotBetween(Long value1, Long value2) {
            addCriterion("cache_id not between", value1, value2, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheCodeIsNull() {
            addCriterion("cache_code is null");
            return (Criteria) this;
        }

        public Criteria andCacheCodeIsNotNull() {
            addCriterion("cache_code is not null");
            return (Criteria) this;
        }

        public Criteria andCacheCodeEqualTo(String value) {
            addCriterion("cache_code =", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeNotEqualTo(String value) {
            addCriterion("cache_code <>", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeGreaterThan(String value) {
            addCriterion("cache_code >", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cache_code >=", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeLessThan(String value) {
            addCriterion("cache_code <", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeLessThanOrEqualTo(String value) {
            addCriterion("cache_code <=", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeLike(String value) {
            addCriterion("cache_code like", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeNotLike(String value) {
            addCriterion("cache_code not like", value, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeIn(List<String> values) {
            addCriterion("cache_code in", values, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeNotIn(List<String> values) {
            addCriterion("cache_code not in", values, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeBetween(String value1, String value2) {
            addCriterion("cache_code between", value1, value2, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheCodeNotBetween(String value1, String value2) {
            addCriterion("cache_code not between", value1, value2, "cacheCode");
            return (Criteria) this;
        }

        public Criteria andCacheNameIsNull() {
            addCriterion("cache_name is null");
            return (Criteria) this;
        }

        public Criteria andCacheNameIsNotNull() {
            addCriterion("cache_name is not null");
            return (Criteria) this;
        }

        public Criteria andCacheNameEqualTo(String value) {
            addCriterion("cache_name =", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotEqualTo(String value) {
            addCriterion("cache_name <>", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameGreaterThan(String value) {
            addCriterion("cache_name >", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("cache_name >=", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameLessThan(String value) {
            addCriterion("cache_name <", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameLessThanOrEqualTo(String value) {
            addCriterion("cache_name <=", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameLike(String value) {
            addCriterion("cache_name like", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotLike(String value) {
            addCriterion("cache_name not like", value, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameIn(List<String> values) {
            addCriterion("cache_name in", values, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotIn(List<String> values) {
            addCriterion("cache_name not in", values, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameBetween(String value1, String value2) {
            addCriterion("cache_name between", value1, value2, "cacheName");
            return (Criteria) this;
        }

        public Criteria andCacheNameNotBetween(String value1, String value2) {
            addCriterion("cache_name not between", value1, value2, "cacheName");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Integer value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Integer value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Integer value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Integer value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Integer value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Integer> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Integer> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Integer value1, Integer value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andDataUrlIsNull() {
            addCriterion("data_url is null");
            return (Criteria) this;
        }

        public Criteria andDataUrlIsNotNull() {
            addCriterion("data_url is not null");
            return (Criteria) this;
        }

        public Criteria andDataUrlEqualTo(String value) {
            addCriterion("data_url =", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotEqualTo(String value) {
            addCriterion("data_url <>", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlGreaterThan(String value) {
            addCriterion("data_url >", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlGreaterThanOrEqualTo(String value) {
            addCriterion("data_url >=", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlLessThan(String value) {
            addCriterion("data_url <", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlLessThanOrEqualTo(String value) {
            addCriterion("data_url <=", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlLike(String value) {
            addCriterion("data_url like", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotLike(String value) {
            addCriterion("data_url not like", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlIn(List<String> values) {
            addCriterion("data_url in", values, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotIn(List<String> values) {
            addCriterion("data_url not in", values, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlBetween(String value1, String value2) {
            addCriterion("data_url between", value1, value2, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotBetween(String value1, String value2) {
            addCriterion("data_url not between", value1, value2, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andFieldCodeIsNull() {
            addCriterion("field_code is null");
            return (Criteria) this;
        }

        public Criteria andFieldCodeIsNotNull() {
            addCriterion("field_code is not null");
            return (Criteria) this;
        }

        public Criteria andFieldCodeEqualTo(String value) {
            addCriterion("field_code =", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotEqualTo(String value) {
            addCriterion("field_code <>", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeGreaterThan(String value) {
            addCriterion("field_code >", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeGreaterThanOrEqualTo(String value) {
            addCriterion("field_code >=", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeLessThan(String value) {
            addCriterion("field_code <", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeLessThanOrEqualTo(String value) {
            addCriterion("field_code <=", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeLike(String value) {
            addCriterion("field_code like", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotLike(String value) {
            addCriterion("field_code not like", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeIn(List<String> values) {
            addCriterion("field_code in", values, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotIn(List<String> values) {
            addCriterion("field_code not in", values, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeBetween(String value1, String value2) {
            addCriterion("field_code between", value1, value2, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotBetween(String value1, String value2) {
            addCriterion("field_code not between", value1, value2, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andReqMethodIsNull() {
            addCriterion("req_method is null");
            return (Criteria) this;
        }

        public Criteria andReqMethodIsNotNull() {
            addCriterion("req_method is not null");
            return (Criteria) this;
        }

        public Criteria andReqMethodEqualTo(Integer value) {
            addCriterion("req_method =", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotEqualTo(Integer value) {
            addCriterion("req_method <>", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodGreaterThan(Integer value) {
            addCriterion("req_method >", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_method >=", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLessThan(Integer value) {
            addCriterion("req_method <", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodLessThanOrEqualTo(Integer value) {
            addCriterion("req_method <=", value, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodIn(List<Integer> values) {
            addCriterion("req_method in", values, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotIn(List<Integer> values) {
            addCriterion("req_method not in", values, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodBetween(Integer value1, Integer value2) {
            addCriterion("req_method between", value1, value2, "reqMethod");
            return (Criteria) this;
        }

        public Criteria andReqMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("req_method not between", value1, value2, "reqMethod");
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

        public Criteria andReflushByIsNull() {
            addCriterion("reflush_by is null");
            return (Criteria) this;
        }

        public Criteria andReflushByIsNotNull() {
            addCriterion("reflush_by is not null");
            return (Criteria) this;
        }

        public Criteria andReflushByEqualTo(Long value) {
            addCriterion("reflush_by =", value, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByNotEqualTo(Long value) {
            addCriterion("reflush_by <>", value, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByGreaterThan(Long value) {
            addCriterion("reflush_by >", value, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByGreaterThanOrEqualTo(Long value) {
            addCriterion("reflush_by >=", value, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByLessThan(Long value) {
            addCriterion("reflush_by <", value, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByLessThanOrEqualTo(Long value) {
            addCriterion("reflush_by <=", value, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByIn(List<Long> values) {
            addCriterion("reflush_by in", values, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByNotIn(List<Long> values) {
            addCriterion("reflush_by not in", values, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByBetween(Long value1, Long value2) {
            addCriterion("reflush_by between", value1, value2, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushByNotBetween(Long value1, Long value2) {
            addCriterion("reflush_by not between", value1, value2, "reflushBy");
            return (Criteria) this;
        }

        public Criteria andReflushTimeIsNull() {
            addCriterion("reflush_time is null");
            return (Criteria) this;
        }

        public Criteria andReflushTimeIsNotNull() {
            addCriterion("reflush_time is not null");
            return (Criteria) this;
        }

        public Criteria andReflushTimeEqualTo(Date value) {
            addCriterion("reflush_time =", value, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeNotEqualTo(Date value) {
            addCriterion("reflush_time <>", value, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeGreaterThan(Date value) {
            addCriterion("reflush_time >", value, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reflush_time >=", value, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeLessThan(Date value) {
            addCriterion("reflush_time <", value, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeLessThanOrEqualTo(Date value) {
            addCriterion("reflush_time <=", value, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeIn(List<Date> values) {
            addCriterion("reflush_time in", values, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeNotIn(List<Date> values) {
            addCriterion("reflush_time not in", values, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeBetween(Date value1, Date value2) {
            addCriterion("reflush_time between", value1, value2, "reflushTime");
            return (Criteria) this;
        }

        public Criteria andReflushTimeNotBetween(Date value1, Date value2) {
            addCriterion("reflush_time not between", value1, value2, "reflushTime");
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