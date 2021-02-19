
import java.util.Scanner;

/*
 Question 4
 Write a program to print the area of a rectangle by creating a class named 'Area' taking
the values of its length and breadth as parameters of its constructor and having a
method named 'returnArea' which returns the area of the rectangle. The length and
breadth of the rectangle are entered through the keyboard.
 */

class Area{
	int length, breadth;
	public Area(int l, int b){
		length = l;
		breadth = b;
		
	}
	
	public int returnArea() {
		return length * breadth;
	}
}

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle : ");
		int l = input.nextInt();
		
		System.out.print("Enter the breadth of the rectangle : ");
		int b = input.nextInt();
		
		Area a = new Area(l, b);
		
		System.out.println("The area of the rectangle is : " + a.returnArea());
		

	}

}
