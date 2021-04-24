import javax.swing.*;

public class SimpleGui1 {
    public static void main (String[] args) {
        // Make a frame
        JFrame myFrame = new JFrame();
        // Make a button with text "click me"
        JButton myButton = new JButton("click me");

        // This line makes the program quite as soon as you close the
        // window (without it the program would remain on the screen forever)
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the button to the frame's content pane
        myFrame.getContentPane().add(myButton);

        // Give the frame a size, in pixels
        myFrame.setSize(300, 300);

        // Make the frame visible
        myFrame.setVisible(true);
    }
}