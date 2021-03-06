package com.neu.his.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettlementExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public SettlementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
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
     * This method corresponds to the database table settlement
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
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 23:45:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
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
     * This class corresponds to the database table settlement
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

        public Criteria andSettlementIdIsNull() {
            addCriterion("settlement_id is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIsNotNull() {
            addCriterion("settlement_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdEqualTo(Integer value) {
            addCriterion("settlement_id =", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotEqualTo(Integer value) {
            addCriterion("settlement_id <>", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdGreaterThan(Integer value) {
            addCriterion("settlement_id >", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_id >=", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdLessThan(Integer value) {
            addCriterion("settlement_id <", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_id <=", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIn(List<Integer> values) {
            addCriterion("settlement_id in", values, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotIn(List<Integer> values) {
            addCriterion("settlement_id not in", values, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdBetween(Integer value1, Integer value2) {
            addCriterion("settlement_id between", value1, value2, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_id not between", value1, value2, "settlementId");
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

        public Criteria andUserIdEqualTo(Short value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Short value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Short value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Short value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Short value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Short value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Short> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Short> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Short value1, Short value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Short value1, Short value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeIsNull() {
            addCriterion("settlement_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeIsNotNull() {
            addCriterion("settlement_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeEqualTo(Date value) {
            addCriterion("settlement_start_time =", value, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeNotEqualTo(Date value) {
            addCriterion("settlement_start_time <>", value, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeGreaterThan(Date value) {
            addCriterion("settlement_start_time >", value, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_start_time >=", value, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeLessThan(Date value) {
            addCriterion("settlement_start_time <", value, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("settlement_start_time <=", value, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeIn(List<Date> values) {
            addCriterion("settlement_start_time in", values, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeNotIn(List<Date> values) {
            addCriterion("settlement_start_time not in", values, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeBetween(Date value1, Date value2) {
            addCriterion("settlement_start_time between", value1, value2, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("settlement_start_time not between", value1, value2, "settlementStartTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeIsNull() {
            addCriterion("settlement_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeIsNotNull() {
            addCriterion("settlement_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeEqualTo(Date value) {
            addCriterion("settlement_end_time =", value, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeNotEqualTo(Date value) {
            addCriterion("settlement_end_time <>", value, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeGreaterThan(Date value) {
            addCriterion("settlement_end_time >", value, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_end_time >=", value, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeLessThan(Date value) {
            addCriterion("settlement_end_time <", value, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("settlement_end_time <=", value, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeIn(List<Date> values) {
            addCriterion("settlement_end_time in", values, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeNotIn(List<Date> values) {
            addCriterion("settlement_end_time not in", values, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeBetween(Date value1, Date value2) {
            addCriterion("settlement_end_time between", value1, value2, "settlementEndTime");
            return (Criteria) this;
        }

        public Criteria andSettlementEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("settlement_end_time not between", value1, value2, "settlementEndTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table settlement
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
     * This class corresponds to the database table settlement
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