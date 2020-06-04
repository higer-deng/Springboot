package com.yqsh.springboot.demo.properties.controller;

import cn.hutool.core.lang.Dict;

import com.yqsh.springboot.demo.properties.property.ApplicationProperty;
import com.yqsh.springboot.demo.properties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PropertyController {

	private final ApplicationProperty applicationProperty;
	private final DeveloperProperty developerProperty;

	@Autowired
	public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
		this.applicationProperty = applicationProperty;
		this.developerProperty = developerProperty;
	}

	@GetMapping(value = "/property")
	public Dict index() {
		return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
	}
}