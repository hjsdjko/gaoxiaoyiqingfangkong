package com.entity.vo;

import com.entity.TongxingzhengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 通行证
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("tongxingzheng")
public class TongxingzhengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生姓名
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


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

    @TableField(value = "tongxingzheng_time")
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

}
