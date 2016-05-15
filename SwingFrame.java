
/**
 * Lav en beskrivelse af klassen SwingFrame her.
 * 
 * @author Lars Birkmose Jensen
 * @version 15-05-16
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;

public class SwingFrame extends JFrame
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    JPanel panel = new JPanel();
    JButton onButton = new JButton("On");
    JButton offButton = new JButton("Off");
    //Create LED's
    final AdjustableLED myLED;
    
    /**
     * Konstruktør for objekter af klassen SwingFrame
     */
    public SwingFrame()
    {
        // initialiser instansvariable
        
        super("Basic swing app");
     
        // create gpio controller and LED
        final GpioController gpio = GpioFactory.getInstance();
        myLED = new AdjustableLED(6);              

        setSize(400,300);
        setResizable(true);
        
        onButton.addActionListener(new ActionListener() {
            @Override    
            public void actionPerformed(ActionEvent e) {
                    myLED.on();
                }
            });
        
        offButton.addActionListener(new ActionListener() {
            @Override    
            public void actionPerformed(ActionEvent e) {
                    myLED.off();
                }
            }); 
            
        panel.add(onButton);
        panel.add(offButton);

        add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

}
