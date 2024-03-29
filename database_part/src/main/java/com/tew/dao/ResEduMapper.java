package com.tew.dao;

import com.tew.pojo.ResEdu;
import com.tew.pojo.ResEduExample;
import java.util.List;

public interface ResEduMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int deleteByPrimaryKey(Short idEdu);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int insert(ResEdu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int insertSelective(ResEdu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    List<ResEdu> selectByExample(ResEduExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    ResEdu selectByPrimaryKey(Short idEdu);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int updateByPrimaryKeySelective(ResEdu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS.RES_EDU
     *
     * @mbg.generated 2019-08-31 09:33:07
     */
    int updateByPrimaryKey(ResEdu record);
}