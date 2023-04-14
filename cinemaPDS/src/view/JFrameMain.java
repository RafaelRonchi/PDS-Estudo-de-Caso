package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Funcionario;
import control.FuncionarioDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private FuncionarioDAO funcionarioDAO = FuncionarioDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
		contentPane.setLayout(new MigLayout("", "[115px,grow][84.00px][97.00px][][134px][105px][78.00][67.00][115px,grow]", "[66px,grow][68.00px][87.00px][55.00][][35.00][18.00][36.00][66px,grow]"));
		
		JLabel lblNewLabel = new JLabel("Abrir sistema");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 51));
		contentPane.add(lblNewLabel, "cell 2 1 5 1,alignx center,growy");
				
				JLabel lblNewLabel_1 = new JLabel("Nome:");
				lblNewLabel_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
				contentPane.add(lblNewLabel_1, "cell 2 2,alignx center,growy");
				
				txtUsuario = new JTextField();
				contentPane.add(txtUsuario, "cell 4 2 2 1,growx,aligny center");
				txtUsuario.setColumns(10);
				
				JLabel lblNewLabel_1_1 = new JLabel("Cpf:");
				lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_1_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 23));
				contentPane.add(lblNewLabel_1_1, "cell 2 3,alignx center,aligny center");
				
				txtSenha = new JTextField();
				txtSenha.setColumns(10);
				contentPane.add(txtSenha, "cell 4 3 2 1,growx,aligny center");
				
				
						JButton btnLogin = new JButton("Login");
						btnLogin.setBackground(Color.WHITE);
						btnLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
						btnLogin.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								ArrayList<Funcionario> lista = funcionarioDAO.listarFuncionario();
								String user = txtUsuario.getText();
								Long cpf = Long.parseLong(txtSenha.getText());
								boolean entrou = false;
								
								
								for (Funcionario funcionario : lista) {
									if((funcionario.getNome()).equals(user) && (funcionario.getCpf()).equals(cpf)) {
										dispose(); // fecha tela atual
										SelecionarFilme sf = new SelecionarFilme();
										sf.setVisible(true);
										sf.setExtendedState(JFrame.MAXIMIZED_BOTH);
										 entrou = true;
									}else {
									entrou = false;
									}
								}
								
								if(entrou != true) {
									JOptionPane.showMessageDialog(null,"Nome ou CPF incorretos ou não cadastrado!");
									txtUsuario.setText(null);
									txtSenha.setText(null);
								}
				
								

							}
						});
						contentPane.add(btnLogin, "cell 4 5 2 1,growx,aligny top");
				
				JButton btnLimpar = new JButton("Cadastrar novo usuário");
				btnLimpar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose(); // fecha tela atual
						CadastrarFuncionario cadas = new CadastrarFuncionario();
						cadas.setVisible(true);
						cadas.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
						
					}
				});
				btnLimpar.setBackground(Color.WHITE);
				btnLimpar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
				contentPane.add(btnLimpar, "cell 4 7 2 1,growx,aligny top");
	}
}
