
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Jordan Trinka and JT Linder
public class SelectPriceRangeClass {
 
    
 
        

	public static void SelectPriceRangeMethodCorolla() {
		JFrame frame4 = new JFrame("Select Your Price Range");
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
 
        JButton pricebutton1 = new JButton("$10,000-$20,000");
        JButton pricebutton2 = new JButton("$20,001-$30,000");
        JButton pricebutton3 = new JButton("$30,000 +");
        panel1.add(pricebutton1);
        panel1.add(pricebutton2);
        panel1.add(pricebutton3);
        
        
        		
        //Add action listener to button
        pricebutton1.addActionListener(new ActionListener() {
 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Toyota Corolla.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;      
 
        frame4.add(panel1);
        frame4.pack();
        frame4.setVisible(true);
	
	pricebutton2.addActionListener(new ActionListener() {
		 
        public void actionPerformed(ActionEvent e)
         {
      	  Component frame = null;
			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Toyota Corolla.");
         }
      });
	
	pricebutton3.addActionListener(new ActionListener() {
		 
        public void actionPerformed(ActionEvent e)
         {
      	  Component frame = null;
			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Toyota Corolla.");
         }
      })
              //Execute when button is pressed
              ;
          
      ;      

      frame4.add(panel1);
      frame4.pack();
      frame4.setVisible(true);}
              //Execute when button is pressed
              ;
          
      ;      

      
	
	public static void SelectPriceRangeMethodTundra() {
		JFrame frame5 = new JFrame("Select Your Price Range");
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel2 = new JPanel();
 
        JButton pricebutton4 = new JButton("$10,000-$20,000");
        JButton pricebutton5 = new JButton("$20,001-$30,000");
        JButton pricebutton6 = new JButton("$30,000 +");
        panel2.add(pricebutton4);
        panel2.add(pricebutton5);
        panel2.add(pricebutton6);
        
        
        		
      //Add action listener to button
        pricebutton4.addActionListener(new ActionListener() {
 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Toyota Tundra.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;      
 
        frame5.add(panel2);
        frame5.pack();
        frame5.setVisible(true);
	
	pricebutton5.addActionListener(new ActionListener() {
		 
        public void actionPerformed(ActionEvent e)
         {
      	  Component frame = null;
			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Toyota Tundra.");
         }
      });
	
	pricebutton6.addActionListener(new ActionListener() {
		 
        public void actionPerformed(ActionEvent e)
         {
      	  Component frame = null;
			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Toyota Tundra.");
         }
      })
              //Execute when button is pressed
              ;
          
      ;      

      frame5.add(panel2);
      frame5.pack();
      frame5.setVisible(true);}
              //Execute when button is pressed
              ;
          
      ;      
	
	public static void SelectPriceRangeMethodPrius() {
		JFrame frame6 = new JFrame("Select Your Price Range");
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel3 = new JPanel();
 
        JButton pricebutton7 = new JButton("$10,000-$20,000");
        JButton pricebutton8 = new JButton("$20,001-$30,000");
        JButton pricebutton9 = new JButton("$30,000 +");
        panel3.add(pricebutton7);
        panel3.add(pricebutton8);
        panel3.add(pricebutton9);
        
        
        		
        pricebutton7.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Toyota Prius.");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame6.add(panel3);
          frame6.pack();
          frame6.setVisible(true);
  	
  	pricebutton8.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Toyota Prius.");
           }
        });
  	
  	pricebutton9.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Toyota Prius.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;      

        frame6.add(panel3);
        frame6.pack();
        frame6.setVisible(true);}
                //Execute when button is pressed
                ;
            
        
	
	public static void SelectPriceRangeMethodYukon() {
		JFrame frame7 = new JFrame("Select Your Price Range");
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel4 = new JPanel();
 
        JButton pricebutton10 = new JButton("$10,000-$20,000");
        JButton pricebutton11 = new JButton("$20,001-$30,000");
        JButton pricebutton12 = new JButton("$30,000 +");
        panel4.add(pricebutton10);
        panel4.add(pricebutton11);
        panel4.add(pricebutton12);
        
        
        		
        pricebutton10.addActionListener(new ActionListener() {
       	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Chevy Yukon.");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame7.add(panel4);
          frame7.pack();
          frame7.setVisible(true);
  	
  	pricebutton11.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Chevy Yukon.");
           }
        });
  	
  	pricebutton12.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Chevy Yukon.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;      

        frame7.add(panel4);
        frame7.pack();
        frame7.setVisible(true);}
                //Execute when button is pressed
                ;
	
	public static void SelectPriceRangeMethodSilverado() {
		JFrame frame8 = new JFrame("Select Your Price Range");
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel5 = new JPanel();
 
        JButton pricebutton13 = new JButton("$10,000-$20,000");
        JButton pricebutton14 = new JButton("$20,001-$30,000");
        JButton pricebutton15 = new JButton("$30,000 +");
        panel5.add(pricebutton13);
        panel5.add(pricebutton14);
        panel5.add(pricebutton15);
        
        
        		
        pricebutton13.addActionListener(new ActionListener() {
          	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Chevy Silverado.");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame8.add(panel5);
          frame8.pack();
          frame8.setVisible(true);
  	
  	pricebutton14.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Chevy Silverado.");
           }
        });
  	
  	pricebutton15.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Chevy Silverado.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;      

        frame8.add(panel5);
        frame8.pack();
        frame8.setVisible(true);}
                //Execute when button is pressed
                ;
	
	public static void SelectPriceRangeMethodImpala() {
		JFrame frame9 = new JFrame("Select Your Price Range");
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel6 = new JPanel();
 
        JButton pricebutton16 = new JButton("$10,000-$20,000");
        JButton pricebutton17 = new JButton("$20,001-$30,000");
        JButton pricebutton18 = new JButton("$30,000 +");
        panel6.add(pricebutton16);
        panel6.add(pricebutton17);
        panel6.add(pricebutton18);
        
        
        		
        pricebutton16.addActionListener(new ActionListener() {
          	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Chevy Impala.");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame9.add(panel6);
          frame9.pack();
          frame9.setVisible(true);
  	
  	pricebutton17.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Chevy Impala.");
           }
        });
  	
  	pricebutton18.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Chevy Impala.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;      

        frame9.add(panel6);
        frame9.pack();
        frame9.setVisible(true);}
                //Execute when button is pressed
                ;
	
	public static void SelectPriceRangeMethodEclipse() {
		JFrame frame10 = new JFrame("Select Your Price Range");
        frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel7 = new JPanel();
 
        JButton pricebutton19 = new JButton("$10,000-$20,000");
        JButton pricebutton20 = new JButton("$20,001-$30,000");
        JButton pricebutton21 = new JButton("$30,000 +");
        panel7.add(pricebutton19);
        panel7.add(pricebutton20);
        panel7.add(pricebutton21);
        
        
        		
        pricebutton19.addActionListener(new ActionListener() {
         	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Mitsubishi Eclipse");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame10.add(panel7);
          frame10.pack();
          frame10.setVisible(true);
  	
  	pricebutton20.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Mitsubishi Eclipse.");
           }
        });
  	
  	pricebutton21.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Mitsubishi Eclipse.");
           }
        })
                //Execute when button is pressed
                ;
  	frame10.add(panel7);
    frame10.pack();
    frame10.setVisible(true);
	}
            
         
		
	public static void SelectPriceRangeMethodOutlander() {
		JFrame frame11 = new JFrame("Select Your Price Range");
        frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel8 = new JPanel();
 
        JButton pricebutton22 = new JButton("$10,000-$20,000");
        JButton pricebutton23 = new JButton("$20,001-$30,000");
        JButton pricebutton24 = new JButton("$30,000 +");
        panel8.add(pricebutton22);
        panel8.add(pricebutton23);
        panel8.add(pricebutton24);
        
        
        		
        pricebutton22.addActionListener(new ActionListener() {
         	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Mitsubishi Outlander.");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame11.add(panel8);
          frame11.pack();
          frame11.setVisible(true);
  	
  	pricebutton23.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Mitsubishi Outlander.");
           }
        });
  	
  	pricebutton24.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Mitsubisi Outlander.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;
        frame11.add(panel8);
        frame11.pack();
        frame11.setVisible(true);    
	}  
	
	public static void SelectPriceRangeMethodLancer() {
		JFrame frame12 = new JFrame("Select Your Price Range");
        frame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel9 = new JPanel();
 
        JButton pricebutton25 = new JButton("$10,000-$20,000");
        JButton pricebutton26 = new JButton("$20,001-$30,000");
        JButton pricebutton27 = new JButton("$30,000 +");
        panel9.add(pricebutton25);
        panel9.add(pricebutton26);
        panel9.add(pricebutton27);
        
        
        		
        pricebutton25.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
             {
          	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2013 Mitsubishi Lancer.");
             }
          })
                  //Execute when button is pressed
                  ;
              
          ;      
   
          frame12.add(panel9);
          frame12.pack();
          frame12.setVisible(true);
  	
  	pricebutton26.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2014 Mitsubishi Lancer.");
           }
        });
  	
  	pricebutton27.addActionListener(new ActionListener() {
  		 
          public void actionPerformed(ActionEvent e)
           {
        	  Component frame = null;
  			JOptionPane.showMessageDialog( frame, "Your ideal car is a 2015 Mitsubisi Lancer.");
           }
        })
                //Execute when button is pressed
                ;
            
        ;
        frame12.add(panel9);
        frame12.pack();
        frame12.setVisible(true);    
	}  }
	
	