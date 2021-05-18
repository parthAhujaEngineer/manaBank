import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
class Login implements ActionListener
{
	Frame f;
	Label l1,l2,l3;
	JLabel l5,l4;
	TextField t2,t3;
	JPanel p;
	Button b1;
	JProgressBar pb;
	Connection con;
	ResultSet rs;
	Statement st;
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			st=con.createStatement();
			JOptionPane.showMessageDialog(null,"Connected","Connected",0);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"Error_[Connection Problem]",0);
		}
	}
	Login()
	{
		f=new Frame("Login");
		f.setLayout(null);
		f.setBounds(200,10,600,600);

		Font f1=new Font("TimesNewRoman",Font.BOLD,20);

		l2=new Label("Enter Username :");
		l2.setBounds(100,150,200,50);
		l2.setFont(f1);
		f.add(l2);

		l3=new Label("Enter Password :");
		l3.setBounds(100,200,200,50);
		l3.setFont(f1);
		f.add(l3);

		t2=new TextField();
		t2.setBounds(300,150,200,40);
		t2.setFont(f1);
		f.add(t2);

		t3=new TextField();
		t3.setBounds(300,200,200,40);
		t3.setFont(f1);
		f.add(t3);

		b1=new Button("Login");
		b1.setBounds(250,300,100,40);
		b1.setFont(f1);
		f.add(b1);

		p=new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBounds(0,560,600,40);
		p.setBackground(Color.BLACK);
		f.add(p);

		l5=new JLabel("www.sgnr_bank.com");
		l5.setBounds(20,0,200,30);
		l5.setForeground(Color.WHITE);
		l5.setFont(f1);
		p.add(l5);

		l4=new JLabel("SGNR_Branch");
		l4.setBounds(450,0,200,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(f1);
		p.add(l4);

		b1.addActionListener(this);

		f.setVisible(true);
		f.setResizable(false);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==b1)
		{
			try
			{
				String a,b;
				a=t2.getText();
				b=t3.getText();
				//rs=st.executeQuery("select * from login");
				boolean f=false;
				/*while(rs.next())
				{
					if((rs.getString("username")==(a))&&(rs.getString("pwd")==(b)))
					{
						BMenu A=new BMenu();
					}
				}
				if(f==false)
				{
					JOptionPane.showMessageDialog(null,"Incorrect Username/Password","Bank",0);
				}*/
				for(int s=1;s!=0;s++)
				{
					rs=st.executeQuery("select * from login where id='"+s+"'");
					rs.next();
					if((rs.getString("username")==(a))&&(rs.getString("pwd")==(b)))
					{
						BMenu A=new BMenu();
					}
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e,"Error",0);
			}
		}
		f.setVisible(false);
	}
	public static void main(String []r)
	{
		Login A=new Login();
	}
}