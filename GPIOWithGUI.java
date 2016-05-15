
/**
 * Lav en beskrivelse af klassen GPIOWithGUI her.
 * 
 * @author Lars Birkmose Jensen     
 * @version 13-5-16
 */

/**import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;*/

public class GPIOWithGUI
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    SwingFrame GUI;
     
    
    public static void main(String args[]) {
        
       /**JFrame frame;
        Container contentPane;
        JTextField textField;
        JButton button;
        FlowLayout layout;
        
        frame = new JFrame();
        frame.setTitle("Handy capitalization service");
        
        contentPane = frame.getContentPane();
        
        textField = new JTextField("Type your text here.", 20);
        
        button = new JButton("Capitalize");
        //button.addActionListener(new MyActionListener(textField));
        button.addActionListener(new ActionListener() {
            @Override    
            public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText().toUpperCase());
                }
            });
        
        contentPane.add(textField);
        contentPane.add(button);
        layout = new FlowLayout();
        contentPane.setLayout(layout);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        */
       new GPIOWithGUI();
       
    }

    /**
     * Konstruktør for objekter af klassen MyLittleGUI
     */
    public GPIOWithGUI()
    {
        // initialiser instansvariable
        GUI = new SwingFrame();
    }

}
