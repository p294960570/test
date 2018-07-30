package com.plb.common.model;

public class ResultCode {

	private Integer code;
	private String msg;
	private Object data;

	public ResultCode() {

	}

	public ResultCode(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ResultCode build(Integer code, String msg) {
		ResultCode resultCode = new ResultCode();
		resultCode.code = code;
		resultCode.msg = msg;
		return resultCode;
	}

	public static ResultCode build(Integer code, String msg, Object data) {
		ResultCode resultCode = new ResultCode();
		resultCode.code = code;
		resultCode.msg = msg;
		resultCode.data = data;
		return resultCode;
	}

	public static ResultCode success() {
		ResultCode resultCode = new ResultCode();
		resultCode.code = Messages.SUCCESS_CODE;
		resultCode.msg = Messages.SUCCESS_MSG;
		return resultCode;
	}

	public static ResultCode success(Object data) {
		ResultCode resultCode = new ResultCode();
		resultCode.code = Messages.SUCCESS_CODE;
		resultCode.msg = Messages.SUCCESS_MSG;
		resultCode.data = data;
		return resultCode;
	}

	public static ResultCode error() {
		ResultCode resultCode = new ResultCode();
		resultCode.code = Messages.ERROR_CODE;
		resultCode.msg = Messages.ERROR_MSG;
		return resultCode;
	}
}
