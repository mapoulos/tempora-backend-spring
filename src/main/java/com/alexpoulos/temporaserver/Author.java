package com.alexpoulos.temporaserver;

import java.util.List;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Author {
	
	@Id
	private String id;
	
	private String name;
	private String info;
	
	
	private List<Work> works;
	
	public Author(final String name, final String info, final List<Work> works) {
		this.name = name;
		this.info = info;
		this.works = works;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<Work> getWorks() {
		return works;
	}

	public void setWorks(List<Work> works) {
		this.works = works;
	}
	
	public String getId() {
		return id;
	}
	
}
