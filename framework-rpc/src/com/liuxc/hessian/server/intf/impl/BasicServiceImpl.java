package com.liuxc.hessian.server.intf.impl;

import com.caucho.hessian.server.HessianServlet;
import com.liuxc.hessian.server.intf.BasicService;

public class BasicServiceImpl extends HessianServlet implements BasicService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getIntfName() {
		return this.getClass().getSuperclass().getName();
	}

	@Override
	public String getSum(Integer a, Integer b) {
		Integer sum = a + b;
		return sum.toString();
	}

}
