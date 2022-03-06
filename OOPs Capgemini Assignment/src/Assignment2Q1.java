
public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				SingletoninheritCheck s1 = SingletoninheritCheck.getInstance();

			}
}

class SingletoninheritCheck{
			
			private static SingletoninheritCheck single;
			private SingletoninheritCheck() {
				
			}
			
			public static SingletoninheritCheck getInstance() {
				System.out.println("This is singleton class");
				return single;
			}
			
}


