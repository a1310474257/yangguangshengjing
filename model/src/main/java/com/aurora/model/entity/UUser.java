package com.aurora.model.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
@Data
@ToString
public class UUser implements Serializable {

    private Integer id;
    private String userNumber;
    private String openid;
    private String token;
    private Date createTime;
    private Date updateTime;
    private static final long serialVersionUID = 1L;

}