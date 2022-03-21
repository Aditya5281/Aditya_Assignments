package AssignmentQ9;

import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {


	public static void main(String[] args) {
		
		  AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/AssignmentQ9/spring9.xml");

		  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      context.registerShutdownHook();
	      obj.getMessage();
	      
	}

}
