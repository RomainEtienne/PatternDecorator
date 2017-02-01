/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateurJButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.Alert;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Romain
 */
public class AlertOnClickDecorator extends JButton {

    public AlertOnClickDecorator(JButton bouton) {
        super(bouton.getText());

        for (ActionListener actionListener : bouton.getActionListeners()) {
            this.addActionListener(actionListener);
        }

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, getText());
            }
        });
    }

}
