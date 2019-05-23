package com.alexpoulos.temporaserver;



import org.springframework.data.annotation.Id;


public class Section {

	@Id
	private String id;
	

	private String number;
	
	private String text;
	

	private String audioURL;
	
	//private Work work;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAudioURL() {
		return audioURL;
	}
	public void setAudioURL(String audioURL) {
		this.audioURL = audioURL;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getId() {
		return id;
	}
//	public Work getWork() {
//		return work;
//	}
//	public void setWork(Work work) {
//		this.work = work;
//	}
}
