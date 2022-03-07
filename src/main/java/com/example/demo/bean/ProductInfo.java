package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName product_info
 */
@TableName(value ="product_info")
@Data
public class ProductInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer pId;

    /**
     * 
     */
    private String pName;

    /**
     * 
     */
    private String pContent;

    /**
     * 
     */
    private Integer pPrice;

    /**
     * 
     */
    private String pImage;

    /**
     * 
     */
    private Integer pNumber;

    /**
     * 
     */
    private Integer typeId;

    /**
     * 
     */
    private Date pDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pName=").append(pName);
        sb.append(", pContent=").append(pContent);
        sb.append(", pPrice=").append(pPrice);
        sb.append(", pImage=").append(pImage);
        sb.append(", pNumber=").append(pNumber);
        sb.append(", typeId=").append(typeId);
        sb.append(", pDate=").append(pDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}