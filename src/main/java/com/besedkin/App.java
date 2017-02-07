package com.besedkin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      Message obj = (Message) context.getBean("message");

	      obj.getMessage();
	      obj.setMessage("Set new message for 1st obj");
	      obj.getMessage();
	      
	      Message obj2 = (Message) context.getBean("message2");
	      obj2.getMessage();
	      
	      Message obj3 = (Message) context.getBean("message3");
	      obj3.getMessage();
	      
	      Message obj4 = (Message) context.getBean("message4");
	      obj4.getNotes();
	}

}
