package ball;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Sresult extends JFrame {
	JLabel j1,j2,j3,j4;
	JTextField t1,t2,t3,t4;
	JPanel p2;
	Conn c=new Conn();
	
public Sresult(String n,String l){
	setSize(500,500);
	setTitle(n+" info");
	j1=new JLabel("Name :");
	j2=new JLabel("staff no :");
	j3=new JLabel("destination :");
	j4=new JLabel("bus routeno :");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	p2=new JPanel(new GridLayout(4,2));
	p2.add(j1);
	p2.add(t1);
	p2.add(j2);
	p2.add(t2);
	p2.add(j3);
	p2.add(t3);
	p2.add(j4);
	p2.add(t4);
	add(p2);
	setr1(n,l);
	
	
}
void setr1(String n,String l) {
	Connection c;
	Statement s;
	ResultSet f2;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(Exception e) {	
	}
	
		try {
	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbl","root","rapiddash2003");
	
	s=c.createStatement();
	ResultSet m2 = s.executeQuery("select * from staff where staffno='"+n+"';");
	if(m2.next()) {
		t1.setText(m2.getString(2));
		t3.setText(m2.getString(3));

	}
		}
		catch(Exception ef) {
			
		}
		
	t2.setText(n);
	t4.setText(l);
	
	t1.setEditable(false);
	t2.setEditable(false);
	t4.setEditable(false);
	t3.setEditable(false);
	
	
}
	
}
