package org.decibel.services.imagestore.service;

import java.util.List;

import org.decibel.services.imagestore.domain.ImageStoreException;
import org.decibel.services.imagestore.domain.Mapper;
import org.decibel.services.imagestore.domain.ProccessedDomain;
import org.decibel.services.imagestore.domain.ProccessedDomainDto;
import org.decibel.services.imagestore.service.dao.DomainsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
class StoreService implements IStoreService {

	@Autowired
	private DomainsDao dao;
	
	@Autowired
	private Mapper mapper;
	
	
	
	@Override
	public ProccessedDomainDto save(ProccessedDomainDto collection) {
		
		ProccessedDomain previous = dao.findByDomain(collection.getDomain());
		
		if (previous!=null) {
			collection.setId(previous.getId());
		}
		
		ProccessedDomain domain = mapper.toEntity(collection);
		
		dao.save(domain);
		
		collection.setId(domain.getId());;
		
		return collection;
	}


	@Override
	public List<ProccessedDomainDto> save(List<ProccessedDomainDto> collection) {
		
		for (ProccessedDomainDto item:collection) {
			save(item);
		}
		return collection;
	}


	@Override
	public ProccessedDomainDto find(String domain) throws ImageStoreException {
		ProccessedDomain entity = dao.findByDomain(domain);
		return mapper.toDto(entity);
	}

	
	
	
}
