import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
	        System.out.println("Enter CTC : ");
	        int ctc = scan.nextInt();
	        TaxAmount tx = new TaxAmount();
	        double tax = tx.calculateTaxAmount(ctc);
	        System.out.println(tax);
	}

}
