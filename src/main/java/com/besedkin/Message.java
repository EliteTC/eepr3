package com.besedkin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Message {
	
	private String message;
	@Autowired(required = false)
	private List<Note> notes;
	
	Message(){

	}
	
	Message(String message){
		this.message = message;
	}
	
	public void setMessage(String message){
		this.message  = message;
	}
	
	public void setNotes(List<Note> notes){
		this.notes = notes;
	}
	public void getNotes(){
		for(Note f : notes)
			System.out.println(f.getTitle()+" "+f.getText());
	}
	public void getMessage(){
		System.out.println("Your Message : " + message);
	}
}
