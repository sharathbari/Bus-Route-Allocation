package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rsix extends JFrame {
	JTextField j6[];
	JLabel r1;
	Conn c,cu;
	int sno6;
	JPanel k;
	public Rsix() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r8;");
			
			while(cu.rs.next()) {
				sno6=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno6+1,1));
		j6=new JTextField[sno6];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r8;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j6[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route6");
		k.add(r1);
		
		for(int i=0;i<sno6;i++) {
			k.add(j6[i]);
			j6[i].setEditable(false);
		}
		add(k);
	}
}

