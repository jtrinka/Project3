import javax.swing.JOptionPane;

// From Assignment 4
public class Environment {

	 public static void enviro(){
		   String array2[] = new String[3];  
		   for (int a=0; a<array2.length;a++) 
 	    {
 	        array2[a] = JOptionPane.showInputDialog("Enter the name of each animal and where it goes. Bluejays go in the first habitat, robins in the second, and geese in the third. Make entries in the following form (bluejay) (robin) (goose). ["+a+"]."); //prompt
 	    
 	       
 	       
 	        }
 	       String x = array2[0];
 	       
 	      String y = array2[1];
	       
	       String z = array2[2];
	 
	 
	
// From Assignment 2
	 switch( x ) { 
     case "(bluejay)": System.out.println("Good, bluejays go in the first habitat"); // 
     break;
     default: Environment.enviro(); System.out.println("Wrong");}
      
     switch( y ) { 
     case "(robin)": System.out.println("Good, robins go in the second habitat"); // 
     break;
     default: Environment.enviro(); System.out.println("Wrong");}
     
    switch( z ) { 
     case "(goose)": System.out.println("Good, geese go in the third habitat"); // 
     break;
     default: Environment.enviro(); System.out.println("Wrong");}
		
	}
 	    	  
 	    		  
 	 	//}
		   
		   /*for(int b = 0; b<array2.length;b++){
 			   if (array2[1]=="bluejay") //double equal signs for test on strings
 					System.out.println("Good, bluejays go in the bluejay habitat ");
 		       else
 		    	   if (array2[1]=="1") //double equal signs for test on strings
 					System.out.println("wrong");}*/
 	    
 	        
 	    	 
 	    }  
		            

 			    	    
		   
	
	
	

