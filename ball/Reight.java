package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Reight extends JFrame {
	JTextField j8[];
	JLabel r1;
	Conn c,cu;
	int sno8;
	JPanel k;
	public Reight() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r8;");
			
			while(cu.rs.next()) {
				sno8=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno8+1,1));
		j8=new JTextField[sno8];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r8;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j8[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route8");
		k.add(r1);
		
		for(int i=0;i<sno8;i++) {
			k.add(j8[i]);
			j8[i].setEditable(false);
		}
		add(k);
	}
}

