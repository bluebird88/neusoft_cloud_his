package com.neu.his.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugPrescriptionDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public DrugPrescriptionDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
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
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
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

        public Criteria andDrugPreDetailIdIsNull() {
            addCriterion("drug_pre_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdIsNotNull() {
            addCriterion("drug_pre_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdEqualTo(Integer value) {
            addCriterion("drug_pre_detail_id =", value, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdNotEqualTo(Integer value) {
            addCriterion("drug_pre_detail_id <>", value, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdGreaterThan(Integer value) {
            addCriterion("drug_pre_detail_id >", value, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_pre_detail_id >=", value, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdLessThan(Integer value) {
            addCriterion("drug_pre_detail_id <", value, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_pre_detail_id <=", value, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdIn(List<Integer> values) {
            addCriterion("drug_pre_detail_id in", values, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdNotIn(List<Integer> values) {
            addCriterion("drug_pre_detail_id not in", values, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_pre_detail_id between", value1, value2, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_pre_detail_id not between", value1, value2, "drugPreDetailId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdIsNull() {
            addCriterion("drug_pre_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdIsNotNull() {
            addCriterion("drug_pre_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdEqualTo(Integer value) {
            addCriterion("drug_pre_id =", value, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdNotEqualTo(Integer value) {
            addCriterion("drug_pre_id <>", value, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdGreaterThan(Integer value) {
            addCriterion("drug_pre_id >", value, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_pre_id >=", value, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdLessThan(Integer value) {
            addCriterion("drug_pre_id <", value, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_pre_id <=", value, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdIn(List<Integer> values) {
            addCriterion("drug_pre_id in", values, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdNotIn(List<Integer> values) {
            addCriterion("drug_pre_id not in", values, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_pre_id between", value1, value2, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugPreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_pre_id not between", value1, value2, "drugPreId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNull() {
            addCriterion("drug_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNotNull() {
            addCriterion("drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIdEqualTo(Integer value) {
            addCriterion("drug_id =", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotEqualTo(Integer value) {
            addCriterion("drug_id <>", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThan(Integer value) {
            addCriterion("drug_id >", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_id >=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThan(Integer value) {
            addCriterion("drug_id <", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_id <=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIn(List<Integer> values) {
            addCriterion("drug_id in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotIn(List<Integer> values) {
            addCriterion("drug_id not in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_id between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_id not between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageIsNull() {
            addCriterion("drug_pre_detail_usage is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageIsNotNull() {
            addCriterion("drug_pre_detail_usage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageEqualTo(String value) {
            addCriterion("drug_pre_detail_usage =", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageNotEqualTo(String value) {
            addCriterion("drug_pre_detail_usage <>", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageGreaterThan(String value) {
            addCriterion("drug_pre_detail_usage >", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageGreaterThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_usage >=", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageLessThan(String value) {
            addCriterion("drug_pre_detail_usage <", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageLessThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_usage <=", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageLike(String value) {
            addCriterion("drug_pre_detail_usage like", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageNotLike(String value) {
            addCriterion("drug_pre_detail_usage not like", value, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageIn(List<String> values) {
            addCriterion("drug_pre_detail_usage in", values, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageNotIn(List<String> values) {
            addCriterion("drug_pre_detail_usage not in", values, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_usage between", value1, value2, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailUsageNotBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_usage not between", value1, value2, "drugPreDetailUsage");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountIsNull() {
            addCriterion("drug_pre_detail_amount is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountIsNotNull() {
            addCriterion("drug_pre_detail_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountEqualTo(String value) {
            addCriterion("drug_pre_detail_amount =", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountNotEqualTo(String value) {
            addCriterion("drug_pre_detail_amount <>", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountGreaterThan(String value) {
            addCriterion("drug_pre_detail_amount >", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountGreaterThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_amount >=", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountLessThan(String value) {
            addCriterion("drug_pre_detail_amount <", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountLessThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_amount <=", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountLike(String value) {
            addCriterion("drug_pre_detail_amount like", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountNotLike(String value) {
            addCriterion("drug_pre_detail_amount not like", value, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountIn(List<String> values) {
            addCriterion("drug_pre_detail_amount in", values, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountNotIn(List<String> values) {
            addCriterion("drug_pre_detail_amount not in", values, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_amount between", value1, value2, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailAmountNotBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_amount not between", value1, value2, "drugPreDetailAmount");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqIsNull() {
            addCriterion("drug_pre_detail_freq is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqIsNotNull() {
            addCriterion("drug_pre_detail_freq is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqEqualTo(String value) {
            addCriterion("drug_pre_detail_freq =", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqNotEqualTo(String value) {
            addCriterion("drug_pre_detail_freq <>", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqGreaterThan(String value) {
            addCriterion("drug_pre_detail_freq >", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqGreaterThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_freq >=", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqLessThan(String value) {
            addCriterion("drug_pre_detail_freq <", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqLessThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_freq <=", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqLike(String value) {
            addCriterion("drug_pre_detail_freq like", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqNotLike(String value) {
            addCriterion("drug_pre_detail_freq not like", value, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqIn(List<String> values) {
            addCriterion("drug_pre_detail_freq in", values, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqNotIn(List<String> values) {
            addCriterion("drug_pre_detail_freq not in", values, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_freq between", value1, value2, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailFreqNotBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_freq not between", value1, value2, "drugPreDetailFreq");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumIsNull() {
            addCriterion("drug_pre_detail_num is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumIsNotNull() {
            addCriterion("drug_pre_detail_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumEqualTo(Byte value) {
            addCriterion("drug_pre_detail_num =", value, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumNotEqualTo(Byte value) {
            addCriterion("drug_pre_detail_num <>", value, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumGreaterThan(Byte value) {
            addCriterion("drug_pre_detail_num >", value, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("drug_pre_detail_num >=", value, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumLessThan(Byte value) {
            addCriterion("drug_pre_detail_num <", value, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumLessThanOrEqualTo(Byte value) {
            addCriterion("drug_pre_detail_num <=", value, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumIn(List<Byte> values) {
            addCriterion("drug_pre_detail_num in", values, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumNotIn(List<Byte> values) {
            addCriterion("drug_pre_detail_num not in", values, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumBetween(Byte value1, Byte value2) {
            addCriterion("drug_pre_detail_num between", value1, value2, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailNumNotBetween(Byte value1, Byte value2) {
            addCriterion("drug_pre_detail_num not between", value1, value2, "drugPreDetailNum");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateIsNull() {
            addCriterion("drug_pre_detail_state is null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateIsNotNull() {
            addCriterion("drug_pre_detail_state is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateEqualTo(String value) {
            addCriterion("drug_pre_detail_state =", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateNotEqualTo(String value) {
            addCriterion("drug_pre_detail_state <>", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateGreaterThan(String value) {
            addCriterion("drug_pre_detail_state >", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateGreaterThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_state >=", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateLessThan(String value) {
            addCriterion("drug_pre_detail_state <", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateLessThanOrEqualTo(String value) {
            addCriterion("drug_pre_detail_state <=", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateLike(String value) {
            addCriterion("drug_pre_detail_state like", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateNotLike(String value) {
            addCriterion("drug_pre_detail_state not like", value, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateIn(List<String> values) {
            addCriterion("drug_pre_detail_state in", values, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateNotIn(List<String> values) {
            addCriterion("drug_pre_detail_state not in", values, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_state between", value1, value2, "drugPreDetailState");
            return (Criteria) this;
        }

        public Criteria andDrugPreDetailStateNotBetween(String value1, String value2) {
            addCriterion("drug_pre_detail_state not between", value1, value2, "drugPreDetailState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 25 15:13:08 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Thu Jul 25 15:13:08 CST 2019
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