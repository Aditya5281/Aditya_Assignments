import java.util.Scanner;

public class Assignment1Q4 {

	public static void main(String[] args) {
		
		ResultDeclaration rd = new ResultDeclaration();
	    Scanner sc = new Scanner(System.in);
	    double subject1Marks=sc.nextDouble();
	    double subject2Marks=sc.nextDouble();
	    double subject3Marks=sc.nextDouble();
		System.out.println(rd.declareResults(subject1Marks,subject2Marks,subject3Marks));
        
	}

}


public class ResultDeclaration {

	public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
		 if((subject1Marks>60 && subject2Marks<60 && subject3Marks<60)||(subject2Marks>60 && subject1Marks<60 && subject3Marks<60)||
                 (subject3Marks>60 && subject1Marks<60 && subject2Marks<60)) {
			 return "failed";
		 }
		 
		 if ((subject1Marks + subject2Marks > 60) || (subject1Marks + subject3Marks > 60) || (subject2Marks + subject3Marks > 60)) {
             return "promoted";
         }
		 
		 if (subject1Marks + subject2Marks + subject3Marks > 60) {
              return "passed";
	      }
		return null;
	}

}
