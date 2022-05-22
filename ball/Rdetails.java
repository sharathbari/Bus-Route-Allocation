package ball;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Rdetails {
	
	String item[];
public Rdetails() {
	
	try {
	FileInputStream f = new FileInputStream("F:\\bus.txt");
	DataInputStream d = new DataInputStream(f);
	String line,fu;
	while((line=d.readLine())!=null){
		 item=line.split(";");
		for(int i=0;i<item.length;i++) {
			System.out.print(item[i]+" ");
		}
		System.out.println("");
	}
	
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
}
