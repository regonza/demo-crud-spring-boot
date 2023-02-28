package com.example.democrud.controller;

import com.example.democrud.model.Content;
import com.example.democrud.service.api.ContentServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/content")
@CrossOrigin("*")
public class ContentRestController {

	@Autowired
	private ContentServiceAPI contentServiceAPI;

	@GetMapping(value = "/all")
	public List<Content> getAll() {
		return contentServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Content find(@PathVariable Long id) {
		return contentServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Content> save(@RequestBody @Valid Content content) {
		Content obj = contentServiceAPI.save(content);
		return new ResponseEntity<Content>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Content> delete(@PathVariable Long id) {
		Content content = contentServiceAPI.get(id);
		if (content != null) {
			contentServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Content>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Content>(content, HttpStatus.OK);
	}

}
