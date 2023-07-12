package Library_Management;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class login
{
	JLabel l1, l2,l3;
	JFrame f;
	JTextField l_user, l_pass;
	JButton b1;

	public login() 
	{

		f = new JFrame("Login"); // login page
		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(550, 200, 430, 340);

		l3 = new JLabel("Library Management System"); 
		l3.setBounds(50, 30, 350, 50); 
		Font myfont = new Font("times new roman", Font.BOLD, 27);
		l3.setFont(myfont);
		l3.setForeground(Color.red);
		f.add(l3);
		
		l1 = new JLabel("Username"); 
		l1.setBounds(60, 100, 120, 30); 
		Font font = new Font("italic", Font.BOLD, 20);
		l1.setFont(font);
		l1.setForeground(Color.blue);
		f.add(l1);

		l2 = new JLabel("Password"); 
		l2.setBounds(60, 150, 120, 30);
		l2.setFont(font);
		l2.setForeground(Color.blue);
		f.add(l2);

		JTextField l_user = new JTextField();
		l_user.setBounds(180, 100, 170, 30);
		f.add(l_user);

		JPasswordField l_pass = new JPasswordField();
		l_pass.setBounds(180, 150, 170, 30);
		f.add(l_pass);

		f.setResizable(false);
		JButton b1 = new JButton("Login"); 
		b1.setBounds(160, 220, 80, 25);
		b1.setBackground(Color.CYAN);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{

				if (l_user.getText().equals("admin") && l_pass.getText().equals("admin123")) {
					JOptionPane.showMessageDialog(null, "User Login Successfully!!");
					new Library_Management.User_List_Page();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Login Failed", "ERROR", JOptionPane.CANCEL_OPTION);
				}

			}

		});
		f.add(b1);
		
		
//		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Downloads\\Library-Management-System\\Library-Management-System\\out\\production\\Library_Management\\bkgroundlibrary.jpg");
//		Image img = icon.getImage();
//		JLabel l22 = new JLabel(icon, JLabel.CENTER);
//		l22.setBounds(00, 00, 500, 300);
//		Image newimg = img.getScaledInstance(l22.getWidth(), l22.getHeight(), Image.SCALE_SMOOTH);
//		f.add(l22);
	}

	public static void main(String args[]) 
	{
		new login();

	}

}
