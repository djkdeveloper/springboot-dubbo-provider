package com.djk.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.djk.springboot.service.DubboService;


@Service("dubboService")
public class DubboServiceImpl implements DubboService
{

	public String hello(String name) {
		return "hello world " + name;
	}

}
