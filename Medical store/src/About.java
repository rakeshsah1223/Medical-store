import javax.swing.*;
import java.awt.*;

class About extends JFrame
{
	JFrame jf;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
	

	About()
	{
		jf=new JFrame();

		jf.setLayout(null);

		l1 = new JLabel("MEDICAL STORE ");
		l1.setFont(new Font("Times New Roman",Font.BOLD,25));
		l1.setBounds(250,30,600,40);
		l1.setForeground(Color.blue);
		jf.add(l1);



		l2 = new JLabel("This System developed by,");
		//l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l2.setBounds(100,150,600,40);
		jf.add(l2);

		l3 = new JLabel("RAKESH KUMAR SAH.");
		l3.setFont(new Font("Times New Roman",Font.BOLD,22));
		
		l3.setBounds(300,200,400,40);l3.setForeground(Color.black);
		jf.add(l3);

		
		l5 = new JLabel("In this system we can add details of Medicines,Suppliers.");
		l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		l5.setBounds(100,300,800,40);
		jf.add(l5);

		l6 = new JLabel("We can also update,delete & search the existing details.");
		l6.setFont(new Font("Times New Roman",Font.BOLD,20));
		l6.setBounds(100,350,800,40);
		jf.add(l6);

		l7 = new JLabel("It is helpful to maintain the stock of medicine and check the sells of medicine on daily basis and on supplier basis");
		l7.setFont(new Font("Times New Roman",Font.BOLD,20));
		l7.setBounds(100,400,1000,40);
		jf.add(l7);

        jf.setTitle("About project");
		jf.setSize(1100,700);
		//jf.setLocation(20,20);
		jf.setResizable(true);
		jf.setBackground(Color.white);
		jf.setVisible(true);

	}

	public static void main(String args[])
	{
          new About();

	}
}
