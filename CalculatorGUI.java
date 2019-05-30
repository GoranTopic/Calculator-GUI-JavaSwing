import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;

import javax.script.ScriptException;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.miginfocom.swing.*;

public class CalculatorGUI {

	private JFrame frame;

	//Calculator object
	private Calculator calc = new Calculator();
	private JTextField txtHello;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//GUI
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 166, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[42px][42px][42px]", "[25px][][][][][][][]"));
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "*");
			}
		});
		panel.add(button_10, "cell 0 2");
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "/");
			}
		});
		
		JButton button_14 = new JButton("(");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "(");
			}
		});
		panel.add(button_14, "cell 1 2");
		
		JButton button_15 = new JButton(")");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + ")");
			}
		});
		panel.add(button_15, "cell 2 2");
		panel.add(button_12, "cell 0 3");
		
		JButton button_13 = new JButton("+");
		panel.add(button_13, "cell 1 3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "+");
			}
		});
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "-");
			}
		});
		panel.add(button_11, "cell 2 3");
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "1");
			}
		});
		panel.add(button, "cell 0 4");
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "2");
			}
		});
		panel.add(button_1, "cell 1 4");
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "3");
			}
		});
		panel.add(button_2, "cell 2 4");
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "4");
			}
		});
		panel.add(button_3, "cell 0 5");
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "5");
				
			}
		});
		panel.add(button_4, "cell 1 5");
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "6");
			}
		});
		panel.add(button_5, "cell 2 5");
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "7");
			}
		});
		panel.add(button_6, "cell 0 6");
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "8");
			}
		});
		panel.add(button_7, "cell 1 6");
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "9");
			}
		});
		panel.add(button_8, "cell 2 6");
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = txtHello.getText();
				txtHello.setText(txt + "0");
			}
		});
		panel.add(button_9, "cell 0 7,growy");
		
		JButton btnEnter = new JButton("enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String txt = txtHello.getText();
					Integer awns = calc.calculate(txt);
					txtHello.setText(String.valueOf(awns));
				}catch(ScriptException e){
					System.err.println(e);
					
				}
				
			}
		});
		panel.add(btnEnter, "cell 1 7 2 1");
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.NORTH);
		
		txtHello = new JTextField();
		txtHello.setText("");
		panel_3.add(txtHello);
		System.out.println(txtHello.getText());
		txtHello.setColumns(10);
	}

}
