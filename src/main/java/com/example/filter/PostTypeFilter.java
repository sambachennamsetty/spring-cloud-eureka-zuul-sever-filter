package com.example.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostTypeFilter extends ZuulFilter {

	/** Enable(true) or Disable Filter(false) **/
	public boolean shouldFilter() {
		return true;
	}

	/** Define Filter Logic Here **/
	public Object run() throws ZuulException {
		System.out.println("FROM POST FILTER");
		return null;
	}

	/** Specify Filter Type **/
	public String filterType() {
		return FilterConstants.POST_TYPE;
	}

	/** Provider Filter Order for Execution **/
	public int filterOrder() {
		return 0;
	}

}
