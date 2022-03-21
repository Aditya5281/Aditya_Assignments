package Spring_Beans_Example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//Use Application Context in order to initialize the spring container
		  		                                                                        //Use Xml file in order to configure it
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");  //triangle is id
		triangle.draw();
	}

} 
