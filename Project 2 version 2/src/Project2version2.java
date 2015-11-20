import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 //skeleton code for button action listener from stackexchange.com.
// Jordan Trinka
public class Project2version2 {
 
    public static void createAndShowGUI()  {
 
        JFrame makeframe1 = new JFrame("Select Your Make");
        makeframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JButton makebutton1 = new JButton("Toyota");
        JButton makebutton2 = new JButton("Chevrolet");
        JButton makebutton3 = new JButton("Mitsubshi");
        JPanel panel = new JPanel();
        panel.add(makebutton1);
        panel.add(makebutton2);
        panel.add(makebutton3);
        //Add action listener to button
        makebutton1.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
               SelectModelClass.SelectToyotaModelMethod() ;
            }
        });      
        
        makebutton2.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
               SelectModelClass.SelectChevyModelMethod() ;
            }
        });      
        
        makebutton3.addActionListener(new ActionListener() {
       	 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
               SelectModelClass.SelectMitsubishiModelMethod() ;
            }
        });      
 
        makeframe1.add(panel);
        makeframe1.pack();
        makeframe1.setVisible(true);
    }
 
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
   

    }
