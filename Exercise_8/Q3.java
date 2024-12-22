package Exercise_8;

/*
 * Shape Area Calculation:Define a base class Shape with a method calculateArea(). 
 * Create subclasses Circle, Rectangle, and Triangle that override this method to 
 * calculate their respective areas. Write a program to demonstrate polymorphism 
 * by calculating the area of different shapes.
 */

//It defines an abstract method calculateArea(), which must be implemented by its subclasses.

	 abstract class Shape {
	    abstract double calculateArea();
	}
	
	 // These classes inherit from the Shape class.
	class Circle extends Shape {
	    public double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    // override the calculateArea() method to calculate the area specific to their shape.
	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}
	
	class Rectangle extends Shape {
		public double length;
		public double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double calculateArea() {
	        return length * width;
	    }
	}
	class Triangle extends Shape {
		public double base;
		public double height;

	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    @Override
	    public double calculateArea() {
	        return 0.5 * base * height;
	    }
	}
	
	public class Q3{
	    public static void main(String[] args) {
	        Shape[] shapes = {new Circle(5.0), new Rectangle(4.0, 6.0), new Triangle(3.0, 8.0)};

	        for (Shape shape : shapes) {
	            double area = shape.calculateArea();
	            System.out.println("Area of the shape: " + area);
	        }
	    }
	}

