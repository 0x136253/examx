package com.tew.dao;

import com.tew.pojo.ResPra;
import com.tew.pojo.ResPraExample;
import java.util.List;

public interface ResPraMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int deleteByPrimaryKey(Short idJob);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int insert(ResPra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int insertSelective(ResPra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    List<ResPra> selectByExample(ResPraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    ResPra selectByPrimaryKey(Short idJob);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int updateByPrimaryKeySelective(ResPra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_PRA
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int updateByPrimaryKey(ResPra record);
}