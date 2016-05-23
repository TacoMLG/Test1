import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		field = new JTextField();
		field.setEditable(false);
		field.setBounds(10, 25, 278, 65);
		contentPane.add(field);
		field.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gettext=field.getText();
						field.setText(gettext+"1");
			}
		});
		btnNewButton.setBounds(20, 101, 55, 39);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"2");
			}
		});
		button.setBounds(85, 101, 55, 39);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"3");
			}
		});
		button_1.setBounds(150, 101, 55, 39);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"4");
			}
		});
		button_2.setBounds(20, 150, 55, 39);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"5");
			}
		});
		button_3.setBounds(85, 150, 55, 39);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"6");
			}
		});
		button_4.setBounds(150, 150, 55, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"7");
			}
		});
		button_5.setBounds(20, 200, 55, 39);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"8");
			}
		});
		button_6.setBounds(85, 200, 55, 39);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"9");
			}
		});
		button_7.setBounds(150, 200, 55, 39);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"0");
			}
		});
		button_8.setBounds(20, 246, 55, 39);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"+");
			}
		});
		button_9.setBounds(218, 101, 55, 39);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"-");
			}
		});
		button_10.setBounds(218, 150, 55, 39);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"*");
			}
		});
		button_11.setBounds(218, 200, 55, 39);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+"/");
			}
		});
		button_12.setBounds(218, 246, 55, 39);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScriptEngineManager c=new ScriptEngineManager();
				ScriptEngine r=c.getEngineByName("JavaScript");
				String result=field.getText();
				try {
					field.setText(r.eval(result).toString());
				} catch (ScriptException e1) {
					field.setText("ERROR");
				}
			}
		});
		button_13.setBounds(150, 246, 55, 39);
		contentPane.add(button_13);
		
		JButton btnC = new JButton("Clear");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				field.setText("");
			}
		});
		btnC.setBounds(20, 296, 120, 39);
		contentPane.add(btnC);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=field.getText();
				field.setText(gettext+".");
			}
		});
		button_14.setBounds(85, 246, 55, 39);
		contentPane.add(button_14);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(150, 296, 123, 39);
		contentPane.add(btnExit);
	}
}
