package com.aurora.web.dao.user;

import com.aurora.model.entity.UUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;


/**
 * UUserMapper表  dao层
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface UUserMapper {


    @Delete({
            "delete from us_user",
            "where id = #{id,jdbcType=INTEGER}",
            "and user_number = #{userNumber,jdbcType=VARCHAR}",
            "and openid = #{openid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userNumber") String userNumber, @Param("openid") String openid);


    @Insert({
            "insert into us_user (user_number, openid, ",
            "token, create_time, ",
            "update_time)",
            "values (#{userNumber,jdbcType=VARCHAR}, #{openid,jdbcType=VARCHAR}, ",
            "#{token,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UUser record);


    @Select({
            "select",
            "id, user_number, openid, token, create_time, update_time",
            "from us_user",
            "where id = #{id,jdbcType=INTEGER}",
            "and user_number = #{userNumber,jdbcType=VARCHAR}",
            "and openid = #{openid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="user_number", property="userNumber", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    UUser selectByPrimaryKey(@Param("id") Integer id, @Param("userNumber") String userNumber, @Param("openid") String openid);


    @Select({
            "select",
            "id, user_number, openid, token, create_time, update_time",
            "from us_user"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="user_number", property="userNumber", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UUser> selectAll();


    @Update({
            "update us_user",
            "set token = #{token,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}",
            "and user_number = #{userNumber,jdbcType=VARCHAR}",
            "and openid = #{openid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UUser record);
}