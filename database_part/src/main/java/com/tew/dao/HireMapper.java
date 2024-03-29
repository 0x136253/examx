package com.tew.dao;

import com.tew.pojo.Hire;
import com.tew.pojo.HireExample;
import java.util.List;

public interface HireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int insert(Hire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int insertSelective(Hire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    List<Hire> selectByExample(HireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    Hire selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int updateByPrimaryKeySelective(Hire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.PER_HIRE
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int updateByPrimaryKey(Hire record);
}