package AssignmentQ8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/AssignmentQ8/spring8.xml");

		  BeanLifeCycle obj = (BeanLifeCycle) context.getBean("helloWorld");
	      context.registerShutdownHook();
	      obj.getMessage();

	}

}
