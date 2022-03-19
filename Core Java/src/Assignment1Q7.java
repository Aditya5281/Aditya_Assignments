import java.util.Scanner;

public class Assignment1Q7 {

	public static void main(String[] args) {
		
		int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value to check : ");
        int valueToCheck = scan.nextInt();
        SearchArray sA = new SearchArray();
        sA.searchArray(arr, valueToCheck);
        
	}
}
