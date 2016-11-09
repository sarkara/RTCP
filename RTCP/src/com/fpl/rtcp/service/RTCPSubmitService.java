package com.fpl.rtcp.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A sample resource that provides access to server configuration properties
 */
@Path(value = "/service")
public class RTCPSubmitService {
	public RTCPSubmitService() {

	}

//	private static String[] list = new String[] { "Eric- 932 Deloraine Av.",
//			"Yen - 687 Markham Rd.", "Keith - 4301 McCowan Rd.",
//			"Ron - 465 Melrose St.", "Jane - 35 Cranbrooke Av.",
//			"Sam - 146 Brooke Av."
//
//	};

	@GET
	@Produces(value = "text/plain")
	public String getList() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("################# Welcome ##################\n");
		buffer.append("FPL Realtime Communication Platform Services\n");
		buffer.append("--------------------------------------------");
		return buffer.toString();
	}
	//
	// @GET
	// @Produces(value="text/plain")
	// @Path(value="{id}")
	// public String getPropety(@PathParam("id") int id) {
	// if (id > -1 && id < list.length -1) {
	// return list[id];
	// }
	// else {
	// return "Name Not Found";
	// }
	// }
	//
	// @GET
	// @Produces(value="text/html")
	// @Path(value="html")
	// public String getHTMLList()
	// {
	// return "<html><body><p><b>Hello</b></body></html>";
	// }
	//
	// @POST
	// @Produces(value="text/html")
	// @Path(value="form")
	// public String handlePost(@PathParam("name") String name,@PathParam("age")
	// int age)
	// {
	// return "<html><body><p>name: " + name + "<p>age: " + age;
	// }
	//
	//
	//
	// @GET
	// @Path("/get")
	// @Produces("application/json")
	// public Product getProductInJSON() {
	//
	// Product product = new Product();
	// product.setName("iPad 3");
	// product.setQty(999);
	//
	// return product;
	//
	// }
	//
	//
	// @POST
	// @Path("/post")
	// @Consumes(value="application/json")
	// public Response createProductInJSON(Product product) {
	//
	// String result = "Product created : " + product;
	// System.out.println(">>>>>>>>>>>>>>>>>>>"+product.getName());
	//
	// return Response.status(201).entity(result).build();
	//
	// }
	//
	// @POST
	// @Path("/postproduct")
	// @Consumes(value="application/json")
	// @Produces("application/json")
	// public Product creategetProductInJSON(Product product) {
	//
	// return product;
	//
	// }
}
