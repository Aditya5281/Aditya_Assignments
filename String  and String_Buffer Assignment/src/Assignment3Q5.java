
public class Assignment3Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("StringBuffer");
	    sb.append(" is a peer class of String");
	    sb.append(" that provides much of");
	    sb.append(" the functionality of strings");
	    System.out.println(sb);
	    
	    StringBuilder  sb2= new StringBuilder("It is used to at the specified index position");
	    sb2.insert(10," Insert text");
	    System.out.println(sb2);
	    
	    StringBuilder sb1 = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(sb1.reverse());

	}

}
