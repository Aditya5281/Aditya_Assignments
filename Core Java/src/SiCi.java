
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
