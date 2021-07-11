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
	private JTextField ftxtSeusExames;
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
		setTitle("Exame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ftxtSeusExames = new JTextField();
		ftxtSeusExames.setBackground(Color.WHITE);
		ftxtSeusExames.setEditable(false);
		ftxtSeusExames.setText("Seu Exame");
		ftxtSeusExames.setFont(new Font("Arial", Font.PLAIN, 20));
		ftxtSeusExames.setBounds(180, 11, 105, 35);
		contentPane.add(ftxtSeusExames);
		ftxtSeusExames.setColumns(10);
		
		ftextDescExame = new JTextField();
		ftextDescExame.setBackground(Color.WHITE);
		ftextDescExame.setFont(new Font("Arial", Font.PLAIN, 12));
		ftextDescExame.setEditable(false);
		ftextDescExame.setBounds(10, 190, 474, 190);
		contentPane.add(ftextDescExame);
		ftextDescExame.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCPF.setBounds(10, 57, 44, 20);
		contentPane.add(lblCPF);
		
		ftextCPF = new JTextField();
		ftextCPF.setBackground(Color.WHITE);
		ftextCPF.setEditable(false);
		ftextCPF.setBounds(96, 60, 149, 20);
		contentPane.add(ftextCPF);
		ftextCPF.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 88, 51, 20);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBackground(Color.WHITE);
		textNome.setEditable(false);
		textNome.setColumns(10);
		textNome.setBounds(96, 88, 149, 20);
		contentPane.add(textNome);
		
		textUnidade = new JTextField();
		textUnidade.setBackground(Color.WHITE);
		textUnidade.setEditable(false);
		textUnidade.setColumns(10);
		textUnidade.setBounds(96, 119, 149, 20);
		contentPane.add(textUnidade);
		
		JLabel lblUnidade = new JLabel("Unidade");
		lblUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUnidade.setBounds(10, 116, 76, 20);
		contentPane.add(lblUnidade);
		
		JLabel lblDataDoExame = new JLabel("Data do Exame");
		lblDataDoExame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDataDoExame.setBounds(255, 57, 136, 20);
		contentPane.add(lblDataDoExame);
		
		textData = new JTextField();
		textData.setBackground(Color.WHITE);
		textData.setEditable(false);
		textData.setColumns(10);
		textData.setBounds(255, 88, 149, 20);
		contentPane.add(textData);
		
		lblDescrioDoExame = new JLabel("Descri\u00E7\u00E3o do Exame");
		lblDescrioDoExame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDescrioDoExame.setBounds(135, 159, 188, 20);
		contentPane.add(lblDescrioDoExame);
	}
}
