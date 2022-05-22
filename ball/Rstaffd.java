package ball;

import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.*;


public class Rstaffd extends JFrame implements ActionListener {
	JLabel u1,u2,u3,u4;
	JTextField y1,y2;
	JComboBox c,m;
	Conn cu;
	int sno1,sno2,sno3,sno4,sno5,sno6,sno8,sno9,sno10,sno11,sno13;
	String an,b,n;
	JPanel y;
	JButton l;
	String stops[];
public Rstaffd(String af,String bf) {
	setTitle("Staff Registration form");
	setSize(500,500);
	setLayout(new FlowLayout());
	u1=new JLabel("Name :");
	u2=new JLabel("staffId :");
	u3=new JLabel("destination");
	u4=new JLabel("stops");
	y1=new JTextField();
	y2=new JTextField();
	l=new JButton("register");
	y=new JPanel(new GridLayout(5,2));
	
	String routes[]= {"route1","route2","route3","route4","route5","route6","route8","route9","route10","route11","route13"};
	//String distance[]= {"<10","10","20",">20"};
	c=new JComboBox(routes);
	c.addActionListener(this);
	m=new JComboBox();
	y.add(u1);
	y.add(y1);
	y.add(u2);
	y.add(y2);
	y.add(u3);
	y.add(c);
	y.add(u4);
	y.add(m);
	y.add(l);
	add(y);
	y1.setText(af);
	y2.setText(bf);
	l.addActionListener(this);
}
public void actionPerformed(ActionEvent a) {
	an=y1.getText();
	b=y2.getText();
	if(a.getSource()==c) {
		String line;
		n=(String)c.getItemAt(c.getSelectedIndex());
		if(n=="route1") {
			try {
				Conn c= new Conn();
				c.rs=c.St.executeQuery("select sno from r1");
				while(c.rs.next()) {
					sno1=Integer.parseInt(c.rs.getString("sno"));

				}		
				FileInputStream ml = new FileInputStream("F:\\bus1.txt");
		     	DataInputStream yy = new DataInputStream(ml);
		     	   line =yy.readLine();
		     		String item[]=line.split(";");
		     		stops=item;		
		     		
		     		setVisible(false);
		     		new Rstudent1(stops,n,sno1,an,b).setVisible(true);
		     		
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
		else if(n=="route2") {
			
			try {
				Conn c= new Conn();
				c.rs=c.St.executeQuery("select sno from r2");
				while(c.rs.next()) {
					sno2=Integer.parseInt(c.rs.getString("sno"));

				}		
				
				FileInputStream ml = new FileInputStream("F:\\bus2.txt");
		     	DataInputStream yy = new DataInputStream(ml);
		     	   line =yy.readLine();
		     		String item[]=line.split(";");
		     		stops=item;
		     		setVisible(false);
		     		new Rstaff1(stops,n,sno2,an,b).setVisible(true);
		     		
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
else if(n=="route3") {
			
			try {
				Conn c= new Conn();
				c.rs=c.St.executeQuery("select sno from r3");
				while(c.rs.next()) {
					sno3=Integer.parseInt(c.rs.getString("sno"));

				}		
				
				FileInputStream ml = new FileInputStream("F:\\bus3.txt");
		     	DataInputStream yy = new DataInputStream(ml);
		     	   line =yy.readLine();
		     		String item[]=line.split(";");
		     		stops=item;
		     		setVisible(false);
		     		new Rstaff1(stops,n,sno3,an,b).setVisible(true);
		     		
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
else if(n=="route4") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r4");
		while(c.rs.next()) {
			sno4=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus4.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno4,an,b).setVisible(true);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route5") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r5");
		while(c.rs.next()) {
			sno3=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus5.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno5,an,b).setVisible(true);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route6") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r6");
		while(c.rs.next()) {
			sno6=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus6.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno6,an,b).setVisible(true);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route8") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r8");
		while(c.rs.next()) {
			sno8=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus8.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno8,an,b).setVisible(true);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route9") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r9");
		while(c.rs.next()) {
			sno9=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus9.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno9,an,b).setVisible(true);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route10") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r10");
		while(c.rs.next()) {
			sno10=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus10.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno10,an,b).setVisible(true);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route11") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r11");
		while(c.rs.next()) {
			sno11=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus11.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		
     		new Rstaff1(stops,n,sno11,an,b).setVisible(true);
     		setVisible(false);
     		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
else if(n=="route13") {
	
	try {
		Conn c= new Conn();
		c.rs=c.St.executeQuery("select sno from r13");
		while(c.rs.next()) {
			sno13=Integer.parseInt(c.rs.getString("sno"));

		}		
		
		FileInputStream ml = new FileInputStream("F:\\bus13.txt");
     	DataInputStream yy = new DataInputStream(ml);
     	   line =yy.readLine();
     		String item[]=line.split(";");
     		stops=item;
     		setVisible(false);
     		new Rstaff1(stops,n,sno13,an,b).setVisible(true);
  		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
else if(a.getSource()==l) {
	JOptionPane.showMessageDialog(this, "select the route!");
}
}
}
