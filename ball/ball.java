package ball;

import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

class ip extends JFrame implements ActionListener{
	JButton l1,l2,l3,l4;
	
	
	JPanel f1;
	ip(){
		setSize(500,500);
		setLayout(null);
		setTitle("GCET bus service");
		setLayout(new FlowLayout());
//		Icon i=new ImageIcon("F:\\logo.png");
//		JButton l4 = new JButton(i);
		l1 =new JButton("GetInfo");
		l2=new JButton("Register");
	    l3=new JButton("Bus routes allocated ");
	    l4=new JButton("Bus Routes ");
		f1 = new JPanel(new GridLayout(4,1));
//		f1.add(l4);
		f1.add(l1);
		f1.add(l2);
	    f1.add(l3);
	    f1.add(l4);
		add(f1);
//		l1.setBounds(500,500,100,100);
		l1.addActionListener(this);
		l2.addActionListener(this);
    	l3.addActionListener(this);
    	l4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==l1){
			new info().setVisible(true);
			setVisible(false);
		}
		else if(ae.getSource()==l3) {
			new Busroute().setVisible(true);
		setVisible(false);
		}
		else if(ae.getSource()==l4) {
			new Rdetails();
			setVisible(false);
		}
		else {
			new Register().setVisible(true);
			setVisible(false);
		}
		
	}
}
public class ball {
 public static void main(String args[]) {
	 new ip().setVisible(true);
 }
}
