import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Agendamento_Exame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agendamento_Exame frame = new Agendamento_Exame();
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
	public Agendamento_Exame() {
		setTitle("Tela Agendamento");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thoma\\Downloads\\Logo_Imagem2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 398);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Agendar");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(318, 313, 126, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblAgendamentoExame = new JLabel("Agendamento");
		lblAgendamentoExame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAgendamentoExame.setBounds(158, 11, 134, 23);
		contentPane.add(lblAgendamentoExame);
		
		textField = new JTextField();
		textField.setBounds(187, 55, 216, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(37, 246, 50, 27);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(219, 96, 140, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 137, 216, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(187, 178, 216, 30);
		contentPane.add(textField_3);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(37, 208, 56, 27);
		contentPane.add(lblNome);
		
		JLabel lblEscolhaUmaData = new JLabel("Escolha uma Data");
		lblEscolhaUmaData.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEscolhaUmaData.setBounds(37, 95, 160, 27);
		contentPane.add(lblEscolhaUmaData);
		
		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPeriodo.setBounds(37, 136, 70, 27);
		contentPane.add(lblPeriodo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(187, 219, 216, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(187, 260, 216, 30);
		contentPane.add(textField_5);
		
		JLabel lblTipoDeExame = new JLabel("Tipo de Exame");
		lblTipoDeExame.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTipoDeExame.setBounds(37, 54, 140, 27);
		contentPane.add(lblTipoDeExame);
		
		JLabel lblUnidade = new JLabel("Unidade");
		lblUnidade.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUnidade.setBounds(37, 177, 80, 27);
		contentPane.add(lblUnidade);
	}

}
