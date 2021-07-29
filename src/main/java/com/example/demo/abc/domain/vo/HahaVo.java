package com.example.demo.abc.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@ApiModel("Haha")
@Data
public class HahaVo {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private String id;

    /**
     * UID
     */
    @ApiModelProperty(value = "UID")
    private String uid;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

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
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    LocalDateTime updateTime;

    /**
     * 名称
     */
    @ApiModelProperty(value = "备注")
    private String remark;

}