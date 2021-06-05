package org.decibel.services.imagestore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PROCESSED_DOMAINS")
public class ProccessedDomain  {
	


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer id;
	
	private String domain;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Image> images;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public List<Image> getImages() {
		if (images==null) {
			images = new ArrayList<>();
		}
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	

}
