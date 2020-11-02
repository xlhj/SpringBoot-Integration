package com.xlhj.sharding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author: lcj
 * @Date: 2020/11/2 14:42
 * @Description: 字典表
 * @Version: 0.0.1
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysDict对象", description="字典表")
public class SysDict implements Serializable {

    private static final long serialVersionUID = -1051705225122107489L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "字典编码")
    private String dictCode;

    @ApiModelProperty(value = "用户名称")
    private String dictValue;

}
