package Spring_Beans_Example;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;

public class Triangle {                //InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware

//	private String type; //member variable
//	                     //triangle object is dependent on this member variable
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
//	
//	public Triangle(String type){
//		this.type = type;
//	}
//	
//	public Triangle(int height){
//		this.height= height;
//	}
//	
//	public Triangle(String type, int height){
//		this.type = type;
//		this.height = height;
//	}
//	
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public void draw() {
//		System.out.println(getType() + " Triangle drawn of height " + getHeight());	
//	}
	
	
//	private Point pointA;
//	private Point pointB;
//	private Point pointC;
//	
//	
//	public Point getPointA() {
//		return pointA;
//	}
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//	
//	public Point getPointB() {
//		return pointB;
//	}
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//	
//	public Point getPointC() {
//		return pointC;
//	}
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}
//
//	public void draw() {
//		
//		System.out.println(" Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
//		System.out.println(" Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
//		System.out.println(" Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
//		
//	}
	
	
//	private List<Point> points;
//	
//	
//	public List<Point> getPoints() {
//		return points;
//	}
//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}
//
//
//	public void draw() {
//	    for(Point point:points) {
//	    	System.out.println(" Point = (" + point.getX() + ", " + point.getY() + ")");
//	    }
//		
//	}
	
	
//	private List<Point> points;
	private Point pointA;
	private Point pointB;
	private Point pointC;
//	private ApplicationContext context = null;
	
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
	    
		System.out.println(" Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println(" Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println(" Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}
	
	public void myInit() {
		System.out.println("InitializingBean init method called for Triangle");		
	}
	
	public void cleanUp() {
		System.out.println("My Cleanup method called for triangle");
	}
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for Triangle");		
//	}
//	
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean destroy method called for Triangle");	
//		
//	}
	
	
//	@Override
//	public void setApplicationContext(ApplicationContext context) throws BeansException {
//		this.context = context;
//		
//	}
//	
//	@Override
//	public void setBeanName(String beanName) {
//		System.out.println("Bean name is: " + beanName);
//		
//	}
}
