import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
	
@ Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface test
{
	int value() default 6;

}

public class Assignment7Q1 {

	@test(value=10)
	public void get()
	{
		System.out.println("Inside get method");
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Assignment7Q1 an=new Assignment7Q1();
		an.get();
		Class c=an.getClass();
		Method m=c.getMethod("get");
		test t=m.getAnnotation(test.class);
		System.out.println(t.value());

	}

}
