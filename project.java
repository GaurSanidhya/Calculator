package cal.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class project extends JFrame {
	static double num1;
	int op;
	static double num2;
	private JPanel contentPane;
	private JTextField disp;
	private JButton seven;
	private JButton four;
	private JButton eight;
	private JButton five;
	private JButton six;
	private JButton three;
	private JButton two;
	private JButton nine;
	private JButton dzero;
	private JButton zero;
	private JButton dot;
	private JButton add;
	private JButton sub;
	private JButton div;
	private JButton mul;
	private JButton equal;
	private JButton prcnt;
	private JTextField disp1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project frame = new project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		disp1 = new JTextField();
		disp1.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {
				
			}
		});
		disp1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f, "Use Only Button");
			}
		});
		disp1.setBackground(SystemColor.text);
		disp1.setBounds(12, 13, 573, 42);
		contentPane.add(disp1);
		disp1.setColumns(10);
		
		

		
		disp = new JTextField();
		disp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
	}
		});
		disp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		disp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		disp.setBounds(12, 40, 573, 87);
		contentPane.add(disp);
		disp.setColumns(10);
		
			
		
		JButton one = new JButton("1");
		one.setFont(new Font("Arial", Font.PLAIN, 20));
		one.setBackground(Color.WHITE);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String old_text=disp.getText();
				disp.setText(old_text+"1");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"1");
			}
		});
		one.setBounds(12, 343, 110, 54);
		contentPane.add(one);
		
		seven = new JButton("7");
		seven.setFont(new Font("Arial", Font.PLAIN, 20));
		seven.setToolTipText("");
		
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"7");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"7");
			}
		});
		seven.setBackground(Color.WHITE);
		seven.setBounds(12, 209, 110, 54);
		contentPane.add(seven);
		
		four = new JButton("4");
		four.setFont(new Font("Arial", Font.PLAIN, 20));
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"4");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"4");
			}
		});
		four.setBackground(Color.WHITE);
		four.setBounds(12, 276, 110, 54);
		contentPane.add(four);
		
		eight = new JButton("8");
		eight.setFont(new Font("Arial", Font.PLAIN, 20));
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String old_text=disp.getText();
				disp.setText(old_text+"8");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"8");
				
			}
		});
		eight.setBackground(Color.WHITE);
		eight.setBounds(158, 209, 100, 54);
		contentPane.add(eight);
		
		five = new JButton("5");
		five.setFont(new Font("Arial", Font.PLAIN, 20));
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"5");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"5");
			}
		});
		
		five.setBackground(Color.WHITE);
		five.setBounds(158, 276, 100, 54);
		contentPane.add(five);
		
		six = new JButton("6");
		six.setFont(new Font("Arial", Font.PLAIN, 20));
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"6");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"6");
			}
		});
		six.setBackground(Color.WHITE);
		six.setBounds(286, 276, 110, 54);
		contentPane.add(six);
		
		three = new JButton("3");
		three.setFont(new Font("Arial", Font.PLAIN, 20));
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"3");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"3");
			}
		});
		three.setBackground(Color.WHITE);
		three.setBounds(286, 343, 110, 54);
		contentPane.add(three);
		
		two = new JButton("2");
		two.setFont(new Font("Arial", Font.PLAIN, 20));
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String old_text=disp.getText();
				disp.setText(old_text+"2");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"2");
			}
		});
		two.setBackground(Color.WHITE);
		two.setBounds(158, 343, 100, 54);
		contentPane.add(two);
		
		nine = new JButton("9");
		nine.setFont(new Font("Arial", Font.PLAIN, 20));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"9");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"9");
			}
		});
		nine.setBackground(Color.WHITE);
		nine.setBounds(286, 209, 110, 54);
		contentPane.add(nine);
		
		dzero = new JButton("00");
		dzero.setFont(new Font("Arial", Font.PLAIN, 20));
		dzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"00");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"00");
			}
		});
		dzero.setBackground(Color.WHITE);
		dzero.setBounds(12, 417, 110, 54);
		contentPane.add(dzero);
		
		zero = new JButton("0");
		zero.setFont(new Font("Arial", Font.PLAIN, 20));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+"0");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+"0");
			}
		});
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		zero.setBackground(Color.WHITE);
		zero.setBounds(158, 417, 100, 54);
		contentPane.add(zero);
		
		dot = new JButton(".");
		dot.setFont(new Font("Arial", Font.PLAIN, 20));
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old_text=disp.getText();
				disp.setText(old_text+".");
				String old_text1=disp1.getText();
				disp1.setText(old_text1+".");
			}
		});
		dot.setBackground(Color.WHITE);
		dot.setBounds(286, 417, 110, 54);
		contentPane.add(dot);
		
		add = new JButton("+");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(disp.getText());

				String old_text=disp.getText();
				disp1.setText(old_text+"+");
				
				op=1;
				disp.setText("");
				
			
			}
		});
		add.setBackground(Color.WHITE);
		add.setBounds(432, 343, 72, 128);
		contentPane.add(add);
		
		sub = new JButton("-");
		sub.setFont(new Font("Arial", Font.PLAIN, 20));
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(disp.getText());
				
				String old_text=disp.getText();
				disp1.setText(old_text+"-");
				
				
				op=2;
				disp.setText("");
			}
		});
		sub.setBackground(Color.WHITE);
		sub.setBounds(432, 276, 72, 54);
		contentPane.add(sub);
		
		div = new JButton("/");
		div.setFont(new Font("Arial", Font.PLAIN, 20));
	
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(disp.getText());
				
				String old_text=disp.getText();
				disp1.setText(old_text+"/");
				
				
				op=4;
				disp.setText("");
						
			}
		});
		div.setBackground(Color.WHITE);
		div.setBounds(516, 276, 72, 54);
		contentPane.add(div);
		
		mul = new JButton("*");
		mul.setFont(new Font("Arial", Font.PLAIN, 20));
		
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(disp.getText());
				
				String old_text=disp.getText();
				disp1.setText(old_text+"*");
				
				
				op=3;
				
				disp.setText("");
			}
		});
		mul.setBackground(Color.WHITE);
		mul.setBounds(516, 343, 72, 54);
		contentPane.add(mul);
		
		equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(disp.getText());
				
				
				String old_text1=disp1.getText();
				
				
				double res=0;
				
				switch(op)
				{
				case 1:
					res=num1+num2;
					disp.setText(""+res);

					
					disp1.setText(old_text1+"="+res);
					break;
				
				case 2:
					res=num1-num2;
					disp.setText(""+res);

					
					disp1.setText(old_text1+"="+res);
					break;
					
				case 3:
					res=num1*num2;
					disp.setText(""+res);
					disp1.setText(old_text1+"="+res);
					break;
				
				case 4:
					res=num1/num2;
					disp.setText(""+res);
					disp1.setText(old_text1+"="+res);
					break;
				
				}
				
				
			}
		});
		equal.setFont(new Font("Arial", Font.PLAIN, 20));
	
			
		equal.setBackground(Color.WHITE);
		equal.setBounds(516, 417, 72, 54);
		contentPane.add(equal);
		
		JButton clear = new JButton("AC");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=0;
				num2=0;
				disp.setText("");
				disp1.setText("");
			}
		});
		clear.setFont(new Font("Arial", Font.PLAIN, 20));
		
		clear.setBackground(Color.WHITE);
		clear.setBounds(432, 209, 72, 51);
		contentPane.add(clear);
		
		prcnt = new JButton("%");
		prcnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.parseInt(disp.getText());
				double r=0;
				double t1=0;
				String old_text1=disp1.getText();
				
				switch(op)
				{
				case 1:
					 t1=(num1*num2)/100;
					r=num1+t1;
					
					disp.setText(""+r);
					
					disp1.setText(old_text1+"% ="+r);
					break;
				
				case 2:
					 t1=(num1*num2)/100;
					r=num1-t1;
					
					disp.setText(""+r);
					disp1.setText(old_text1+"% ="+r);
					
					break;
				
				case 3:
					 t1=(num1*num2)/100;
					r=num1*t1;
					
					disp.setText(""+r);
					disp1.setText(old_text1+"% ="+r);
					
					break;
				
				case 4:
					 t1=(num1*num2)/100;
					r=num1/t1;
					
					disp.setText(""+r);
					disp1.setText(old_text1+"% ="+r);
					
					break;
				 
				}
			}
		});
		prcnt.setFont(new Font("Arial", Font.PLAIN, 20));
		prcnt.setBackground(Color.WHITE);
		prcnt.setBounds(516, 209, 72, 54);
		contentPane.add(prcnt);
	}
}
