import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Resultado extends JFrame {

	private JPanel contentPane;
	private JTextField textCPF;
	private JTextField textData_Atendimento;
	private JTextField textData_Public;
	private JTextField textID_Exame;
	private JTextField textNome;
	private JTextField textSit_Exame;
	private JTextField textUnidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultado frame = new Resultado();
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
	public Resultado() {
		setTitle("Situa\u00E7\u00E3o Exames ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 488);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloTela = new JLabel("Exames realizados a retirar:");
		lblTituloTela.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTituloTela.setBounds(112, 21, 275, 24);
		contentPane.add(lblTituloTela);
		
		textCPF = new JTextField();
		textCPF.setForeground(new Color(0, 0, 0));
		textCPF.setBackground(Color.WHITE);
		textCPF.setEditable(false);
		textCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		textCPF.setBounds(266, 85, 197, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCPF.setBounds(83, 351, 46, 20);
		contentPane.add(lblCPF);
		
		textData_Atendimento = new JTextField();
		textData_Atendimento.setFont(new Font("Arial", Font.PLAIN, 20));
		textData_Atendimento.setEditable(false);
		textData_Atendimento.setColumns(10);
		textData_Atendimento.setBackground(Color.WHITE);
		textData_Atendimento.setBounds(266, 131, 197, 20);
		contentPane.add(textData_Atendimento);
		
		textData_Public = new JTextField();
		textData_Public.setFont(new Font("Arial", Font.PLAIN, 20));
		textData_Public.setEditable(false);
		textData_Public.setColumns(10);
		textData_Public.setBackground(Color.WHITE);
		textData_Public.setBounds(266, 175, 197, 20);
		contentPane.add(textData_Public);
		
		textID_Exame = new JTextField();
		textID_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		textID_Exame.setEditable(false);
		textID_Exame.setColumns(10);
		textID_Exame.setBackground(Color.WHITE);
		textID_Exame.setBounds(266, 220, 197, 20);
		contentPane.add(textID_Exame);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.PLAIN, 20));
		textNome.setEditable(false);
		textNome.setColumns(10);
		textNome.setBackground(Color.WHITE);
		textNome.setBounds(266, 263, 197, 20);
		contentPane.add(textNome);
		
		textSit_Exame = new JTextField();
		textSit_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		textSit_Exame.setEditable(false);
		textSit_Exame.setColumns(10);
		textSit_Exame.setBackground(Color.WHITE);
		textSit_Exame.setBounds(266, 307, 197, 20);
		contentPane.add(textSit_Exame);
		
		textUnidade = new JTextField();
		textUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		textUnidade.setEditable(false);
		textUnidade.setColumns(10);
		textUnidade.setBackground(Color.WHITE);
		textUnidade.setBounds(266, 351, 197, 20);
		contentPane.add(textUnidade);
		
		JLabel lblData_Atendimento = new JLabel("Data de Atendimento");
		lblData_Atendimento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblData_Atendimento.setBounds(10, 263, 197, 20);
		contentPane.add(lblData_Atendimento);
		
		JLabel lblData_Public = new JLabel("Data da Publica\u00E7\u00E3o");
		lblData_Public.setFont(new Font("Arial", Font.PLAIN, 20));
		lblData_Public.setBounds(30, 131, 177, 20);
		contentPane.add(lblData_Public);
		
		JLabel lblID_Exame = new JLabel("Identifica\u00E7\u00E3o do Exame");
		lblID_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblID_Exame.setBounds(10, 220, 225, 20);
		contentPane.add(lblID_Exame);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(68, 307, 61, 20);
		contentPane.add(lblNome);
		
		JLabel lblSit_Exame = new JLabel("Situa\u00E7\u00E3o atual do Exame");
		lblSit_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSit_Exame.setBounds(10, 85, 225, 20);
		contentPane.add(lblSit_Exame);
		
		JLabel lblUnidade = new JLabel("Unidade");
		lblUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUnidade.setBounds(68, 175, 80, 20);
		contentPane.add(lblUnidade);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.BLACK);
		btnConsultar.setBackground(Color.DARK_GRAY);
		btnConsultar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnConsultar.setBounds(344, 405, 130, 33);
		contentPane.add(btnConsultar);
	}
}
