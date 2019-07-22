package com.neu.his.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalProjectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public MedicalProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
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
     * This method corresponds to the database table medical_project
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
     * This method corresponds to the database table medical_project
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_project
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
     * This class corresponds to the database table medical_project
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

        public Criteria andMedicalidIsNull() {
            addCriterion("medicalID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalidIsNotNull() {
            addCriterion("medicalID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalidEqualTo(Short value) {
            addCriterion("medicalID =", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotEqualTo(Short value) {
            addCriterion("medicalID <>", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidGreaterThan(Short value) {
            addCriterion("medicalID >", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidGreaterThanOrEqualTo(Short value) {
            addCriterion("medicalID >=", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidLessThan(Short value) {
            addCriterion("medicalID <", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidLessThanOrEqualTo(Short value) {
            addCriterion("medicalID <=", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidIn(List<Short> values) {
            addCriterion("medicalID in", values, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotIn(List<Short> values) {
            addCriterion("medicalID not in", values, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidBetween(Short value1, Short value2) {
            addCriterion("medicalID between", value1, value2, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotBetween(Short value1, Short value2) {
            addCriterion("medicalID not between", value1, value2, "medicalid");
            return (Criteria) this;
        }

        public Criteria andRegistidIsNull() {
            addCriterion("registID is null");
            return (Criteria) this;
        }

        public Criteria andRegistidIsNotNull() {
            addCriterion("registID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistidEqualTo(Integer value) {
            addCriterion("registID =", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidNotEqualTo(Integer value) {
            addCriterion("registID <>", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidGreaterThan(Integer value) {
            addCriterion("registID >", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("registID >=", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidLessThan(Integer value) {
            addCriterion("registID <", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidLessThanOrEqualTo(Integer value) {
            addCriterion("registID <=", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidIn(List<Integer> values) {
            addCriterion("registID in", values, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidNotIn(List<Integer> values) {
            addCriterion("registID not in", values, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidBetween(Integer value1, Integer value2) {
            addCriterion("registID between", value1, value2, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidNotBetween(Integer value1, Integer value2) {
            addCriterion("registID not between", value1, value2, "registid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Short value) {
            addCriterion("itemID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Short value) {
            addCriterion("itemID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Short value) {
            addCriterion("itemID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Short value) {
            addCriterion("itemID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Short value) {
            addCriterion("itemID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Short value) {
            addCriterion("itemID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Short> values) {
            addCriterion("itemID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Short> values) {
            addCriterion("itemID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Short value1, Short value2) {
            addCriterion("itemID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Short value1, Short value2) {
            addCriterion("itemID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("itemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("itemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("itemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("itemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("itemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("itemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("itemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("itemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("itemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("itemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("itemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("itemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("itemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andProjecturgentIsNull() {
            addCriterion("projectUrgent is null");
            return (Criteria) this;
        }

        public Criteria andProjecturgentIsNotNull() {
            addCriterion("projectUrgent is not null");
            return (Criteria) this;
        }

        public Criteria andProjecturgentEqualTo(Boolean value) {
            addCriterion("projectUrgent =", value, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentNotEqualTo(Boolean value) {
            addCriterion("projectUrgent <>", value, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentGreaterThan(Boolean value) {
            addCriterion("projectUrgent >", value, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("projectUrgent >=", value, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentLessThan(Boolean value) {
            addCriterion("projectUrgent <", value, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentLessThanOrEqualTo(Boolean value) {
            addCriterion("projectUrgent <=", value, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentIn(List<Boolean> values) {
            addCriterion("projectUrgent in", values, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentNotIn(List<Boolean> values) {
            addCriterion("projectUrgent not in", values, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentBetween(Boolean value1, Boolean value2) {
            addCriterion("projectUrgent between", value1, value2, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andProjecturgentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("projectUrgent not between", value1, value2, "projecturgent");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionIsNull() {
            addCriterion("medicalExecution is null");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionIsNotNull() {
            addCriterion("medicalExecution is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionEqualTo(Boolean value) {
            addCriterion("medicalExecution =", value, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionNotEqualTo(Boolean value) {
            addCriterion("medicalExecution <>", value, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionGreaterThan(Boolean value) {
            addCriterion("medicalExecution >", value, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("medicalExecution >=", value, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionLessThan(Boolean value) {
            addCriterion("medicalExecution <", value, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionLessThanOrEqualTo(Boolean value) {
            addCriterion("medicalExecution <=", value, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionIn(List<Boolean> values) {
            addCriterion("medicalExecution in", values, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionNotIn(List<Boolean> values) {
            addCriterion("medicalExecution not in", values, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionBetween(Boolean value1, Boolean value2) {
            addCriterion("medicalExecution between", value1, value2, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andMedicalexecutionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("medicalExecution not between", value1, value2, "medicalexecution");
            return (Criteria) this;
        }

        public Criteria andItemamountIsNull() {
            addCriterion("itemAmount is null");
            return (Criteria) this;
        }

        public Criteria andItemamountIsNotNull() {
            addCriterion("itemAmount is not null");
            return (Criteria) this;
        }

        public Criteria andItemamountEqualTo(Byte value) {
            addCriterion("itemAmount =", value, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountNotEqualTo(Byte value) {
            addCriterion("itemAmount <>", value, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountGreaterThan(Byte value) {
            addCriterion("itemAmount >", value, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountGreaterThanOrEqualTo(Byte value) {
            addCriterion("itemAmount >=", value, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountLessThan(Byte value) {
            addCriterion("itemAmount <", value, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountLessThanOrEqualTo(Byte value) {
            addCriterion("itemAmount <=", value, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountIn(List<Byte> values) {
            addCriterion("itemAmount in", values, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountNotIn(List<Byte> values) {
            addCriterion("itemAmount not in", values, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountBetween(Byte value1, Byte value2) {
            addCriterion("itemAmount between", value1, value2, "itemamount");
            return (Criteria) this;
        }

        public Criteria andItemamountNotBetween(Byte value1, Byte value2) {
            addCriterion("itemAmount not between", value1, value2, "itemamount");
            return (Criteria) this;
        }

        public Criteria andProjecttimeIsNull() {
            addCriterion("projectTime is null");
            return (Criteria) this;
        }

        public Criteria andProjecttimeIsNotNull() {
            addCriterion("projectTime is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttimeEqualTo(Date value) {
            addCriterion("projectTime =", value, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeNotEqualTo(Date value) {
            addCriterion("projectTime <>", value, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeGreaterThan(Date value) {
            addCriterion("projectTime >", value, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("projectTime >=", value, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeLessThan(Date value) {
            addCriterion("projectTime <", value, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeLessThanOrEqualTo(Date value) {
            addCriterion("projectTime <=", value, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeIn(List<Date> values) {
            addCriterion("projectTime in", values, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeNotIn(List<Date> values) {
            addCriterion("projectTime not in", values, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeBetween(Date value1, Date value2) {
            addCriterion("projectTime between", value1, value2, "projecttime");
            return (Criteria) this;
        }

        public Criteria andProjecttimeNotBetween(Date value1, Date value2) {
            addCriterion("projectTime not between", value1, value2, "projecttime");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridIsNull() {
            addCriterion("checkDoctorID is null");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridIsNotNull() {
            addCriterion("checkDoctorID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridEqualTo(Short value) {
            addCriterion("checkDoctorID =", value, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridNotEqualTo(Short value) {
            addCriterion("checkDoctorID <>", value, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridGreaterThan(Short value) {
            addCriterion("checkDoctorID >", value, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridGreaterThanOrEqualTo(Short value) {
            addCriterion("checkDoctorID >=", value, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridLessThan(Short value) {
            addCriterion("checkDoctorID <", value, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridLessThanOrEqualTo(Short value) {
            addCriterion("checkDoctorID <=", value, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridIn(List<Short> values) {
            addCriterion("checkDoctorID in", values, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridNotIn(List<Short> values) {
            addCriterion("checkDoctorID not in", values, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridBetween(Short value1, Short value2) {
            addCriterion("checkDoctorID between", value1, value2, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andCheckdoctoridNotBetween(Short value1, Short value2) {
            addCriterion("checkDoctorID not between", value1, value2, "checkdoctorid");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultIsNull() {
            addCriterion("medicalProjectResult is null");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultIsNotNull() {
            addCriterion("medicalProjectResult is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultEqualTo(String value) {
            addCriterion("medicalProjectResult =", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultNotEqualTo(String value) {
            addCriterion("medicalProjectResult <>", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultGreaterThan(String value) {
            addCriterion("medicalProjectResult >", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultGreaterThanOrEqualTo(String value) {
            addCriterion("medicalProjectResult >=", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultLessThan(String value) {
            addCriterion("medicalProjectResult <", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultLessThanOrEqualTo(String value) {
            addCriterion("medicalProjectResult <=", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultLike(String value) {
            addCriterion("medicalProjectResult like", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultNotLike(String value) {
            addCriterion("medicalProjectResult not like", value, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultIn(List<String> values) {
            addCriterion("medicalProjectResult in", values, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultNotIn(List<String> values) {
            addCriterion("medicalProjectResult not in", values, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultBetween(String value1, String value2) {
            addCriterion("medicalProjectResult between", value1, value2, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andMedicalprojectresultNotBetween(String value1, String value2) {
            addCriterion("medicalProjectResult not between", value1, value2, "medicalprojectresult");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridIsNull() {
            addCriterion("beginDoctorID is null");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridIsNotNull() {
            addCriterion("beginDoctorID is not null");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridEqualTo(Short value) {
            addCriterion("beginDoctorID =", value, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridNotEqualTo(Short value) {
            addCriterion("beginDoctorID <>", value, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridGreaterThan(Short value) {
            addCriterion("beginDoctorID >", value, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridGreaterThanOrEqualTo(Short value) {
            addCriterion("beginDoctorID >=", value, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridLessThan(Short value) {
            addCriterion("beginDoctorID <", value, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridLessThanOrEqualTo(Short value) {
            addCriterion("beginDoctorID <=", value, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridIn(List<Short> values) {
            addCriterion("beginDoctorID in", values, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridNotIn(List<Short> values) {
            addCriterion("beginDoctorID not in", values, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridBetween(Short value1, Short value2) {
            addCriterion("beginDoctorID between", value1, value2, "begindoctorid");
            return (Criteria) this;
        }

        public Criteria andBegindoctoridNotBetween(Short value1, Short value2) {
            addCriterion("beginDoctorID not between", value1, value2, "begindoctorid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table medical_project
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
     * This class corresponds to the database table medical_project
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