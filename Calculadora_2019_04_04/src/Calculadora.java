import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.*;


public class Calculadora {

	private JFrame frame;
	private JTextField textField_Display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculadora");
		frame.setSize(new Dimension(220, 300));
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField_Display = new JTextField();
		textField_Display.setBounds(0, 0, 204, 40);
		panel.add(textField_Display);
		textField_Display.setColumns(10);
		
		JPanel panel_Excluir = new JPanel();
		panel_Excluir.setBounds(0, 41, 204, 40);
		panel.add(panel_Excluir);
		panel_Excluir.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("E");
		btnNewButton_1.setBounds(102, 0, 51, 40);
		panel_Excluir.add(btnNewButton_1);
		
		JButton btn_Apaga1 = new JButton("\u21e6");

		btn_Apaga1.setBounds(153, 0, 51, 40);
		panel_Excluir.add(btn_Apaga1);
		
		JPanel panel_Teclado = new JPanel();
		panel_Teclado.setBounds(0, 82, 204, 179);
		panel.add(panel_Teclado);
		panel_Teclado.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btn_7 = new JButton("7");
		panel_Teclado.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		panel_Teclado.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		panel_Teclado.add(btn_9);
		
		JButton btn_div = new JButton("/");
		panel_Teclado.add(btn_div);
		
		JButton btn_4 = new JButton("4");
		panel_Teclado.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		panel_Teclado.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		panel_Teclado.add(btn_6);
		
		JButton btn_Mult = new JButton("*");
		panel_Teclado.add(btn_Mult);
		
		JButton btn_1 = new JButton("1");
		panel_Teclado.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		panel_Teclado.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		panel_Teclado.add(btn_3);
		
		JButton btn_Menos = new JButton("-");
		panel_Teclado.add(btn_Menos);
		
		JButton btn_Ponto = new JButton(".");
		panel_Teclado.add(btn_Ponto);
		
		JButton btn_0 = new JButton("0");
		panel_Teclado.add(btn_0);
		
		JButton btn_Igual = new JButton("=");
		panel_Teclado.add(btn_Igual);
		
		JButton btn_Mais = new JButton("+");
		panel_Teclado.add(btn_Mais);
		
	}
}
