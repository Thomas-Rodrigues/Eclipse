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
		setTitle("Resultados");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 441);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSit_Exame_Realizado = new JLabel("Situa\u00E7\u00E3o do Exame Realizado");
		lblSit_Exame_Realizado.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSit_Exame_Realizado.setBounds(106, 11, 275, 24);
		contentPane.add(lblSit_Exame_Realizado);
		
		textCPF = new JTextField();
		textCPF.setBackground(Color.WHITE);
		textCPF.setEditable(false);
		textCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		textCPF.setBounds(245, 85, 164, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCPF.setBounds(10, 85, 46, 20);
		contentPane.add(lblCPF);
		
		textData_Atendimento = new JTextField();
		textData_Atendimento.setFont(new Font("Arial", Font.PLAIN, 20));
		textData_Atendimento.setEditable(false);
		textData_Atendimento.setColumns(10);
		textData_Atendimento.setBackground(Color.WHITE);
		textData_Atendimento.setBounds(245, 131, 164, 20);
		contentPane.add(textData_Atendimento);
		
		textData_Public = new JTextField();
		textData_Public.setFont(new Font("Arial", Font.PLAIN, 20));
		textData_Public.setEditable(false);
		textData_Public.setColumns(10);
		textData_Public.setBackground(Color.WHITE);
		textData_Public.setBounds(245, 175, 164, 20);
		contentPane.add(textData_Public);
		
		textID_Exame = new JTextField();
		textID_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		textID_Exame.setEditable(false);
		textID_Exame.setColumns(10);
		textID_Exame.setBackground(Color.WHITE);
		textID_Exame.setBounds(245, 220, 164, 20);
		contentPane.add(textID_Exame);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.PLAIN, 20));
		textNome.setEditable(false);
		textNome.setColumns(10);
		textNome.setBackground(Color.WHITE);
		textNome.setBounds(245, 263, 164, 20);
		contentPane.add(textNome);
		
		textSit_Exame = new JTextField();
		textSit_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		textSit_Exame.setEditable(false);
		textSit_Exame.setColumns(10);
		textSit_Exame.setBackground(Color.WHITE);
		textSit_Exame.setBounds(245, 307, 164, 20);
		contentPane.add(textSit_Exame);
		
		textUnidade = new JTextField();
		textUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		textUnidade.setEditable(false);
		textUnidade.setColumns(10);
		textUnidade.setBackground(Color.WHITE);
		textUnidade.setBounds(245, 351, 164, 20);
		contentPane.add(textUnidade);
		
		JLabel lblData_Atendimento = new JLabel("Data de Atendimento");
		lblData_Atendimento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblData_Atendimento.setBounds(10, 131, 197, 20);
		contentPane.add(lblData_Atendimento);
		
		JLabel lblData_Public = new JLabel("Data da Publica\u00E7\u00E3o");
		lblData_Public.setFont(new Font("Arial", Font.PLAIN, 20));
		lblData_Public.setBounds(10, 175, 177, 20);
		contentPane.add(lblData_Public);
		
		JLabel lblID_Exame = new JLabel("Identifica\u00E7\u00E3o do Exame");
		lblID_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblID_Exame.setBounds(10, 220, 225, 20);
		contentPane.add(lblID_Exame);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 263, 61, 20);
		contentPane.add(lblNome);
		
		JLabel lblSit_Exame = new JLabel("Situa\u00E7\u00E3o atual do Exame");
		lblSit_Exame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSit_Exame.setBounds(10, 307, 225, 20);
		contentPane.add(lblSit_Exame);
		
		JLabel lblUnidade = new JLabel("Unidade");
		lblUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUnidade.setBounds(10, 351, 80, 20);
		contentPane.add(lblUnidade);
	}

}
