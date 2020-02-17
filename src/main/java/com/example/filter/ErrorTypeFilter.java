package com.example.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ErrorTypeFilter extends ZuulFilter {

	/** Enable(true) or Disable Filter(false) **/
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/** Define Filter Logic Here **/
	@Override
	public Object run() throws ZuulException {
		System.out.println("from error filter");
		return null;
	}

	/** Specify Filter Type **/
	@Override
	public String filterType() {
		return FilterConstants.ERROR_TYPE;
	}

	/** Provider Filter Order for Execution **/
	@Override
	public int filterOrder() {
		return 0;
	}

}
