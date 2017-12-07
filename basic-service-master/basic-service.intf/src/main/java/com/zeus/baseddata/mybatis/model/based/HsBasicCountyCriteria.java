package com.zeus.baseddata.mybatis.model.based;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HsBasicCountyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsBasicCountyCriteria() {
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

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(Long value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(Long value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(Long value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(Long value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<Long> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<Long> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(Long value1, Long value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNull() {
            addCriterion("county_code is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("county_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(String value) {
            addCriterion("county_code =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(String value) {
            addCriterion("county_code <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(String value) {
            addCriterion("county_code >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("county_code >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(String value) {
            addCriterion("county_code <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("county_code <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLike(String value) {
            addCriterion("county_code like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotLike(String value) {
            addCriterion("county_code not like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(List<String> values) {
            addCriterion("county_code in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(List<String> values) {
            addCriterion("county_code not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(String value1, String value2) {
            addCriterion("county_code between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(String value1, String value2) {
            addCriterion("county_code not between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNull() {
            addCriterion("county_name is null");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNotNull() {
            addCriterion("county_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountyNameEqualTo(String value) {
            addCriterion("county_name =", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotEqualTo(String value) {
            addCriterion("county_name <>", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThan(String value) {
            addCriterion("county_name >", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("county_name >=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThan(String value) {
            addCriterion("county_name <", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThanOrEqualTo(String value) {
            addCriterion("county_name <=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLike(String value) {
            addCriterion("county_name like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotLike(String value) {
            addCriterion("county_name not like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIn(List<String> values) {
            addCriterion("county_name in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotIn(List<String> values) {
            addCriterion("county_name not in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameBetween(String value1, String value2) {
            addCriterion("county_name between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotBetween(String value1, String value2) {
            addCriterion("county_name not between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinIsNull() {
            addCriterion("county_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinIsNotNull() {
            addCriterion("county_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinEqualTo(String value) {
            addCriterion("county_pinyin =", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinNotEqualTo(String value) {
            addCriterion("county_pinyin <>", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinGreaterThan(String value) {
            addCriterion("county_pinyin >", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("county_pinyin >=", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinLessThan(String value) {
            addCriterion("county_pinyin <", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinLessThanOrEqualTo(String value) {
            addCriterion("county_pinyin <=", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinLike(String value) {
            addCriterion("county_pinyin like", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinNotLike(String value) {
            addCriterion("county_pinyin not like", value, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinIn(List<String> values) {
            addCriterion("county_pinyin in", values, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinNotIn(List<String> values) {
            addCriterion("county_pinyin not in", values, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinBetween(String value1, String value2) {
            addCriterion("county_pinyin between", value1, value2, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyPinyinNotBetween(String value1, String value2) {
            addCriterion("county_pinyin not between", value1, value2, "countyPinyin");
            return (Criteria) this;
        }

        public Criteria andCountyOrderIsNull() {
            addCriterion("county_order is null");
            return (Criteria) this;
        }

        public Criteria andCountyOrderIsNotNull() {
            addCriterion("county_order is not null");
            return (Criteria) this;
        }

        public Criteria andCountyOrderEqualTo(Integer value) {
            addCriterion("county_order =", value, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderNotEqualTo(Integer value) {
            addCriterion("county_order <>", value, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderGreaterThan(Integer value) {
            addCriterion("county_order >", value, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("county_order >=", value, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderLessThan(Integer value) {
            addCriterion("county_order <", value, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderLessThanOrEqualTo(Integer value) {
            addCriterion("county_order <=", value, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderIn(List<Integer> values) {
            addCriterion("county_order in", values, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderNotIn(List<Integer> values) {
            addCriterion("county_order not in", values, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderBetween(Integer value1, Integer value2) {
            addCriterion("county_order between", value1, value2, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCountyOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("county_order not between", value1, value2, "countyOrder");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
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

        public Criteria andOverallFlagIsNull() {
            addCriterion("overall_flag is null");
            return (Criteria) this;
        }

        public Criteria andOverallFlagIsNotNull() {
            addCriterion("overall_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOverallFlagEqualTo(Integer value) {
            addCriterion("overall_flag =", value, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagNotEqualTo(Integer value) {
            addCriterion("overall_flag <>", value, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagGreaterThan(Integer value) {
            addCriterion("overall_flag >", value, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("overall_flag >=", value, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagLessThan(Integer value) {
            addCriterion("overall_flag <", value, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagLessThanOrEqualTo(Integer value) {
            addCriterion("overall_flag <=", value, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagIn(List<Integer> values) {
            addCriterion("overall_flag in", values, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagNotIn(List<Integer> values) {
            addCriterion("overall_flag not in", values, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagBetween(Integer value1, Integer value2) {
            addCriterion("overall_flag between", value1, value2, "overallFlag");
            return (Criteria) this;
        }

        public Criteria andOverallFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("overall_flag not between", value1, value2, "overallFlag");
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