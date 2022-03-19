package AssignmentQ1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test_JunitTest {
	@Test
	void test() {

		ApplicationContext fac = new FileSystemXmlApplicationContext("src/AssignmentQ1/spring1.xml");
		
		Customer customer = (Customer)fac.getBean("info");
		assertEquals(true,fac.containsBean("address"),"this should be true..");
		assertEquals(true,fac.containsBean("info"),"this should also be true..");
		
	}
}
