package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setLocationRelativeTo(null);
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
	public JFrameMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrameMain.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setBackground(Color.WHITE);
		setTitle("Sistema de Cinema");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnLogin.setBounds(232, 274, 113, 33);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUsuario.getText();
				String senha = txtSenha.getText();
				
				var login = "admin";
				
				
				if((user.equals(login)) && (senha.equals(login))) {
					dispose(); // fecha tela atual
					SelecionarFilme sf = new SelecionarFilme();
					sf.setLocationRelativeTo(null);
					sf.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos!");
					txtUsuario.setText(null);
					txtSenha.setText(null);
				} 

			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Abrir sistema");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		lblNewLabel.setBounds(278, 43, 287, 66);
		contentPane.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(320, 154, 260, 25);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
		lblNewLabel_1.setBounds(190, 149, 113, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(200, 198, 105, 55);
		contentPane.add(lblNewLabel_1_1);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(320, 211, 260, 25);
		contentPane.add(txtSenha);
		
		JButton btnLimpar = new JButton("Cadastrar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose(); // fecha tela atual
				CadastrarFuncionario cadas = new CadastrarFuncionario();
				cadas.setLocationRelativeTo(null);
				cadas.setVisible(true);
			
				
			}
		});
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnLimpar.setBounds(479, 274, 105, 33);
		contentPane.add(btnLimpar);
	}
}
