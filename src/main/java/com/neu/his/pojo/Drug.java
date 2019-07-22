package com.neu.his.pojo;

import java.util.Date;

public class Drug {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Integer drugId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_code
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String drugCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_name
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String drugName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_specif
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String drugSpecif;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_unit
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String drugUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_manufacturer
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String drugManufacturer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drugs_dosage_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Byte drugsDosageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drugs_type_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Byte drugsTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_unit_price
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Float drugUnitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_memonic_code
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String drugMemonicCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug.drug_crt_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Date drugCrtTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_id
     *
     * @return the value of drug.drug_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Integer getDrugId() {
        return drugId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_id
     *
     * @param drugId the value for drug.drug_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_code
     *
     * @return the value of drug.drug_code
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_code
     *
     * @param drugCode the value for drug.drug_code
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_name
     *
     * @return the value of drug.drug_name
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_name
     *
     * @param drugName the value for drug.drug_name
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_specif
     *
     * @return the value of drug.drug_specif
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDrugSpecif() {
        return drugSpecif;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_specif
     *
     * @param drugSpecif the value for drug.drug_specif
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugSpecif(String drugSpecif) {
        this.drugSpecif = drugSpecif == null ? null : drugSpecif.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_unit
     *
     * @return the value of drug.drug_unit
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDrugUnit() {
        return drugUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_unit
     *
     * @param drugUnit the value for drug.drug_unit
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit == null ? null : drugUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_manufacturer
     *
     * @return the value of drug.drug_manufacturer
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDrugManufacturer() {
        return drugManufacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_manufacturer
     *
     * @param drugManufacturer the value for drug.drug_manufacturer
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugManufacturer(String drugManufacturer) {
        this.drugManufacturer = drugManufacturer == null ? null : drugManufacturer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drugs_dosage_id
     *
     * @return the value of drug.drugs_dosage_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Byte getDrugsDosageId() {
        return drugsDosageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drugs_dosage_id
     *
     * @param drugsDosageId the value for drug.drugs_dosage_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugsDosageId(Byte drugsDosageId) {
        this.drugsDosageId = drugsDosageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drugs_type_id
     *
     * @return the value of drug.drugs_type_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Byte getDrugsTypeId() {
        return drugsTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drugs_type_id
     *
     * @param drugsTypeId the value for drug.drugs_type_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugsTypeId(Byte drugsTypeId) {
        this.drugsTypeId = drugsTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_unit_price
     *
     * @return the value of drug.drug_unit_price
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Float getDrugUnitPrice() {
        return drugUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_unit_price
     *
     * @param drugUnitPrice the value for drug.drug_unit_price
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugUnitPrice(Float drugUnitPrice) {
        this.drugUnitPrice = drugUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_memonic_code
     *
     * @return the value of drug.drug_memonic_code
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDrugMemonicCode() {
        return drugMemonicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_memonic_code
     *
     * @param drugMemonicCode the value for drug.drug_memonic_code
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugMemonicCode(String drugMemonicCode) {
        this.drugMemonicCode = drugMemonicCode == null ? null : drugMemonicCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug.drug_crt_time
     *
     * @return the value of drug.drug_crt_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Date getDrugCrtTime() {
        return drugCrtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug.drug_crt_time
     *
     * @param drugCrtTime the value for drug.drug_crt_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDrugCrtTime(Date drugCrtTime) {
        this.drugCrtTime = drugCrtTime;
    }
}