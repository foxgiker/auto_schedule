package com.foxgiker.schedule.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class WorkBatch {

    // 班次开始时间
    private Date startDate;

    // 班次结束时间
    private Date endDate;

    // 就餐耗时
    private Double mealCost;

    // 每次休息时长
    private Double restCost = 0.167;

    // 休息间隔
    private Integer restGap = 2;


}
