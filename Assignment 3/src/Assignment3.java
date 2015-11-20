import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
public class Assignment3 {
//
	
	//For ints and string coversion. Convert then initialize
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //defines a new scanner which is used to create an input so that you can enter things into the command line.
		int count=1; //initializes count as starting at 1
		while(count < 3 ) // while the count is less than 3, do the following commands
		{
		count++; //add one to the count 
		System.out.print("What is your birth year?:"); //prompt
		int age = input.nextInt(); //resets loop and asks for an input using the scanner command
		if (age<=1994) //
			System.out.println("21 or older");
		
					else
						
						System.out.println("Not of age");
		
	}
		//define a new function, then use input
	//for random number generators create a new generator then initialize a variable as a generated number between 0 and a certain number. Then show that number
	SecureRandom mySecureRandomgenerator = new SecureRandom(); // makes a new random generator
	int pick; //initializes pick
	
	int i;
	int x;
	try{Thread.sleep(4000);}
	catch (Exception e){};
	System.out.println("Roll a 1, no points gained or lost. 2 gain 2 points. 3 lose 1 point. 4 gain 4 points. 5 your opponent gets 5 points. 6 get 6 points. First one to 10 points or over wins");
	
	for (i = 1; i<5; i++) //start at i is equal to 1 and run until i is equal to 5. Don't run a for loop with a double or float runs 9 times.
	{
		pick = mySecureRandomgenerator.nextInt(6)+1; //set pick to 0 but we make it equal to any random number, initializes pick as a secureRandomgenerator.
		try{Thread.sleep(1500);}
		catch (Exception e){};
		System.out.println(i+" rolls used");
		try{Thread.sleep(1500);}
		catch (Exception e){};
		System.out.println("The number rolled is "+pick); //random number generator is not random, just appears to be random.
		// from www.stackoverflow.com
		String str=Integer.toString(pick); // Takes an int, pick, into a string
		str = input.nextLine(); //initializing the string
		try{Thread.sleep(3000);}
		catch (Exception e){};
		if (pick==1) //double equal signs for test
			System.out.println("Nothing");
		else
			if(pick==2) //when using a string use double equal signs.
		System.out.println("Gain 2 points");
		else
			if(pick==3)
				System.out.println("Lose 1 Point");
			else 
				if(pick==4)
					System.out.println("Gain 4 Points");
				else 
					if(pick==5)
						System.out.println("Your opponent gains 2 points");
					else 
						if(pick==6)
							System.out.println("Gain 6 Points");
		
	
	}
	try{Thread.sleep(1500);}
	catch (Exception e){};
	//weblogs.java.net
	Random rand = new Random(); //make a new random number generator
    int z = rand.nextInt(6); // make z a random inteer between 0 and 6
    int y = rand.nextInt(6);
    System.out.println("(z > 5) && (y > 5) is " + ((z > 5) && (y > 5)) );  //if both z and y are greater than 5 then print this
    System.out.println("(z < 5) || (y < 5) is " +  ((z < 5) || (y < 5)) ); //if z or y are less than 5, print this.
    
    try{Thread.sleep(1500);}
	catch (Exception e){};
    //Best for 1 variable
    System.out.println("Do you like Computer Science? yes or no"); // this uses a string
    String a = input.next(); // so this has to be a string asking a question that is yes or no
	switch( a ) { //creates a switch a then if a is the first case or 1 then print something then second case is 2 so print that.
    case "yes": System.out.println("Good, computer science has lots of opportunities. I enjoy it too."); // case if a=1 then print this
    break;
    case "no": System.out.println("Time to find a new major or minor I suppose");
    break;
    default: System.out.println("Invalid entry");
    break;
   
	}
	 try{Thread.sleep(1500);}
		catch (Exception e){};
	String r;
	String password = "carrollcollege";
	String input2;
	//input2=input.next();//System.in.toString();
	
	boolean check = true;
	// if there's one equals sign, it will be an infinite loop
	do { //do while loop. Test is at the bottom of the loop. Need test condition at end of the loop. Test and see if we want to repeat the loop. Good for passwords, test and test again if they got it right.
		System.out.println("What is the password?");
		input2 = input.next();
		if (input2.equals(password))
		{check = false;}
		count = count + 1;
		//break;
	} while(check); //while check is true, keep running, once input2 = password which is carroll college, the check becomes false therefore break out of it
	
	try{Thread.sleep(1500);}
	catch (Exception e){};
	//www.herongyang.com
	try{Thread.sleep(1500);}
	catch (Exception e){};
	MyJFrame f = new MyJFrame(); //creates a new jframe
    f.setTitle("Drawing Graphics in Frames");
    f.setBounds(0,0,300,300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
 }
 static class MyJFrame extends JFrame {
    public void paint(Graphics g) {
       g.drawOval(135,165,135,165);
       g.drawRect(0, 0, 100, 100);
    }
 
    
	

	
	
}
	 

}
