package org.decibel.services.imagestore.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class ImageDto {



	private Integer id;

	//@JsonDeserialize(using = UrlDeseralizer.class)
	private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
