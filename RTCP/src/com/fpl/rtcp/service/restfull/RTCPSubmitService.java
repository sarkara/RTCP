package com.fpl.rtcp.service.restfull;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.fpl.rtcp.pojo.IsCellRequestVO;
import com.fpl.rtcp.pojo.IsCellResponseVO;
import com.fpl.rtcp.processor.RequestProcessor;
import com.fpl.rtcp.processor.RequestProcessorImpl;

/**
 * A sample resource that provides access to server configuration properties
 */
@Path(value = "/service")
public class RTCPSubmitService {

	private RequestProcessor reqProcessor = new RequestProcessorImpl();

	public RTCPSubmitService() {

	}

	@GET
	@Produces(value = "text/plain")
	public String getList() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("################# Welcome ##################\n");
		buffer.append("FPL Realtime Communication Platform Services\n");
		buffer.append("--------------------------------------------");
		return buffer.toString();
	}

	@POST
	@Path("/iscell")
	@Consumes(value = "application/json")
	@Produces("application/json")
	public IsCellResponseVO creategetProductInJSON(IsCellRequestVO input) {
//		System.out.println("---1----");
		try {
			return reqProcessor.dipNumber(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
