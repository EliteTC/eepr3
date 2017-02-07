package com.besedkin;

import java.util.List;

public class Message {
	private String message;
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
