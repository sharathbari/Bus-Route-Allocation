package ball;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Register extends JFrame implements ActionListener {
	
	JButton s,t;
	JPanel x;
public Register(){
	/*j1=new JLabel("Name :");
	j2=new JLabel("rollno :");
	String stops[]= {"Boduppal","Chengicherla","Habsiguda","Ramanthapur"};
	c=new JComboBox(stops);*/
	setSize(400,400);
	s=new JButton("staff");
	t=new JButton("student");
	x=new JPanel(new GridLayout(2,1));
	x.add(s);
	x.add(t);
	add(x);
	s.addActionListener(this);
	t.addActionListener(this);
	
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==s) {
		
		new Rstaff().setVisible(true);
		setVisible(false);
		

	}
	if(ae.getSource()==t) {
		new Rstudent().setVisible(true);
		setVisible(false);
		/*j1=new JLabel("Name :");
		j2=new JLabel("rollno :");
		j3=new JLabel("destination");
		t1=new JTextField();
		t2=new JTextField();
		String stops[]= {"Boduppal","Chengicherla","Habsiguda","Ramanthapur"};
		c=new JComboBox(stops);
		z=new JPanel(new GridLayout());
		z.add(j1);
		z.add(t1);
		z.add(j2);
		z.add(t2);
		z.add(c);*/
		
	}
}
}
