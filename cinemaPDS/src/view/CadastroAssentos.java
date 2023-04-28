package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import control.Funcionario;
import control.FuncionarioDAO;
import control.Usuario;
import control.UsuarioDAO;
import net.miginfocom.swing.MigLayout;

public class CadastroAssentos extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAssentos frame = new CadastroAssentos();
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
	public CadastroAssentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[100.00px,grow 71][138.00px,grow][][138.00px,grow][16px,grow]", "[grow][53px][grow][41px][22.00px][45px][grow][36.00px][36.00][33.00px,grow][][grow]"));

		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				JFrameMain jMain = new JFrameMain();
				jMain.setVisible(true);
				jMain.setExtendedState(JFrame.MAXIMIZED_BOTH);

			}
		});
		contentPane.add(btnNewButton, "cell 0 0,alignx left,aligny top");

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		contentPane.add(lblNewLabel, "cell 1 3,alignx center,aligny center");

		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 3 3,growx,aligny center");
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Cpf:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		contentPane.add(lblNewLabel_1, "cell 1 5,alignx center,growy");

		txtCpf = new JTextField();
		contentPane.add(txtCpf, "cell 3 5,growx,aligny center");
		txtCpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Assento");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 66));
		contentPane.add(lblNewLabel_2, "cell 1 0 3 3,alignx center,growy");

		JButton btnCadastrar = new JButton("Cadastar");
		btnCadastrar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario usua = new Usuario();
				Long cpf = Long.parseLong(txtCpf.getText());
				String nome = txtNome.getText();
				
				if (nome.isEmpty() || cpf == null ) {
					JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
				} else {
					usua.setCpf(cpf);
					usua.setNome(nome);
					boolean a = usuarioDAO.inserir(usua);
					if (a) {
						JOptionPane.showMessageDialog(null, "CPF cadastrado");
					} else {
						JOptionPane.showMessageDialog(null, "CPF já existente");
					}
				}
				usua.setCpf(cpf);
				usua.setNome(nome);

				UsuarioDAO.inserir(usua);
				txtCpf.setText(null);
				txtNome.setText(null);
			}
		});
		contentPane.add(btnCadastrar, "cell 1 7,growx,aligny center");
		
				JButton btnExcluir = new JButton("Excluir");
				
				btnExcluir.setVisible(false);
				
				btnExcluir.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
				contentPane.add(btnExcluir, "cell 3 7,growx,aligny center");
				btnExcluir.setBackground(Color.WHITE);
				btnExcluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
		
				JButton btnAlterar = new JButton("Alterar");
				btnAlterar.setVisible(false); 
				btnAlterar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
				contentPane.add(btnAlterar, "cell 1 9 3 1,growx,aligny center");
				btnAlterar.setBackground(Color.WHITE);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Usuario usua = new Usuario();

				// Long cpf = Long.parseLong(txtCpf.getText());

				// Criação dos componentes do painel
				JTextField campo1 = new JTextField();
				JTextField campo2 = new JTextField();

				JPanel painel = new JPanel(new GridLayout(0, 2)); // Criação do painel personalizado
				painel.add(new JLabel("CPF:"));
				painel.add(campo1);
				painel.add(new JLabel("Novo nome:"));
				painel.add(campo2);

				int opcao = JOptionPane.showOptionDialog(null, painel, "Digite o CPF e um novo NOME",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

				if (opcao == JOptionPane.OK_OPTION) {
					String cpf = campo1.getText(); // Obtenção do valor do campo1
					String nome = campo2.getText(); // Obtenção do valor do campo2

					if (nome.isEmpty() || cpf.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
					} else {
						usua.setCpf(Long.parseLong(cpf));
						usua.setNome(nome);
						boolean a = usuarioDAO.alterar(usua);
						if (a) {
							JOptionPane.showMessageDialog(null, "Nome alterado!");
						} else {
							JOptionPane.showMessageDialog(null, "Erro, CPF não encontrado!");
						}
					}
				}
			}
		});
	}

}
