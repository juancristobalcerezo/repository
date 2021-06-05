package org.decibel.services.imagestore.service.dao;

import org.decibel.services.imagestore.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesDao extends JpaRepository<Image, Integer> {

}
