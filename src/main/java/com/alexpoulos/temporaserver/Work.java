package com.alexpoulos.temporaserver;



import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Work {
	@Id
	private String id;
	
	private String name;
	
	private String info;
	private List<Section> sections;
	
	
	public Work(final String name, final String info, final List<Section> sections) {
		this.name = name;
		this.info = info;
		this.sections = sections;
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
	
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	public List<Section> getSections() { 
		return sections;
	}
	
	public String getId() {
		return id;
	}


	
}
