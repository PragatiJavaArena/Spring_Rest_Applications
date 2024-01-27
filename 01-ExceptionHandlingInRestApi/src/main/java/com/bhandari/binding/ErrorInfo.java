package com.bhandari.binding;

import java.time.LocalDateTime;

public class ErrorInfo {

	private String code;
	private String msg;
	private LocalDateTime when;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getWhen() {
		return when;
	}
	public void setWhen(LocalDateTime when) {
		this.when = when;
	}
	@Override
	public String toString() {
		return "ErrorInfo [code=" + code + ", msg=" + msg + ", when=" + when + "]";
	}
	
	
}
