import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.awt.Checkbox.*;
class Delete extends Panel implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	TextArea ta1;
	Button b1,b2;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
	CheckboxGroup g1,g2,g3,g4,g5;
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
			JOptionPane.showMessageDialog(null,e,"Error",0);
		}
	}
	Delete()
	{
		
		l1=new Label("Branch : Sri Ganganagar");
		l1.setBounds(13,33,266,40);
		add(l1);

		l2=new Label("Please Open an Account of your choice as given below :");
		l2.setBounds(13,73,533,40);
		add(l2);

		g1=new CheckboxGroup();

		c1=new Checkbox("Saving Bank Account",g1,true);
		c1.setBounds(546,73,200,40);
		add(c1);

		c2=new Checkbox("Current Account",g1,false);
		c2.setBounds(746,73,166,40);
		add(c2);

		l3=new Label("Customer Type :");
		l3.setBounds(13,126,146,40);
		add(l3);

		g2=new CheckboxGroup();

		c3=new Checkbox("Public",g2,true);
		c3.setBounds(200,126,100,40);
		add(c3);

		c4=new Checkbox("Staff",g2,false);
		c4.setBounds(350,126,160,40);
		add(c4);

		l4=new Label("(A)Personal Details :");
		l4.setBounds(240,180,200,40);
		add(l4);

		l5=new Label("Full Name");
		l5.setBounds(13,220,200,40);
		add(l5);

		t1=new TextField();
		t1.setBounds(266,220,200,26);
		add(t1);

		l6=new Label("Name of Father/Husband");
		l6.setBounds(13,260,226,40);
		add(l6);

		t2=new TextField();
		t2.setBounds(266,260,200,26);
		add(t2);

		l7=new Label("Date of Birth");
		l7.setBounds(13,300,200,40);
		add(l7);

		t3=new TextField();
		t3.setBounds(266,300,200,26);
		add(t3);

		l8=new Label("Sex");
		l8.setBounds(13,340,200,40);
		add(l8);

		g3=new CheckboxGroup();

		c5=new Checkbox("Male",g3,true);
		c5.setBounds(266,340,106,40);
		add(c5);

		c6=new Checkbox("Female",g3,false);
		c6.setBounds(373,340,106,40);
		add(c6);

		l9=new Label("Marital Status");
		l9.setBounds(13,380,200,40);
		add(l9);

		g4=new CheckboxGroup();

		c7=new Checkbox("Married",g4,true);
		c7.setBounds(266,380,100,40);
		add(c7);

		c8=new Checkbox("Unmarried",g4,false);
		c8.setBounds(373,380,100,40);
		add(c8);

		l10=new Label("Mode of Operation");
		l10.setBounds(13,420,200,40);
		add(l10);

		g5=new CheckboxGroup();

		c9=new Checkbox("Self Only",g5,true);
		c9.setBounds(266,420,100,40);
		add(c9);

		c10=new Checkbox("Either or Supervisor",g5,false);
		c10.setBounds(373,420,146,40);
		add(c10);

		l11=new Label("Service Required");
		l11.setBounds(13,460,200,40);
		add(l11);

		c11=new Checkbox("SMS Alert");
		c11.setBounds(266,460,100,30);
		add(c11);

		c12=new Checkbox("Internet Banking");
		c12.setBounds(373,460,146,30);
		add(c12);

		c13=new Checkbox("ATM/Debit Card");
		c13.setBounds(340,480,146,40);
		add(c13);

		l12=new Label("(B)Residendial Area :");
		l12.setBounds(733,180,200,40);
		add(l12);

		ta1=new TextArea();
		ta1.setBounds(666,220,333,113);
		add(ta1);

		l13=new Label("City");
		l13.setBounds(573,373,85,40);
		add(l13);

		t4=new TextField();
		t4.setBounds(666,373,130,26);
		add(t4);

		l14=new Label("State");
		l14.setBounds(573,413,85,40);
		add(l14);

		t5=new TextField();
		t5.setBounds(666,413,130,26);
		add(t5);

		l15=new Label("Mob No.");
		l15.setBounds(573,453,85,40);
		add(l15);

		t6=new TextField();
		t6.setBounds(666,453,130,26);
		add(t6);

		l16=new Label("Email");
		l16.setBounds(810,373,105,40);
		add(l16);

		t7=new TextField();
		t7.setBounds(916,373,170,26);
		add(t7);

		l17=new Label("Nationality");
		l17.setBounds(810,413,105,40);
		add(l17);

		t8=new TextField();
		t8.setBounds(916,413,170,26);
		add(t8);

		l18=new Label("Balance");
		l18.setBounds(810,453,105,40);
		add(l18);

		t9=new TextField();
		t9.setBounds(916,453,170,26);
		add(t9);

		b1=new Button("Find");
		b1.setBounds(933,50,133,66);
		add(b1);

		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t8.setText("");
		t9.setText("");
		ta1.setText("");
		t1.setEnabled(false);
		t2.setEnabled(false);
		t3.setEnabled(false);
		t4.setEnabled(false);
		t5.setEnabled(false);
		t6.setEnabled(false);
		t7.setEnabled(false);
		t8.setEnabled(false);
		t9.setEnabled(false);
		ta1.setEnabled(false);


		Font f1=new Font("Serif",Font.BOLD,20);
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		l13.setFont(f1);
		l14.setFont(f1);
		l15.setFont(f1);
		l16.setFont(f1);
		l17.setFont(f1);
		l18.setFont(f1);
		b1.setFont(f1);

		Font f2=new Font("Serif",Font.BOLD,16);
		c1.setFont(f2);
		c2.setFont(f2);
		c3.setFont(f2);
		c4.setFont(f2);
		c5.setFont(f2);
		c6.setFont(f2);
		c7.setFont(f2);
		c8.setFont(f2);
		c9.setFont(f2);
		c10.setFont(f2);
		c11.setFont(f2);
		c12.setFont(f2);
		c13.setFont(f2);
		t1.setFont(f2);
		t2.setFont(f2);
		t3.setFont(f2);
		t4.setFont(f2);
		t5.setFont(f2);
		t6.setFont(f2);
		t7.setFont(f2);
		t8.setFont(f2);
		t9.setFont(f2);
		ta1.setFont(f2);

		setVisible(true);
		setLayout(null);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==b1)
		{
			int s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter ID","Account",0));
			if(b1.getLabel().equals("Find"))
			{
				try
				{
					rs=st.executeQuery("select * from account where id="+s+"");
					if(rs.next())
					{
						t1.setText(rs.getString("fullname"));
						t2.setText(rs.getString("fathername"));
						t3.setText(rs.getString("dob"));
						t4.setText(rs.getString("city"));
						t5.setText(rs.getString("state"));
						t6.setText(rs.getString("mobno"));
						t7.setText(rs.getString("emailid"));
						t8.setText(rs.getString("nationality"));
						t9.setText(rs.getString("bal"));
						t1.requestFocus();
						if((rs.getString("acctype"))==(c1.getLabel()))
						{
							c1.setState(true);
						}
						else
						{
							c1.setState(false);
							c2.setState(true);
						}
						if((rs.getString("custype"))==(c3.getLabel()))
						{
							c3.setState(true);
						}
						else
						{
							c3.setState(false);
							c4.setState(true);
						}
						if((rs.getString("gender"))==(c5.getLabel()))
						{
							c5.setState(true);
						}
						else
						{
							c5.setState(false);
							c6.setState(true);
						}
						if((rs.getString("maritalstatus"))==(c7.getLabel()))
						{
							c7.setState(true);
						}
						else
						{
							c7.setState(false);
							c8.setState(true);
						}
						if((rs.getString("mo"))==(c9.getLabel()))
						{
							c9.setState(true);
						}
						else
						{
							c9.setState(false);
							c10.setState(true);
						}
						if((rs.getString("sms"))==(c11.getLabel()))
						{
							c11.setState(true);
						}
						if((rs.getString("internetbanking"))==(c12.getLabel()))
						{
							c12.setState(true);
						}
						if((rs.getString("atm"))==(c13.getLabel()))
						{
							c13.setState(true);
						}
						b1.setLabel("Delete");
						JOptionPane.showMessageDialog(null,"Record Found :\nClick on Delete Button","Account",0);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Not Found","Account",0);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Account",0);
				}
			}
			else
			{
				try
				{
					rs=st.executeQuery("select * from account where id="+s+"");
					if(rs.next())
					{
					int yy=JOptionPane.showConfirmDialog(null,"Do You Want To Delete","Account",0);
					if(yy==0)
					{
						try
						{
							st.executeUpdate("delete from account where id="+s+"");
							JOptionPane.showMessageDialog(null,"Deleted","Account",0);
						}
						catch(Exception e)
						{
							JOptionPane.showMessageDialog(null,e,"Account",0);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Stay Connected","Account",0);
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Record Not Found","Account",0);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Account",0);
				}
			}
		}
	}
	public static void main(String []r)
	{
		Delete A=new Delete();
	}
}