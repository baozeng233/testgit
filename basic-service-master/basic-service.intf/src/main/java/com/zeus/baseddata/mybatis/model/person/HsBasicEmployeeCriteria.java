package com.zeus.baseddata.mybatis.model.person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HsBasicEmployeeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsBasicEmployeeCriteria() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Long value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Long value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Long value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Long value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Long> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Long> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNull() {
            addCriterion("employee_code is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("employee_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeEqualTo(String value) {
            addCriterion("employee_code =", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotEqualTo(String value) {
            addCriterion("employee_code <>", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThan(String value) {
            addCriterion("employee_code >", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_code >=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThan(String value) {
            addCriterion("employee_code <", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThanOrEqualTo(String value) {
            addCriterion("employee_code <=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLike(String value) {
            addCriterion("employee_code like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotLike(String value) {
            addCriterion("employee_code not like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIn(List<String> values) {
            addCriterion("employee_code in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotIn(List<String> values) {
            addCriterion("employee_code not in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeBetween(String value1, String value2) {
            addCriterion("employee_code between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotBetween(String value1, String value2) {
            addCriterion("employee_code not between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinIsNull() {
            addCriterion("employee_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinIsNotNull() {
            addCriterion("employee_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinEqualTo(String value) {
            addCriterion("employee_pinyin =", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinNotEqualTo(String value) {
            addCriterion("employee_pinyin <>", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinGreaterThan(String value) {
            addCriterion("employee_pinyin >", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("employee_pinyin >=", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinLessThan(String value) {
            addCriterion("employee_pinyin <", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinLessThanOrEqualTo(String value) {
            addCriterion("employee_pinyin <=", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinLike(String value) {
            addCriterion("employee_pinyin like", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinNotLike(String value) {
            addCriterion("employee_pinyin not like", value, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinIn(List<String> values) {
            addCriterion("employee_pinyin in", values, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinNotIn(List<String> values) {
            addCriterion("employee_pinyin not in", values, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinBetween(String value1, String value2) {
            addCriterion("employee_pinyin between", value1, value2, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeePinyinNotBetween(String value1, String value2) {
            addCriterion("employee_pinyin not between", value1, value2, "employeePinyin");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderIsNull() {
            addCriterion("employee_order is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderIsNotNull() {
            addCriterion("employee_order is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderEqualTo(Integer value) {
            addCriterion("employee_order =", value, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderNotEqualTo(Integer value) {
            addCriterion("employee_order <>", value, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderGreaterThan(Integer value) {
            addCriterion("employee_order >", value, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_order >=", value, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderLessThan(Integer value) {
            addCriterion("employee_order <", value, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderLessThanOrEqualTo(Integer value) {
            addCriterion("employee_order <=", value, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderIn(List<Integer> values) {
            addCriterion("employee_order in", values, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderNotIn(List<Integer> values) {
            addCriterion("employee_order not in", values, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderBetween(Integer value1, Integer value2) {
            addCriterion("employee_order between", value1, value2, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andEmployeeOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_order not between", value1, value2, "employeeOrder");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Long value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Long value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Long value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Long value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Long> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Long> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Long value1, Long value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
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

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsIsNull() {
            addCriterion("phone_sms is null");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsIsNotNull() {
            addCriterion("phone_sms is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsEqualTo(String value) {
            addCriterion("phone_sms =", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsNotEqualTo(String value) {
            addCriterion("phone_sms <>", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsGreaterThan(String value) {
            addCriterion("phone_sms >", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsGreaterThanOrEqualTo(String value) {
            addCriterion("phone_sms >=", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsLessThan(String value) {
            addCriterion("phone_sms <", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsLessThanOrEqualTo(String value) {
            addCriterion("phone_sms <=", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsLike(String value) {
            addCriterion("phone_sms like", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsNotLike(String value) {
            addCriterion("phone_sms not like", value, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsIn(List<String> values) {
            addCriterion("phone_sms in", values, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsNotIn(List<String> values) {
            addCriterion("phone_sms not in", values, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsBetween(String value1, String value2) {
            addCriterion("phone_sms between", value1, value2, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andPhoneSmsNotBetween(String value1, String value2) {
            addCriterion("phone_sms not between", value1, value2, "phoneSms");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkIsNull() {
            addCriterion("self_remark is null");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkIsNotNull() {
            addCriterion("self_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkEqualTo(String value) {
            addCriterion("self_remark =", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkNotEqualTo(String value) {
            addCriterion("self_remark <>", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkGreaterThan(String value) {
            addCriterion("self_remark >", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("self_remark >=", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkLessThan(String value) {
            addCriterion("self_remark <", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkLessThanOrEqualTo(String value) {
            addCriterion("self_remark <=", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkLike(String value) {
            addCriterion("self_remark like", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkNotLike(String value) {
            addCriterion("self_remark not like", value, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkIn(List<String> values) {
            addCriterion("self_remark in", values, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkNotIn(List<String> values) {
            addCriterion("self_remark not in", values, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkBetween(String value1, String value2) {
            addCriterion("self_remark between", value1, value2, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andSelfRemarkNotBetween(String value1, String value2) {
            addCriterion("self_remark not between", value1, value2, "selfRemark");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("is_use is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("is_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Integer value) {
            addCriterion("is_use =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Integer value) {
            addCriterion("is_use <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Integer value) {
            addCriterion("is_use >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Integer value) {
            addCriterion("is_use <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Integer value) {
            addCriterion("is_use <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion("is_use in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion("is_use not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Integer value1, Integer value2) {
            addCriterion("is_use between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andBasicSalarIsNull() {
            addCriterion("basic_salar is null");
            return (Criteria) this;
        }

        public Criteria andBasicSalarIsNotNull() {
            addCriterion("basic_salar is not null");
            return (Criteria) this;
        }

        public Criteria andBasicSalarEqualTo(BigDecimal value) {
            addCriterion("basic_salar =", value, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarNotEqualTo(BigDecimal value) {
            addCriterion("basic_salar <>", value, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarGreaterThan(BigDecimal value) {
            addCriterion("basic_salar >", value, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("basic_salar >=", value, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarLessThan(BigDecimal value) {
            addCriterion("basic_salar <", value, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("basic_salar <=", value, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarIn(List<BigDecimal> values) {
            addCriterion("basic_salar in", values, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarNotIn(List<BigDecimal> values) {
            addCriterion("basic_salar not in", values, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basic_salar between", value1, value2, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andBasicSalarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("basic_salar not between", value1, value2, "basicSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarIsNull() {
            addCriterion("add_salar is null");
            return (Criteria) this;
        }

        public Criteria andAddSalarIsNotNull() {
            addCriterion("add_salar is not null");
            return (Criteria) this;
        }

        public Criteria andAddSalarEqualTo(BigDecimal value) {
            addCriterion("add_salar =", value, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarNotEqualTo(BigDecimal value) {
            addCriterion("add_salar <>", value, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarGreaterThan(BigDecimal value) {
            addCriterion("add_salar >", value, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("add_salar >=", value, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarLessThan(BigDecimal value) {
            addCriterion("add_salar <", value, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("add_salar <=", value, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarIn(List<BigDecimal> values) {
            addCriterion("add_salar in", values, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarNotIn(List<BigDecimal> values) {
            addCriterion("add_salar not in", values, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_salar between", value1, value2, "addSalar");
            return (Criteria) this;
        }

        public Criteria andAddSalarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("add_salar not between", value1, value2, "addSalar");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountIsNull() {
            addCriterion("limit_sum_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountIsNotNull() {
            addCriterion("limit_sum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountEqualTo(BigDecimal value) {
            addCriterion("limit_sum_amount =", value, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_sum_amount <>", value, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_sum_amount >", value, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_sum_amount >=", value, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountLessThan(BigDecimal value) {
            addCriterion("limit_sum_amount <", value, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_sum_amount <=", value, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountIn(List<BigDecimal> values) {
            addCriterion("limit_sum_amount in", values, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_sum_amount not in", values, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_sum_amount between", value1, value2, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitSumAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_sum_amount not between", value1, value2, "limitSumAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountIsNull() {
            addCriterion("limit_one_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountIsNotNull() {
            addCriterion("limit_one_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountEqualTo(BigDecimal value) {
            addCriterion("limit_one_amount =", value, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_one_amount <>", value, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_one_amount >", value, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_one_amount >=", value, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountLessThan(BigDecimal value) {
            addCriterion("limit_one_amount <", value, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_one_amount <=", value, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountIn(List<BigDecimal> values) {
            addCriterion("limit_one_amount in", values, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_one_amount not in", values, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_one_amount between", value1, value2, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andLimitOneAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_one_amount not between", value1, value2, "limitOneAmount");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdIsNull() {
            addCriterion("transport_tool_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdIsNotNull() {
            addCriterion("transport_tool_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdEqualTo(Integer value) {
            addCriterion("transport_tool_id =", value, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdNotEqualTo(Integer value) {
            addCriterion("transport_tool_id <>", value, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdGreaterThan(Integer value) {
            addCriterion("transport_tool_id >", value, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_tool_id >=", value, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdLessThan(Integer value) {
            addCriterion("transport_tool_id <", value, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdLessThanOrEqualTo(Integer value) {
            addCriterion("transport_tool_id <=", value, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdIn(List<Integer> values) {
            addCriterion("transport_tool_id in", values, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdNotIn(List<Integer> values) {
            addCriterion("transport_tool_id not in", values, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdBetween(Integer value1, Integer value2) {
            addCriterion("transport_tool_id between", value1, value2, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andTransportToolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_tool_id not between", value1, value2, "transportToolId");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNull() {
            addCriterion("part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Long value) {
            addCriterion("part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Long value) {
            addCriterion("part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Long value) {
            addCriterion("part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Long value) {
            addCriterion("part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Long value) {
            addCriterion("part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Long> values) {
            addCriterion("part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Long> values) {
            addCriterion("part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Long value1, Long value2) {
            addCriterion("part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Long value1, Long value2) {
            addCriterion("part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIsNull() {
            addCriterion("job_remark is null");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIsNotNull() {
            addCriterion("job_remark is not null");
            return (Criteria) this;
        }

        public Criteria andJobRemarkEqualTo(String value) {
            addCriterion("job_remark =", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotEqualTo(String value) {
            addCriterion("job_remark <>", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkGreaterThan(String value) {
            addCriterion("job_remark >", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("job_remark >=", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLessThan(String value) {
            addCriterion("job_remark <", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLessThanOrEqualTo(String value) {
            addCriterion("job_remark <=", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLike(String value) {
            addCriterion("job_remark like", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotLike(String value) {
            addCriterion("job_remark not like", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIn(List<String> values) {
            addCriterion("job_remark in", values, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotIn(List<String> values) {
            addCriterion("job_remark not in", values, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkBetween(String value1, String value2) {
            addCriterion("job_remark between", value1, value2, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotBetween(String value1, String value2) {
            addCriterion("job_remark not between", value1, value2, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeIsNull() {
            addCriterion("driver_license_type is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeIsNotNull() {
            addCriterion("driver_license_type is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeEqualTo(String value) {
            addCriterion("driver_license_type =", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotEqualTo(String value) {
            addCriterion("driver_license_type <>", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeGreaterThan(String value) {
            addCriterion("driver_license_type >", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("driver_license_type >=", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeLessThan(String value) {
            addCriterion("driver_license_type <", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("driver_license_type <=", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeLike(String value) {
            addCriterion("driver_license_type like", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotLike(String value) {
            addCriterion("driver_license_type not like", value, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeIn(List<String> values) {
            addCriterion("driver_license_type in", values, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotIn(List<String> values) {
            addCriterion("driver_license_type not in", values, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeBetween(String value1, String value2) {
            addCriterion("driver_license_type between", value1, value2, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("driver_license_type not between", value1, value2, "driverLicenseType");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdIsNull() {
            addCriterion("bank_account_id is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdIsNotNull() {
            addCriterion("bank_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdEqualTo(Integer value) {
            addCriterion("bank_account_id =", value, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdNotEqualTo(Integer value) {
            addCriterion("bank_account_id <>", value, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdGreaterThan(Integer value) {
            addCriterion("bank_account_id >", value, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_account_id >=", value, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdLessThan(Integer value) {
            addCriterion("bank_account_id <", value, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_account_id <=", value, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdIn(List<Integer> values) {
            addCriterion("bank_account_id in", values, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdNotIn(List<Integer> values) {
            addCriterion("bank_account_id not in", values, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_id between", value1, value2, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_account_id not between", value1, value2, "bankAccountId");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThan(String value) {
            addCriterion("bank_account_no <", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLike(String value) {
            addCriterion("bank_account_no like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bankAccountNo");
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

        public Criteria andEmployeeNoIsNull() {
            addCriterion("employee_no is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("employee_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(String value) {
            addCriterion("employee_no =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(String value) {
            addCriterion("employee_no <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(String value) {
            addCriterion("employee_no >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_no >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(String value) {
            addCriterion("employee_no <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
            addCriterion("employee_no <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLike(String value) {
            addCriterion("employee_no like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotLike(String value) {
            addCriterion("employee_no not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<String> values) {
            addCriterion("employee_no in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<String> values) {
            addCriterion("employee_no not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(String value1, String value2) {
            addCriterion("employee_no between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(String value1, String value2) {
            addCriterion("employee_no not between", value1, value2, "employeeNo");
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