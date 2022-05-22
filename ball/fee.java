package ball;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class fee extends JFrame implements ActionListener {
 Conn uy=new Conn();
 JButton y1,y2,b;
 JTextField t1;
 JLabel u1,u2;
 int d,m;
 
 String r,uf;
 Conn cu=new Conn();
 public fee(String rno) {
	 y1=new JButton("pay");
	 b=new JButton("Home");
	 t1=new JTextField(10);
	 JPanel yq;
	 r=rno;
	 
	 try {
	 
	cu.rs= cu.St.executeQuery("select due from student where rollno='"+rno+"';");
	
	if(cu.rs.next()) {
		uf=cu.rs.getString(1);
		 d=Integer.parseInt(cu.rs.getString(1));
	 }
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 u2=new JLabel("enter the amount:");
	 u1=new JLabel("due: "+uf);
	 setLayout(new FlowLayout());
	 yq=new JPanel(new GridLayout(5,1));
	 setSize(400,400);
	 setTitle("Fee payment ");
	 yq.add(u1);
	 yq.add(u2);
	 yq.add(t1);
	 yq.add(y1);
	 yq.add(b);
	 add(yq);
	 y1.addActionListener(this);
	 b.addActionListener(this);
	 
	 
 }
 public void actionPerformed(ActionEvent ae) {
	 try {
		 
			cu.rs= cu.St.executeQuery("select due from student where rollno='"+r+"';");
			
			if(cu.rs.next()) {
				uf=cu.rs.getString(1);
				 d=Integer.parseInt(cu.rs.getString(1));
			 }
			 }
			 catch(Exception e) {
				JOptionPane.showMessageDialog(this, "enter the amount!");
			 }
	 if(ae.getSource()==y1) {
		 m=Integer.parseInt(t1.getText());
		 if(m>0 && d>=m && d>0) {
	 try {
	 int v=d-m;
	
	 cu.St.executeUpdate("update student set due="+v+" where rollno='"+r+"';");
	 u1.setText("due: "+v);
	 JOptionPane.showMessageDialog(this,"payment completed successfully");
	 u1.setText("due: "+v);
	
	 }
	 catch(Exception eu) {
		 JOptionPane.showMessageDialog(this, "transaction failed");
		 eu.printStackTrace();
	 }
	 t1.setText("");
		 }
		 else if(m<=0) {
			 JOptionPane.showMessageDialog(this, "enter appropriate amount");
		 }
		 else if(d==0) {
			 JOptionPane.showMessageDialog(this,"already paid");
		 }
		 else if(m>d) {
			 JOptionPane.showMessageDialog(this, "only "+d+" need to be paid not more than that");
		 }
 }
	 else {
		 new ip().setVisible(true);
		 setVisible(false);
	 }
 }

}
