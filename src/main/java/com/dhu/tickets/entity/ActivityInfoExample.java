package com.dhu.tickets.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityInfoExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityLocationIsNull() {
            addCriterion("activity_location is null");
            return (Criteria) this;
        }

        public Criteria andActivityLocationIsNotNull() {
            addCriterion("activity_location is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLocationEqualTo(String value) {
            addCriterion("activity_location =", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationNotEqualTo(String value) {
            addCriterion("activity_location <>", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationGreaterThan(String value) {
            addCriterion("activity_location >", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationGreaterThanOrEqualTo(String value) {
            addCriterion("activity_location >=", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationLessThan(String value) {
            addCriterion("activity_location <", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationLessThanOrEqualTo(String value) {
            addCriterion("activity_location <=", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationLike(String value) {
            addCriterion("activity_location like", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationNotLike(String value) {
            addCriterion("activity_location not like", value, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationIn(List<String> values) {
            addCriterion("activity_location in", values, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationNotIn(List<String> values) {
            addCriterion("activity_location not in", values, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationBetween(String value1, String value2) {
            addCriterion("activity_location between", value1, value2, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityLocationNotBetween(String value1, String value2) {
            addCriterion("activity_location not between", value1, value2, "activityLocation");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionIsNull() {
            addCriterion("activity_introduction is null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionIsNotNull() {
            addCriterion("activity_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionEqualTo(String value) {
            addCriterion("activity_introduction =", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotEqualTo(String value) {
            addCriterion("activity_introduction <>", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionGreaterThan(String value) {
            addCriterion("activity_introduction >", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("activity_introduction >=", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionLessThan(String value) {
            addCriterion("activity_introduction <", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionLessThanOrEqualTo(String value) {
            addCriterion("activity_introduction <=", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionLike(String value) {
            addCriterion("activity_introduction like", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotLike(String value) {
            addCriterion("activity_introduction not like", value, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionIn(List<String> values) {
            addCriterion("activity_introduction in", values, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotIn(List<String> values) {
            addCriterion("activity_introduction not in", values, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionBetween(String value1, String value2) {
            addCriterion("activity_introduction between", value1, value2, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andActivityIntroductionNotBetween(String value1, String value2) {
            addCriterion("activity_introduction not between", value1, value2, "activityIntroduction");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersIsNull() {
            addCriterion("max_numbers is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersIsNotNull() {
            addCriterion("max_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersEqualTo(Integer value) {
            addCriterion("max_numbers =", value, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersNotEqualTo(Integer value) {
            addCriterion("max_numbers <>", value, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersGreaterThan(Integer value) {
            addCriterion("max_numbers >", value, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_numbers >=", value, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersLessThan(Integer value) {
            addCriterion("max_numbers <", value, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("max_numbers <=", value, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersIn(List<Integer> values) {
            addCriterion("max_numbers in", values, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersNotIn(List<Integer> values) {
            addCriterion("max_numbers not in", values, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersBetween(Integer value1, Integer value2) {
            addCriterion("max_numbers between", value1, value2, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andMaxNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("max_numbers not between", value1, value2, "maxNumbers");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNull() {
            addCriterion("activity_img is null");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNotNull() {
            addCriterion("activity_img is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImgEqualTo(String value) {
            addCriterion("activity_img =", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotEqualTo(String value) {
            addCriterion("activity_img <>", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThan(String value) {
            addCriterion("activity_img >", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThanOrEqualTo(String value) {
            addCriterion("activity_img >=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThan(String value) {
            addCriterion("activity_img <", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThanOrEqualTo(String value) {
            addCriterion("activity_img <=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLike(String value) {
            addCriterion("activity_img like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotLike(String value) {
            addCriterion("activity_img not like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgIn(List<String> values) {
            addCriterion("activity_img in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotIn(List<String> values) {
            addCriterion("activity_img not in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgBetween(String value1, String value2) {
            addCriterion("activity_img between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotBetween(String value1, String value2) {
            addCriterion("activity_img not between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andNowNumbersIsNull() {
            addCriterion("now_numbers is null");
            return (Criteria) this;
        }

        public Criteria andNowNumbersIsNotNull() {
            addCriterion("now_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNowNumbersEqualTo(Integer value) {
            addCriterion("now_numbers =", value, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersNotEqualTo(Integer value) {
            addCriterion("now_numbers <>", value, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersGreaterThan(Integer value) {
            addCriterion("now_numbers >", value, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_numbers >=", value, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersLessThan(Integer value) {
            addCriterion("now_numbers <", value, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("now_numbers <=", value, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersIn(List<Integer> values) {
            addCriterion("now_numbers in", values, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersNotIn(List<Integer> values) {
            addCriterion("now_numbers not in", values, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersBetween(Integer value1, Integer value2) {
            addCriterion("now_numbers between", value1, value2, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andNowNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("now_numbers not between", value1, value2, "nowNumbers");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("activity_status is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("activity_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(Integer value) {
            addCriterion("activity_status =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(Integer value) {
            addCriterion("activity_status <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(Integer value) {
            addCriterion("activity_status >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_status >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(Integer value) {
            addCriterion("activity_status <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("activity_status <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<Integer> values) {
            addCriterion("activity_status in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<Integer> values) {
            addCriterion("activity_status not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(Integer value1, Integer value2) {
            addCriterion("activity_status between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_status not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIfLimitIsNull() {
            addCriterion("if_limit is null");
            return (Criteria) this;
        }

        public Criteria andIfLimitIsNotNull() {
            addCriterion("if_limit is not null");
            return (Criteria) this;
        }

        public Criteria andIfLimitEqualTo(Integer value) {
            addCriterion("if_limit =", value, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitNotEqualTo(Integer value) {
            addCriterion("if_limit <>", value, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitGreaterThan(Integer value) {
            addCriterion("if_limit >", value, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_limit >=", value, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitLessThan(Integer value) {
            addCriterion("if_limit <", value, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitLessThanOrEqualTo(Integer value) {
            addCriterion("if_limit <=", value, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitIn(List<Integer> values) {
            addCriterion("if_limit in", values, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitNotIn(List<Integer> values) {
            addCriterion("if_limit not in", values, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitBetween(Integer value1, Integer value2) {
            addCriterion("if_limit between", value1, value2, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andIfLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("if_limit not between", value1, value2, "ifLimit");
            return (Criteria) this;
        }

        public Criteria andAssocIdIsNull() {
            addCriterion("assoc_id is null");
            return (Criteria) this;
        }

        public Criteria andAssocIdIsNotNull() {
            addCriterion("assoc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssocIdEqualTo(Integer value) {
            addCriterion("assoc_id =", value, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdNotEqualTo(Integer value) {
            addCriterion("assoc_id <>", value, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdGreaterThan(Integer value) {
            addCriterion("assoc_id >", value, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assoc_id >=", value, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdLessThan(Integer value) {
            addCriterion("assoc_id <", value, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdLessThanOrEqualTo(Integer value) {
            addCriterion("assoc_id <=", value, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdIn(List<Integer> values) {
            addCriterion("assoc_id in", values, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdNotIn(List<Integer> values) {
            addCriterion("assoc_id not in", values, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdBetween(Integer value1, Integer value2) {
            addCriterion("assoc_id between", value1, value2, "assocId");
            return (Criteria) this;
        }

        public Criteria andAssocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assoc_id not between", value1, value2, "assocId");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIsNull() {
            addCriterion("if_delete is null");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIsNotNull() {
            addCriterion("if_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIfDeleteEqualTo(Integer value) {
            addCriterion("if_delete =", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotEqualTo(Integer value) {
            addCriterion("if_delete <>", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThan(Integer value) {
            addCriterion("if_delete >", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_delete >=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThan(Integer value) {
            addCriterion("if_delete <", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("if_delete <=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIn(List<Integer> values) {
            addCriterion("if_delete in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotIn(List<Integer> values) {
            addCriterion("if_delete not in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteBetween(Integer value1, Integer value2) {
            addCriterion("if_delete between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("if_delete not between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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