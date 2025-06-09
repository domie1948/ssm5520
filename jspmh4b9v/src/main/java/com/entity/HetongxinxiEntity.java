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
 * 合同信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-16 20:49:38
 */
@TableName("hetongxinxi")
public class HetongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HetongxinxiEntity() {
		
	}
	
	public HetongxinxiEntity(T t) {
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
	 * 合同编号
	 */
					
	private String hetongbianhao;
	
	/**
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
	/**
	 * 房屋类型
	 */
					
	private String fangwuleixing;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 总租金
	 */
					
	private String zongzujin;
	
	/**
	 * 租赁日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zulinriqi;
	
	/**
	 * 租赁时间
	 */
					
	private String zulinshijian;
	
	/**
	 * 合同内容
	 */
					
	private String hetongneirong;
	
	/**
	 * 合同文件
	 */
					
	private String hetongwenjian;
	
	/**
	 * 签订日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qiandingriqi;
	
	/**
	 * 有效期
	 */
					
	private String youxiaoqi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：合同编号
	 */
	public void setHetongbianhao(String hetongbianhao) {
		this.hetongbianhao = hetongbianhao;
	}
	/**
	 * 获取：合同编号
	 */
	public String getHetongbianhao() {
		return hetongbianhao;
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
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：总租金
	 */
	public void setZongzujin(String zongzujin) {
		this.zongzujin = zongzujin;
	}
	/**
	 * 获取：总租金
	 */
	public String getZongzujin() {
		return zongzujin;
	}
	/**
	 * 设置：租赁日期
	 */
	public void setZulinriqi(Date zulinriqi) {
		this.zulinriqi = zulinriqi;
	}
	/**
	 * 获取：租赁日期
	 */
	public Date getZulinriqi() {
		return zulinriqi;
	}
	/**
	 * 设置：租赁时间
	 */
	public void setZulinshijian(String zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	/**
	 * 获取：租赁时间
	 */
	public String getZulinshijian() {
		return zulinshijian;
	}
	/**
	 * 设置：合同内容
	 */
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
	/**
	 * 设置：合同文件
	 */
	public void setHetongwenjian(String hetongwenjian) {
		this.hetongwenjian = hetongwenjian;
	}
	/**
	 * 获取：合同文件
	 */
	public String getHetongwenjian() {
		return hetongwenjian;
	}
	/**
	 * 设置：签订日期
	 */
	public void setQiandingriqi(Date qiandingriqi) {
		this.qiandingriqi = qiandingriqi;
	}
	/**
	 * 获取：签订日期
	 */
	public Date getQiandingriqi() {
		return qiandingriqi;
	}
	/**
	 * 设置：有效期
	 */
	public void setYouxiaoqi(String youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	/**
	 * 获取：有效期
	 */
	public String getYouxiaoqi() {
		return youxiaoqi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
