package com.neu.his.model;

import java.util.ArrayList;
import java.util.List;

public class DrugTemplateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public DrugTemplateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
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
     * This method corresponds to the database table drug_template
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
     * This method corresponds to the database table drug_template
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_template
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
     * This class corresponds to the database table drug_template
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

        public Criteria andDrugtempidIsNull() {
            addCriterion("drugTempID is null");
            return (Criteria) this;
        }

        public Criteria andDrugtempidIsNotNull() {
            addCriterion("drugTempID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugtempidEqualTo(Short value) {
            addCriterion("drugTempID =", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidNotEqualTo(Short value) {
            addCriterion("drugTempID <>", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidGreaterThan(Short value) {
            addCriterion("drugTempID >", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidGreaterThanOrEqualTo(Short value) {
            addCriterion("drugTempID >=", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidLessThan(Short value) {
            addCriterion("drugTempID <", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidLessThanOrEqualTo(Short value) {
            addCriterion("drugTempID <=", value, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidIn(List<Short> values) {
            addCriterion("drugTempID in", values, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidNotIn(List<Short> values) {
            addCriterion("drugTempID not in", values, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidBetween(Short value1, Short value2) {
            addCriterion("drugTempID between", value1, value2, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDrugtempidNotBetween(Short value1, Short value2) {
            addCriterion("drugTempID not between", value1, value2, "drugtempid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorID is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Short value) {
            addCriterion("doctorID =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Short value) {
            addCriterion("doctorID <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Short value) {
            addCriterion("doctorID >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Short value) {
            addCriterion("doctorID >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Short value) {
            addCriterion("doctorID <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Short value) {
            addCriterion("doctorID <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Short> values) {
            addCriterion("doctorID in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Short> values) {
            addCriterion("doctorID not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Short value1, Short value2) {
            addCriterion("doctorID between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Short value1, Short value2) {
            addCriterion("doctorID not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIsNull() {
            addCriterion("drugCode is null");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIsNotNull() {
            addCriterion("drugCode is not null");
            return (Criteria) this;
        }

        public Criteria andDrugcodeEqualTo(Short value) {
            addCriterion("drugCode =", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotEqualTo(Short value) {
            addCriterion("drugCode <>", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeGreaterThan(Short value) {
            addCriterion("drugCode >", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeGreaterThanOrEqualTo(Short value) {
            addCriterion("drugCode >=", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLessThan(Short value) {
            addCriterion("drugCode <", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeLessThanOrEqualTo(Short value) {
            addCriterion("drugCode <=", value, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeIn(List<Short> values) {
            addCriterion("drugCode in", values, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotIn(List<Short> values) {
            addCriterion("drugCode not in", values, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeBetween(Short value1, Short value2) {
            addCriterion("drugCode between", value1, value2, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugcodeNotBetween(Short value1, Short value2) {
            addCriterion("drugCode not between", value1, value2, "drugcode");
            return (Criteria) this;
        }

        public Criteria andDrugspecifIsNull() {
            addCriterion("drugSpecif is null");
            return (Criteria) this;
        }

        public Criteria andDrugspecifIsNotNull() {
            addCriterion("drugSpecif is not null");
            return (Criteria) this;
        }

        public Criteria andDrugspecifEqualTo(String value) {
            addCriterion("drugSpecif =", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifNotEqualTo(String value) {
            addCriterion("drugSpecif <>", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifGreaterThan(String value) {
            addCriterion("drugSpecif >", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifGreaterThanOrEqualTo(String value) {
            addCriterion("drugSpecif >=", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifLessThan(String value) {
            addCriterion("drugSpecif <", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifLessThanOrEqualTo(String value) {
            addCriterion("drugSpecif <=", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifLike(String value) {
            addCriterion("drugSpecif like", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifNotLike(String value) {
            addCriterion("drugSpecif not like", value, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifIn(List<String> values) {
            addCriterion("drugSpecif in", values, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifNotIn(List<String> values) {
            addCriterion("drugSpecif not in", values, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifBetween(String value1, String value2) {
            addCriterion("drugSpecif between", value1, value2, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugspecifNotBetween(String value1, String value2) {
            addCriterion("drugSpecif not between", value1, value2, "drugspecif");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIsNull() {
            addCriterion("drugPrice is null");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIsNotNull() {
            addCriterion("drugPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugpriceEqualTo(Double value) {
            addCriterion("drugPrice =", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotEqualTo(Double value) {
            addCriterion("drugPrice <>", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThan(Double value) {
            addCriterion("drugPrice >", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("drugPrice >=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThan(Double value) {
            addCriterion("drugPrice <", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceLessThanOrEqualTo(Double value) {
            addCriterion("drugPrice <=", value, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceIn(List<Double> values) {
            addCriterion("drugPrice in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotIn(List<Double> values) {
            addCriterion("drugPrice not in", values, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceBetween(Double value1, Double value2) {
            addCriterion("drugPrice between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugpriceNotBetween(Double value1, Double value2) {
            addCriterion("drugPrice not between", value1, value2, "drugprice");
            return (Criteria) this;
        }

        public Criteria andDrugusageIsNull() {
            addCriterion("drugUsage is null");
            return (Criteria) this;
        }

        public Criteria andDrugusageIsNotNull() {
            addCriterion("drugUsage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugusageEqualTo(String value) {
            addCriterion("drugUsage =", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageNotEqualTo(String value) {
            addCriterion("drugUsage <>", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageGreaterThan(String value) {
            addCriterion("drugUsage >", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageGreaterThanOrEqualTo(String value) {
            addCriterion("drugUsage >=", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageLessThan(String value) {
            addCriterion("drugUsage <", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageLessThanOrEqualTo(String value) {
            addCriterion("drugUsage <=", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageLike(String value) {
            addCriterion("drugUsage like", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageNotLike(String value) {
            addCriterion("drugUsage not like", value, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageIn(List<String> values) {
            addCriterion("drugUsage in", values, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageNotIn(List<String> values) {
            addCriterion("drugUsage not in", values, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageBetween(String value1, String value2) {
            addCriterion("drugUsage between", value1, value2, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugusageNotBetween(String value1, String value2) {
            addCriterion("drugUsage not between", value1, value2, "drugusage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageIsNull() {
            addCriterion("drugDosage is null");
            return (Criteria) this;
        }

        public Criteria andDrugdosageIsNotNull() {
            addCriterion("drugDosage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugdosageEqualTo(String value) {
            addCriterion("drugDosage =", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageNotEqualTo(String value) {
            addCriterion("drugDosage <>", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageGreaterThan(String value) {
            addCriterion("drugDosage >", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageGreaterThanOrEqualTo(String value) {
            addCriterion("drugDosage >=", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageLessThan(String value) {
            addCriterion("drugDosage <", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageLessThanOrEqualTo(String value) {
            addCriterion("drugDosage <=", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageLike(String value) {
            addCriterion("drugDosage like", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageNotLike(String value) {
            addCriterion("drugDosage not like", value, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageIn(List<String> values) {
            addCriterion("drugDosage in", values, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageNotIn(List<String> values) {
            addCriterion("drugDosage not in", values, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageBetween(String value1, String value2) {
            addCriterion("drugDosage between", value1, value2, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugdosageNotBetween(String value1, String value2) {
            addCriterion("drugDosage not between", value1, value2, "drugdosage");
            return (Criteria) this;
        }

        public Criteria andDrugfreqIsNull() {
            addCriterion("drugFreq is null");
            return (Criteria) this;
        }

        public Criteria andDrugfreqIsNotNull() {
            addCriterion("drugFreq is not null");
            return (Criteria) this;
        }

        public Criteria andDrugfreqEqualTo(String value) {
            addCriterion("drugFreq =", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqNotEqualTo(String value) {
            addCriterion("drugFreq <>", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqGreaterThan(String value) {
            addCriterion("drugFreq >", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqGreaterThanOrEqualTo(String value) {
            addCriterion("drugFreq >=", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqLessThan(String value) {
            addCriterion("drugFreq <", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqLessThanOrEqualTo(String value) {
            addCriterion("drugFreq <=", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqLike(String value) {
            addCriterion("drugFreq like", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqNotLike(String value) {
            addCriterion("drugFreq not like", value, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqIn(List<String> values) {
            addCriterion("drugFreq in", values, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqNotIn(List<String> values) {
            addCriterion("drugFreq not in", values, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqBetween(String value1, String value2) {
            addCriterion("drugFreq between", value1, value2, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugfreqNotBetween(String value1, String value2) {
            addCriterion("drugFreq not between", value1, value2, "drugfreq");
            return (Criteria) this;
        }

        public Criteria andDrugamountIsNull() {
            addCriterion("drugAmount is null");
            return (Criteria) this;
        }

        public Criteria andDrugamountIsNotNull() {
            addCriterion("drugAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDrugamountEqualTo(Byte value) {
            addCriterion("drugAmount =", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountNotEqualTo(Byte value) {
            addCriterion("drugAmount <>", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountGreaterThan(Byte value) {
            addCriterion("drugAmount >", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountGreaterThanOrEqualTo(Byte value) {
            addCriterion("drugAmount >=", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountLessThan(Byte value) {
            addCriterion("drugAmount <", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountLessThanOrEqualTo(Byte value) {
            addCriterion("drugAmount <=", value, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountIn(List<Byte> values) {
            addCriterion("drugAmount in", values, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountNotIn(List<Byte> values) {
            addCriterion("drugAmount not in", values, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountBetween(Byte value1, Byte value2) {
            addCriterion("drugAmount between", value1, value2, "drugamount");
            return (Criteria) this;
        }

        public Criteria andDrugamountNotBetween(Byte value1, Byte value2) {
            addCriterion("drugAmount not between", value1, value2, "drugamount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table drug_template
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
     * This class corresponds to the database table drug_template
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