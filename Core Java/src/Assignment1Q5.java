import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ctc = sc.nextInt();
		sc.close();
		TaxAmount ta = new TaxAmount();
		System.out.println(ta.calculateTaxAmount(ctc));
	}

}

public class TaxAmount {

	public double calculateTaxAmount(int ctc){
		double fctc;
        if(ctc>=0 && ctc<=180000){
            fctc = 0.0;
        }
        else if(ctc>=180001 && ctc<=300000){
            fctc = ctc * 0.10;
        }
        else if(ctc>=300001 && ctc<=500000){
            fctc = ctc * 0.20;
        }
        else if(ctc>=500001 && ctc<=1000000){
            fctc = ctc * 0.30;
        }
        else{
            fctc = 0.0;
        }
        return fctc;
    
	}

}
