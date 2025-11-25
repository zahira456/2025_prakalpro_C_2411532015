package pekan9_2411532015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Kalkulator_2411532015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2411532015 frame = new Kalkulator_2411532015();
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
	public Kalkulator_2411532015() {
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 286, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
		{
			StringBuilder str = new StringBuilder(textField.getText());
			str.deleteCharAt(textField.getText().length()-1);
			backSpace = str.toString();
			textField.setText(backSpace);
		}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnB.setBounds(10, 71, 69, 49);
		contentPane.add(btnB);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 121, 69, 49);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 172, 69, 49);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 223, 69, 49);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 275, 69, 49);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(83, 71, 69, 49);
		contentPane.add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(83, 121, 69, 49);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(83, 172, 69, 49);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(83, 223, 69, 49);
		contentPane.add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(83, 275, 69, 49);
		contentPane.add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(155, 71, 69, 49);
		contentPane.add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(155, 121, 69, 49);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(155, 172, 69, 49);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(155, 223, 69, 49);
		contentPane.add(btn3);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+"){
					result = first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-"){
					result = first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*"){
					result = first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/"){
					result = first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%"){
					result = first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);	
				}
				
				
				
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEq.setBounds(155, 275, 69, 49);
		contentPane.add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
			
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(227, 71, 69, 49);
		contentPane.add(btnPlus);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMin.setBounds(227, 121, 69, 49);
		contentPane.add(btnMin);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(227, 172, 69, 49);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(227, 223, 69, 49);
		contentPane.add(btnDiv);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
			
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod.setBounds(227, 275, 69, 49);
		contentPane.add(btnMod);

	}
}
