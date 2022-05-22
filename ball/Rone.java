package ball;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Rone extends JFrame {
	JTextField j1[];
	JLabel r1;
	Conn c,cu;
	int sno1;
	JPanel k;
	public Rone() {
		setSize(600,600);
		try {
			cu=new Conn();
			
			cu.rs=cu.St.executeQuery("select sno from r1;");
			
			while(cu.rs.next()) {
				sno1=Integer.parseInt(cu.rs.getString("sno"));

			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		k=new JPanel(new GridLayout(sno1+1,1));
		j1=new JTextField[sno1];
		try {
			c=new Conn();
			c.rs=c.St.executeQuery("select * from r1;");
			int i=0,j=0;
			while(c.rs.next()) {
		    j1[i]= new JTextField( c.rs.getString(1));
	        i++;
			}	
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		r1=new JLabel("route1");
		k.add(r1);
		
		for(int i=0;i<sno1;i++) {
			k.add(j1[i]);
			j1[i].setEditable(false);
		}
		add(k);
	}
}
