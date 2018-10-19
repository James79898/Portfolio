import javax.swing.JOptionPane;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.ArrayList;
import java.util.Scanner;


public class A2Finch{

static String command;//variable


public static String F;
public static String B;
public static String R;
public static String L;
public static String T;
public static String Q;



	
public static void main(final String[]args)  {


	Movements Movement = new Movements(); //calling the other class
	Scanner sc=new Scanner(System.in);

	while(true){
	System.out.println("please insert command ");
    command = sc.nextLine();
	if (!(command.equals("F")||command.equals("B")||command.equals("R")||command.equals("L")||command.equals("T")||command.equals("Q"))){	  
	JOptionPane.showMessageDialog(null,"The command entered is not correct: "   + command);}//if the letter entered does not equal any of the commands then it will show a message saying this.
	else { 
	System.out.println("you entered command:" + command);
	}
	

	switch(command) { //switch statement
	
	case "F":{
		
          command.equalsIgnoreCase("F");//if command equal F then ignore the other cases
	      Movement.forwardMovement();//calling the method forwardMovement from the 'Movements' class.
		
	     break;//terminates case
     }
	
	case "B":{
	
		command.equalsIgnoreCase("B");//if the command equal B then ignore the other cases
		Movement.backwardsMovement();//calling the method backwardsMovement from the 'Movements' class.
	    
		break;//terminates case
	 }
	
	case "R":{		

        command.equalsIgnoreCase("R");//if the command equal R then ignore the other cases
		Movement.rightMovement();//calling the method rightMovement from the 'Movements' class.
		
		break;//terminates case
		
     }
	
	case "L":{
		
	    command.equalsIgnoreCase("L");//if the command equal L then ignore the other cases
	    Movement.leftMovement();//calling the method leftMovement from the 'Movements' class.
	
	break;//terminates case
	
	}
	
	case "T":{
		
	     command.equalsIgnoreCase("T");//if the command equal T then ignore the other cases
	     Movement.retraceMovement();//calling the method retraceMovement from the 'Movements' class.
			
	break;	//terminates case
	
	}
	
case "Q":{
	
		command.equalsIgnoreCase("Q");//if the command equal Q then ignore the other cases
		Movement.quit();//calling the method quit from the 'Movements' class.
		
	}
	
 	break; //terminates case
	}

	}}}
	



















