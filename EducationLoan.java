import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class EducationLoan extends Panel implements ActionListener
{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4;
	Checkbox c1,c2,c3;
	CheckboxGroup g1;
	Button b1,b2;
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
	EducationLoan()
	{
		l1=new Label("Education Amt. :");
		l1.setBounds(333,50,220,50);
		add(l1); 

		l2=new Label("Down Payment :");
		l2.setBounds(333,100,220,50);
		add(l2);

		l3=new Label("Length Of Loan :");
		l3.setBounds(333,330,220,50);
		add(l3);

		l4=new Label("Interest Rate :");
		l4.setBounds(333,200,220,50);
		add(l4);

		l5=new Label("Monthly Payment :");
		l5.setBounds(333,400,220,50);
		add(l5);

		g1=new CheckboxGroup();

		c1=new Checkbox("Great Credit (5% Interest)",g1,true);
		c1.setBounds(600,150,300,60);
		add(c1);

		c2=new Checkbox("Average Credit (10% Interest)",g1,false);
		c2.setBounds(600,200,330,60);
		add(c2);

		c3=new Checkbox("Poor Credit (12% Interest)",g1,false);
		c3.setBounds(600,250,330,60);
		add(c3);

		t1=new TextField();
		t1.setBounds(600,50,250,30);
		add(t1);

		t2=new TextField();
		t2.setBounds(600,100,250,30);
		add(t2);

		t3=new TextField();
		t3.setBounds(600,330,250,30);
		add(t3);

		t4=new TextField();
		t4.setBounds(600,400,150,30);
		add(t4);
		t4.setEnabled(false);

		b1=new Button("Submit");
		b1.setBounds(20,400,270,100);
		add(b1);

		b2=new Button("Calculate");
		b2.setBounds(800,400,300,100);
		add(b2);

		t1.setText("");
		t2.setText("");
		t3.setText("");

		Font f1=new Font("Serif",Font.BOLD,25);
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		t3.setFont(f1);
		t4.setFont(f1);
		
		Font f2=new Font("Serif",Font.BOLD,40);
		b1.setFont(f2);
		b2.setFont(f1);

		Font f3=new Font("Serif",Font.BOLD,20);
		c1.setFont(f3);
		c2.setFont(f3);
		c3.setFont(f3);

		setVisible(true);
		setLayout(null);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==b1)
		{
			try
			{
				int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Bank","Enter Account Number",2));
				double a1,a2,a3,a4=0.0,s;
				a1=Double.parseDouble(t1.getText());
				a2=Double.parseDouble(t2.getText());
				a3=Double.parseDouble(t3.getText());
				if(c1.getState())
				{
					a4=5.00;
				}
				if(c2.getState())
				{
					a4=10.00;
				}			
				if(c2.getState())
				{
					a4=12.00;
				}
				s=((a1-a2+(a4*a2/100))/(a3*12));
				String w="EducationLoan";
				st.execute("insert into loan(id,type,interest,downpayment,length,amount,monthlypay)values("+a+",'"+w+"',"+a4+","+a2+","+a3+","+a1+","+s+")");
				JOptionPane.showMessageDialog(null,"Record Saved","Account",0);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e,"Error",1);
			}
		}
		if(ob==b2)
		{
			double a1,a2,a3,a4=0.0,s;
			a1=Double.parseDouble(t1.getText());
			a2=Double.parseDouble(t2.getText());
			a3=Double.parseDouble(t3.getText());
			if(c1.getState())
			{
				a4=5.00;
			}
			if(c2.getState())
			{
				a4=10.00;
			}			
			if(c2.getState())
			{
				a4=12.00;
			}
			s=((a1-a2+(a4*a2/100))/(a3*12));
			t4.setText(""+s);
		}
	}
	public static void main(String []r)
	{
		EducationLoan A=new EducationLoan();
	}
}