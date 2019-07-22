package com.neu.his.dao;

import com.neu.his.model.Confirmed;
import com.neu.his.model.ConfirmedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfirmedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    long countByExample(ConfirmedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByExample(ConfirmedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int deleteByPrimaryKey(Integer confirmedid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insert(Confirmed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int insertSelective(Confirmed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    List<Confirmed> selectByExample(ConfirmedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    Confirmed selectByPrimaryKey(Integer confirmedid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") Confirmed record, @Param("example") ConfirmedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByExample(@Param("record") Confirmed record, @Param("example") ConfirmedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKeySelective(Confirmed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table confirmed
     *
     * @mbg.generated Mon Jul 22 15:20:08 CST 2019
     */
    int updateByPrimaryKey(Confirmed record);
}