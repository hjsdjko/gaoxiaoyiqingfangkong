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
 * 打卡记录
 *
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("dakajilu")
public class DakajiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DakajiluEntity() {

	}

	public DakajiluEntity(T t) {
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
     * 打卡学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 打卡时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)
    private Date insertTime;


    /**
     * 体温
     */
    @TableField(value = "dakajilu_tiwen")

    private Double dakajiluTiwen;


    /**
     * 打卡地点
     */
    @TableField(value = "dakajilu_didian")

    private String dakajiluDidian;


    /**
     * 一月内是否接触过确诊病例
     */
    @TableField(value = "quezhen_types")

    private Integer quezhenTypes;


    /**
     * 一月内是否接触过疑似病例
     */
    @TableField(value = "yishi_types")

    private Integer yishiTypes;


    /**
     * 一月内是否去过中高风险地区
     */
    @TableField(value = "gaofengxian_types")

    private Integer gaofengxianTypes;


    /**
     * 以上内容是否属实
     */
    @TableField(value = "shifou_types")

    private Integer shifouTypes;


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
	 * 设置：打卡学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：打卡学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：打卡时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：打卡时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：体温
	 */
    public Double getDakajiluTiwen() {
        return dakajiluTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setDakajiluTiwen(Double dakajiluTiwen) {
        this.dakajiluTiwen = dakajiluTiwen;
    }
    /**
	 * 设置：打卡地点
	 */
    public String getDakajiluDidian() {
        return dakajiluDidian;
    }


    /**
	 * 获取：打卡地点
	 */

    public void setDakajiluDidian(String dakajiluDidian) {
        this.dakajiluDidian = dakajiluDidian;
    }
    /**
	 * 设置：一月内是否接触过确诊病例
	 */
    public Integer getQuezhenTypes() {
        return quezhenTypes;
    }


    /**
	 * 获取：一月内是否接触过确诊病例
	 */

    public void setQuezhenTypes(Integer quezhenTypes) {
        this.quezhenTypes = quezhenTypes;
    }
    /**
	 * 设置：一月内是否接触过疑似病例
	 */
    public Integer getYishiTypes() {
        return yishiTypes;
    }


    /**
	 * 获取：一月内是否接触过疑似病例
	 */

    public void setYishiTypes(Integer yishiTypes) {
        this.yishiTypes = yishiTypes;
    }
    /**
	 * 设置：一月内是否去过中高风险地区
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 获取：一月内是否去过中高风险地区
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 设置：以上内容是否属实
	 */
    public Integer getShifouTypes() {
        return shifouTypes;
    }


    /**
	 * 获取：以上内容是否属实
	 */

    public void setShifouTypes(Integer shifouTypes) {
        this.shifouTypes = shifouTypes;
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
        return "Dakajilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", dakajiluTiwen=" + dakajiluTiwen +
            ", dakajiluDidian=" + dakajiluDidian +
            ", quezhenTypes=" + quezhenTypes +
            ", yishiTypes=" + yishiTypes +
            ", gaofengxianTypes=" + gaofengxianTypes +
            ", shifouTypes=" + shifouTypes +
            ", createTime=" + createTime +
        "}";
    }
}
