package AssignmentQ1;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext fac = new FileSystemXmlApplicationContext("src/main/java/AssignmentQ1/spring1.xml");
		 
		Customer customer = (Customer)fac.getBean("info");
		System.out.println(customer.toString());

	}
}
