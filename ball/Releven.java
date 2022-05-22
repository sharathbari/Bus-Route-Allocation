package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Releven extends JFrame {
	JTextField j11[];
	JLabel r1;
	Conn c,cu;
	int sno11;
	JPanel k;
	public Releven() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r11;");
			
			while(cu.rs.next()) {
				sno11=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno11+1,1));
		j11=new JTextField[sno11];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r11;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j11[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route11");
		k.add(r1);
		
		for(int i=0;i<sno11;i++) {
			k.add(j11[i]);
			j11[i].setEditable(false);
		}
		add(k);
	}
}

