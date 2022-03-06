
public class Assignment1Q1 {

	 public boolean armstrongCheck(int num) {
		 int r,res=0;
		 r=num%10;
		 res=res+r*r*r;
		 num=num/10;
		 
		 if(res==num) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

}

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s.nextInt();
        s.close();
		Assignment1Q1 A1 = new Assignment1Q1();
		System.out.println(A1.armstrongCheck(num));
	}

}
