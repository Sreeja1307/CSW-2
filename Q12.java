package chapter12;

public class Q12 {
	static class Shape{
		public void draw() {
			System.out.println("Drawing a shape.");
			return;
		}
	}
	static class Circle extends Shape{
		@Override
		public void draw() {
			System.out.println("Drawing a Circle.");
			return;
		}
	}
	static class Rectangle extends Shape{
		@Override
		public void draw() {
			System.out.println("Drawing a Rectangle.");
			return;
		}
	}
	static class Triangle extends Shape{
		@Override
		public void draw() {
			System.out.println("Drawing a Triangle.");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.draw();
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
		Triangle triangle=new Triangle();
		triangle.draw();

	}

}
