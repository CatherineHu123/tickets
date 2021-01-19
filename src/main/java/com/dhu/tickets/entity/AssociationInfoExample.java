package com.dhu.tickets.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssociationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssociationInfoExample() {
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

        public Criteria andAssocTextIsNull() {
            addCriterion("assoc_text is null");
            return (Criteria) this;
        }

        public Criteria andAssocTextIsNotNull() {
            addCriterion("assoc_text is not null");
            return (Criteria) this;
        }

        public Criteria andAssocTextEqualTo(String value) {
            addCriterion("assoc_text =", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextNotEqualTo(String value) {
            addCriterion("assoc_text <>", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextGreaterThan(String value) {
            addCriterion("assoc_text >", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextGreaterThanOrEqualTo(String value) {
            addCriterion("assoc_text >=", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextLessThan(String value) {
            addCriterion("assoc_text <", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextLessThanOrEqualTo(String value) {
            addCriterion("assoc_text <=", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextLike(String value) {
            addCriterion("assoc_text like", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextNotLike(String value) {
            addCriterion("assoc_text not like", value, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextIn(List<String> values) {
            addCriterion("assoc_text in", values, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextNotIn(List<String> values) {
            addCriterion("assoc_text not in", values, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextBetween(String value1, String value2) {
            addCriterion("assoc_text between", value1, value2, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocTextNotBetween(String value1, String value2) {
            addCriterion("assoc_text not between", value1, value2, "assocText");
            return (Criteria) this;
        }

        public Criteria andAssocImgIsNull() {
            addCriterion("assoc_img is null");
            return (Criteria) this;
        }

        public Criteria andAssocImgIsNotNull() {
            addCriterion("assoc_img is not null");
            return (Criteria) this;
        }

        public Criteria andAssocImgEqualTo(String value) {
            addCriterion("assoc_img =", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgNotEqualTo(String value) {
            addCriterion("assoc_img <>", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgGreaterThan(String value) {
            addCriterion("assoc_img >", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgGreaterThanOrEqualTo(String value) {
            addCriterion("assoc_img >=", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgLessThan(String value) {
            addCriterion("assoc_img <", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgLessThanOrEqualTo(String value) {
            addCriterion("assoc_img <=", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgLike(String value) {
            addCriterion("assoc_img like", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgNotLike(String value) {
            addCriterion("assoc_img not like", value, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgIn(List<String> values) {
            addCriterion("assoc_img in", values, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgNotIn(List<String> values) {
            addCriterion("assoc_img not in", values, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgBetween(String value1, String value2) {
            addCriterion("assoc_img between", value1, value2, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocImgNotBetween(String value1, String value2) {
            addCriterion("assoc_img not between", value1, value2, "assocImg");
            return (Criteria) this;
        }

        public Criteria andAssocContactIsNull() {
            addCriterion("assoc_contact is null");
            return (Criteria) this;
        }

        public Criteria andAssocContactIsNotNull() {
            addCriterion("assoc_contact is not null");
            return (Criteria) this;
        }

        public Criteria andAssocContactEqualTo(String value) {
            addCriterion("assoc_contact =", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactNotEqualTo(String value) {
            addCriterion("assoc_contact <>", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactGreaterThan(String value) {
            addCriterion("assoc_contact >", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactGreaterThanOrEqualTo(String value) {
            addCriterion("assoc_contact >=", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactLessThan(String value) {
            addCriterion("assoc_contact <", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactLessThanOrEqualTo(String value) {
            addCriterion("assoc_contact <=", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactLike(String value) {
            addCriterion("assoc_contact like", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactNotLike(String value) {
            addCriterion("assoc_contact not like", value, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactIn(List<String> values) {
            addCriterion("assoc_contact in", values, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactNotIn(List<String> values) {
            addCriterion("assoc_contact not in", values, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactBetween(String value1, String value2) {
            addCriterion("assoc_contact between", value1, value2, "assocContact");
            return (Criteria) this;
        }

        public Criteria andAssocContactNotBetween(String value1, String value2) {
            addCriterion("assoc_contact not between", value1, value2, "assocContact");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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