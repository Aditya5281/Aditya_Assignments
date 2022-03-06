
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.lang.Math;

public class GenericQ2<K,V> {
	private K key;
	private V value;
	
	public GenericQ2(K key,V value)
	{
		
		this.key=key;
		this.value=value;
		
	}
	
	public void keyvalue()
	{
		
		HashMap<Integer,Double> M=new HashMap<>();
		M.put(1,1.0);
		M.put(2,2.0);
		M.put(3,13.0);
		M.put(4,17.0);
		M.put(5,14.0);
		M.put(6,17.0);
		M.put(7,17.0);
		M.put(8,18.0);
		M.put(9,7.0);
		M.put(10,1.0);
		
		Set<Integer>keySet= M.keySet();
		List<Integer> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        Integer randomKey = keyList.get(randIdx);
        Double randomValue = M.get(randomKey);
        System.out.println("key: " + randomKey + ", value: " + randomValue);

		
	}

}
