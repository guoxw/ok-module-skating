package cn.c.module.skating.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.c.core.domain.DateEntity;

@Entity
@Table(name="tab_Student")
public class Student extends DateEntity {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 头像文件链接
	 */
	private String profilePhotos;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 学校
	 */
	private String school;
	/**
	 * 家长电话
	 */
	private String guardianTelephone;
	/**
	 * QQ
	 */
	private String qq;
	/**
	 * 微信
	 */
	private String weixin;
	/**
	 * 报名日期
	 */
	private Date enrollmentDate;
	/**
	 * 上课时间
	 */
	private String training;
	/**
	 * 证号
	 */
	private String number;
	/**
	 * 轮滑级别
	 */
	private String level;
	/**
	 * 备注
	 */
	private String remark;
	
	@Override
	public String[] getSearchFields(){
		return new String[]{"name", "guardianTelephone"};
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getGuardianTelephone() {
		return guardianTelephone;
	}
	public void setGuardianTelephone(String guardianTelephone) {
		this.guardianTelephone = guardianTelephone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public String getEnrollmentDateFormat() {
		if(enrollmentDate == null) {
			return "";
		}
		return new SimpleDateFormat("yyyy-MM-dd").format(enrollmentDate);
	}
	public void setEnrollmentDateFormat(String enrollmentDateFormat) {
		try {
			this.enrollmentDate = new SimpleDateFormat("yyyy-MM-dd").parse(enrollmentDateFormat);
		} catch (ParseException e) {
		}
	}
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getProfilePhotos() {
		return profilePhotos;
	}
	public void setProfilePhotos(String profilePhotos) {
		this.profilePhotos = profilePhotos;
	}
}
