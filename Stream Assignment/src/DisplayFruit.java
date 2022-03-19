import java.util.Arrays;
import java.util.List;

public class DisplayFruit {
	public static void main(String[] args) {
		
		
		List<Fruit> fruit = Arrays.asList(
				new Fruit("pineapple", 90, 25, "yellowishgreen"),
				new Fruit("Apple", 105, 30, "red"),
				new Fruit("Banana", 100, 30, "yellow"),
				new Fruit("Mango", 85, 40, "yellow"),
				new Fruit("Grapes", 70, 55, "green"),
				new Fruit("Guava", 80, 25, "green"),
				new Fruit("orange", 110, 35, "orange")
				);
		fruit.stream()
		.filter(f->f.getCalories()<100)
		.sorted((a,b)->b.getCalories()-a.getCalories())
		.forEach(f->System.out.println(f.getCalories() +" "+ f.getName()));
		fruit.stream()
		.sorted((a,b)->a.getColor().compareTo(b.getColor()))
		.forEach(f->System.out.println("Colour: "+f.getColor()+ " => "+"Fruit: "+f.getName()));
		fruit.stream()
		.filter(f->f.getColor().startsWith("red"))
		.sorted((a,b)->a.getPrice()-b.getPrice())
		.forEach(f->System.out.println(f.getColor()+" "+f.getPrice()+" "+f.getName()));
		
				
		
	}
}
