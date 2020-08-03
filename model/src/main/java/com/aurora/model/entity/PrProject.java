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
public class PrProject implements Serializable {
    private String prNumber;
    private Integer id;
    private String prName;
    private String prAddress;
    private String rotationImages;
    private String introductionImages;
    private String landArea;
    private String introductionWords;
    private Integer houseNumber;
    private String developers;
    private Date createTime;
    private Date updateTime;
    private static final long serialVersionUID = 1L;
}