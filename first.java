package in.ineuron;


interface Shape1{
	 void draw();
	 
}
class Rectangle1 implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}
class Circle1 implements Shape1 {
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
}
public class first {

	public static void main(String[] args) {
		Rectangle1 a = new Rectangle1();
		Circle1 b = new Circle1();
		a.draw();
		b.draw();
		
	}

}

