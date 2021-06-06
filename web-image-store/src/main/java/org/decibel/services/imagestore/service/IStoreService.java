package org.decibel.services.imagestore.service;

import java.util.List;

import org.decibel.services.imagestore.domain.ImageStoreException;
import org.decibel.services.imagestore.domain.ProccessedDomainDto;

public interface IStoreService {

	ProccessedDomainDto save(ProccessedDomainDto collection);

	List<ProccessedDomainDto> save(List<ProccessedDomainDto> collection);

	ProccessedDomainDto find(String domain) throws ImageStoreException;

}
