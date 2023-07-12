package Library_Management;

import javax.swing.*;

public class User {
	JFrame f;

	public User()

	{
		f = new JFrame();
		String data[][] = { { "1", "Sanjan", "admin", "false" }, { "2", "Manasi", "admin", "true" },
								{ "3", "Manav", "admin", "false" }, };
		String column[] = { "UID", "USERNAME", "PASSWORD", "ADMIN" };
		JTable jt = new JTable(data, column);
		jt.setBounds(50, 60, 250, 350);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		
		JPanel p1 = new JPanel();
		p1.setVisible(true);
		p1.setBounds(200,300,400,400);
		
		JButton back = new JButton("Back");
		back.setBounds(100,300,100,50);
		p1.add(back);
		
		f.add(p1);
		f.setLayout(null);
		f.setSize(600, 400);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new User();
	}
}
