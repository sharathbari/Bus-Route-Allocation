package ball;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

class info extends JFrame implements ActionListener{
	JButton l3,l4;
	JLabel j1,j2;
	JPanel f2;
	JTextField t1,t2;
	info(){
		setSize(400,400);
		setTitle("Bus details");
		j1=new JLabel("staff Id");
		j2 =new JLabel("rollno");
		l3=new JButton("StaffBusInfo");
		l4=new JButton("StudentBusInfo");
		t1=new JTextField();
		t2=new JTextField();
		f2=new JPanel(new GridLayout(2,2));
		f2.add(j1);
		f2.add(t1);
		f2.add(l3);
		f2.add(j2);
		f2.add(t2);
		f2.add(l4);
		add(f2);
		l3.addActionListener(this);
		l4.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		try {
			Conn c = new Conn();
			Comp cm = new Comp();
			JOptionPane uf;
		if(e.getSource()==l3) {
		String n =t1.getText();
		String f=cm.Compare(2, n);
		
	    if(f=="notfound") {
	    	
				JOptionPane.showMessageDialog(null, "not Registered!");
				new ip().setVisible(true);
				setVisible(false);
			}
			else {
				
				new Sresult(n,f).setVisible(true);
				setVisible(false);
				
				
			}
	    }
		
		
		if(e.getSource()==l4) {
			String n =t2.getText();
		String f=cm.Compare(1, n);
		if(f=="notfound") {
	    	
			JOptionPane.showMessageDialog(null, "not Registered!");
			new ip().setVisible(true);
			setVisible(false);
		}
		else {
			new Result(n,f).setVisible(true);
			setVisible(false);
		}
		}
	}
		catch(Exception ee) {
			
		}
	}
}
