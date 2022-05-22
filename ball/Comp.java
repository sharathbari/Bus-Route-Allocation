package ball;

import java.io.*;
import java.sql.*;
public class Comp{
	
	public String Compare (int l,String str) throws Exception{
		Connection c;
		Statement s;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {	
		}
		
			
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbl","root","rapiddash2003");
		
		s=c.createStatement();
FileInputStream f = new FileInputStream("F:\\bus.txt");
DataInputStream d = new DataInputStream(f);
String line,fu;
if(l==1){
ResultSet rs1 = s.executeQuery("select * from student where rollno='"+str+"';");
if(rs1.next()) {
while((line=d.readLine())!=null){
String item[]=line.split(";");
for(int i=1;i<item.length;i++){
	fu=item[i];
	
if(fu.equals(rs1.getString(3)))
return(item[0]);
}}}
else{
	//System.out.println("not registered");
	}
}
else if(l==2){
ResultSet rs1 = s.executeQuery("select * from staff where staffno='"+str+"';");
if(rs1.next()) {
while((line=d.readLine())!=null){
String item[]=line.split(";");
for(int i=1;i<item.length;i++){
	fu=item[i];
if(fu.equals(rs1.getString(3)))
return(item[0]);
}}}
else{
	//System.out.println("not registered");
	}
}
return("notfound");
	}
}