 package com.cg.hims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hims.entities.Property;
import com.cg.hims.service.IPropertyService;

@RestController
public class PropertyController {
	@Autowired
	private IPropertyService property_service;
	@PostMapping("/addProperty")
	public Property add_property(@RequestBody Property property) {
		return property_service.addProperty(property);
	}
	@GetMapping("/viewingProperties")
	public List<Property> view_property() {
		return property_service.viewProperty();
	}

}
