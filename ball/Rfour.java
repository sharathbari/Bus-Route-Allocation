package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rfour extends JFrame {
	JTextField j4[];
	JLabel r1;
	Conn c,cu;
	int sno4;
	JPanel k;
	public Rfour() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r4;");
			
			while(cu.rs.next()) {
				sno4=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno4+1,1));
		j4=new JTextField[sno4];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r4;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j4[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route4");
		k.add(r1);
		
		for(int i=0;i<sno4;i++) {
			k.add(j4[i]);
			j4[i].setEditable(false);
		}
		add(k);
	}
}

