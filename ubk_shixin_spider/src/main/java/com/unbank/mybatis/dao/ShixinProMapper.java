package com.unbank.mybatis.dao;

import com.unbank.mybatis.entity.ShixinPro;
import com.unbank.mybatis.entity.ShixinProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShixinProMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int countByExample(ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int deleteByExample(ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int insert(ShixinPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int insertSelective(ShixinPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    List<ShixinPro> selectByExampleWithBLOBs(ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    List<ShixinPro> selectByExample(ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    ShixinPro selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int updateByExampleSelective(@Param("record") ShixinPro record, @Param("example") ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") ShixinPro record, @Param("example") ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int updateByExample(@Param("record") ShixinPro record, @Param("example") ShixinProExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int updateByPrimaryKeySelective(ShixinPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(ShixinPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table court_shixin_pro
     *
     * @mbggenerated Mon Nov 23 11:15:42 CST 2015
     */
    int updateByPrimaryKey(ShixinPro record);
}