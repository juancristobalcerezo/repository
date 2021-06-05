package org.decibel.services.imagestore.service.dao;

import org.decibel.services.imagestore.domain.ProccessedDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainsDao extends JpaRepository<ProccessedDomain, Integer> {

}
