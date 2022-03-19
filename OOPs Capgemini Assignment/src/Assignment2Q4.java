abstract class account{
	abstract int amount();
	
	int deposit() {
		return 1000;
	}
}

public class Assignment2Q4 extends account {
	int amount() {
		return 3000; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q4 obj = new Assignment2Q4();
		System.out.println(obj.deposit());
		System.out.println(obj.amount());
	}

}
