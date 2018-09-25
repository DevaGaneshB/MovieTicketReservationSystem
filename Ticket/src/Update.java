import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Update {
	Update(String s1,String dat1,String Mov1,String Tim1){
		
		String seat="";
		
		Fillo fillocc= new Fillo();
    	Connection connection1c;
    	
    	try {
			connection1c = fillocc.getConnection("tic.xlsx");
		    String strtest="SELECT * from "+s1+" WHERE Occupancy=2"; 
			Recordset rcs=connection1c.executeQuery(strtest);
		    while(rcs.next())
        	{
		    	seat=seat+"\t "+rcs.getField("Seat")+"";
				String str1Queryc ="Update "+s1+" Set Occupancy=0 where Button='"+rcs.getField("Button")+"'";
				connection1c.executeUpdate(str1Queryc);
                    
               	}
		    
		    JFrame tic=new JFrame("Ticket (Classic Theatre)");


		    String image="";
		    String screen="";

		    if(Mov1.equals("Citizen Kane")) {
		    	image="citizen.jpg";
		    	screen="Screen-1";
		    	}
		    else if(Mov1.equals("Psycho")) {image="psycho.jpg"; screen="Screen-2";}
		    else if(Mov1.equals("Pather Panchali")) {image="pather.jpg";screen="Screen-3";}
		    ImageIcon ii = new ImageIcon(image);
		    JLabel lable = new JLabel(ii);
		    
		    JLabel Dat=new JLabel("Date: "+dat1+"\t");
		    JLabel Tim=new JLabel("Time: "+Tim1+"\t");
		    JLabel Nam=new JLabel("Movie: "+Mov1+"\t");
		    JLabel Scr=new JLabel("Screen: "+screen+" \t");
		    JLabel Sea=new JLabel("Seats: "+seat+"\t");
		    
		    

		    lable.setBounds(450,10,200,300);
		    Dat.setBounds(10,10,300,50);
		    Tim.setBounds(10,60,300,50);
		    Nam.setBounds(10,110,300,50);
		    Scr.setBounds(10,160,300,50);
		    Sea.setBounds(10,210,300,50);

		    tic.add(lable);
		    tic.add(Dat);
		    tic.add(Tim);
		    tic.add(Nam);
		    tic.add(Scr);
		    tic.add(Sea);
		    tic.add(lable);
		    
		    tic.setSize(650,400);
		    tic.setVisible(true);
		    

		    JOptionPane.showMessageDialog(tic, "*note:Take screenshot of this Frame to use as entry ticket");
		    //new Booking(s1,dat1,Mov1,Tim1);
        	
    	} catch (FilloException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	
    }  

		
public static void main(String args[]) {
	String s1="Sheet6";

	String sam1="25/09/2018";
    String sam2="Citizen Kane";
    String sam3="1:00 PM";
	new Update(s1,sam1,sam2,sam3);
}
}
