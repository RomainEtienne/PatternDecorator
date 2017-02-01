/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateurJButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Romain
 */
public class TextUpperCaseDecorator extends JButton {


    public TextUpperCaseDecorator(JButton bouton) {
        super(bouton.getText());
        
        for(ActionListener actionListener : bouton.getActionListeners()){
            this.addActionListener(actionListener);
        }
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setText(getText().toUpperCase());
            }
        });

    }

}
