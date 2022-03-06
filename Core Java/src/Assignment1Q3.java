
public class Assignment1Q3 {

	public static void main(String[] args) {
		
		 SiCi sc = new SiCi();
		 System.out.println(sc.simpleInterest(20000,3,200));
		 System.out.println(sc.compoundInterest(190000,2,300));
	}

}

public class SiCi {

	 public double simpleInterest(double principalAmount,int time,double interestRate){
	        double Si = (principalAmount*time*interestRate)/100;
	        return Si ;
	 }
	 public double compoundInterest(double principalAmount,int time,double interestRate){
	        double Ci = (principalAmount * Math.pow((1.0+interestRate/100),time))-principalAmount;
	        return Ci;
	 }

}
