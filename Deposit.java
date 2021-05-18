import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Deposit extends Panel implements ActionListener
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
	Deposit()
	{
		l1=new Label("Enter Account ID:");
		l1.setBounds(303,100,300,50);
		add(l1); 

		l2=new Label("Enter Deposit Amount :");
		l2.setBounds(303,150,300,50);
		add(l2);

		l3=new Label("Remaining Amount :");
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

		b1=new Button("Calculate");
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
			if(b1.getLabel().equals("Calculate"))
			{
				try
				{
					s=Integer.parseInt(t1.getText());
					rs=st.executeQuery("select * from account where id="+s+"");
					if(rs.next())
					{
						r=Integer.parseInt(rs.getString("bal"));
						t=Integer.parseInt(t2.getText());
						t=r+t;
						t3.setText(""+t);
						b1.setLabel("Deposit");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Record Not Found","Withdraw",1);
					}
				}

				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null,f,"Error",1);
				}
			}
			else
			{
				if((JOptionPane.showConfirmDialog(null,"Do You Want To Continue","Bank",0))==0)
				{
					try
					{
						s=Integer.parseInt(t1.getText());
						rs=st.executeQuery("select * from account where id="+s+"");
						if(rs.next())
						{
							int y=0;
							st.executeUpdate("Update account set bal="+Integer.parseInt(t3.getText())+" where id="+s+"");
							st.execute("insert into transactions(id,deposit,withdraw,bal)values("+s+","+Integer.parseInt(t2.getText())+","+y+","+t+")");
							JOptionPane.showMessageDialog(null,"Amount Deposited","Account",0);
							JOptionPane.showMessageDialog(null,"Record Saved","Account",0);
						}
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
					b1.setLabel("Calculate");
				}
			}
		}
	}
	public static void main(String []r)
	{
		Deposit A=new Deposit();
	}
}