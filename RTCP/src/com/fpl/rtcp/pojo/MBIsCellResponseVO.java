package com.fpl.rtcp.pojo;

public class MBIsCellResponseVO {

	private String origPhoneNumber;

	private String error;

	private String isCell;

	public String getOrigPhoneNumber() {
		return origPhoneNumber;
	}

	public void setOrigPhoneNumber(String origPhoneNumber) {
		this.origPhoneNumber = origPhoneNumber;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getIsCell() {
		return isCell;
	}

	public void setIsCell(String isCell) {
		this.isCell = isCell;
	}

	@Override
	public String toString() {
		return "ClassPojo [origPhoneNumber = " + origPhoneNumber + ", error = "
				+ error + ", isCell = " + isCell + "]";
	}
}
