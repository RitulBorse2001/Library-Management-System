package Library_Management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import javax.swing.*;

public class Demo implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JButton submit,back;
	int i;
 public Demo()
{
	 f=new JFrame("Enter Details"); 
	
	 l5=new JLabel("ENTER ISSUE BOOK DETALIS");
	l5.setBounds(200,50,200,30);
	f.add(l5);
	
	
	
	 l1=new JLabel("Book ID(BID)");
	l1.setBounds(100,100,100,30);
	f.add(l1);
	
	 l3=new JLabel("User ID(UID)");
	l3.setBounds(100,150,100,30);
	f.add(l3);
	
	 l2=new JLabel("Period(days)");
	l2.setBounds(100,200,100,30);
	f.add(l2);
	
	 l4=new JLabel("Issued Date");
	l4.setBounds(100,250,100,30);
	f.add(l4);
	
	 t1=new JTextField();
	t1.setVisible(true);
	t1.setBounds(300,100,150,25);
	f.add(t1);
	
	 t2=new JTextField();
	t2.setVisible(true);
	t2.setBounds(300,150,150,25);
	f.add(t2);
	
	 t4=new JTextField();
	t4.setVisible(true);
	t4.setBounds(300,200,150,25);
	f.add(t4);
	
	
	 t3 = new JTextField();
	t3.setVisible(true);
	t3.setBounds(300,250,150,25);
	f.add(t3);
	
	 submit = new JButton("SUBMIT");
	submit.setVisible(true);
	submit.setBounds(290,350,100,30);
	f.add(submit);
	submit.addActionListener(this);
	
	 back = new JButton("Back");
	back.setVisible(true);
	back.setBounds(100,350,100,30);
	f.add(back);
	back.addActionListener(this);
	
	
	f.setSize(600,500);  
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	
}

	public static void main(String[] args)
	{    
		new Demo();    
	}  
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back) {
			new User_List_Page();
			f.setVisible(false);
		}
		if(e.getSource()== submit) 
		{
			issuebook();
		}
	}
		public void issuebook()
		{
			try
			{
			if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty()) 
			{
				JOptionPane.showMessageDialog(null, "Fill al details","Error", JOptionPane.ERROR_MESSAGE);
				
			}
			else
			{
				DbConnection db = new DbConnection();
				
				PreparedStatement ps = db.con.prepareStatement(String.format("insert into issuebook values('%s','%s','%s','%s')", t1.getText(),t2.getText(),t4.getText(),t3.getText()));
				
				i= ps.executeUpdate();
			}
			if(i==1)
			{
				JOptionPane.showMessageDialog(null,"Book Issued Successfully");
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
			}
				
		}
		catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());
				e.printStackTrace();
			}
	}
}
