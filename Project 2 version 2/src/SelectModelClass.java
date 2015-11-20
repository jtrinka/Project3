import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//JT Linder
public class SelectModelClass {
 
    
 
        

	public static void SelectToyotaModelMethod() {
		JFrame frame1 = new JFrame("Select Your Model");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
 
        JButton modelbutton1 = new JButton("Corolla");
        JButton modelbutton2 = new JButton("Tundra");
        JButton modelbutton3 = new JButton("Prius");
        panel1.add(modelbutton1);
        panel1.add(modelbutton2);
        panel1.add(modelbutton3);
        //Add action listener to button
        modelbutton1.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e){
            
                //Execute when button is pressed
        	  SelectPriceRangeClass.SelectPriceRangeMethodCorolla();     
         }
       
         
            });
        
        modelbutton2.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e){
               
                   //Execute when button is pressed
           	  SelectPriceRangeClass.SelectPriceRangeMethodTundra();     
            }
          
            
               });
        
        modelbutton3.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e){
               
                   //Execute when button is pressed
           	  SelectPriceRangeClass.SelectPriceRangeMethodPrius();     
            }
          
            
               });
        frame1.add(panel1);
        
        frame1.pack();
        frame1.setVisible(true);}
        
        public static void SelectChevyModelMethod() {
    		JFrame frame2 = new JFrame("Select Your Model");
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel2 = new JPanel();
     
            JButton modelbutton4 = new JButton("Yukon");
            JButton modelbutton5 = new JButton("Silverado");
            JButton modelbutton6 = new JButton("Impala");
            panel2.add(modelbutton4);
            panel2.add(modelbutton5);
            panel2.add(modelbutton6);
            //Add action listener to button
            modelbutton4.addActionListener(new ActionListener() {
     
             public void actionPerformed(ActionEvent e){
                
                    //Execute when button is pressed
            	  SelectPriceRangeClass.SelectPriceRangeMethodYukon();     
             }
           
             
                });
            
            modelbutton5.addActionListener(new ActionListener() {
            	 
                public void actionPerformed(ActionEvent e){
                   
                       //Execute when button is pressed
               	  SelectPriceRangeClass.SelectPriceRangeMethodSilverado();     
                }
              
                
                   });
            
            modelbutton6.addActionListener(new ActionListener() {
            	 
                public void actionPerformed(ActionEvent e){
                   
                       //Execute when button is pressed
               	  SelectPriceRangeClass.SelectPriceRangeMethodImpala();     
                }
              
                
                   });
            frame2.add(panel2);
            
            frame2.pack();
            frame2.setVisible(true);}
            
            public static void SelectMitsubishiModelMethod() {
        		JFrame frame3 = new JFrame("Select Your Model");
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel3 = new JPanel();
         
                JButton modelbutton7 = new JButton("Eclipse");
                JButton modelbutton8 = new JButton("Outlander");
                JButton modelbutton9 = new JButton("Lancer");
                panel3.add(modelbutton7);
                panel3.add(modelbutton8);
                panel3.add(modelbutton9);
                //Add action listener to button
                modelbutton7.addActionListener(new ActionListener() {
         
                 public void actionPerformed(ActionEvent e){
                    
                        //Execute when button is pressed
                	  SelectPriceRangeClass.SelectPriceRangeMethodEclipse();     
                 }
               
                 
                    });
                
                modelbutton8.addActionListener(new ActionListener() {
                	 
                    public void actionPerformed(ActionEvent e){
                       
                           //Execute when button is pressed
                   	  SelectPriceRangeClass.SelectPriceRangeMethodOutlander();     
                    }
                  
                    
                       });
                
                modelbutton9.addActionListener(new ActionListener() {
                	 
                    public void actionPerformed(ActionEvent e){
                       
                           //Execute when button is pressed
                   	  SelectPriceRangeClass.SelectPriceRangeMethodLancer();     
                    }
                  
                    
                       });
                frame3.add(panel3);
                
                frame3.pack();
                frame3.setVisible(true);
        
	}
}

    