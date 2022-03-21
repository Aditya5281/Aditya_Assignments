package AssignmentQ8;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

public class BeanLifeCycle{
     
	private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
	   @PostConstruct
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   
	   @PreDestroy
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
	   
	   
}
