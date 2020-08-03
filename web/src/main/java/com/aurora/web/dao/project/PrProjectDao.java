package com.aurora.web.dao.project;

import com.aurora.model.entity.PrProject;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * PrProject表dao层
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface PrProjectDao {

    @Delete({
            "delete from pr_project",
            "where pr_number = #{prNumber,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String prNumber);


    @Insert({
            "insert into pr_project (pr_number, pr_name, ",
            "pr_address, rotation_images, ",
            "introduction_images, land_area, ",
            "introduction_words, house_number, ",
            "developers, create_time, ",
            "update_time)",
            "values (#{prNumber,jdbcType=VARCHAR}, #{prName,jdbcType=VARCHAR}, ",
            "#{prAddress,jdbcType=VARCHAR}, #{rotationImages,jdbcType=VARCHAR}, ",
            "#{introductionImages,jdbcType=VARCHAR}, #{landArea,jdbcType=VARCHAR}, ",
            "#{introductionWords,jdbcType=VARCHAR}, #{houseNumber,jdbcType=INTEGER}, ",
            "#{developers,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(PrProject record);


    @Select({
            "select",
            "pr_number, id, pr_name, pr_address, rotation_images, introduction_images, land_area, ",
            "introduction_words, house_number, developers, create_time, update_time",
            "from pr_project",
            "where pr_number = #{prNumber,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="pr_number", property="prNumber", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
            @Result(column="pr_name", property="prName", jdbcType=JdbcType.VARCHAR),
            @Result(column="pr_address", property="prAddress", jdbcType=JdbcType.VARCHAR),
            @Result(column="rotation_images", property="rotationImages", jdbcType=JdbcType.VARCHAR),
            @Result(column="introduction_images", property="introductionImages", jdbcType=JdbcType.VARCHAR),
            @Result(column="land_area", property="landArea", jdbcType=JdbcType.VARCHAR),
            @Result(column="introduction_words", property="introductionWords", jdbcType=JdbcType.VARCHAR),
            @Result(column="house_number", property="houseNumber", jdbcType=JdbcType.INTEGER),
            @Result(column="developers", property="developers", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PrProject selectByPrimaryKey(String prNumber);


    @Select({
            "select",
            "pr_number, id, pr_name, pr_address, rotation_images, introduction_images, land_area, ",
            "introduction_words, house_number, developers, create_time, update_time",
            "from pr_project"
    })
    @Results({
            @Result(column="pr_number", property="prNumber", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
            @Result(column="pr_name", property="prName", jdbcType=JdbcType.VARCHAR),
            @Result(column="pr_address", property="prAddress", jdbcType=JdbcType.VARCHAR),
            @Result(column="rotation_images", property="rotationImages", jdbcType=JdbcType.VARCHAR),
            @Result(column="introduction_images", property="introductionImages", jdbcType=JdbcType.VARCHAR),
            @Result(column="land_area", property="landArea", jdbcType=JdbcType.VARCHAR),
            @Result(column="introduction_words", property="introductionWords", jdbcType=JdbcType.VARCHAR),
            @Result(column="house_number", property="houseNumber", jdbcType=JdbcType.INTEGER),
            @Result(column="developers", property="developers", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PrProject> selectAll();


    @Update({
            "update pr_project",
            "set id = #{id,jdbcType=INTEGER},",
            "pr_name = #{prName,jdbcType=VARCHAR},",
            "pr_address = #{prAddress,jdbcType=VARCHAR},",
            "rotation_images = #{rotationImages,jdbcType=VARCHAR},",
            "introduction_images = #{introductionImages,jdbcType=VARCHAR},",
            "land_area = #{landArea,jdbcType=VARCHAR},",
            "introduction_words = #{introductionWords,jdbcType=VARCHAR},",
            "house_number = #{houseNumber,jdbcType=INTEGER},",
            "developers = #{developers,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where pr_number = #{prNumber,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PrProject record);
}