package AssignmentQ6;


import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/AssignmentQ6/springQ6.xml");
        DbConfiguration dbConfiguration = (DbConfiguration)context.getBean("DbConfiguration");
        dbConfiguration.display();
    }
}
