import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
// Import the package that the ActionListener and ActionEvent are in
import java.awt.event.*;

// Impliment the interface. An instance of SimpleGuiB is a ActionListener.
public class SimpleGui1B implements ActionListener {
    JButton myButton;
    
    public static void main (String[] args) {
        SimpleGui1B myGui = new SimpleGui1B();
        myGui.Go();
    }

    public void Go () {
        JFrame myFrame = new JFrame();
        myButton = new JButton("click me");

        // Register button to event
        myButton.addActionListener(this);

        myFrame.getContentPane().add(myButton);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300, 300);
        myFrame.setVisible(true);
    }

    // The button calls this method when an event occurs. It sends an
    // ActionEvent object as the input argument.
    public void actionPerformed(ActionEvent event) {
        myButton.setText("I've been clicked!");
    }
}