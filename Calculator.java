import java.awt.*;
import java.awt.event.*;
class Calculator{
	Frame f;
	Label l1;
	Font f1,f2;
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	float r,s;
	String t;

	Calculator(){
		f=new Frame("CALCULATOR");
		f.setResizable(false);
		f.setLayout(null);
		f.setBounds(300,10,600,600);
		f.setVisible(true);

		l1=new Label("CALCULATOR");
		l1.setBounds(0,0,100,50);
		f.add(l1);

		t1=new TextField();
		t1.setBounds(0,50,600,100);
		f.add(t1);

		b1=new Button("1");
		b1.setBounds(100,350,100,100);
		f.add(b1);

		b2=new Button("2");
		b2.setBounds(200,350,100,100);
		f.add(b2);

		b3=new Button("3");
		b3.setBounds(300,350,100,100);
		f.add(b3);

		b4=new Button("4");
		b4.setBounds(100,450,100,100);
		f.add(b4);

		b5=new Button("5");
		b5.setBounds(200,450,100,100);
		f.add(b5);

		b6=new Button("6");
		b6.setBounds(300,450,100,100);
		f.add(b6);

		b7=new Button("7");
		b7.setBounds(100,550,100,100);
		f.add(b7);

		b8=new Button("8");
		b8.setBounds(200,550,100,100);
		f.add(b8);

		b9=new Button("9");
		b9.setBounds(300,550,100,100);
		f.add(b1);

		b10=new Button("0");
		b10.setBounds(200,650,100,100);
		f.add(b10);

		b11=new Button("=");
		b11.setBounds(300,650,100,100);
		f.add(b11);

		b12=new Button("+");
		b12.setBounds();
		f.add(b12);

		b13=new Button("-");
		b13.setBounds();
		f.add(b13);

		b14=new Button("/");
		b14.setBounds();
		f.add(b14);

		b15=new Button("*");
		b15.setBounds();
		f.add(b15);

		b16=new Button("c");
		b16.setBounds();
		f.add(b16);

		b17=new Button("%");
		b17.setBounds();
		f.add(b17);
	}
	public void actionPerformed(Object obj){
		Object ob=obj.getSource();
		if(ob==b1){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+1;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b2){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+2;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b3){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+3;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b4){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+4;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b5){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+5;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b6){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+6;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b7){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+7;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b8){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+8;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b9){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10+9;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b10){
			try{
				r=Float.parseFloat(t1.getText());
				r=r*10;
				t1.setText(""+r);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b11){
			try{
				if(t=="+"){
					s=Float.parseFloat(t1.getText());
					s=s+r;
					t1.setText(""+s);
				}
				if(t=="-"){
					s=Float.parseFloat(t1.getText());
					s=s-r;
					t1.setText(""+s);
				}
				if(t=="/"){
					s=Float.parseFloat(t1.getText());
					s=s/r;
					t1.setText(""+s);
				}
				if(t=="*"){
					s=Float.parseFloat(t1.getText());
					s=s*r;
					t1.setText(""+s);
				}
				if(t=="%"){
					s=Float.parseFloat(t1.getText());
					s=s*r/100;
					t1.setText(""+s);
				}
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b12){
			try{
				r=Float.parseFloat(t1.getText());
				t="+";
				t1.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b13){
			try{
				r=Float.parseFloat(t1.getText());
				t="-";
				t1.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b14){
			try{
				r=Float.parseFloat(t1.getText());
				t="/";
				t1.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b15){
			try{
				r=Float.parseFloat(t1.getText());
				t="*";
				t1.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b16){
			try{
				t1.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
		if(ob==b17){
			try{
				r=Float.parseFloat(t1.getText());
				t="%";
				t1.setText("");
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"e",Error,1);
			}
		}
	}
	public static void main(String[] args) {
		Calculator A=new Calculator();
	}
}
