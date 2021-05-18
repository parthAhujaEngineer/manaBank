import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class BMenu implements ActionListener
{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3,m4,m5;
	JLabel l1,l2,l3,l4;
	ImageIcon img;
	MenuItem i11,i12,i13,i14,i21,i22,i23,i31,i32,i33,i34,i41,i42,i43,i44,i45;
	JPanel p;
	JDesktopPane dp;
	BMenu()
	{
		f=new Frame("Bank Customer Management Menu");
		f.setLayout(null);
		f.setVisible(true);

		dp=new JDesktopPane();
		dp.setLayout(null);
		dp.setBounds(65,75,1133,553);
		dp.setVisible(true);
		dp.setBackground(Color.WHITE);
		f.add(dp);

		img=new ImageIcon("Beach.jpg");
		l2=new JLabel("Image");
		l2.setIcon(img);
		l2.setBounds(0,0,1266,640);
		f.add(l2);

		Font f1=new Font("TimesNewRoman",Font.BOLD,13);

		mb=new MenuBar();
		f.setMenuBar(mb);
		mb.setFont(f1);

		m1=new Menu("Customer");
		mb.add(m1);

		m2=new Menu("Transaction");
		mb.add(m2);

		m3=new Menu("Loan");
		mb.add(m3);

		m4=new Menu("Extra");
		mb.add(m4);

		m5=new Menu("About");
		mb.add(m5);

		i11=new MenuItem("New Customer");
		m1.add(i11);

		i12=new MenuItem("Modify Customer");
		m1.add(i12);

		i13=new MenuItem("Delete Customer");
		m1.add(i13);

		i14=new MenuItem("Joint a/c");
		m1.add(i14);

		i21=new MenuItem("WithDraw");
		m2.add(i21);

		i22=new MenuItem("Deposit");
		m2.add(i22);

		i23=new MenuItem("Account Statement");
		m2.add(i23);

		i31=new MenuItem("Car Loan");
		m3.add(i31);

		i32=new MenuItem("Education Loan");
		m3.add(i32);

		i33=new MenuItem("Gold Loan");
		m3.add(i33);

		i34=new MenuItem("Property Loan");
		m3.add(i34);

		i41=new MenuItem("ATM Facility");
		m4.add(i41);

		i42=new MenuItem("Debit Card");
		m4.add(i42);

		i43=new MenuItem("Crebit Card");
		m4.add(i43);

		p=new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBounds(0,640,1266,26);
		p.setBackground(Color.BLACK);
		f.add(p);

		l3=new JLabel("www.sgnr_bank.com");
		l3.setBounds(7,0,133,20);
		l3.setForeground(Color.WHITE);
		l3.setFont(f1);
		p.add(l3);

		l4=new JLabel("SGNR_Branch");
		l4.setBounds(1166,0,133,20);
		l4.setForeground(Color.WHITE);
		l4.setFont(f1);
		p.add(l4);

		i11.addActionListener(this);
		i12.addActionListener(this);
		i13.addActionListener(this);
		i14.addActionListener(this);
		i21.addActionListener(this);
		i22.addActionListener(this);
		i23.addActionListener(this);
		i31.addActionListener(this);
		i32.addActionListener(this);
		i33.addActionListener(this);
		i34.addActionListener(this);
		i41.addActionListener(this);
		i42.addActionListener(this);
		i43.addActionListener(this);

		f.setVisible(true);
		//f.setResizable(false);
		f.setSize(1266,666);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==i11)
		{
			JInternalFrame jif=new JInternalFrame("New Account",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			NewAcc A=new NewAcc();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i12)
		{
			JInternalFrame jif=new JInternalFrame("Modify Account",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Modify B=new Modify();
			B.setBounds(0,0,1133,553);
			jif.add(B);
		}
		if(ob==i13)
		{
			JInternalFrame jif=new JInternalFrame("Delete Account",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Delete C=new Delete();
			C.setBounds(0,0,1133,553);
			jif.add(C);
		}
		if(ob==i21)
		{
			JInternalFrame jif=new JInternalFrame("Withdraw Amt.",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Withdraw A=new Withdraw();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i22)
		{
			JInternalFrame jif=new JInternalFrame("Deposit Amount",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Deposit A=new Deposit();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i23)
		{
			JInternalFrame jif=new JInternalFrame("Amount Statement",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			StatementAcc A=new StatementAcc();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i31)
		{
			JInternalFrame jif=new JInternalFrame("Car Loan",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			CarLoan A=new CarLoan();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i32)
		{
			JInternalFrame jif=new JInternalFrame("Car Loan",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			EducationLoan A=new EducationLoan();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i33)
		{
			JInternalFrame jif=new JInternalFrame("Car Loan",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			GoldLoan A=new GoldLoan();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i34)
		{
			JInternalFrame jif=new JInternalFrame("Car Loan",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			PropertyLoan A=new PropertyLoan();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i41)
		{
			JInternalFrame jif=new JInternalFrame("ATM Facility",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Atm A=new Atm();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i42)
		{
			JInternalFrame jif=new JInternalFrame("Debit Card",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Debit A=new Debit();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
		if(ob==i43)
		{
			JInternalFrame jif=new JInternalFrame("Credit Card",true,true,true,true);
			jif.setLayout(null);
			jif.setVisible(true);
			jif.setBounds(0,0,1133,553);
			dp.add(jif);
			Credit A=new Credit();
			A.setBounds(0,0,1133,553);
			jif.add(A);
		}
	}
	public static void main(String []r)
	{
		BMenu A=new BMenu();
	}
}