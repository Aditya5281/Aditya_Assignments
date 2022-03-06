abstract class Persistence {
    abstract public String persist();
}

class FilePersistence extends Persistence{

    public String persist() {
    	return "FilePersistence";
    }
    
}

class DatabasePersistence extends Persistence{

    public String persist() {
    	return "DatabasePersistence";
    }
    
}

public class Assignment2Q6 {

	public static void main(String[] args) {
		
		Persistence obj1 = new FilePersistence();
		Persistence obj2 = new DatabasePersistence();
		
		System.out.println(obj1.persist());
		System.out.println(obj2.persist());

	}

}