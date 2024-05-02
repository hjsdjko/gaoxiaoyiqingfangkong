package com.entity.view;

import com.entity.TongxingzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 通行证
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("tongxingzheng")
public class TongxingzhengView extends TongxingzhengEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 通行状态的值
		*/
		private String tongxingzhengValue;
		/**
		* 审核状态的值
		*/
		private String shenheValue;



		//级联表 yonghu
			/**
			* 学工号
			*/
			private String yonghuXuegonghao;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 学院
			*/
			private String yonghuXueyuan;
			/**
			* 专业
			*/
			private String yonghuZhuanye;
			/**
			* 班级
			*/
			private String yonghuBanji;
			/**
			* 年级
			*/
			private String yonghuNianji;

	public TongxingzhengView() {

	}

	public TongxingzhengView(TongxingzhengEntity tongxingzhengEntity) {
		try {
			BeanUtils.copyProperties(this, tongxingzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 通行状态的值
			*/
			public String getTongxingzhengValue() {
				return tongxingzhengValue;
			}
			/**
			* 设置： 通行状态的值
			*/
			public void setTongxingzhengValue(String tongxingzhengValue) {
				this.tongxingzhengValue = tongxingzhengValue;
			}
			/**
			* 获取： 审核状态的值
			*/
			public String getShenheValue() {
				return shenheValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setShenheValue(String shenheValue) {
				this.shenheValue = shenheValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 学工号
					*/
					public String getYonghuXuegonghao() {
						return yonghuXuegonghao;
					}
					/**
					* 设置： 学工号
					*/
					public void setYonghuXuegonghao(String yonghuXuegonghao) {
						this.yonghuXuegonghao = yonghuXuegonghao;
					}
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 学院
					*/
					public String getYonghuXueyuan() {
						return yonghuXueyuan;
					}
					/**
					* 设置： 学院
					*/
					public void setYonghuXueyuan(String yonghuXueyuan) {
						this.yonghuXueyuan = yonghuXueyuan;
					}
					/**
					* 获取： 专业
					*/
					public String getYonghuZhuanye() {
						return yonghuZhuanye;
					}
					/**
					* 设置： 专业
					*/
					public void setYonghuZhuanye(String yonghuZhuanye) {
						this.yonghuZhuanye = yonghuZhuanye;
					}
					/**
					* 获取： 班级
					*/
					public String getYonghuBanji() {
						return yonghuBanji;
					}
					/**
					* 设置： 班级
					*/
					public void setYonghuBanji(String yonghuBanji) {
						this.yonghuBanji = yonghuBanji;
					}
					/**
					* 获取： 年级
					*/
					public String getYonghuNianji() {
						return yonghuNianji;
					}
					/**
					* 设置： 年级
					*/
					public void setYonghuNianji(String yonghuNianji) {
						this.yonghuNianji = yonghuNianji;
					}


}
