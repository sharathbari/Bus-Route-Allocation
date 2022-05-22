package ball;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class flogin extends JFrame implements ActionListener{
     JButton u1;
     JTextField l1;
     public flogin() {
    	 setSize(500,500);
    	 u1=new JButton("check");
    	 l1=new JTextField(10);
    	 add(l1);
    	 add(u1);
    	 u1.addActionListener(this);
     }
	public void actionPerformed(ActionEvent n) {
		
	}
}
