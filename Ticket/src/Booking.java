import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;  

public class Booking extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
Booking(String s1,String dat1,String Mov1,String Tim1) throws FilloException{  
    super("Ticket Booking");  
    
    
    
    JButton con= new JButton("Confirm");
    con.setBounds(230,270,100,40);
    
    ImageIcon ii = new ImageIcon("illusion.jpg");
    JLabel lable = new JLabel(ii);
    lable.setBounds(40,50,170,40);
    JLabel txt=new JLabel("Screen");
    txt.setBounds(100,35,70,20);
    
    b1=new JButton("A1");  
    b1.setBounds(50,110,50,40);  
    b2=new JButton("A2");  
    b2.setBounds(100,110,50,40);  
    b3=new JButton("A3");  
    b3.setBounds(150,110,50,40);  
    b4=new JButton("B1");  
    b4.setBounds(50,170,50,40);  
    b5=new JButton("B2");  
    b5.setBounds(100,170,50,40);  
    b6=new JButton("B3");  
    b6.setBounds(150,170,50,40);  
    b7=new JButton("C1");  
    b7.setBounds(50,230,50,40);  
    b8=new JButton("C2");  
    b8.setBounds(100,230,50,40);  
    b9=new JButton("C3");  
    b9.setBounds(150,230,50,40);  
    

    Fillo filloc= new Fillo();
	Connection connection1;
	connection1 = filloc.getConnection("tic.xlsx");

	String str1Queryc ="Select * from "+s1+" ";
	Recordset rsc=connection1.executeQuery(str1Queryc);
	while(rsc.next()) {
		if(Integer.parseInt(rsc.getField("Occupancy")) == 1) {
			switch(rsc.getField("Seat")) {
			case "A1":
		    	b1.setBackground(null);
		    	break;
			case "A2":
		    	b2.setBackground(null);
		    	break;
			case "A3":
		    	b3.setBackground(null);
		    	break;
			case "B1":
		    	b4.setBackground(null);				
		    	break;
			case "B2":
		    	b5.setBackground(null);
		    	break;
			case "B3":
		    	b6.setBackground(null);
		    	break;
			case "C1":
		    	b7.setBackground(null);
		    	break;
			case "C2":
		    	b8.setBackground(null);
		    	break;
			case "C3":
		    	b9.setBackground(null);
					
			}		}
		else {
			switch(rsc.getField("Seat")) {
			case "A1":
		    	b1.setBackground(Color.gray);
		    	break;
			case "A2":
		    	b2.setBackground(Color.gray);
		    	break;
			case "A3":
		    	b3.setBackground(Color.gray);
		    	break;
			case "B1":
		    	b4.setBackground(Color.gray);				
		    	break;
			case "B2":
		    	b5.setBackground(Color.gray);
		    	break;
			case "B3":
		    	b6.setBackground(Color.gray);
		    	break;
			case "C1":
		    	b7.setBackground(Color.gray);
		    	break;
			case "C2":
		    	b8.setBackground(Color.gray);
		    	break;
			case "C3":
		    	b9.setBackground(Color.gray);
					
		}
	}
	}
	rsc.close();
	connection1.close();

    
    b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);  
    
    con.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
        	Fillo fillocc= new Fillo();
        	Connection connection1c;
        	int amt=0;
        	try {
				connection1c = filloc.getConnection("tic.xlsx");
				if(b1.getBackground()==Color.red)
	        	{
					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b1'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b1.setBackground(Color.red);
	        	}
				if(b2.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b2'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b2.setBackground(Color.red);
	        	}
				if(b3.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b3'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b3.setBackground(Color.red);
	        	}
				if(b4.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b4'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b4.setBackground(Color.red);
	        	}
				if(b5.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b5'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b5.setBackground(Color.red);
	        	}
				if(b6.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b6'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b6.setBackground(Color.red);
	        	}
				if(b7.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b7'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b7.setBackground(Color.red);
	        	}
				if(b8.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b8'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b8.setBackground(Color.red);
	        	}
				if(b9.getBackground()==Color.red)
	        	{

					amt+=150;
					String str1Queryc ="Update "+s1+" Set Occupancy=2 where Button='b9'";
					connection1c.executeUpdate(str1Queryc);
	                    
	        		b9.setBackground(Color.red);
	        	}
	        	
        	} catch (FilloException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	dispose();
        	new Pay(amt,s1,dat1,Mov1,Tim1);

        	
        }  
        });
    
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);  
    add(con);add(lable);add(txt);
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}  
public void actionPerformed(ActionEvent e){  
    if(e.getSource()==b1){
    	if(b1.getBackground()==Color.red)
    	{
    	b1.setBackground(null);
        }else if(b1.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b1.setBackground(Color.red);
        }
    	}
    if(e.getSource()==b2){  
    	if(b2.getBackground()==Color.red)
    	{
    	b2.setBackground(null);
        }else if(b2.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b2.setBackground(Color.red);
        }
    }  
    if(e.getSource()==b3){  
    	if(b3.getBackground()==Color.red)
    	{
    	b3.setBackground(null);
        }else if(b3.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b3.setBackground(Color.red);
        }    }  
    if(e.getSource()==b4){  
    	if(b4.getBackground()==Color.red)
    	{
    	b4.setBackground(null);
        }else if(b4.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b4.setBackground(Color.red);
        }
    }  
    if(e.getSource()==b5){  
    	if(b5.getBackground()==Color.red)
    	{
    	b5.setBackground(null);
        }else if(b5.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b5.setBackground(Color.red);
        }

    }  
    if(e.getSource()==b6){  
    	if(b6.getBackground()==Color.red)
    	{
    	b6.setBackground(null);
        }else if(b6.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b6.setBackground(Color.red);
        }
    }  
    if(e.getSource()==b7){  
    	if(b7.getBackground()==Color.red)
    	{
    	b7.setBackground(null);
        }else if(b7.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b7.setBackground(Color.red);
        }
    }  
    if(e.getSource()==b8){  
    	if(b8.getBackground()==Color.red)
    	{
    	b8.setBackground(null);
        }else if(b8.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b8.setBackground(Color.red);
        }
    }  
    if(e.getSource()==b9){      
    	if(b9.getBackground()==Color.red)
    	{
    	b9.setBackground(null);
        }else if(b9.getBackground()==Color.gray) {
        	JOptionPane.showMessageDialog(null, "Seat Unavailable", "Seat is booked",JOptionPane.WARNING_MESSAGE);
        }else {b9.setBackground(Color.red);
        }
    }  
       
}  
public static void main(String[] args) throws FilloException {  
    String s1="Sheet2";
    String sam1="";
    String sam2="";
    String sam3="";
	new Booking(s1,sam1,sam2,sam3);  
}  
}  