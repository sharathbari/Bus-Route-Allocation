package ball;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
	public class Rstudent1 extends JFrame implements ActionListener {
		JLabel u1,u2,u3,u4;
		JTextField y1,y2;
		Conn cu;
		Connection cq;
		Statement s;
		ResultSet rs;
		String an,b,n,o,rcho;
		int fee,numb;
		JComboBox c,m;
		JPanel y;
		JButton l;
		ResultSet umu;
		
//		String fees(String n) {
//			try {
//				FileInputStream ml = new FileInputStream("F:\\distance.txt");
//				DataInputStream yy = new DataInputStream(ml);
//				String uno;
//				while((uno=yy.readLine())!=null) {
//					String yn[]=uno.split(";");
//					for(int i=1;i<yn.length;i++) {
//						System.out.println(yn[i]);
//						if(yn[i]==n) {
//							return yn[0];
//					}
//						
//					}
//				}
//			}
//		catch(Exception e) {
//				e.printStackTrace();
//			}
//			return "notfound";
//		}
	public Rstudent1(String a[],String rch,int num,String af,String bf) {
		rcho=rch;
		numb=num;
		setTitle("Student Registration form");
		setSize(500,500);
		setLayout(new FlowLayout());
		u1=new JLabel("Name :");
		u2=new JLabel("rollno :");
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
		m=new JComboBox(a);
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
		if(rcho=="route1") {
			c.setSelectedItem("route1");
		}
		else if(rcho=="route2") {
		c.setSelectedItem("route2");
		}
		else if(rcho=="route3") {
			c.setSelectedItem("route3");
			}
		else if(rcho=="route4") {
			c.setSelectedItem("route4");
			}
		else if(rcho=="route5") {
			c.setSelectedItem("route5");
			}
		else if(rcho=="route6") {
			c.setSelectedItem("route6");
			}
		else if(rcho=="route8") {
			c.setSelectedItem("route8");
			}
		else if(rcho=="route9") {
			c.setSelectedItem("route9");
			}
		else if(rcho=="route10") {
			c.setSelectedItem("route10");
			}
		else if(rcho=="route11") {
			c.setSelectedItem("route11");
			}
		else if(rcho=="route13") {
			c.setSelectedItem("route13");
			}
		
		l.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==c) {
			an=y1.getText();
			b=y2.getText();
			new Rstudentd(an,b).setVisible(true);
			setVisible(false);
		}
	else if(a.getSource()==l) {
		
		an=y1.getText();
		b=y2.getText();
		n=(String)m.getItemAt(m.getSelectedIndex());
		
//		Rstudent uuu=new Rstudent();
//		o=uuu.fees(n);
		try {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(Exception e) {	
			}
			
				
			cq=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbl","root","rapiddash2003");
			
			s=cq.createStatement();
			
		rs=s.executeQuery("select * from distance where stop='"+n+"';");
		
		if(rs.next()) {
		o=rs.getString("d");
		
		}
		}
		catch(Exception ef) {
			ef.printStackTrace();
		}
		
		if(o.equals("<10")) {
			fee=10000;
		}
		else if(o.equals("10")) {
			fee=15000;
		}
		else if(o.equals("20")) {
			fee=25000;
		}
		else if(o.equals(">20")) {
			fee=35000;
		}
		
		
		try {
		cu = new Conn();
		
		if(rcho=="route1") {
			
			if(numb<2) {
				int ym=numb+1;
				
		cu.St.executeUpdate("insert into r1 values('"+b+"','"+an+"',"+ym+")");
		cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
		JOptionPane.showMessageDialog(this, "Successfully completed Registration");
			}
			else {
				JOptionPane.showMessageDialog(this, rcho+" is full try other routes if your destination is available in them");
				new Rstudent().setVisible(true);
				setVisible(false);
			}
		}
		else if(rcho=="route2" && numb<2) {
			
			if(numb<2) {
			    
			    int ym=numb+1;
				cu.St.executeUpdate("insert into r2 values('"+b+"','"+an+"',"+ym+")");
				cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
				
				 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
			}
			
		}
			else if(rcho=="route3" && numb<2) {
				
				if(numb<2) {
				    
				    int ym=numb+1;
					cu.St.executeUpdate("insert into r3 values('"+b+"','"+an+"',"+ym+")");
					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
					
					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
				}
				
			}
                else if(rcho=="route4" && numb<2) {
                	
				if(numb<2) {
					
				    int ym=numb+1;
				   
					cu.St.executeUpdate("insert into r4 values('"+b+"','"+an+"',"+ym+")");
					
					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
					
					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
				}
				
			}
                else if(rcho=="route5" && numb<2) {
    				
    				if(numb<2) {
    				    
    				    int ym=numb+1;
    					cu.St.executeUpdate("insert into r5 values('"+b+"','"+an+"',"+ym+")");
    					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
    					
    					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
    				}
    				
    			}
                   else if(rcho=="route6" && numb<2) {
    				
    				if(numb<2) {
    				    
    				    int ym=numb+1;
    					cu.St.executeUpdate("insert into r6 values('"+b+"','"+an+"',"+ym+")");
    					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
    					
    					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
    				}
    				
    			}
                   else if(rcho=="route8" && numb<2) {
       				
       				if(numb<2) {
       				    
       				    int ym=numb+1;
       					cu.St.executeUpdate("insert into r8 values('"+b+"','"+an+"',"+ym+")");
       					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
       					
       					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
       				}
       				
       			}
                   else if(rcho=="route9" && numb<2) {
       				
       				if(numb<2) {
       				    
       				    int ym=numb+1;
       					cu.St.executeUpdate("insert into r9 values('"+b+"','"+an+"',"+ym+")");
       					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
       					
       					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
       				}
       				
       			}
                   else if(rcho=="route10" && numb<2) {
       				
       				if(numb<2) {
       				    
       				    int ym=numb+1;
       					cu.St.executeUpdate("insert into r10 values('"+b+"','"+an+"',"+ym+")");
       					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
       					
       					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
       				}
       			}
                   else if(rcho=="route11" && numb<2) {
          				
          				if(numb<2) {
          				    
          				    int ym=numb+1;
          					cu.St.executeUpdate("insert into r11 values('"+b+"','"+an+"',"+ym+")");
          					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
          					
          					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
          				}
          			}
                   else if(rcho=="route13" && numb<2) {
          				
          				if(numb<2) {
          				    
          				    int ym=numb+1;
          					cu.St.executeUpdate("insert into r13 values('"+b+"','"+an+"',"+ym+")");
          					cu.St.executeUpdate("insert into student values('"+b+"','"+an+"','"+n+"',+"+fee+","+fee+");");
          					
          					 JOptionPane.showMessageDialog(this, "Successfully completed Registration");
          				}
          			}
			else {
				
				JOptionPane.showMessageDialog(this, rcho+" is full try other routes if your destination is available in them");
				new Rstudent().setVisible(true);
				setVisible(false);
			}
       
        new ip().setVisible(true);
		setVisible(false);
			}
		catch(Exception e) {
			
			JOptionPane.showMessageDialog(null,"already registered");
			new ip().setVisible(true);
			setVisible(false);
			
		}
		}
	}
	}


