
/*
 Print the sum, difference, and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by the user.
 */

class Complex{
	int real, imag;
	public Complex(int r, int i){
		real = r;
		imag = i;
	}
	
	public static Complex sum (Complex a, Complex b){
		return new Complex((a.real+b.real),(a.imag+b.imag));
	}
	
	public static Complex difference (Complex a, Complex b){
		return new Complex((a.real-b.real),(a.imag-b.imag));
	}
	
	public static Complex product (Complex a, Complex b){
		return new Complex((a.real*b.real)-(a.imag*b.imag),(a.real*b.real)+(a.imag*b.imag));
	}
	
	void display() {
		if(real == 0 && imag != 0) {
			System.out.println(imag + "i");
		}
		else if(real != 0 && imag == 0) {
			System.out.println(real);
		}
		else {
			System.out.println(real + " + " + imag + "i");
		}
		

	}

}


public class Q5 {

	public static void main(String[] args) {
		Complex y = new Complex(6, 2); //real and imaginary parts entered by the user
		Complex z = new Complex(5, 11);
		
		Complex c = Complex.sum(y, z);
		Complex d = Complex.difference(y, z);
		Complex e = Complex.product(y, z);
		
		c.display();
		d.display();
		e.display();
		

	}

}
