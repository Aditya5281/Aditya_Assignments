import java.util.Date;
public class GenericQ4<K, V> {

		private K key;
		private V value;
		
		public GenericQ4(K key,V value) 
		{
			
			this.key=key;
			this.value=value;		
			System.out.println("key is:--> "+key+" (AND) "+" Value is:--> "+value);
			
		}
		
	public static void main(String[] args) {
			
		GenericQ4<String,String> p=new GenericQ4("1", "Hello");
		GenericQ4<String,Date> p1=new GenericQ4("Today is",new java.util.Date());

    }
	
}
