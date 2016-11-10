package com.fpl.rtcp.pojo;

public class IsCellRequestVO {

	private String appName;

	private DipRequest dipRequest;

	private String requestId;

	private String dipType;

	private String productName;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public DipRequest getDipRequest() {
		return dipRequest;
	}

	public void setDipRequest(DipRequest dipRequest) {
		this.dipRequest = dipRequest;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDipType() {
		return dipType;
	}

	public void setDipType(String dipType) {
		this.dipType = dipType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ClassPojo [appName = " + appName + ", dipRequest = "
				+ dipRequest + ", requestId = " + requestId + ", dipType = "
				+ dipType + ", productName = " + productName + "]";
	}
}
