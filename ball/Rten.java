package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rten extends JFrame {
	JTextField j10[];
	JLabel r1;
	Conn c,cu;
	int sno10;
	JPanel k;
	public Rten() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r10;");
			
			while(cu.rs.next()) {
				sno10=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno10+1,1));
		j10=new JTextField[sno10];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r10;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j10[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route10");
		k.add(r1);
		
		for(int i=0;i<sno10;i++) {
			k.add(j10[i]);
			j10[i].setEditable(false);
		}
		add(k);
	}
}
