import java.util.Date;

class Pair<K,V>
{
	
	private K key;
	private V value;
	
	public Pair(K key,V value) 
	{
		
		this.key=key;
		this.value=value;		
		System.out.println("key is:--> "+key+" (AND) "+" Value is:--> "+value);
		
	}
}
