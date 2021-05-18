import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;
class Credit extends Panel implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	Connection con;
	ResultSet rs;
	Statement st;
	int s,r,t;
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
			JOptionPane.showMessageDialog(null,e,"Error",0);
		}
	}
	Credit()
	{
		l1=new Label("Enter Account ID:");
		l1.setBounds(303,100,300,50);
		add(l1); 

		l2=new Label("Enter Issuing Date :");
		l2.setBounds(303,150,300,50);
		add(l2);

		l3=new Label("Credit Card Number :");
		l3.setBounds(303,200,300,50);
		add(l3);

		t1=new TextField();
		t1.setBounds(605,100,250,30);
		add(t1);

		t2=new TextField();
		t2.setBounds(605,150,250,30);
		add(t2);

		t3=new TextField();
		t3.setBounds(605,200,250,30);
		add(t3);
		t3.setEnabled(false);

		b1=new Button("Generate");
		b1.setBounds(466,300,300,100);
		add(b1);

		t1.setText("");
		t2.setText("");
		t3.setText("");

		Font f1=new Font("Serif",Font.BOLD,25);
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		t3.setFont(f1);
		Font f2=new Font("Serif",Font.BOLD,40);
		b1.setFont(f2);

		setVisible(true);
		setLayout(null);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==b1)
		{
			if(b1.getLabel().equals("Generate"))
			{
				try
				{
					Random random=new Random();
					char[]digits =new char[12];
					for(int i=0;i<=11;i++)
					{
						digits[i]=(char)(random.nextInt(10)+'0');
					}
					String str=new String(digits); 
					t3.setText(str);
					b1.setLabel("Save");
					s=Integer.parseInt(t1.getText());
					rs=st.executeQuery("select * from account where id="+s+"");	
				}

				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null,"Enter Valid Id/"+f,"Error",1);
				}
			}
			else
			{
				if((JOptionPane.showConfirmDialog(null,"Do You Want To Continue","Bank",0))==0)
				{
					try
					{
						s=Integer.parseInt(t1.getText());
						String y="Credit";
						st.execute("insert into extra(id,issuedate,type,cardno)values("+s+",'"+(t2.getText())+"','"+y+"','"+(t3.getText())+"')");
						JOptionPane.showMessageDialog(null,"Record Generated Saved","Account",0);
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,e,"Error",1);
					}
				}
				else
				{
					t1.setText("");
					t2.setText("");
					t3.setText("");
					b1.setLabel("Generate");
				}
			}
		}
	}
	public static void main(String []r)
	{
		Credit A=new Credit();
	}
}