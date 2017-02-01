
import DecorateurJButton.AlertOnClickDecorator;
import DecorateurJButton.HideOnClickDecorator;
import DecorateurJButton.TextUpperCaseDecorator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

    public Window() {

        JButton bouton = new TextUpperCaseDecorator(new AlertOnClickDecorator(new JButton("Text Upper Case + Alert")));
        
        JButton bouton2 = new HideOnClickDecorator(new JButton("Hide"));
        
        JButton bouton3 = new TextUpperCaseDecorator(new JButton("Text Upper"));
        
        JButton bouton4 = new AlertOnClickDecorator(new JButton("Alert"));

        JPanel pan = new JPanel();
        pan.add(bouton);
        pan.add(bouton2);
        pan.add(bouton3);
        pan.add(bouton4);

        this.setContentPane(pan);
        this.setTitle("Abstract Factory");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
