package Spring_Beans_Example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
     
	public Object postProcessorAfterInitialization(Object bean,String beanName) throws BeansException{   //after completing initialization any bean this one called
		System.out.println("In After Initialization method. Bean name is " + beanName);
		return bean;
	}
	
	public Object postProcessorBeforeInitialization(Object bean,String beanName) throws BeansException{ //before initializing any bean this one called
		System.out.println("In Before Initialization method. Bean name is " + beanName);
		return bean;
	}
	
}
