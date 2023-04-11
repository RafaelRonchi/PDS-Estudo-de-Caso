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
		btnLogin.setBounds(305, 263, 89, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUsuario.getText();
				String senha = txtSenha.getText();
				
				var login = "admin";
				
				System.out.println(user +""+ senha);
				
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
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 29));
		lblNewLabel.setBounds(340, 76, 182, 66);
		contentPane.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(305, 171, 260, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 14));
		lblNewLabel_1.setBounds(224, 172, 71, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(224, 215, 71, 25);
		contentPane.add(lblNewLabel_1_1);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(305, 214, 260, 20);
		contentPane.add(txtSenha);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnLimpar.setBounds(450, 263, 89, 23);
		contentPane.add(btnLimpar);
	}
}
