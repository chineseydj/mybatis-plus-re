package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName orderdetail
 */
@TableName(value ="orderdetail")
@Data
public class Orderdetail implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer odid;

    /**
     * 
     */
    private String oid;

    /**
     * 
     */
    private Integer pid;

    /**
     * 
     */
    private Integer pnumber;

    /**
     * 
     */
    private Double ptotal;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orderdetail other = (Orderdetail) that;
        return (this.getOdid() == null ? other.getOdid() == null : this.getOdid().equals(other.getOdid()))
            && (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPnumber() == null ? other.getPnumber() == null : this.getPnumber().equals(other.getPnumber()))
            && (this.getPtotal() == null ? other.getPtotal() == null : this.getPtotal().equals(other.getPtotal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOdid() == null) ? 0 : getOdid().hashCode());
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPnumber() == null) ? 0 : getPnumber().hashCode());
        result = prime * result + ((getPtotal() == null) ? 0 : getPtotal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odid=").append(odid);
        sb.append(", oid=").append(oid);
        sb.append(", pid=").append(pid);
        sb.append(", pnumber=").append(pnumber);
        sb.append(", ptotal=").append(ptotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}