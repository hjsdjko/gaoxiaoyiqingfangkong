package com.entity.model;

import com.entity.TongxingzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 通行证
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-21
 */
public class TongxingzhengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生姓名
     */
    private Integer yonghuId;


    /**
     * 通行区域
     */
    private String tongxingzhengQuyu;


    /**
     * 通行状态
     */
    private Integer tongxingzhengTypes;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date tongxingzhengTime;


    /**
     * 备注
     */
    private String youxigonglueContent;


    /**
     * 审核状态
     */
    private Integer shenheTypes;


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
	 * 获取：学生姓名
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生姓名
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：通行区域
	 */
    public String getTongxingzhengQuyu() {
        return tongxingzhengQuyu;
    }


    /**
	 * 设置：通行区域
	 */
    public void setTongxingzhengQuyu(String tongxingzhengQuyu) {
        this.tongxingzhengQuyu = tongxingzhengQuyu;
    }
    /**
	 * 获取：通行状态
	 */
    public Integer getTongxingzhengTypes() {
        return tongxingzhengTypes;
    }


    /**
	 * 设置：通行状态
	 */
    public void setTongxingzhengTypes(Integer tongxingzhengTypes) {
        this.tongxingzhengTypes = tongxingzhengTypes;
    }
    /**
	 * 获取：时间
	 */
    public Date getTongxingzhengTime() {
        return tongxingzhengTime;
    }


    /**
	 * 设置：时间
	 */
    public void setTongxingzhengTime(Date tongxingzhengTime) {
        this.tongxingzhengTime = tongxingzhengTime;
    }
    /**
	 * 获取：备注
	 */
    public String getYouxigonglueContent() {
        return youxigonglueContent;
    }


    /**
	 * 设置：备注
	 */
    public void setYouxigonglueContent(String youxigonglueContent) {
        this.youxigonglueContent = youxigonglueContent;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getShenheTypes() {
        return shenheTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setShenheTypes(Integer shenheTypes) {
        this.shenheTypes = shenheTypes;
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
