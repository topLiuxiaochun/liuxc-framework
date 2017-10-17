/**
 * 
 */
package com.liuxc.hessian.client.service;

/**
 * 客户端接口服务
 * @author dell
 *
 */
public interface BasicService {

	String getIntfName();
	
	String getSum(Integer a, Integer b);
	
	String notRemoteService();
}
