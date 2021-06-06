package org.decibel.services.imagestore.domain;

import org.springframework.stereotype.Component;

@Component
public class Mapper {

	public ProccessedDomain toEntity(ProccessedDomainDto dto) {
		ProccessedDomain entity = new ProccessedDomain();
		entity.setId(dto.getId());
		entity.setDomain(dto.getDomain());

		for (String imageDto : dto.getImages()) {
			Image image = new Image();
			image.setUrl(imageDto);
			entity.getImages().add(image);

		}
		return entity;
	}

	public ProccessedDomainDto toDto(ProccessedDomain entity) throws ImageStoreException {

		ProccessedDomainDto dto = new ProccessedDomainDto();

		try {
			dto.setId(entity.getId());
			dto.setDomain(entity.getDomain());

			for (Image image : entity.getImages()) {
				dto.getImages().add(image.getUrl());

			}

			return dto;
		} catch (Exception e) {
			throw new ImageStoreException(e.getMessage());
		}
	}

}
