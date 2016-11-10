package com.fpl.rtcp.service.restfull;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RealTimeCommunicationPlatformApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(RTCPSubmitService.class);
		return classes;
	}

}
