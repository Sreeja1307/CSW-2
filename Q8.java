package newproject;
class Shape{
	public int calculateArea(int side) {
		return side*side;
	}
	public int calculateArea(int length, int breadth) {
		return length*breadth;
	}
	public double calculateArea(double radius) {
		return (3.14)*radius*radius;
	}
	public double calculateArea(double base, double height){
		return 0.5*base*height;
	}
}
public class Q8 {
	public static void main(String[] args) {
	  Shape shape = new Shape();
	  System.out.println("Area of Square: "+shape.calculateArea(5));
	  System.out.println("Area of Rectangle: "+shape.calculateArea(4, 5));
	  System.out.println("Area of Circle: "+shape.calculateArea(14.0));
	  System.out.println("Area of Triangle: "+shape.calculateArea(10.7, 13.0));
	}
}

