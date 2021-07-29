package com.example.demo.abc.domain.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ApiModel("查询Haha参数")
@Data
public class FindAllHahaParam {

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    Integer currentPage = 1;

    /**
     * 每页条数
     */
    @ApiModelProperty(value = "每页条数")
    Integer pageSize = 20;

    /**
     * 开始日期
     */
    @ApiModelProperty(value = "开始日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate startTime;

    /**
     * 截止日期
     */
    @ApiModelProperty(value = "截止日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate endTime;


    /**
     * 开始日期
     */
    @ApiModelProperty(value = "开始日期2")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime startTime2;

    /**
     * 截止日期
     */
    @ApiModelProperty(value = "截止日期2")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime endTime2;
}