package com.neu.his.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RegistLevelExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public RegistLevelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
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

        public Criteria andRegistLevelIdIsNull() {
            addCriterion("regist_level_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdIsNotNull() {
            addCriterion("regist_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdEqualTo(Boolean value) {
            addCriterion("regist_level_id =", value, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdNotEqualTo(Boolean value) {
            addCriterion("regist_level_id <>", value, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdGreaterThan(Boolean value) {
            addCriterion("regist_level_id >", value, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("regist_level_id >=", value, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdLessThan(Boolean value) {
            addCriterion("regist_level_id <", value, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdLessThanOrEqualTo(Boolean value) {
            addCriterion("regist_level_id <=", value, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdIn(List<Boolean> values) {
            addCriterion("regist_level_id in", values, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdNotIn(List<Boolean> values) {
            addCriterion("regist_level_id not in", values, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdBetween(Boolean value1, Boolean value2) {
            addCriterion("regist_level_id between", value1, value2, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelIdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("regist_level_id not between", value1, value2, "registLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeIsNull() {
            addCriterion("regist_level_code is null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeIsNotNull() {
            addCriterion("regist_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeEqualTo(String value) {
            addCriterion("regist_level_code =", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeNotEqualTo(String value) {
            addCriterion("regist_level_code <>", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeGreaterThan(String value) {
            addCriterion("regist_level_code >", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("regist_level_code >=", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeLessThan(String value) {
            addCriterion("regist_level_code <", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("regist_level_code <=", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeLike(String value) {
            addCriterion("regist_level_code like", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeNotLike(String value) {
            addCriterion("regist_level_code not like", value, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeIn(List<String> values) {
            addCriterion("regist_level_code in", values, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeNotIn(List<String> values) {
            addCriterion("regist_level_code not in", values, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeBetween(String value1, String value2) {
            addCriterion("regist_level_code between", value1, value2, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelCodeNotBetween(String value1, String value2) {
            addCriterion("regist_level_code not between", value1, value2, "registLevelCode");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameIsNull() {
            addCriterion("regist_level_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameIsNotNull() {
            addCriterion("regist_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameEqualTo(String value) {
            addCriterion("regist_level_name =", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameNotEqualTo(String value) {
            addCriterion("regist_level_name <>", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameGreaterThan(String value) {
            addCriterion("regist_level_name >", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("regist_level_name >=", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameLessThan(String value) {
            addCriterion("regist_level_name <", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameLessThanOrEqualTo(String value) {
            addCriterion("regist_level_name <=", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameLike(String value) {
            addCriterion("regist_level_name like", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameNotLike(String value) {
            addCriterion("regist_level_name not like", value, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameIn(List<String> values) {
            addCriterion("regist_level_name in", values, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameNotIn(List<String> values) {
            addCriterion("regist_level_name not in", values, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameBetween(String value1, String value2) {
            addCriterion("regist_level_name between", value1, value2, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelNameNotBetween(String value1, String value2) {
            addCriterion("regist_level_name not between", value1, value2, "registLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqIsNull() {
            addCriterion("regist_level_seq is null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqIsNotNull() {
            addCriterion("regist_level_seq is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqEqualTo(String value) {
            addCriterion("regist_level_seq =", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqNotEqualTo(String value) {
            addCriterion("regist_level_seq <>", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqGreaterThan(String value) {
            addCriterion("regist_level_seq >", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqGreaterThanOrEqualTo(String value) {
            addCriterion("regist_level_seq >=", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqLessThan(String value) {
            addCriterion("regist_level_seq <", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqLessThanOrEqualTo(String value) {
            addCriterion("regist_level_seq <=", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqLike(String value) {
            addCriterion("regist_level_seq like", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqNotLike(String value) {
            addCriterion("regist_level_seq not like", value, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqIn(List<String> values) {
            addCriterion("regist_level_seq in", values, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqNotIn(List<String> values) {
            addCriterion("regist_level_seq not in", values, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqBetween(String value1, String value2) {
            addCriterion("regist_level_seq between", value1, value2, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelSeqNotBetween(String value1, String value2) {
            addCriterion("regist_level_seq not between", value1, value2, "registLevelSeq");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceIsNull() {
            addCriterion("regist_level_price is null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceIsNotNull() {
            addCriterion("regist_level_price is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceEqualTo(Byte value) {
            addCriterion("regist_level_price =", value, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceNotEqualTo(Byte value) {
            addCriterion("regist_level_price <>", value, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceGreaterThan(Byte value) {
            addCriterion("regist_level_price >", value, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceGreaterThanOrEqualTo(Byte value) {
            addCriterion("regist_level_price >=", value, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceLessThan(Byte value) {
            addCriterion("regist_level_price <", value, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceLessThanOrEqualTo(Byte value) {
            addCriterion("regist_level_price <=", value, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceIn(List<Byte> values) {
            addCriterion("regist_level_price in", values, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceNotIn(List<Byte> values) {
            addCriterion("regist_level_price not in", values, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceBetween(Byte value1, Byte value2) {
            addCriterion("regist_level_price between", value1, value2, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelPriceNotBetween(Byte value1, Byte value2) {
            addCriterion("regist_level_price not between", value1, value2, "registLevelPrice");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitIsNull() {
            addCriterion("regist_level_limit is null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitIsNotNull() {
            addCriterion("regist_level_limit is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitEqualTo(Byte value) {
            addCriterion("regist_level_limit =", value, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitNotEqualTo(Byte value) {
            addCriterion("regist_level_limit <>", value, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitGreaterThan(Byte value) {
            addCriterion("regist_level_limit >", value, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("regist_level_limit >=", value, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitLessThan(Byte value) {
            addCriterion("regist_level_limit <", value, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitLessThanOrEqualTo(Byte value) {
            addCriterion("regist_level_limit <=", value, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitIn(List<Byte> values) {
            addCriterion("regist_level_limit in", values, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitNotIn(List<Byte> values) {
            addCriterion("regist_level_limit not in", values, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitBetween(Byte value1, Byte value2) {
            addCriterion("regist_level_limit between", value1, value2, "registLevelLimit");
            return (Criteria) this;
        }

        public Criteria andRegistLevelLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("regist_level_limit not between", value1, value2, "registLevelLimit");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regist_level
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 22 23:45:36 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regist_level
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
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