import java.util.Scanner;

public class Assignment4Q1 {
	
      public static void main(String[] args) {
    	  
    	  int result=0;
    	  
    	  Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.close();
			
		try {
			
			result = a/b;
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		System.out.println(result);
	}
}
