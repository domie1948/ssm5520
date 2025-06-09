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
 * 房屋信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-16 20:49:38
 */
@TableName("fangwuxinxi")
public class FangwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangwuxinxiEntity() {
		
	}
	
	public FangwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 房间号
	 */
					
	private String fangjianhao;
	
	/**
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
	/**
	 * 房屋类型
	 */
					
	private String fangwuleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 房型
	 */
					
	private String fangxing;
	
	/**
	 * 面积
	 */
					
	private String mianji;
	
	/**
	 * 月租金
	 */
					
	private String yuezujin;
	
	/**
	 * 咨询电话
	 */
					
	private String zixundianhua;
	
	/**
	 * 地区
	 */
					
	private String diqu;
	
	/**
	 * 详细地址
	 */
					
	private String xiangxidizhi;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：房间号
	 */
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
	/**
	 * 设置：房屋名称
	 */
	public void setFangwumingcheng(String fangwumingcheng) {
		this.fangwumingcheng = fangwumingcheng;
	}
	/**
	 * 获取：房屋名称
	 */
	public String getFangwumingcheng() {
		return fangwumingcheng;
	}
	/**
	 * 设置：房屋类型
	 */
	public void setFangwuleixing(String fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}
	/**
	 * 获取：房屋类型
	 */
	public String getFangwuleixing() {
		return fangwuleixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：房型
	 */
	public void setFangxing(String fangxing) {
		this.fangxing = fangxing;
	}
	/**
	 * 获取：房型
	 */
	public String getFangxing() {
		return fangxing;
	}
	/**
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
	/**
	 * 设置：月租金
	 */
	public void setYuezujin(String yuezujin) {
		this.yuezujin = yuezujin;
	}
	/**
	 * 获取：月租金
	 */
	public String getYuezujin() {
		return yuezujin;
	}
	/**
	 * 设置：咨询电话
	 */
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
	/**
	 * 设置：地区
	 */
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
	/**
	 * 设置：详细地址
	 */
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}

}
