package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 通行证
 *
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("tongxingzheng")
public class TongxingzhengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TongxingzhengEntity() {

	}

	public TongxingzhengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生姓名
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;
    @TableField(value = "zhuangtai")

    private Integer zhuangtai;

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    /**
     * 通行区域
     */
    @TableField(value = "tongxingzheng_quyu")

    private String tongxingzhengQuyu;


    /**
     * 通行状态
     */
    @TableField(value = "tongxingzheng_types")

    private Integer tongxingzhengTypes;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "tongxingzheng_time",fill = FieldFill.UPDATE)

    private Date tongxingzhengTime;


    /**
     * 备注
     */
    @TableField(value = "youxigonglue_content")

    private String youxigonglueContent;


    /**
     * 审核状态
     */
    @TableField(value = "shenhe_types")

    private Integer shenheTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生姓名
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生姓名
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：通行区域
	 */
    public String getTongxingzhengQuyu() {
        return tongxingzhengQuyu;
    }


    /**
	 * 获取：通行区域
	 */

    public void setTongxingzhengQuyu(String tongxingzhengQuyu) {
        this.tongxingzhengQuyu = tongxingzhengQuyu;
    }
    /**
	 * 设置：通行状态
	 */
    public Integer getTongxingzhengTypes() {
        return tongxingzhengTypes;
    }


    /**
	 * 获取：通行状态
	 */

    public void setTongxingzhengTypes(Integer tongxingzhengTypes) {
        this.tongxingzhengTypes = tongxingzhengTypes;
    }
    /**
	 * 设置：时间
	 */
    public Date getTongxingzhengTime() {
        return tongxingzhengTime;
    }


    /**
	 * 获取：时间
	 */

    public void setTongxingzhengTime(Date tongxingzhengTime) {
        this.tongxingzhengTime = tongxingzhengTime;
    }
    /**
	 * 设置：备注
	 */
    public String getYouxigonglueContent() {
        return youxigonglueContent;
    }


    /**
	 * 获取：备注
	 */

    public void setYouxigonglueContent(String youxigonglueContent) {
        this.youxigonglueContent = youxigonglueContent;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getShenheTypes() {
        return shenheTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setShenheTypes(Integer shenheTypes) {
        this.shenheTypes = shenheTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Tongxingzheng{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", tongxingzhengQuyu=" + tongxingzhengQuyu +
            ", tongxingzhengTypes=" + tongxingzhengTypes +
            ", tongxingzhengTime=" + tongxingzhengTime +
            ", youxigonglueContent=" + youxigonglueContent +
            ", shenheTypes=" + shenheTypes +
            ", createTime=" + createTime +
        "}";
    }
}
