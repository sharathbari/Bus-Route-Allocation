package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rfive extends JFrame {
	JTextField j5[];
	JLabel r1;
	Conn c,cu;
	int sno5;
	JPanel k;
	public Rfive() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r5;");
			
			while(cu.rs.next()) {
				sno5=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno5+1,1));
		j5=new JTextField[sno5];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r5;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j5[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route5");
		k.add(r1);
		
		for(int i=0;i<sno5;i++) {
			k.add(j5[i]);
			j5[i].setEditable(false);
		}
		add(k);
	}
}

