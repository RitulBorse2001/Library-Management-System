package Library_Management;
import javax.swing.*;
import java.awt.*;

public class Add_User
{
Add_User()
{
	JFrame f=new JFrame("Add New User"); 
	
	JLabel l5=new JLabel("ENTER USER DETALIS");
	l5.setBounds(200,50,200,30);
	f.add(l5);
	
	JLabel l1=new JLabel("Username");
	l1.setBounds(100,100,100,30);
	f.add(l1);
	
	JLabel l2=new JLabel("Create Password");
	l2.setBounds(100,150,100,30);
	f.add(l2);
	
	JLabel l3=new JLabel("Re-enter Password");
	l3.setBounds(100,200,100,30);
	f.add(l3);
	
	JTextField t1=new JTextField();
	t1.setVisible(true);
	t1.setBounds(300,100,150,25);
	f.add(t1);
	
	JTextField t2=new JTextField();
	t2.setVisible(true);
	t2.setBounds(300,150,150,25);
	f.add(t2);
	
	JTextField t3=new JTextField();
	t3.setVisible(true);
	t3.setBounds(300,200,150,25);
	f.add(t3);
	
	JButton b=new JButton("Create");
	b.setVisible(true);
	b.setBounds(200,300,100,30);
	f.add(b);
	
	f.setSize(600,600);  
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Downloads\\Library-Management-System\\Library-Management-System\\out\\production\\Library_Management\\bkgroundlibrary.jpg");
	Image img = icon.getImage();
	JLabel l22 = new JLabel(icon, JLabel.CENTER);
	l22.setBounds(00, 00, 700, 570);
	Image newimg = img.getScaledInstance(l22.getWidth(), l22.getHeight(), Image.SCALE_SMOOTH);
	f.add(l22);
}

	public static void main(String[] args)
	{    
		new Add_User();    
	}    

}