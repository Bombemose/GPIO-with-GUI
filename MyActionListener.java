
/**
 * Lav en beskrivelse af klassen MyActionListener her.
 * 
 * @author Lars Birkmose Jensen
 * @version 13-5-16
 */

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyActionListener implements ActionListener 
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    JTextField textField;

    /**
     * Konstruktør for objekter af klassen MyActionListener
     */
    public MyActionListener(JTextField textField)
    {
        // initialiser instansvariable
        this.textField = textField;
    }
    
    public void actionPerformed(ActionEvent e) {
        textField.setText(textField.getText().toUpperCase());
    }

}
