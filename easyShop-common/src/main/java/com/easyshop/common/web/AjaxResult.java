/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.easyshop.common.web;

/**
 * @description ajax请求返回信息
 * @author ywu@wuxicloud.com
 * 2015年5月27日 下午2:30:50
 */
public class AjaxResult {
	private static final String DEFAULT_MSG = "操作成功";
	/**
	 * 操作状态,0:成功,1:失败
	 */
	private int status = 0;
	/**
	 * 提示信息
	 */
	private String msg = DEFAULT_MSG;
	/**
	 * 操作状态,0:成功,1:失败
	 * @param status
	 */
	public AjaxResult(int status) {
		this.status = status;
	}
	/**
	 * @param status 操作状态,0:成功,1:失败
	 * @param msg 提示信息
	 */
	public AjaxResult(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
