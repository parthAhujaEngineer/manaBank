import java.awt.*;
import javax.swing.*;
class Bank
{
	Frame f;
	JLabel l1,l2,l3,l4;
	ImageIcon img;
	JPanel p;
	JProgressBar pb;
	Bank()
	{
		f=new Frame("Bank Customer Management");
		f.setLayout(null);
		f.setBounds(300,10,600,600);
		

		img=new ImageIcon("office.jpg");
		l2=new JLabel();
		l2.setBounds(0,0,600,560);
		l2.setIcon(img);
		f.add(l2);

		Font f1=new Font("TimesNewRoman",Font.BOLD,20);


		p=new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBounds(0,560,600,40);
		p.setBackground(Color.BLACK);
		f.add(p);

		l3=new JLabel("www.sgnr_bank.com");
		l3.setBounds(20,0,200,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(f1);
		p.add(l3);

		l4=new JLabel("SGNR_Branch");
		l4.setBounds(450,0,200,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(f1);
		p.add(l4);

		pb=new JProgressBar(1,100);
		pb.setBounds(0,400,600,30);
		f.add(pb);

		f.setVisible(true);

		for(int i=0;i<100;i++)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e,"Error",1);
			}
			pb.setValue(i);
		}
		Login A=new Login();
		f.setResizable(false);
		f.setVisible(false);
		
	}
	public static void main(String []r)
	{
		Bank A=new Bank();
	}
}