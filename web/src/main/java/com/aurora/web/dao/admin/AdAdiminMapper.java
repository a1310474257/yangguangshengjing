package com.aurora.web.dao.admin;

import com.aurora.model.entity.AdAdimin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * AdAdiminMapper 表  dao层
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface AdAdiminMapper {


    @Delete({
        "delete from ad_adimin",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);


    @Insert({
        "insert into ad_adimin (admin_number, admin_password, ",
        "admin_token, create_time, ",
        "update_time)",
        "values (#{adminNumber,jdbcType=VARCHAR}, #{adminPassword,jdbcType=VARCHAR}, ",
        "#{adminToken,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AdAdimin record);


    @Select({
        "select",
        "id, admin_number, admin_password, admin_token, create_time, update_time",
        "from ad_adimin",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="admin_number", property="adminNumber", jdbcType= JdbcType.VARCHAR),
        @Result(column="admin_password", property="adminPassword", jdbcType= JdbcType.VARCHAR),
        @Result(column="admin_token", property="adminToken", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    AdAdimin selectByPrimaryKey(Integer id);


    @Select({
        "select",
        "id, admin_number, admin_password, admin_token, create_time, update_time",
        "from ad_adimin"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="admin_number", property="adminNumber", jdbcType= JdbcType.VARCHAR),
        @Result(column="admin_password", property="adminPassword", jdbcType= JdbcType.VARCHAR),
        @Result(column="admin_token", property="adminToken", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    List<AdAdimin> selectAll();


    @Update({
        "update ad_adimin",
        "set admin_number = #{adminNumber,jdbcType=VARCHAR},",
          "admin_password = #{adminPassword,jdbcType=VARCHAR},",
          "admin_token = #{adminToken,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AdAdimin record);
}