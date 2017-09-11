package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField produtoNome;
	private JLabel label;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalvar = new JButton("Logar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Nome: "+produtoNome.getText());
				
			}
		});
		btnSalvar.setBounds(156, 172, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblDigiteONome = new JLabel("Login");
		lblDigiteONome.setBounds(185, 69, 31, 23);
		contentPane.add(lblDigiteONome);
		
		produtoNome = new JTextField();
		produtoNome.setBounds(117, 90, 173, 20);
		contentPane.add(produtoNome);
		produtoNome.setColumns(10);
		
		label = new JLabel("Senha");
		label.setBounds(185, 121, 31, 23);
		contentPane.add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(117, 144, 173, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(View.class.getResource("/view/teste.png")));
		lblNewLabel.setBounds(170, 11, 64, 50);
		contentPane.add(lblNewLabel);
	}
}
