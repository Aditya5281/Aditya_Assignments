
public class Assignment3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("StringBuffer");
	    sb.append(" is a peer class of String");
	    sb.append(" that provides much of");
	    sb.append(" the functionality of strings");
	    System.out.println(sb);
	    
	    StringBuffer  sb2= new StringBuffer("It is used to at the specified index position");
	    sb2.insert(10," Insert text");
	    System.out.println(sb2);
	    
	    StringBuffer sb1 = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(sb1.reverse());
	}

}
