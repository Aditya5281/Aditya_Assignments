package AssignmentQ5;

import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RunEmployee {
	public static void main(String[] args) {
		AbstractApplicationContext fac = new FileSystemXmlApplicationContext("src/main/java/AssignmentQ5/spring5.xml");
		Employee e = (Employee)fac.getBean("employee");
		System.out.println(e.toString());

	}
}
