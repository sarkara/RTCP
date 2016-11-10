package com.fpl.rtcp.integration.messagebroadcast;

import com.fpl.rtcp.pojo.MBIsCellResponseVO;
import com.fpl.rtcp.properties.SystemProperties;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MessageBroadcastConnectorImpl implements MessageBroadcastConnector {

	private final String USER_AGENT = SystemProperties.getInstance().getProperty("USER_AGENT");
	private final String MB_DIP_URL = SystemProperties.getInstance().getProperty("MB_DIP_URL");
	
	
	@Override
	public MBIsCellResponseVO dipNumber(String phoneNumber) throws Exception {
		String url = MB_DIP_URL + "?phoneNumber=" + phoneNumber;
		// MBIsCellResponseVO responseObj = new MBIsCellResponseVO();
		Gson gson = new Gson();

		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);

//			int responseCode = con.getResponseCode();
			// System.out.println("\nSending 'GET' request to URL : " + url);
			// System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			return (MBIsCellResponseVO) gson.fromJson(response.toString(),
					MBIsCellResponseVO.class);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	public static void main (String srg[])
	{
		System.out.println(SystemProperties.getInstance().getProperty("USER_AGENT"));
	}

}
