package com.neu.his.pojo;

import java.util.Date;

public class DrugPrescription {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_prescription.drug_pre_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    private Integer drugPreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_prescription.regist_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    private Integer registId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_prescription.doctor_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    private Short doctorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_prescription.medical_record_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    private Integer medicalRecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_prescription.drug_pre_name
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    private String drugPreName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_prescription.drug_pre_time
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    private Date drugPreTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_prescription.drug_pre_id
     *
     * @return the value of drug_prescription.drug_pre_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public Integer getDrugPreId() {
        return drugPreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_prescription.drug_pre_id
     *
     * @param drugPreId the value for drug_prescription.drug_pre_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public void setDrugPreId(Integer drugPreId) {
        this.drugPreId = drugPreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_prescription.regist_id
     *
     * @return the value of drug_prescription.regist_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public Integer getRegistId() {
        return registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_prescription.regist_id
     *
     * @param registId the value for drug_prescription.regist_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public void setRegistId(Integer registId) {
        this.registId = registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_prescription.doctor_id
     *
     * @return the value of drug_prescription.doctor_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public Short getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_prescription.doctor_id
     *
     * @param doctorId the value for drug_prescription.doctor_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public void setDoctorId(Short doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_prescription.medical_record_id
     *
     * @return the value of drug_prescription.medical_record_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_prescription.medical_record_id
     *
     * @param medicalRecordId the value for drug_prescription.medical_record_id
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_prescription.drug_pre_name
     *
     * @return the value of drug_prescription.drug_pre_name
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public String getDrugPreName() {
        return drugPreName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_prescription.drug_pre_name
     *
     * @param drugPreName the value for drug_prescription.drug_pre_name
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public void setDrugPreName(String drugPreName) {
        this.drugPreName = drugPreName == null ? null : drugPreName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_prescription.drug_pre_time
     *
     * @return the value of drug_prescription.drug_pre_time
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public Date getDrugPreTime() {
        return drugPreTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_prescription.drug_pre_time
     *
     * @param drugPreTime the value for drug_prescription.drug_pre_time
     *
     * @mbg.generated Thu Jul 25 15:12:20 CST 2019
     */
    public void setDrugPreTime(Date drugPreTime) {
        this.drugPreTime = drugPreTime;
    }
}