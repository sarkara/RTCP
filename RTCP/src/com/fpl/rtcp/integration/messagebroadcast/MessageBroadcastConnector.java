package com.fpl.rtcp.integration.messagebroadcast;

import com.fpl.rtcp.pojo.MBIsCellResponseVO;

public interface MessageBroadcastConnector {

	MBIsCellResponseVO dipNumber(String phoneNumber) throws Exception;

}
