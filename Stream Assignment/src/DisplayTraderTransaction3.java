import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayTraderTransaction3 {
	public static void main(String[] args) {
		Trader3 t1=new Trader3("Anirudh", "Bangolore");
		Trader3 t2=new Trader3("Dharma", "Chennai");
		Trader3 t3=new Trader3("Juanid", "Pune");
		Trader3 t4=new Trader3("Narasimha", "Hyderabad");
		Trader3 t5=new Trader3("Siddharth", "Pune");
		Trader3 t6=new Trader3("Saju", "Delhi");
		List<Trader3> trader= new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		trader.add(t6);
		List<Transaction3> transaction= Arrays.asList(
				new Transaction3(t1, 2018, 99),
				new Transaction3(t2, 2017, 85),
				new Transaction3(t3, 2011, 81),
				new Transaction3(t4, 2009, 95),
				new Transaction3(t5, 2015, 92),
				new Transaction3(t6, 2011, 75)				
				);
		System.out.println("Traders belonging to Pune with names sorted");
		trader.stream()
		.filter(t->t.getCity().equals("Pune")).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(t->System.out.println(t));
		
		System.out.println("Traders with names sorted alphabetically");
		trader.stream()
		.filter(t->t.getName().contains(t.getName())).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(t->System.out.println(t));
	
		System.out.println("Trader based in indore");
		long count=trader.stream()
		.filter(t->t.getCity().equals("Indore")).count();
		if(count==0)
			System.out.println("No Traders Belong to Indore");
		else
			System.out.println("Traders Belong to Indore");

		System.out.println("Transactions made in the year 2011");
		transaction.stream()
		.filter(tr->tr.getYear()==2011).sorted((a,b)->a.getValue()-b.getValue()).forEach(tr->System.out.println(tr));
	
		System.out.println("Traders Belonging to Delhi");
		transaction.stream()
		.filter(t->t.getTrader().getCity().equals("Delhi")).forEach(tr->System.out.println(tr));

		System.out.println("Highest Transaction");
		transaction.stream()
		.mapToInt(Transaction3::getValue).max().ifPresent(System.out::println);
	
		System.out.println("Lowest Transaction");
		transaction.stream()
		.mapToInt(Transaction3::getValue).min().ifPresent(System.out::println);
	
	}
}
