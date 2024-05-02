package com.entity.vo;

import com.entity.DakajiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 打卡记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("dakajilu")
public class DakajiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Integer insertTime;


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

    @TableField(value = "create_time")
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
    public Integer getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：打卡时间
	 */

    public void setInsertTime(Integer insertTime) {
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

}
