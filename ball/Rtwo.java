package ball;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Rtwo extends JFrame{
	JPanel k;
	Conn c;
	int j=0,sno2;
	JTextField j2[];
	JLabel r2;
	public Rtwo() {
		setSize(600,600);
		try {
			 c= new Conn();
			c.rs=c.St.executeQuery("select sno from r2;");
			while(c.rs.next()) {
				sno2=Integer.parseInt(c.rs.getString("sno"));
				

			}	
		}
			catch(Exception ea) {
				ea.printStackTrace();
			}
		r2=new JLabel("Route2");
		try {
	c=new Conn();
	c.rs=c.St.executeQuery("select * from r2;");
	while(c.rs.next()) {
		j2[j]=new JTextField(c.rs.getString(1));
		j++;
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		k=new JPanel(new GridLayout(sno2+1,1));
		k.add(r2);
		
		for(int i=0;i<sno2;i++) {
			k.add(j2[i]);
			j2[i].setEditable(false);
		}
		add(k);
}
}
