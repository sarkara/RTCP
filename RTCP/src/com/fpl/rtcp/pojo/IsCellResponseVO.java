package com.fpl.rtcp.pojo;

public class IsCellResponseVO {

	private String message;

	private String noOfErrors;

	private String code;

	private DipResponse dipResponse;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNoOfErrors() {
		return noOfErrors;
	}

	public void setNoOfErrors(String noOfErrors) {
		this.noOfErrors = noOfErrors;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public DipResponse getDipResponse() {
		return dipResponse;
	}

	public void setDipResponse(DipResponse dipResponse) {
		this.dipResponse = dipResponse;
	}

	@Override
	public String toString() {
		return "ClassPojo [message = " + message + ", noOfErrors = "
				+ noOfErrors + ", code = " + code + ", dipResponse = "
				+ dipResponse + "]";
	}
}
