import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Paciente_Cadastro extends JFrame {
	
	/**
	 * create cadastro
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ftextCPF;
	private JTextField ftextNome;
	private JTextField textDataNasc;
	private JTextField ftextSexo;
	private JTextField ftextEmail;
	private JTextField ftextContato;
	private JTextField ftextSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paciente_Cadastro frame = new Paciente_Cadastro();
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
	public Paciente_Cadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setBackground(Color.BLACK);
		setTitle("Casdastro Paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroPaciente = new JLabel("Cadastro");
		lblCadastroPaciente.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCadastroPaciente.setBounds(152, 11, 92, 30);
		contentPane.add(lblCadastroPaciente);
		
		ftextCPF = new JTextField();
		ftextCPF.setBounds(200, 52, 202, 30);
		contentPane.add(ftextCPF);
		ftextCPF.setColumns(10);
		
		ftextNome = new JTextField();
		ftextNome.setColumns(10);
		ftextNome.setBounds(200, 97, 202, 30);
		contentPane.add(ftextNome);
		
		textDataNasc = new JTextField();
		textDataNasc.setColumns(10);
		textDataNasc.setBounds(200, 140, 202, 30);
		contentPane.add(textDataNasc);
		
		ftextSexo = new JTextField();
		ftextSexo.setColumns(10);
		ftextSexo.setBounds(200, 181, 202, 30);
		contentPane.add(ftextSexo);
		
		ftextEmail = new JTextField();
		ftextEmail.setColumns(10);
		ftextEmail.setBounds(200, 222, 202, 30);
		contentPane.add(ftextEmail);
		
		ftextContato = new JTextField();
		ftextContato.setColumns(10);
		ftextContato.setBounds(200, 263, 202, 30);
		contentPane.add(ftextContato);
		
		ftextSenha = new JTextField();
		ftextSenha.setColumns(10);
		ftextSenha.setBounds(200, 304, 202, 30);
		contentPane.add(ftextSenha);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCPF.setBounds(97, 52, 45, 30);
		contentPane.add(lblCPF);
		
		JLabel lblNomr = new JLabel("Nome");
		lblNomr.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNomr.setBounds(97, 97, 58, 30);
		contentPane.add(lblNomr);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDataDeNascimento.setBounds(10, 137, 180, 30);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSexo.setBounds(97, 181, 45, 30);
		contentPane.add(lblSexo);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setFont(new Font("Arial", Font.PLAIN, 20));
		lblContato.setBounds(97, 263, 75, 30);
		contentPane.add(lblContato);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEmail.setBounds(97, 222, 65, 30);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(97, 304, 58, 30);
		contentPane.add(lblSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.DARK_GRAY);
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnCadastrar.setBounds(275, 360, 127, 30);
		contentPane.add(btnCadastrar);
		
		
	}
}
