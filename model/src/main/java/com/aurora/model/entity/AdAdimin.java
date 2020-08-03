package com.aurora.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public class AdAdimin implements Serializable {

    private Integer id;
    private String adminNumber;
    private String adminPassword;
    private String adminToken;
    private Date createTime;
    private Date updateTime;

}