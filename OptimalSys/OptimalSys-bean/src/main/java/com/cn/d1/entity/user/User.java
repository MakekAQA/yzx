/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: Login.java 
 * @Prject: OptimalSys-bean
 * @Package: com.cn.d1.entity.user 
 * @Description: TODO
 * @author: yzx   
 * @date: 2017年10月24日 下午2:56:22 
 * @version: V1.0   
 */
package com.cn.d1.entity.user;

/** 
 * @ClassName: 登录.注册
 * @Description: TODO
 * @author: yzx
 * @date: 2017年10月24日 下午2:56:22  
 */
public class User {

	private Integer id = null;
	
	private Integer code  = null;
	
	private String phone = null;
	
	private String age = null;
	
	private String pwd = null;
	

	/**
	 * @return the code
	 */
	public final Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public final void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the age
	 */
	public final String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public final void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the pwd
	 */
	public final String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public final void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
