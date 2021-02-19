
/*
 Question 2
 Write a program to print the area and perimeter of a triangle having sides of 3, 4, and 5
units by creating a class named 'Triangle' without any parameter in its constructor.
 */
class Triangle{
	int x, y, z;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public double getArea() {
		return (x * y) / 2.0; //area of a triangle is (height * base) / 2. In this case, it is a right angled triangle therefore the base and height are 4 and 3.
	}
	public int getPerimeter() {
		return x + y + z; //perimeter of a triangle is the sum of the length of its sides
	}
	
	/*
	 I have created getters and setters for the values because I don't want a user I don't know to get access to the variables
	 I want to prevent our data from corrupting
	 */
}

public class Q2 {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.setX(3);
		tr.setY(4);
		tr.setZ(5);
				
		System.out.println("The area of the triangle is " + tr.getArea());
		System.out.println("The perimeter of the triangle is " + tr.getPerimeter());
		

	}

}
