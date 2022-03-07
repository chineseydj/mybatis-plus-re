package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName address
 */
@TableName(value ="address")
@Data
public class Address implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer addressid;

    /**
     * 
     */
    private Integer uid;

    /**
     * 
     */
    private String cnee;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String address;


}