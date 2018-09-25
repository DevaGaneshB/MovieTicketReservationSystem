import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class select {
	select() throws FilloException{
	
	Fillo filloc= new Fillo();
	Connection connection1;
	connection1 = filloc.getConnection("tic.xlsx");

	String str1Queryc ="Select * from Sheet4 ";
	Recordset rsc=connection1.executeQuery(str1Queryc);
	int d=rsc.getCount();
	rsc.close();
	connection1.close();
	
	String Datemov[]= new String[d];
	String Namemov[][]= new String[3][3];
	String Timemov[][]= new String[3][3];
	Fillo fillo= new Fillo();
	Connection connection;
	connection = fillo.getConnection("tic.xlsx");

	String str1Query ="Select * from Sheet4 ";
	Recordset rs=connection.executeQuery(str1Query);
	for(int i=0;rs.next();i++) {
		Datemov[i]=rs.getField("Date");
		Namemov[i][0]=rs.getField("Movie1");
		Namemov[i][1]=rs.getField("Movie2");
		Namemov[i][2]=rs.getField("Movie3");
		Timemov[i][0]=rs.getField("Time1");
		Timemov[i][1]=rs.getField("Time2");
		Timemov[i][2]=rs.getField("Time3");
				}    
    rs.close();
    connection.close();

	JFrame mov=new JFrame("Select");
    JLabel date=new JLabel("Date:");
    JComboBox<String> cb1=new JComboBox<String>(Datemov);    
	JLabel Movie=new JLabel("   Movie:");
	JLabel time =new JLabel("Time:");
	JButton movb= new JButton("Select Date");
	JButton timeb= new JButton("Select Time");
	
	date.setBounds(10,10,60,10);
	cb1.setBounds(50,40,100,50);
	movb.setBounds(160,40,130,50);
	
	Movie.setBounds(0,80,60,20);
	
	time.setBounds(0,140,60,20);
    
	mov.add(date);
    mov.add(cb1);
    mov.add(movb);
    
    mov.setLayout(null);
    mov.setSize(375,400);    
    mov.setVisible(true);
	
    movb.addActionListener(new ActionListener()
	{
       public void actionPerformed(ActionEvent e)
       {
    	   int k=cb1.getSelectedIndex(); 
    	   String dat1=Datemov[k];
    	   JComboBox moc=new JComboBox(Namemov[k]);
    	   JButton timeb=new JButton("Select Movie");
    	   moc.setBounds(50,100,100,50);
    	   timeb.setBounds(160,100,130,50);
    	   date.setVisible(false);
    	   cb1.setVisible(false);
    	   movb.setVisible(false);
    	   
    	   mov.add(moc);mov.add(timeb);mov.add(Movie);

    	   timeb.addActionListener(new ActionListener()
   		   {
           public void actionPerformed(ActionEvent e)
           {
        	   int k1=moc.getSelectedIndex(); 
        	   String Mov1=Namemov[k][k1];   
        	   JComboBox mocs=new JComboBox(Timemov[k1]);
        	   JButton timemb=new JButton("Select Time");
        	    mocs.setBounds(50,150,100,50);
        	    timemb.setBounds(160,150,130,50);
        	
        	   moc.setVisible(false);
         	   timeb.setVisible(false);
         	   Movie.setVisible(false);
         	
         	  mov.add(mocs);mov.add(timemb);mov.add(time);

         	 timemb.addActionListener(new ActionListener()
     		{
             public void actionPerformed(ActionEvent e)
             {
                try {
                	int k11=mocs.getSelectedIndex(); 
                	String Tim1=Timemov[k][k11];
                	mov.dispose();
                	String s1="";
                	     if(k==0 && k1==0 && k11==0)  {s1="Sheet2";}
                	else if(k==0 && k1==0 && k11==1) {s1="Sheet5";}
                	else if(k==0 && k1==0 && k11==2) {s1="Sheet6";}
                	else if(k==0 && k1==1 && k11==0) {s1="Sheet7";}
                	else if(k==0 && k1==1 && k11==1) {s1="Sheet8";}
                	else if(k==0 && k1==1 && k11==2) {s1="Sheet9";}
                	else if(k==0 && k1==2 && k11==0) {s1="Sheet10";}
                	else if(k==0 && k1==2 && k11==1) {s1="Sheet11";}
                	else if(k==0 && k1==2 && k11==2) {s1="Sheet12";}
                	else if(k==1 && k1==0 && k11==0) {s1="Sheet13";}
                	else if(k==1 && k1==0 && k11==1) {s1="Sheet14";}
                	else if(k==1 && k1==0 && k11==2) {s1="Sheet15";}
                	else if(k==1 && k1==1 && k11==0) {s1="Sheet16";}
                	else if(k==1 && k1==1 && k11==1) {s1="Sheet17";}
                	else if(k==1 && k1==1 && k11==2) {s1="Sheet18";}
                	else if(k==1 && k1==2 && k11==0) {s1="Sheet19";}
                	else if(k==1 && k1==2 && k11==1) {s1="Sheet20";}
                	else if(k==1 && k1==2 && k11==2) {s1="Sheet21";}
                	else if(k==2 && k1==0 && k11==0) {s1="Sheet22";}
                	else if(k==2 && k1==0 && k11==1) {s1="Sheet23";}
                	else if(k==2 && k1==0 && k11==2) {s1="Sheet24";}
                	else if(k==2 && k1==1 && k11==0) {s1="Sheet25";}
                	else if(k==2 && k1==1 && k11==1) {s1="Sheet26";}
                	else if(k==2 && k1==1 && k11==2) {s1="Sheet27";}
                	else if(k==2 && k1==2 && k11==0) {s1="Sheet28";}
                	else if(k==2 && k1==2 && k11==1) {s1="Sheet29";}
                	else if(k==2 && k1==2 && k11==2) {s1="Sheet30";}
                	
                	     new Booking(s1,dat1,Mov1,Tim1);
				} catch (FilloException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
             }
     		}		);
     	
           }
   		}		);
   	
       
       }
	}		);
    
    
	}
public static void main(String args[]) throws FilloException {
	new select();
}
}
