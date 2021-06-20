 package com.cg.hims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hims.entities.Property;
import com.cg.hims.repository.IPropertyRepository;
@Service
public class IPropertyServiceImplementation implements IPropertyService {
	@Autowired
	private IPropertyRepository property_repository;

	@Override
	public Property addProperty(Property property) {
		return property_repository.save(property);
	}

	@Override
	public List<Property> viewProperty() {
		return  property_repository.findAll();
	}

}
