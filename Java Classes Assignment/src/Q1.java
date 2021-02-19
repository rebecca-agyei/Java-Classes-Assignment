
/*
 Question 1
 Create a class named 'Student' with the String variable 'name' and integer variable
'roll_no'. Assign the value of roll_no as '2' and that of the name as "John" by creating an
object of the class Student.
 */
class Student{
	String name;
	int roll_no;
}

public class Q1 {

	public static void main(String[] args) {
		Student st = new Student();
		st.name = "John";
		st.roll_no = 2;
		
		System.out.println("The name of the student is " + st.name + " and his roll number is " + st.roll_no);

	}

}
