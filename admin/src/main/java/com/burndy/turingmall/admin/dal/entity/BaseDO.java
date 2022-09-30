package com.burndy.turingmall.admin.dal.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

/**
 * 数据库(MySQL)实体基类
 *
 * @author Ran.Ding
 * @since 2022/7/21
 */
@Setter
@Getter
@ToString
public class BaseDO {

    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(insertStrategy = FieldStrategy.NEVER, updateStrategy = FieldStrategy.NEVER)
    private Instant createAt;

    @TableField(insertStrategy = FieldStrategy.NEVER, updateStrategy = FieldStrategy.NEVER)
    private Instant updateAt;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Boolean deleted;
}
