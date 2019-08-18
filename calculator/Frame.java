import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Frame extends JFrame implements WindowListener{

		JTextField text=new JTextField();
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		JButton b0=new JButton("0");
		JButton sum=new JButton("+");
		JButton min=new JButton("-");
		JButton equal=new JButton("=");
		JButton pow=new JButton("X");
		JButton div=new JButton("/");
		JButton dot=new JButton(".");
		JButton c=new JButton("C");
		Double x;
		Double y;
		Double z;
		boolean b=false;
		char ch;


		Frame(String s){
			super(s);
			addWindowListener(this);
            setLayout(null);
			setSize(310,280);
			text.setBounds(10,10,285,30);
           
           
			
	
			add(text);				
			c.setBounds(10,60,285,30);
			b7.setBounds(10,100,60,30);
			b8.setBounds(85,100,60,30);
			b9.setBounds(160,100,60,30);
			div.setBounds(235,100,60,30);
			b4.setBounds(10,135,60,30);
			b5.setBounds(85,135,60,30);
			b6.setBounds(160,135,60,30);
			pow.setBounds(235,135,60,30);
			b1.setBounds(10,170,60,30);
			b2.setBounds(85,170,60,30);
			b3.setBounds(160,170,60,30);
			min.setBounds(235,170,60,30);
			dot.setBounds(10,205,60,30);
			b0.setBounds(85,205,60,30);
			equal.setBounds(160,205,60,30);
			sum.setBounds(235,205,60,30);

			text.setEditable(false);

			add(c);
			add(b7);
			add(b8);
			add(b9);
			add(div);
			add(b4);
			add(b5);
			add(b6);
			add(pow);
			add(b1);
			add(b2);
			add(b3);
			add(min);
			add(dot);
			add(b0);
			add(equal);
			add(sum);
			
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
						String p=text.getText();
						text.setText(p+b1.getText());
					}catch(Exception e){}
				}
			});
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
						String p=text.getText();
						text.setText(p+b2.getText());
					}catch(Exception e){}
				}
			});
			b3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
						String p=text.getText();
						text.setText(p+b3.getText());
					}catch(Exception e){}	
				}
			});
			b4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
					String p=text.getText();
					text.setText(p+b4.getText());
					}catch(Exception e){}
				}
			});
			b5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
					String p=text.getText();
					text.setText(p+b5.getText());
					}catch(Exception e){}
				}
			});
			b6.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
						String p=text.getText();
					text.setText(p+b6.getText());
					}catch(Exception e){}
				}
			});
			b7.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					
					try{
					String p=text.getText();
					text.setText(p+b7.getText());
					}catch(Exception e){}
				}
			});
			b8.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
						String p=text.getText();
					text.setText(p+b8.getText());
					}catch(Exception e){}

				}
			});
			b9.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
					try{
					String p=text.getText();
					text.setText(c + b9.getText());
					}catch(Exception e){}
				}
			});
			b0.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
						try{
							String p=text.getText();
						if(p=="0")
							text.setText("0");
						else
							text.setText(p+"0");
						}catch(Exception e){}
					 	
				}
			});
			c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
						
						
					 	text.setText("");
				}
			});
			
			
			dot.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
						try{
							if(b==false){
						String p=text.getText();
						text.setText(p + ".");
						b=true;
						}
						}catch(Exception e){}
				}
			});

			
			div.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
						b=false;
						x=new Double(text.getText());
						text.setText("");
						ch='/';
					 }
			});
			pow.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
						b=false;
						x=new Double(text.getText());
						text.setText("");
						ch='*';
					 }
			});
			sum.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ev){
						b=false;
						x=new Double(text.getText());
						text.setText("");
						ch='+';
					 }
			});
			min.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
						b=false;
						x=new Double(text.getText());
						text.setText("");
						ch='-';
					 }
			});
			equal.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
						b=false;
						y=new Double(text.getText());
						
						switch(ch){
							case ('+'):
							z=x+y;
							break;
							case ('-'):
							z=x-y;
							break;
							case ('/'):
							z=x/y;
							break;
							case ('*'):
							z=x*y;
							break;
						}
						text.setText(Double.toString(z));
					 }

				
			});
			
			setVisible(true);

		}

		 public void actionPerformed(ActionEvent e) {
                
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

		public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

	public static void main(String[] args){
		new Frame("Eazy Calculator");
	}
}