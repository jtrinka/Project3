import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
git init
public class Assignment5 {

	public static void main(String[] args) {
		
		try //try catch statement for a reader and a writer
		{
			
			 //creates a new file called file
		    BufferedReader br = new BufferedReader(new FileReader("abc.txt")); //creates a new buffered reader called br and has it read file using a filereader
		    String word2 = br.readLine(); //makes a string word2 and sets it equal to what br reads in
		    PrintWriter writer = new PrintWriter("writeme.txt"); //creates a new print writer called writer that will write into abc.txt
		    
		    
		    
		    
		    
		    
		    //test:
		    String[] arr = word2.split("[;, ]"); //creates a string array that splits the string word 2 with conditions

			for (int i = 0; i < arr.length; ++i) { //for loop to run until it has run the length of the array
			    System.out.println(arr[i]); //system out prints arr[i]
			    writer.println(arr[i]); //writer writes the arr[i] into writeme.txt
			   
			    
		
		}
		writer.close();
		br.close();}
		
			    
			    
			 catch(Exception e) {
			    e.printStackTrace();
			}}}
		    
	
		
		
		
	

		

		

		
		
		

	

