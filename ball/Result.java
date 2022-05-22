package ball;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Result extends JFrame implements ActionListener {
	JLabel j1,j2,j3,j4,j5,j6,j7;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JPanel p1;
	JButton l1;
	Conn c=new Conn();
	String ny;
public Result(String n,String l){
	setSize(500,500);
	setTitle(n+" info");
	ny=n;
	j1=new JLabel("Name :");
	j2=new JLabel("rollno :");
	//j3=new JLabel("section :");
	j4=new JLabel("fees  :");
	j5=new JLabel("due amount :");
	j6=new JLabel(" bus routeno :");
	j7=new JLabel("destination :");
	l1=new JButton("fee payment");
	t1=new JTextField();
	t2=new JTextField();
	//t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	p1=new JPanel(new GridLayout(7,2));
	p1.add(j1);
	p1.add(t1);
	p1.add(j2);
	p1.add(t2);
	//p1.add(j3);
	//p1.add(t3);
	p1.add(j4);
	p1.add(t4);
	p1.add(j5);
	p1.add(t5);
	p1.add(j6);
	p1.add(t6);
	p1.add(j7);
	p1.add(t7);
	p1.add(l1);
	add(p1);
	l1.addActionListener(this);
	setr(n,l);
	
	
}
public void actionPerformed(ActionEvent ae) {
	new fee(ny).setVisible(true);
	setVisible(false);
}
void setr(String n,String l) {
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
	ResultSet m2 = s.executeQuery("select * from student where rollno='"+n+"';");
	if(m2.next()) {
		t1.setText(m2.getString(2));
		t4.setText(m2.getString(4));
		t5.setText(m2.getString(5));
		t7.setText(m2.getString(3));
	}
		}
		catch(Exception ef) {
			
		}
		
	t2.setText(n);
	t6.setText(l);
	
	t1.setEditable(false);
	t2.setEditable(false);
	t4.setEditable(false);
	t5.setEditable(false);
	t6.setEditable(false);
	t7.setEditable(false);
	
	
}
	
}
