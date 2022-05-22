package ball;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class success extends JFrame {
public success(){
	setSize(400,400);
	JOptionPane.showMessageDialog(this, "Successfully Completed Registration");
	new ip().setVisible(true);
	setVisible(false);
}

}
