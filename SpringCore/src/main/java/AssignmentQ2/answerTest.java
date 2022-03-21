package AssignmentQ2;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class answerTest {
	public static void main(String[] args) {
		// initializing
		ApplicationContext fac = new FileSystemXmlApplicationContext("src/main/java/AssignmentQ2/spring2.xml");
		Question q = (Question)fac.getBean("questions");
		
		// printing out from toString() :
			//[a] list answers
			//[b] set answers
			//[c] map answers
		System.out.println(q.toString());
	}
}
