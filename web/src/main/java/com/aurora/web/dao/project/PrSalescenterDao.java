package com.aurora.web.dao.project;

import com.aurora.model.entity.PrSalescenter;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;


/**
 * PrSalescenter表dao层
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface PrSalescenterDao {

    @Delete({
        "delete from pr_salescenter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into pr_salescenter (py_project_number, sales_address, ",
        "sales_phone, create_time, ",
        "update_time)",
        "values (#{pyProjectNumber,jdbcType=VARCHAR}, #{salesAddress,jdbcType=VARCHAR}, ",
        "#{salesPhone,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(PrSalescenter record);

    /**
     * 根据主键id查询
     * @param id
     * @return
     */
    @Select({
        "select",
        "id, py_project_number, sales_address, sales_phone, create_time, update_time",
        "from pr_salescenter",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="py_project_number", property="pyProjectNumber", jdbcType= JdbcType.VARCHAR),
        @Result(column="sales_address", property="salesAddress", jdbcType= JdbcType.VARCHAR),
        @Result(column="sales_phone", property="salesPhone", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    PrSalescenter selectByPrimaryKey(Integer id);



    @Select({
        "select",
        "id, py_project_number, sales_address, sales_phone, create_time, update_time",
        "from pr_salescenter"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="py_project_number", property="pyProjectNumber", jdbcType= JdbcType.VARCHAR),
        @Result(column="sales_address", property="salesAddress", jdbcType= JdbcType.VARCHAR),
        @Result(column="sales_phone", property="salesPhone", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    List<PrSalescenter> selectAll();

    /**
     * 根据项目编号查询销售中心
     * @param projectNumber
     * @return
     */
    @Select({
            "select",
            "id, py_project_number, sales_address, sales_phone, create_time, update_time",
            "from pr_salescenter where py_project_number = #{projectNumber}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="py_project_number", property="pyProjectNumber", jdbcType= JdbcType.VARCHAR),
            @Result(column="sales_address", property="salesAddress", jdbcType= JdbcType.VARCHAR),
            @Result(column="sales_phone", property="salesPhone", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    List<PrSalescenter> selectAllByprojectNumber(String projectNumber);

    /**
     * 根据主键id更新
     * @param record
     * @return
     */
    @Update({
        "update pr_salescenter",
        "set py_project_number = #{pyProjectNumber,jdbcType=VARCHAR},",
          "sales_address = #{salesAddress,jdbcType=VARCHAR},",
          "sales_phone = #{salesPhone,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PrSalescenter record);
}