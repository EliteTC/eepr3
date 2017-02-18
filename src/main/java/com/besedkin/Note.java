package com.besedkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Note {
	
	private String title;
	
	private String text;
	
	
	Note(){
		
	}
	
	Note(String title,String text){
		this.title = title;
		this.text = text;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public Note createNote(Note note){
		return note;
		
	}
	

}
