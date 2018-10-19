import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

public class Movements {
	
	
	static String command;//variables
	static int speed;
	static int duration;
	
 
	static Finch myFinch = new Finch();
	static ArrayList<String > list = new ArrayList<String>();//array list
	
	public static void forwardMovement() { //method


		Scanner sc=new Scanner(System.in); 
		System.out.println("please insert the duration and speed");	
		duration=sc.nextInt();speed=sc.nextInt(); 
		if(speed > 200 || duration > 6) {//if speed higher than 200 and duration than 6 then it will show that message box.
			JOptionPane.showMessageDialog(null,"The speed or duration was not entered in correctly");}
		else {	
		myFinch.setWheelVelocities(speed, speed, duration*1000);
		JOptionPane.showMessageDialog(null,"This made a forward movement");}
		list.add("forwardMovements");//adds this to the array list
		

		
		}
	
		
	public static void backwardsMovement() {//method

	
		Scanner sc=new Scanner(System.in);
	     System.out.println("please insert the duration and speed");	
		 duration=sc.nextInt();speed=sc.nextInt();
		if(speed > 200 || duration > 6) { //if speed higher than 200 and duration than 6 then it will show that message box.
		JOptionPane.showMessageDialog(null,"The speed or duration was not entered in correctly");}
		else {
		myFinch.setWheelVelocities(-speed,-speed, duration*1000);
		JOptionPane.showMessageDialog(null,"This made a backwards movement");}
		list.add("backwardsMovement");//adds this to the array list
	
	
		
	}
	
	public static void rightMovement() { //method
			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please insert the duration and speed");	
		 duration=sc.nextInt();speed=sc.nextInt();
		if(speed > 200 || duration > 6) {//if speed higher than 200 and duration than 6 then it will show that message box.
		JOptionPane.showMessageDialog(null,"The speed or duration was not entered in correctly");}
		else {
		myFinch.setWheelVelocities(200,-150,1*1000);
		myFinch.setWheelVelocities(speed, speed, duration*1000);	
		JOptionPane.showMessageDialog(null,"This made a right movement");}
		list.add("rightMovement");//adds this to the array list

		
	}
	
	public static void leftMovement() { //method
			

		Scanner sc=new Scanner(System.in);
		System.out.println("please insert the duration and speed");
		 duration=sc.nextInt();speed=sc.nextInt(); 
		if(speed > 200 || duration > 6) {//if speed higher than 200 and duration than 6 then it will show that message box.
		JOptionPane.showMessageDialog(null,"The speed or duration was not entered in correctly");}
		else {
		myFinch.setWheelVelocities(-150,200,1*1000);
		myFinch.setWheelVelocities(speed, speed, duration*1000);	
	    JOptionPane.showMessageDialog(null,"This made a left movement");}
		list.add("leftMovement");//adds this to the array list
			
	}
			public static void retraceMovement() {// method
//retrieving elements from array list
            int size = list.size(); //the int size is the list size
             System.out.println("The size of the list is: " + size); //prints out list size

			for (int i = 0; i < list.size(); i++){	//for loop using index and size list. It will then carry out the movement of the finch after.
			myFinch.setWheelVelocities(speed, speed, duration*1000);	
		   JOptionPane.showMessageDialog(null,"This did a retrace movement");}

			}


	public static void quit(){ //method
		JOptionPane.showMessageDialog(null, "The finch will now quit");
		myFinch.quit();
		JOptionPane.showMessageDialog(null, "The finch has now stopped");
		System.exit(0);
		
	}}
		
	



