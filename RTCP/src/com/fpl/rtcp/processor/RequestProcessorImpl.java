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
		DipResponse dipResponse = new DipResponse();

		if (input.getDipType().equals("1")) {
			response.setMessage("Preference Portal Check is not yet ready");
			response.setNoOfErrors("1");
			response.setCode("1");
			dipResponse.setIsCell("false");
		}

		else if (input.getDipType().equals("2")) {

			MBIsCellResponseVO mbResponse = mbConnector.dipNumber(input
					.getDipRequest().getPhone_number());

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

			
		}

		else if (input.getDipType().equals("3")) {
			response.setMessage("Preference Portal Check is not yet ready");
			response.setNoOfErrors("1");
			response.setCode("1");
			dipResponse.setIsCell("false");
		}

		else {
			response.setMessage("Invalid Dip Type");
			response.setNoOfErrors("1");
			response.setCode("1");
			dipResponse.setIsCell("false");
		}
		
		response.setDipResponse(dipResponse);
		return response;
	}

}
