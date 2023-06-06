package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import control.FuncionarioDAO;
import modelo.Funcionario;
import net.miginfocom.swing.MigLayout;

public class CadastrarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTable table;
	private FuncionarioDAO funcionarioDAO = FuncionarioDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// LAF Windows não encontrado, usar o LAF padrão do sistema
				}
				try {
					CadastrarFuncionario frame = new CadastrarFuncionario();
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
	public CadastrarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[100.00px,grow 71][138.00px,grow][][138.00px,grow][16px,grow]",
				"[grow][53px][grow][41px][22.00px][45px][grow][23px][36.00][130.00px,grow][][grow]"));

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
		MaskFormatter cpfFormatter = null;
		try {
			cpfFormatter = new MaskFormatter("###.###.###-##");

			// cpfFormatter.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCpf = new JFormattedTextField(cpfFormatter);

		contentPane.add(txtCpf, "cell 3 5,growx,aligny center");
		txtCpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Cadastrar Funcionario");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 66));
		contentPane.add(lblNewLabel_2, "cell 1 0 3 3,alignx center,growy");

		JButton btnCadastrar = new JButton("Cadastar");
		btnCadastrar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Funcionario funcio = new Funcionario();
				String cpf = txtCpf.getText();
				String nome = txtNome.getText();
				long cpf1 = 0;
				if (nome.isEmpty() || cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
				} else {
					cpf = cpf.replace(".", "");
					cpf = cpf.replace("-", "");
					cpf = cpf.trim();
					cpf1 = Long.parseLong(cpf);

					funcio.setCpf(cpf1);
					funcio.setNome(nome);
					boolean a = funcionarioDAO.inserir(funcio);
					if (a) {
						JOptionPane.showMessageDialog(null, "CPF cadastrado");
					} else {
						JOptionPane.showMessageDialog(null, "CPF já existente");
					}
				}

				funcio.setCpf(cpf1);
				funcio.setNome(nome);

				funcionarioDAO.inserir(funcio);
				txtCpf.setText(null);
				txtNome.setText(null);
			}
		});
		contentPane.add(btnCadastrar, "cell 1 7,grow");

		JPanel panel = new JPanel();
		panel.setVisible(false);

		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "cell 1 9 3 1,grow");
		panel.setLayout(new MigLayout("", "[100px,grow][][100px,grow]", "[20px][grow]"));

		JLabel cpfLabel = new JLabel("CPF");
		panel.add(cpfLabel, "cell 0 0, width 50, alignx center, aligny center");

		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		panel.add(separator, "cell 1 0,width 4,alignx center,growy");

		JLabel nomeLabel = new JLabel("Nome");
		panel.add(nomeLabel, "cell 2 0,width 50,alignx center,aligny center");

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "CPF", "Nome" }));
		panel.add(table, "cell 0 1 3 1,grow");

		JButton btnExcluir = new JButton("Excluir");

		btnExcluir.setVisible(false);

		btnExcluir.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		contentPane.add(btnExcluir, "cell 1 11,growx,aligny center");
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario funcio = new Funcionario();

				// Criação dos componentes do painel
				JTextField campo1 = new JTextField();
				JTextField campo2 = new JTextField();

				JPanel painel = new JPanel(new GridLayout(0, 2)); // Criação do painel personalizado
				painel.add(new JLabel("CPF:"));
				painel.add(campo1);
				painel.add(new JLabel("Nome:"));
				painel.add(campo2);

				int opcao = JOptionPane.showOptionDialog(null, painel, "Digite o CPF e NOME para EXCLUSÃO!",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

				if (opcao == JOptionPane.OK_OPTION) {
					String cpf = campo1.getText(); // Obtenção do valor do campo1
					String nome = campo2.getText(); // Obtenção do valor do campo2

					if (nome.isEmpty() || cpf.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
					} else {
						funcio.setCpf(Long.parseLong(cpf));
						funcio.setNome(nome);
						boolean a = funcionarioDAO.remover(funcio);
						if (a) {
							JOptionPane.showMessageDialog(null, "Excluido com sucesso");

						} else {
							JOptionPane.showMessageDialog(null, "Erro, CPF ou/e Nome não encontrado!");
						}

					}
				}
			}
		});

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setVisible(false);
		btnAlterar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		contentPane.add(btnAlterar, "cell 3 11,growx,aligny center");
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Funcionario usua = new Funcionario();

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
						boolean a = funcionarioDAO.alterar(usua);
						if (a) {
							JOptionPane.showMessageDialog(null, "Nome alterado!");
						} else {
							JOptionPane.showMessageDialog(null, "Erro, CPF não encontrado!");
						}
					}
				}
			}
		});
		JButton btnListar = new JButton("Listar Cadastros");
		contentPane.add(btnListar, "cell 3 7,grow");
		btnListar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		btnListar.setBackground(Color.WHITE);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Funcionario> lista = funcionarioDAO.listarFuncionario();

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0); // limpa as linhas da tabela

				for (Funcionario funcionario : lista) {
					Object[] row = { funcionario.getCpf(), funcionario.getNome() };
					model.addRow(row);
				}

				panel.setVisible(true);
				btnExcluir.setVisible(true);
				btnAlterar.setVisible(true);
				System.out.println(txtCpf);

			}
		});
	}
}
