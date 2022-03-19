import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter userID : ");
        String userName = scan.nextLine();
        
        System.out.println("Enter password : ");
        String userPass = scan.nextLine();
        
        Login login = new Login();
        
        login.loginUser(userName,userPass);
	}

}
