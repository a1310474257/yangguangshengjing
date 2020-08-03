package com.aurora.result;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class QueryResult<T>{
    //数据列表
    private List<T> list;
    //数据总数
    private long total;
}
