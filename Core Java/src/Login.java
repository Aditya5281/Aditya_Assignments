
public class Login {
	
	String userId = "Ajay",password = "password";  //initialize
    static int count=0; 
    public String loginUser(String user, String pass) {
    	
        if(userId.equals(user)){                      //if the user id and credentials of user are equal
            if(password.equals(pass)) {               //if the password of user are equal to user entered password
                System.out.println("Welcome Ajay");
            }
            
            else {                                    //if the password of user are not equal to user entered password
                count += 1;
                if(count<3){                          //if enter wrong password more then 3 than contact admin
                	System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                }
                
                else{
                    System.out.println("You have entered wrong credentials 3 times");
                    System.out.println("Contact Admin");
                    System.exit(0);
                }
            }
        }
        
        else {
            count += 1;
            if(count<3){
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                //Assignment1Q6.main(null);
            }
            
            else{
                System.out.println("You have entered wrong credentials 3 times");
                System.out.println("Contact Admin");
                System.exit(0);
            }
        }
        return null;
    }
}

