import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;

public class Exames extends JFrame {

	private JPanel contentPane;
	private JTextField ftextDescExame;
	private JTextField ftextCPF;
	private JTextField textNome;
	private JTextField textUnidade;
	private JTextField textData;
	private JLabel lblDescrioDoExame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exames frame = new Exames();
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
	public Exames() {
		setTitle("Hist\u00F3rico Exames");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ftextDescExame = new JTextField();
		ftextDescExame.setBackground(Color.WHITE);
		ftextDescExame.setFont(new Font("Arial", Font.PLAIN, 12));
		ftextDescExame.setEditable(false);
		ftextDescExame.setBounds(10, 136, 464, 190);
		contentPane.add(ftextDescExame);
		ftextDescExame.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCPF.setBounds(271, 366, 44, 20);
		contentPane.add(lblCPF);
		
		ftextCPF = new JTextField();
		ftextCPF.setBackground(Color.WHITE);
		ftextCPF.setEditable(false);
		ftextCPF.setBounds(325, 366, 149, 20);
		contentPane.add(ftextCPF);
		ftextCPF.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 366, 51, 20);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBackground(Color.WHITE);
		textNome.setEditable(false);
		textNome.setColumns(10);
		textNome.setBounds(90, 337, 149, 20);
		contentPane.add(textNome);
		
		textUnidade = new JTextField();
		textUnidade.setBackground(Color.WHITE);
		textUnidade.setEditable(false);
		textUnidade.setColumns(10);
		textUnidade.setBounds(90, 369, 149, 20);
		contentPane.add(textUnidade);
		
		JLabel lblUnidade = new JLabel("Unidade");
		lblUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUnidade.setBounds(10, 337, 76, 20);
		contentPane.add(lblUnidade);
		
		JLabel lblDataDoExame = new JLabel("Data do Exame");
		lblDataDoExame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDataDoExame.setBounds(10, 63, 136, 23);
		contentPane.add(lblDataDoExame);
		
		textData = new JTextField();
		textData.setBackground(Color.WHITE);
		textData.setEditable(false);
		textData.setColumns(10);
		textData.setBounds(156, 66, 149, 20);
		contentPane.add(textData);
		
		lblDescrioDoExame = new JLabel("Descri\u00E7\u00E3o do Exame");
		lblDescrioDoExame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDescrioDoExame.setBounds(10, 97, 188, 28);
		contentPane.add(lblDescrioDoExame);
		
		JLabel lblTituloTela = new JLabel("Hist\u00F3rico de Exames");
		lblTituloTela.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTituloTela.setBounds(135, 11, 196, 20);
		contentPane.add(lblTituloTela);
	}
}
