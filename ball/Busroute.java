package ball;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Busroute extends JFrame implements ActionListener {
	JButton r1,r2,r3,r4,r5,r6,r8,r9,r10,r11,r13;
	JPanel l1;
	public Busroute(){
		setSize(400,400);
		r1=new JButton("Route 1");
		r2=new JButton("Route 2");
		r3=new JButton("Route 3");
		r4=new JButton("Route 4");
		r5=new JButton("Route 5");
		r6=new JButton("Route 6");
		r8=new JButton("Route 8");
		r9=new JButton("Route 9");
		r10=new JButton("Route 10");
		r11=new JButton("Route 11");
		r13=new JButton("Route 13");
		l1=new JPanel(new GridLayout(11,1));
		l1.add(r1);
		l1.add(r2);
		l1.add(r3);
		l1.add(r4);
		l1.add(r5);
		l1.add(r6);
		l1.add(r8);
		l1.add(r9);
		l1.add(r10);
		l1.add(r11);
		l1.add(r13);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r8.addActionListener(this);
		r9.addActionListener(this);
		r10.addActionListener(this);
		r11.addActionListener(this);
		r13.addActionListener(this);
		add(l1);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==r1) {
			new Rone().setVisible(true);
			setVisible(false);
		}
		else if(ae.getSource()==r2) {
			new Rtwo().setVisible(true);
			setVisible(false);
		}
        else if(ae.getSource()==r3) {
        	new Rthree().setVisible(true);
			setVisible(false);
		}
else if(ae.getSource()==r4) {
	new Rfour().setVisible(true);
	setVisible(false);
		}
else if(ae.getSource()==r5) {
	new Rfive().setVisible(true);
	setVisible(false);
}
else if(ae.getSource()==r6) {
	new Rsix().setVisible(true);
	setVisible(false);
}
else if(ae.getSource()==r8) {
	new Reight().setVisible(true);
	setVisible(false);
}
else if(ae.getSource()==r9) {
	new Rnine().setVisible(true);
	setVisible(false);
}
else if(ae.getSource()==r10) {
	new Rten().setVisible(true);
	setVisible(false);
}
else if(ae.getSource()==r11) {
	new Releven().setVisible(true);
	setVisible(false);
}
else {
	new Rthirteen().setVisible(true);
	setVisible(false);
}

	}
	

}
