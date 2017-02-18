package com.besedkin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
		 WriterStuffXML writer = (WriterStuffXML) context.getBean("writer");
	    WriterStuffAnnotated wr = context.getBean(WriterStuffAnnotated.class);
		 Message obj = (Message) context.getBean(Message.class);

	      obj.getMessage();
	      obj.setMessage("Set new message for 1st obj");
	      obj.getMessage();
	      
	      writer.getNote();
	      wr.getNote();
	      Message obj2 = (Message) context.getBean(Message.class);
	      obj2.getMessage();
	      
	      Message obj3 = (Message) context.getBean(Message.class);
	      obj3.getMessage();
	      
	      Message obj4 = (Message) context.getBean(Message.class);
	      obj4.getNotes();
	      
	      
	     
	      
	}

}
