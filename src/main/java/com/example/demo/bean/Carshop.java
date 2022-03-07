package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName carshop
 */
@TableName(value ="carshop")
@Data
public class Carshop implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer cid;

    /**
     * 
     */
    private Integer uid;

    /**
     * 
     */
    private Integer pid;

    /**
     * 
     */
    private Integer numbers;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}