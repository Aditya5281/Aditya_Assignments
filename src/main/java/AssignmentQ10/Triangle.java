package AssignmentQ10;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private ApplicationContext context = null;
	
	public int draw(int r) {
	     return r;
	}
	

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		//System.out.println("App Context used is : "+context);
		
	}


	public void setBeanName(String beanName) {
		System.out.println("Bean Name used from XML is : "+beanName);
		
	}
}