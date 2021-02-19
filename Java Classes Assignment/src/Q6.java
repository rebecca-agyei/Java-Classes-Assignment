
/*
 Question 6
 Write a program to create a room class, the attributes of this class is roomno, roomtype,
roomarea and ACmachine. In this class the member functions are setdata and
displaydata.
 */

class room{
	int roomno;
	String roomtype;
	double roomarea;
	boolean ACmachine;
	
	void setdata(int rn, String rt, double ra, boolean ac) {
		roomno = rn;
		roomtype = rt;
		roomarea = ra;
		ACmachine = ac;
	}
	
	void display() {
		System.out.println("The room number is " + roomno);
		System.out.println("The room type is " + roomtype);
		System.out.println("The room area is " + roomarea);
		String avail = (ACmachine) ? "yes" : "no "; 
		System.out.println("Is an AC Machine available? " + avail);
	}
	
}

public class Q6 {

	public static void main(String[] args) {
		room myRoom = new room();
		myRoom.setdata(10, "hostel room", 70.0f, true);
		myRoom.display();

	}

}
