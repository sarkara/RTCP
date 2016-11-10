package com.fpl.rtcp.processor;

import com.fpl.rtcp.integration.messagebroadcast.MessageBroadcastConnector;
import com.fpl.rtcp.integration.messagebroadcast.MessageBroadcastConnectorImpl;
import com.fpl.rtcp.pojo.DipResponse;
import com.fpl.rtcp.pojo.IsCellRequestVO;
import com.fpl.rtcp.pojo.IsCellResponseVO;
import com.fpl.rtcp.pojo.MBIsCellResponseVO;

public class RequestProcessorImpl implements RequestProcessor {

	private MessageBroadcastConnector mbConnector = new MessageBroadcastConnectorImpl();

	@Override
	public IsCellResponseVO dipNumber(IsCellRequestVO input) throws Exception {
		IsCellResponseVO response = new IsCellResponseVO();

		MBIsCellResponseVO mbResponse = mbConnector.dipNumber(input
				.getDipRequest().getPhone_number());

		DipResponse dipResponse = new DipResponse();
		

		

		if (mbResponse.getError().isEmpty()) {
			response.setMessage("Success");
			response.setNoOfErrors("0");
			response.setCode("0");
			dipResponse.setIsCell(mbResponse.getIsCell());
		}

		else {
			response.setMessage(mbResponse.getError());
			response.setNoOfErrors("1");
			response.setCode("1");
			dipResponse.setIsCell("false");
		}
		
		response.setDipResponse(dipResponse);

		return response;
	}

}
