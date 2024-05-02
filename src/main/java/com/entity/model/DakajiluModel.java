package com.entity.model;

import com.entity.DakajiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 打卡记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-21
 */
public class DakajiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 打卡学生
     */
    private Integer yonghuId;


    /**
     * 打卡时间
     */
    private Integer insertTime;


    /**
     * 体温
     */
    private Double dakajiluTiwen;


    /**
     * 打卡地点
     */
    private String dakajiluDidian;


    /**
     * 一月内是否接触过确诊病例
     */
    private Integer quezhenTypes;


    /**
     * 一月内是否接触过疑似病例
     */
    private Integer yishiTypes;


    /**
     * 一月内是否去过中高风险地区
     */
    private Integer gaofengxianTypes;


    /**
     * 以上内容是否属实
     */
    private Integer shifouTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：打卡学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：打卡学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：打卡时间
	 */
    public Integer getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：打卡时间
	 */
    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：体温
	 */
    public Double getDakajiluTiwen() {
        return dakajiluTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setDakajiluTiwen(Double dakajiluTiwen) {
        this.dakajiluTiwen = dakajiluTiwen;
    }
    /**
	 * 获取：打卡地点
	 */
    public String getDakajiluDidian() {
        return dakajiluDidian;
    }


    /**
	 * 设置：打卡地点
	 */
    public void setDakajiluDidian(String dakajiluDidian) {
        this.dakajiluDidian = dakajiluDidian;
    }
    /**
	 * 获取：一月内是否接触过确诊病例
	 */
    public Integer getQuezhenTypes() {
        return quezhenTypes;
    }


    /**
	 * 设置：一月内是否接触过确诊病例
	 */
    public void setQuezhenTypes(Integer quezhenTypes) {
        this.quezhenTypes = quezhenTypes;
    }
    /**
	 * 获取：一月内是否接触过疑似病例
	 */
    public Integer getYishiTypes() {
        return yishiTypes;
    }


    /**
	 * 设置：一月内是否接触过疑似病例
	 */
    public void setYishiTypes(Integer yishiTypes) {
        this.yishiTypes = yishiTypes;
    }
    /**
	 * 获取：一月内是否去过中高风险地区
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 设置：一月内是否去过中高风险地区
	 */
    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 获取：以上内容是否属实
	 */
    public Integer getShifouTypes() {
        return shifouTypes;
    }


    /**
	 * 设置：以上内容是否属实
	 */
    public void setShifouTypes(Integer shifouTypes) {
        this.shifouTypes = shifouTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
