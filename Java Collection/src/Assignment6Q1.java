import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignment6Q1 {

		public static void main(String[] args) {
			
			TreeMap<Long,contact> tree=new TreeMap<Long, contact>(Collections.reverseOrder());
			
			contact c1=new contact(9381572080L, "chary", "loki@gmail.com", Gender.Male);
			contact c2=new contact(9885026204L, "Raju", "raju@.com", Gender.Male);
			contact c3=new contact(8121628223L, "harshitha", "kukka@gmail.com", Gender.female);
			contact c4=new contact(6302757240L, "Abhinav", "ABhi@.com", Gender.Male);
			
			tree.put(c1.phonenumber, c1);
			tree.put(c2.phonenumber, c2);
			tree.put(c3.phonenumber, c3);
			tree.put(c4.phonenumber, c4);
			
			Set<Entry<Long,contact>> entry=tree.entrySet();
			
			for (Entry<Long, contact> e : entry) 
			{
				
				System.out.println(e.getKey());

				System.out.println(e.getValue());
				
				
			}
			
			//Question 2
			Set<Integer> set=new HashSet<>();
			ArrayList<Integer> list=new  ArrayList<>();
			
			for (int i = 1; i <=10; i++)
			{
				list.add(i);
				
			}
			
			set.addAll(list);
			System.out.println(set);
			
		}

}
