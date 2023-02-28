package com.example.democrud.service.impl;

import com.example.democrud.commons.GenericServiceImpl;
import com.example.democrud.dao.api.ContentDaoAPI;
import com.example.democrud.dao.api.PersonaDaoAPI;
import com.example.democrud.model.Content;
import com.example.democrud.model.Persona;
import com.example.democrud.service.api.ContentServiceAPI;
import com.example.democrud.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl extends GenericServiceImpl<Content, Long> implements ContentServiceAPI {

	@Autowired
	private ContentDaoAPI contentDaoAPI;
	
	@Override
	public CrudRepository<Content, Long> getDao() {
		return contentDaoAPI;
	}

}
