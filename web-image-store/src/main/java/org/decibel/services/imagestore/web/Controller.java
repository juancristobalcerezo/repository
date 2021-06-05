package org.decibel.services.imagestore.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.decibel.services.imagestore.domain.ProccessedDomainDto;
import org.decibel.services.imagestore.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private IStoreService store;
	
	
	@PostMapping
	public ResponseEntity<List<ProccessedDomainDto>> collectImages(@RequestBody List<ProccessedDomainDto> collection, HttpServletRequest request) {
		
		return new ResponseEntity<>(store.save(collection), HttpStatus.CREATED);
		
		//return new ResponseEntity<>(new TagsCollection(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
