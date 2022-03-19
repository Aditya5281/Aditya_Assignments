import java.util.Scanner;

public class Assignment1Q9 {

	public static void main(String[] args) {
		
	     int[] mark1 = new int[3];
         int[] mark2 = new int[3];
         int[] mark3 = new int[3];
         
         Scanner s = new Scanner(System.in);
         
         for (int i = 0; i < 3; i++) {
        	 
             System.out.println("Enter marks for A,B,C sub : ");
             mark1[i] = s.nextInt();
             mark2[i] = s.nextInt();
             mark3[i] = s.nextInt();
             
         }
         
         Assignment1Q9 tt = new Assignment1Q9();
         /*
          * getting the total marks for further calculation
          */
         int[] yo;
         yo = tt.total(mark1,mark2,mark3);
         Student sd = new Student();
         
     System.out.println(sd.studentsTotalMarksInAllSubjects(yo));
     System.out.println(sd.studentsAverageMarksInAllSubjects(yo));
     System.out.println(sd.subjectATotalByStudents(mark1));
     System.out.println(sd.subjectAAverageByStudents(mark1));
     System.out.println(sd.subjectBTotalByStudents(mark2));
     System.out.println(sd.subjectBAverageByStudents(mark2));
     System.out.println(sd.subjectCTotalByStudents(mark3));
     System.out.println(sd.subjectCAverageByStudents(mark3));
     
    }
 /*
  * upper method call passing here for calculation
  */
     public int[] total(int[] mark1, int[] mark2, int[] mark3){
    	 
     int[] total = new int[3];
     
     for(int i=0;i<3;i++){
         total[i] = mark1[i]+mark2[i]+mark3[i];
     }
     
     return total;

	}

}
