
/**
 * Lav en beskrivelse af klassen SwingFrame her.
 * 
 * @author Lars Birkmose Jensen
 * @version 15-05-16
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class SwingFrame extends JFrame
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    JPanel panel = new JPanel();
    JButton onButton = new JButton("On");
    JButton offButton = new JButton("Off");
    
    
    /**
     * Konstruktør for objekter af klassen SwingFrame
     */
    public SwingFrame()
    {
        // initialiser instansvariable
        super("Basic swing app");
        
        setSize(400,300);
        setResizable(true);
        
        panel.add(onButton);
        panel.add(offButton);

        add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

}
