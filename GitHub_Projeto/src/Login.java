import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textCPF;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 262);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo_CPF = new JLabel("Login");
		lblTitulo_CPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTitulo_CPF.setBounds(106, 11, 65, 24);
		contentPane.add(lblTitulo_CPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(90, 64, 148, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(90, 118, 148, 20);
		contentPane.add(textSenha);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCPF.setBounds(21, 61, 46, 20);
		contentPane.add(lblCPF);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(21, 115, 55, 20);
		contentPane.add(lblSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(201, 168, 89, 23);
		contentPane.add(btnLogin);
	}
}
