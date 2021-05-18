import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class StatementAcc extends Panel implements ActionListener
{
	Label l1,l3;
	TextField t1,t3;
	Connection con;
	ResultSet rs;
	Statement st;
	Button b1;
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
	StatementAcc()
	{
		l1=new Label("Enter Account ID:");
		l1.setBounds(303,100,300,50);
		add(l1); 

		t1=new TextField();
		t1.setBounds(605,100,250,30);
		add(t1);

		t1.setText("");

		b1=new Button("Collect");
		b1.setBounds(466,200,300,100);
		add(b1);

		Font f1=new Font("Serif",Font.BOLD,25);
		l1.setFont(f1);
		t1.setFont(f1);
		Font f2=new Font("Serif",Font.BOLD,40);
		b1.setFont(f2);

		setVisible(true);
		setLayout(null);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==b1)
		{
			try
			{
				s=Integer.parseInt(t1.getText());
				rs=st.executeQuery("Select * from transactions where id="+s+"");
				String d[][]=new String[20][4];
				int r=0;
				while(rs.next())
				{
					d[r][0]=rs.getString("id");
					d[r][1]=rs.getString("deposit");
					d[r][2]=rs.getString("withdraw");
					d[r][3]=rs.getString("bal");
					r++;
				}
				String h[]={"Account ID","Deposited Amt","Withdrawed Amount","Balance"};
				JTable tb=new JTable(d,h);
				JScrollPane sp=new JScrollPane(tb);
				sp.setBounds(200,350,733,130);
				add(sp);
			}
			catch(Exception f)
			{
				JOptionPane.showMessageDialog(null,e,"Error",1);
			}
			t3.setText(""+r);
		}

	}
	public static void main(String []r)
	{
		StatementAcc A=new StatementAcc();
	}
}