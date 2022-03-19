
abstract class Shape {
    abstract public String draw();
}

class Rectangle extends Shape {

    public String draw()
    {
    	return "It is rectangle";
    }
}

class Line extends Shape{

    public String draw() 
    {
    	return "It is line";
    }
}

class Cube extends Shape {

    public String draw() 
    {
    	return "It is cube";
    }
}


public class Assignment2Q5{
    public static void main(String[] args) 
    {
    	
    	Rectangle r=new Rectangle();
    	Line l=new Line();
    	Cube c=new Cube();
    	
    	String a,b,o;
    	a=r.draw();
    	b=l.draw();
    	o=c.draw();
    	
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(o);
    }
}
