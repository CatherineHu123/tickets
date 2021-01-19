package com.dhu.tickets.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExhibitionVoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitionVoteExample() {
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

        public Criteria andExhibitionVoteIdIsNull() {
            addCriterion("exhibition_vote_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdIsNotNull() {
            addCriterion("exhibition_vote_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdEqualTo(Integer value) {
            addCriterion("exhibition_vote_id =", value, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdNotEqualTo(Integer value) {
            addCriterion("exhibition_vote_id <>", value, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdGreaterThan(Integer value) {
            addCriterion("exhibition_vote_id >", value, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibition_vote_id >=", value, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdLessThan(Integer value) {
            addCriterion("exhibition_vote_id <", value, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibition_vote_id <=", value, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdIn(List<Integer> values) {
            addCriterion("exhibition_vote_id in", values, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdNotIn(List<Integer> values) {
            addCriterion("exhibition_vote_id not in", values, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibition_vote_id between", value1, value2, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionVoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibition_vote_id not between", value1, value2, "exhibitionVoteId");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameIsNull() {
            addCriterion("exhibition_name is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameIsNotNull() {
            addCriterion("exhibition_name is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameEqualTo(String value) {
            addCriterion("exhibition_name =", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameNotEqualTo(String value) {
            addCriterion("exhibition_name <>", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameGreaterThan(String value) {
            addCriterion("exhibition_name >", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition_name >=", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameLessThan(String value) {
            addCriterion("exhibition_name <", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameLessThanOrEqualTo(String value) {
            addCriterion("exhibition_name <=", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameLike(String value) {
            addCriterion("exhibition_name like", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameNotLike(String value) {
            addCriterion("exhibition_name not like", value, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameIn(List<String> values) {
            addCriterion("exhibition_name in", values, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameNotIn(List<String> values) {
            addCriterion("exhibition_name not in", values, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameBetween(String value1, String value2) {
            addCriterion("exhibition_name between", value1, value2, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionNameNotBetween(String value1, String value2) {
            addCriterion("exhibition_name not between", value1, value2, "exhibitionName");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextIsNull() {
            addCriterion("exhibition_text is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextIsNotNull() {
            addCriterion("exhibition_text is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextEqualTo(String value) {
            addCriterion("exhibition_text =", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextNotEqualTo(String value) {
            addCriterion("exhibition_text <>", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextGreaterThan(String value) {
            addCriterion("exhibition_text >", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition_text >=", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextLessThan(String value) {
            addCriterion("exhibition_text <", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextLessThanOrEqualTo(String value) {
            addCriterion("exhibition_text <=", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextLike(String value) {
            addCriterion("exhibition_text like", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextNotLike(String value) {
            addCriterion("exhibition_text not like", value, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextIn(List<String> values) {
            addCriterion("exhibition_text in", values, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextNotIn(List<String> values) {
            addCriterion("exhibition_text not in", values, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextBetween(String value1, String value2) {
            addCriterion("exhibition_text between", value1, value2, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionTextNotBetween(String value1, String value2) {
            addCriterion("exhibition_text not between", value1, value2, "exhibitionText");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgIsNull() {
            addCriterion("exhibition_img is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgIsNotNull() {
            addCriterion("exhibition_img is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgEqualTo(String value) {
            addCriterion("exhibition_img =", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgNotEqualTo(String value) {
            addCriterion("exhibition_img <>", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgGreaterThan(String value) {
            addCriterion("exhibition_img >", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgGreaterThanOrEqualTo(String value) {
            addCriterion("exhibition_img >=", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgLessThan(String value) {
            addCriterion("exhibition_img <", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgLessThanOrEqualTo(String value) {
            addCriterion("exhibition_img <=", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgLike(String value) {
            addCriterion("exhibition_img like", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgNotLike(String value) {
            addCriterion("exhibition_img not like", value, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgIn(List<String> values) {
            addCriterion("exhibition_img in", values, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgNotIn(List<String> values) {
            addCriterion("exhibition_img not in", values, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgBetween(String value1, String value2) {
            addCriterion("exhibition_img between", value1, value2, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andExhibitionImgNotBetween(String value1, String value2) {
            addCriterion("exhibition_img not between", value1, value2, "exhibitionImg");
            return (Criteria) this;
        }

        public Criteria andVoteNumberIsNull() {
            addCriterion("vote_number is null");
            return (Criteria) this;
        }

        public Criteria andVoteNumberIsNotNull() {
            addCriterion("vote_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoteNumberEqualTo(Integer value) {
            addCriterion("vote_number =", value, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberNotEqualTo(Integer value) {
            addCriterion("vote_number <>", value, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberGreaterThan(Integer value) {
            addCriterion("vote_number >", value, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_number >=", value, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberLessThan(Integer value) {
            addCriterion("vote_number <", value, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberLessThanOrEqualTo(Integer value) {
            addCriterion("vote_number <=", value, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberIn(List<Integer> values) {
            addCriterion("vote_number in", values, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberNotIn(List<Integer> values) {
            addCriterion("vote_number not in", values, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberBetween(Integer value1, Integer value2) {
            addCriterion("vote_number between", value1, value2, "voteNumber");
            return (Criteria) this;
        }

        public Criteria andVoteNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_number not between", value1, value2, "voteNumber");
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