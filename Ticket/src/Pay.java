import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Pay {
	Pay(int amt,String s1,String dat1,String Mov1,String Tim1){
		JFrame frame = new JFrame("Bank Login");
		  JLabel l1 = new JLabel("Internet-Banking");
		 
		  JLabel l2 = new JLabel("BankId");
		  JLabel l3 = new JLabel("Password");
		  JTextField tf1 = new JTextField();
		  JPasswordField p1 = new JPasswordField();
		  JButton btn1 = new JButton("Login");	 
		  l1.setBounds(100, 30, 400, 30);
		  l2.setBounds(80, 70, 200, 30);
		  l3.setBounds(80, 110, 200, 30);
		  tf1.setBounds(300, 70, 200, 30);
		  p1.setBounds(300, 110, 200, 30);
		  btn1.setBounds(400, 160, 100, 30);
		  frame.add(l1);
		  frame.add(l2);
		  frame.add(tf1);
		  frame.add(l3);
		  frame.add(p1);
		  frame.add(btn1);
		 
		  frame.setSize(800, 400);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  
		  btn1.addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){  
			             String un=tf1.getText();
			             String pwd=p1.getText();
			             int exi,stats=0;
				  Fillo filloc= new Fillo();
					Connection connection1;
					try {
						connection1 = filloc.getConnection("tic.xlsx");
						String str1Queryc ="SELECT * FROM Sheet3 WHERE EXISTS (SELECT BankId FROM Sheet1 WHERE BankId='"+btn1.getText()+"')";
				
						
						Recordset rsc=connection1.executeQuery(str1Queryc);					
						if(un.equals("") ||pwd.equals("")) {

			        		   JOptionPane.showMessageDialog(null,"Kindly Enter both your BankId and Password");
						}else {
	                    while(rsc.next()) {
	                    	if(rsc.getField("Password").equals(pwd)) {
	                    		JOptionPane.showMessageDialog(null,"Login Successful!!!");
	                    		frame.dispose();
	                    		new Transaction(amt,un,s1,dat1,Mov1,Tim1);
	                    		stats=stats+1;
	                    		break;
	                    	}
	                    	
	                    }
	                    if(stats==0){
                    		JOptionPane.showMessageDialog(null,"Incorrect BankId or Password");
                    		
                    	}
						}
						
					} catch (FilloException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}


			          }  
			      }); 

		
	}
public static void main(String args[]) {
	int a=0;
	String s1="Sheet2";
	String sam1="";
    String sam2="";
    String sam3="";
	new Pay(a,s1,sam1,sam2,sam3);
}
}
