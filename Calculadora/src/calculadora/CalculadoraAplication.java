package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraAplication {

	private JFrame frame;
	private JTextField textField_Texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraAplication window = new CalculadoraAplication();
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
	public CalculadoraAplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 340, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculadora");
		frame.setLocationRelativeTo(null);
//		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 324, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_Texto = new JTextField();
		textField_Texto.setBounds(0, 0, 324, 85);
		panel.add(textField_Texto);
		textField_Texto.setColumns(10);
		
		JPanel panel_Excluir = new JPanel();
		panel_Excluir.setBounds(0, 85, 324, 42);
		panel.add(panel_Excluir);
		panel_Excluir.setLayout(null);
		
		JButton button_Excluir = new JButton("Excluir");
		button_Excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Excluir.setBounds(161, 0, 163, 42);
		panel_Excluir.add(button_Excluir);
		
		JPanel panel_Teclado = new JPanel();
		panel_Teclado.setBounds(0, 127, 324, 334);
		panel.add(panel_Teclado);
		panel_Teclado.setLayout(new GridLayout(4, 4, 1, 1));
		
		JButton button_7 = new JButton("7");
		
		panel_Teclado.add(button_7);
		JButton button_8 = new JButton("8");
		panel_Teclado.add(button_8);
		
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_Teclado.add(button_9);
		
		JButton button_div = new JButton("/");
		panel_Teclado.add(button_div);
		
		
		JButton button_4 = new JButton("4");
		panel_Teclado.add(button_4);
		JButton button_5 = new JButton("5");
		panel_Teclado.add(button_5);
		
		JButton button_6 = new JButton("6");
		panel_Teclado.add(button_6);
		
		JButton button_mult = new JButton("*");
		panel_Teclado.add(button_mult);
		
		JButton button_1 = new JButton("1");
		panel_Teclado.add(button_1);
		
		JButton button_2 = new JButton("2");
		panel_Teclado.add(button_2);
		
		JButton button_3 = new JButton("3");
		panel_Teclado.add(button_3);
		
		JButton button_subtracao = new JButton("-");
		panel_Teclado.add(button_subtracao);
		
		JButton button = new JButton(".");
		panel_Teclado.add(button);
		
		JButton button_0 = new JButton("0");
		panel_Teclado.add(button_0);
		
		JButton button_igual = new JButton("=");
		panel_Teclado.add(button_igual);
		
		JButton button_soma = new JButton("+");
		panel_Teclado.add(button_soma);
	}
}
