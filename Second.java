package in.ineuron;

abstract class Shape {
  public abstract void draw();
  public abstract void area();

  public void print() {
    System.out.println("This is a shape");
  }
}

class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle with width " + width + " and height " + height);
  }

  @Override
  public void area() {
    int area = width * height;
    System.out.println("The area of the rectangle is " + area);
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle with radius " + radius);
  }

  @Override
  public void area() {
    double area = 3.14 * radius * radius;
    System.out.println("The area of the circle is " + area);
  }
}

public class Second {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 20);
    rectangle.draw();
    rectangle.area();

    Circle circle = new Circle(5);
    circle.draw();
    circle.area();
  }
}