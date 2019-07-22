package com.neu.his.model;

import java.util.ArrayList;
import java.util.List;

public class DrugTemplateDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public DrugTemplateDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
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
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
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

        public Criteria andDrugtempdetailidIsNull() {
            addCriterion("drugTempDetailID is null");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidIsNotNull() {
            addCriterion("drugTempDetailID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidEqualTo(Integer value) {
            addCriterion("drugTempDetailID =", value, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidNotEqualTo(Integer value) {
            addCriterion("drugTempDetailID <>", value, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidGreaterThan(Integer value) {
            addCriterion("drugTempDetailID >", value, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugTempDetailID >=", value, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidLessThan(Integer value) {
            addCriterion("drugTempDetailID <", value, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("drugTempDetailID <=", value, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidIn(List<Integer> values) {
            addCriterion("drugTempDetailID in", values, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidNotIn(List<Integer> values) {
            addCriterion("drugTempDetailID not in", values, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidBetween(Integer value1, Integer value2) {
            addCriterion("drugTempDetailID between", value1, value2, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugTempDetailID not between", value1, value2, "drugtempdetailid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidIsNull() {
            addCriterion("drugTempID is null");
            return (Criteria) this;
        }

        public Criteria andDrugtempidIsNotNull() {
            addCriterion("drugTempID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugtempidEqualTo(Integer value) {
            addCriterion("drugTempID =", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidNotEqualTo(Integer value) {
            addCriterion("drugTempID <>", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidGreaterThan(Integer value) {
            addCriterion("drugTempID >", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugTempID >=", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidLessThan(Integer value) {
            addCriterion("drugTempID <", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidLessThanOrEqualTo(Integer value) {
            addCriterion("drugTempID <=", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidIn(List<Integer> values) {
            addCriterion("drugTempID in", values, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidNotIn(List<Integer> values) {
            addCriterion("drugTempID not in", values, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidBetween(Integer value1, Integer value2) {
            addCriterion("drugTempID between", value1, value2, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugTempID not between", value1, value2, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugidIsNull() {
            addCriterion("drugID is null");
            return (Criteria) this;
        }

        public Criteria andDrugidIsNotNull() {
            addCriterion("drugID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugidEqualTo(Short value) {
            addCriterion("drugID =", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotEqualTo(Short value) {
            addCriterion("drugID <>", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidGreaterThan(Short value) {
            addCriterion("drugID >", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidGreaterThanOrEqualTo(Short value) {
            addCriterion("drugID >=", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLessThan(Short value) {
            addCriterion("drugID <", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidLessThanOrEqualTo(Short value) {
            addCriterion("drugID <=", value, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidIn(List<Short> values) {
            addCriterion("drugID in", values, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotIn(List<Short> values) {
            addCriterion("drugID not in", values, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidBetween(Short value1, Short value2) {
            addCriterion("drugID between", value1, value2, "drugid");
            return (Criteria) this;
        }

        public Criteria andDrugidNotBetween(Short value1, Short value2) {
            addCriterion("drugID not between", value1, value2, "drugid");
            return (Criteria) this;
        }

        public Criteria andUsageIsNull() {
            addCriterion("usage is null");
            return (Criteria) this;
        }

        public Criteria andUsageIsNotNull() {
            addCriterion("usage is not null");
            return (Criteria) this;
        }

        public Criteria andUsageEqualTo(String value) {
            addCriterion("usage =", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotEqualTo(String value) {
            addCriterion("usage <>", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThan(String value) {
            addCriterion("usage >", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThanOrEqualTo(String value) {
            addCriterion("usage >=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThan(String value) {
            addCriterion("usage <", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThanOrEqualTo(String value) {
            addCriterion("usage <=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLike(String value) {
            addCriterion("usage like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotLike(String value) {
            addCriterion("usage not like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageIn(List<String> values) {
            addCriterion("usage in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotIn(List<String> values) {
            addCriterion("usage not in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageBetween(String value1, String value2) {
            addCriterion("usage between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotBetween(String value1, String value2) {
            addCriterion("usage not between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andFreqIsNull() {
            addCriterion("freq is null");
            return (Criteria) this;
        }

        public Criteria andFreqIsNotNull() {
            addCriterion("freq is not null");
            return (Criteria) this;
        }

        public Criteria andFreqEqualTo(String value) {
            addCriterion("freq =", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotEqualTo(String value) {
            addCriterion("freq <>", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThan(String value) {
            addCriterion("freq >", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThanOrEqualTo(String value) {
            addCriterion("freq >=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThan(String value) {
            addCriterion("freq <", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThanOrEqualTo(String value) {
            addCriterion("freq <=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLike(String value) {
            addCriterion("freq like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotLike(String value) {
            addCriterion("freq not like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqIn(List<String> values) {
            addCriterion("freq in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotIn(List<String> values) {
            addCriterion("freq not in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqBetween(String value1, String value2) {
            addCriterion("freq between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotBetween(String value1, String value2) {
            addCriterion("freq not between", value1, value2, "freq");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_template_detail
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 22 15:20:08 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_template_detail
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
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