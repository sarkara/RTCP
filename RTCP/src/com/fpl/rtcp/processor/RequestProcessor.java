package com.fpl.rtcp.processor;

import com.fpl.rtcp.pojo.IsCellRequestVO;
import com.fpl.rtcp.pojo.IsCellResponseVO;

public interface RequestProcessor {

	public IsCellResponseVO dipNumber(IsCellRequestVO input) throws Exception;

}
