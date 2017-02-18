package com.besedkin;

public class WriterStuffXML {
	private String note;
	public void prepareNotePad(){
		System.out.println("Notepad prepared, ready to write!");
	}
	
	public void writeDownNote(String note){
		this.note = note;
		System.out.println("Note has been written down!");
	}
	public String getNote(){
		return note;
	}

}
