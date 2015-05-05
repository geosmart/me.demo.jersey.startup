package me.demo.jersey.startup.service.impl;

import me.demo.jersey.startup.service.IAppService;

/**
 * AppServiceImpl
 * 
 * @author geosmart
 */
public class AppServiceimpl implements IAppService {
 
	@Override
	public String sayHelloWord(String userName)
	{ 
		return userName + "：Hello World！";
	}

}
