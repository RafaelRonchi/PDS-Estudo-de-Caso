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
import net.miginfocom.swing.MigLayout;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[115px,grow][15px][105px][][105px][][115px,grow]", "[66px,grow][38px][55px][33px][][66px,grow]"));
		
		JLabel lblNewLabel = new JLabel("Abrir sistema");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		contentPane.add(lblNewLabel, "cell 3 0,alignx right,growy");
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
		contentPane.add(lblNewLabel_1, "cell 2 1,growx,aligny top");
		
		txtUsuario = new JTextField();
		contentPane.add(txtUsuario, "cell 3 1,growx,aligny center");
		txtUsuario.setColumns(10);
				
				JLabel lblNewLabel_1_1 = new JLabel("Senha:");
				lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
				contentPane.add(lblNewLabel_1_1, "cell 2 2,grow");
				
				txtSenha = new JTextField();
				txtSenha.setColumns(10);
				contentPane.add(txtSenha, "cell 3 2,growx,aligny center");
		
				JButton btnLogin = new JButton("Login");
				btnLogin.setBackground(Color.WHITE);
				btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
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
				contentPane.add(btnLogin, "cell 3 3,alignx center,aligny center");
		
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
		contentPane.add(btnLimpar, "cell 3 4,alignx center,aligny top");
	}
}
