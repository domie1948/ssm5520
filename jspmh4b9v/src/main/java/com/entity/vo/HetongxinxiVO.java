package com.entity.vo;

import com.entity.HetongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 合同信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-16 20:49:38
 */
public class HetongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
