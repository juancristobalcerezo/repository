package org.decibel.services.imagestore.domain;


import java.util.ArrayList;
import java.util.List;



public class ProccessedDomainDto {

	private Integer id;
	
	
	private String domain;
	
	
	
	private List<String> images;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<String> getImages() {
		if (images==null) {
			images = new ArrayList<>();
		}
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	
	
	
	
	
	
	
	
}
