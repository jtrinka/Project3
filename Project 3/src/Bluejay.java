
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
// Dave Marshall
public class Bluejay extends Flyinganimalsclass {
public Bluejay(){ 
	feathercolor = "blue"; // override the super class if the sub class object is more specific
	System.out.println("The bird has " + feathercolor + " feathers");
	try{Thread.sleep(1500);}
	catch(Exception e){};
	System.out.println("The bird has a " + beakcolor + " colored beak");
	try{Thread.sleep(1500);}
	catch(Exception e){};
	System.out.println("The bird is " + size + " size");
	try{Thread.sleep(1500);}
	catch(Exception e){};
	System.out.println("The bird has " + talontype);
	try{Thread.sleep(1500);}
	catch(Exception e){};
	
	//www.docs.oracle.com
	Component frame = null;
	JOptionPane.showMessageDialog(frame, "Therefore, your bird is a blue jay.");
	try{Thread.sleep(1500);}
	catch(Exception e){};
	
	//Delanie Chapman
	JFrame bluejayframe = new JFrame("Bluejay");
	bluejayframe.setSize(400,400);
	bluejayframe.setLocation(400,400);
	JPanel panel = new JPanel();
	JLabel label = new JLabel(new ImageIcon("X:\\My Documents\\CS 110\\bluejay.jpg"));
	JLabel label1 = new JLabel("Bluejays");
	panel.add(label);
	panel.add(label1);
	bluejayframe.add(panel);
	bluejayframe.setVisible(true);
	
	
	

}}