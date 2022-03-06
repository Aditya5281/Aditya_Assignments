
public class Assignment5Q3 {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5,6};
		String arr1[]= {"Abc","BBB","CCC","DDD"};
		
		GenericQ3 ass1=new GenericQ3();
		
		Integer a[]=ass1.exchange(arr);
		String a3[]=ass1.exchange(arr1);
		
		for (Integer a2:a)
		{
			System.out.println(a2);
		}
		
		for (String a2:a3)
		{
			System.out.println(a2);
		}		

	}

}
