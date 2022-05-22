package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rnine extends JFrame {
	JTextField j9[];
	JLabel r1;
	Conn c,cu;
	int sno9;
	JPanel k;
	public Rnine() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r9;");
			
			while(cu.rs.next()) {
				sno9=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno9+1,1));
		j9=new JTextField[sno9];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r9;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j9[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route9");
		k.add(r1);
		
		for(int i=0;i<sno9;i++) {
			k.add(j9[i]);
			j9[i].setEditable(false);
		}
		add(k);
	}
}
