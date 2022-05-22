package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rthree extends JFrame {
	JTextField j3[];
	JLabel r1;
	Conn c,cu;
	int sno3;
	JPanel k;
	public Rthree() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r3;");
			
			while(cu.rs.next()) {
				sno3=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno3+1,1));
		j3=new JTextField[sno3];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r3;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j3[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route3");
		k.add(r1);
		
		for(int i=0;i<sno3;i++) {
			k.add(j3[i]);
			j3[i].setEditable(false);
		}
		add(k);
	}
}
