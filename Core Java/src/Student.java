
public class Student {
	
    public int studentsTotalMarksInAllSubjects(int[] students) {
    	
        int sum=0;
        
        for(int i=0;i<3;i++){
            sum = sum + students[i];
        }
        
        return sum;
    }
    
    public double studentsAverageMarksInAllSubjects(int[] students) {
    	
        double avg=0;
        
        for(int i=0;i<3;i++){
            avg =  studentsTotalMarksInAllSubjects(students)/3.0;
        }
        
        return avg;
    }
    //public int[] subjectWiseMarks(Student[] students,String subjectName){ }
    public int subjectATotalByStudents(int[] marks1) {
    	
        int tSA;
        tSA = marks1[0]+marks1[1]+marks1[2];
        return tSA;
        
    }
    public int subjectBTotalByStudents(int[] marks2) {
    	
        int tSB;
        tSB = marks2[0]+marks2[1]+marks2[2];
        return tSB;
        
    }
    public int subjectCTotalByStudents(int[] marks3) {
    	
        int tSC;
        tSC = marks3[0]+marks3[1]+marks3[2];
        return tSC;
        
    }
    //public int (subjectTotalByStudents(int[] marks);
    public double subjectAAverageByStudents(int[] marks1) {
    	
        double avgSA;
        avgSA = subjectATotalByStudents(marks1)/3.0;
        return avgSA;
        
    }
    public double subjectBAverageByStudents(int[] marks2) {
    	
        double avgSB;
        avgSB = subjectATotalByStudents(marks2)/3.0;
        return avgSB;
        
    }
    public double subjectCAverageByStudents(int[] marks3) {
    	
        double avgSC;
        avgSC = subjectATotalByStudents(marks3)/3.0;
        return avgSC;
        
    }
}
