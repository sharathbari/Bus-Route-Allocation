package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rthirteen extends JFrame {
	JTextField j13[];
	JLabel r1;
	Conn c,cu;
	int sno13;
	JPanel k;
	public Rthirteen() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r13;");
			
			while(cu.rs.next()) {
				sno13=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno13+1,1));
		j13=new JTextField[sno13];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r13;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j13[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route13");
		k.add(r1);
		
		for(int i=0;i<sno13;i++) {
			k.add(j13[i]);
			j13[i].setEditable(false);
		}
		add(k);
	}
}

