import java.util.Scanner;

public class Assignment1Q1 {

	 public int armstrongCheck(int num) {
	        int n=num;
	        int r;int sum=0;
	        
	        while(n!=0){
	            r = n%10;
	            n = n/10;
	            sum = sum + r*r*r;
	        }
	        
	        return sum;
	 }

	 public static void main(String[] args) {
         int num,finalResult;
         Scanner s = new Scanner(System.in);
         System.out.println("Enter number : ");
         num = s.nextInt();
         
         Assignment1Q1  arm = new Assignment1Q1 ();
         finalResult = arm.armstrongCheck(num);
         
         if(finalResult==num){
             System.out.println("Armstrong num");
         }
         else{
             System.out.println("not Armstrong num");
         }
         
     }
}
