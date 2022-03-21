package AssignmentQ10;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;

public class DrawingApp {

	public static void main(String[] args) {
    	  
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/AssignmentQ10/spring10.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		int e = triangle.draw(2);
		System.out.println(e);
		
	}
}
