package com.besedkin;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WriterStuffAnnotated {
	private String note;
	@Pointcut("execution(* com.besedkin.Note.createNote(Note)")
	public void noting(){}

	@Before("noting()")
	public void prepareNotePad() { 
		System.out.println("Notepad prepared, ready to write!");
	}

	@AfterReturning("noting()")
	public void writeDownNote(String note) { 
		this.note = note;
		System.out.println(note.getTitle()+ " has been written down!");
	}

	public String getNote(){
		return note;
	}

}
