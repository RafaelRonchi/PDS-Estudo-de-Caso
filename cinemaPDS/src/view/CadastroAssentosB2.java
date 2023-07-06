package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import control.ClienteDAO;
import modelo.Usuario;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;

public class CadastroAssentosB2 extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private ClienteDAO usuarioDAO = ClienteDAO.getInstancia();
	public static int assento;
	public static int assento1;
	private JTable table;
	public Integer salaN = 4;
	private Double valorIngresso = 20.00;
	private JFormattedTextField campo1;
	/**
	 * Launch the application.
	 */

	public CadastroAssentosB2(int row, int col) {
		this.assento = row;
		this.assento1 = col;
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrameMain.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("",
				"[119.00px,grow 71][138.00px,grow][170px][151.00][200.00][54.00px,grow][119.00px,grow 71]",
				"[grow][53px][grow][41px][9.00px][45px][][][][16.00][55.00px][29.00,grow][grow]"));

		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AssentosB2 jMain = new AssentosB2();
				jMain.setVisible(true);
				jMain.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();

			}
		});
		contentPane.add(btnNewButton, "cell 0 0,alignx left,aligny top");

		JLabel lblNewLabel_2 = new JLabel("Assento");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 66));
		contentPane.add(lblNewLabel_2, "cell 1 0 5 2,alignx center,aligny top");

		JPanel panel = new JPanel();
		panel.setVisible(true);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		contentPane.add(lblNewLabel, "cell 1 3,alignx center,aligny center");

		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 2 3 3 1,growx,aligny center");
		txtNome.setColumns(10);
		;

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
		
		contentPane.add(txtCpf, "cell 2 5 3 1,growx,aligny center");
		txtCpf.setColumns(10);

		JRadioButton pagaMeia = new JRadioButton("Paga meia?");
		pagaMeia.setFont(new Font("Tahoma", Font.BOLD, 15));
		pagaMeia.setBackground(new Color(0, 0, 64));
		pagaMeia.setForeground(Color.WHITE);
		contentPane.add(pagaMeia, "cell 1 6 5 1,alignx center");
		JButton btnCadastrar = new JButton("Cadastar");
		btnCadastrar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ClienteDAO usuarioDAO = ClienteDAO.getInstancia();
				Usuario usua = new Usuario();
				String cpf = txtCpf.getText();
				cpf = cpf.replace(".", "");
				cpf = cpf.replace("-", "");
				cpf = cpf.trim();
				Long cpf1=null;
				cpf1 = Long.parseLong(cpf);

				String nome = txtNome.getText();

				if (nome.isEmpty() || cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
				} else {
					usua.setCpf(cpf1);
					usua.setNome(nome);

					if (pagaMeia.isSelected()) {
						usua.setMeiaEntrada(true);
						usua.setPrecoIngresso(valorIngresso / 2);
					} else {
						usua.setMeiaEntrada(false);
						usua.setPrecoIngresso(valorIngresso);
					}
					boolean a = usuarioDAO.inserir(usua, assento, assento1, salaN);
					if (a) {
						AssentosB2.assentosOcupados[assento][assento1] = true;
						JOptionPane.showMessageDialog(null, "CPF cadastrado, valor: R$" + usua.getPrecoIngresso());
					} else {

						JOptionPane.showMessageDialog(null, "Assento indisponível!");
					}
				}

				txtCpf.setText(null);
				txtNome.setText(null);
			}
		});
		contentPane.add(btnCadastrar, "cell 1 7 5 1,alignx center,growy");

		JButton btnListar = new JButton("Listar Cadastros");
		contentPane.add(btnListar, "cell 1 9 5 1,grow");
		btnListar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		btnListar.setBackground(Color.WHITE);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0); // limpa as linhas da tabela

				System.out.println(assento);
				System.out.println(assento1);

				var retorno = ClienteDAO.listarUsuarios(assento, assento1, salaN);
				StringBuilder cpfFormatado = new StringBuilder();
				String numeros = String.valueOf(retorno.getCpf());
				cpfFormatado.append(numeros.substring(0, 3));
				cpfFormatado.append(".");
				cpfFormatado.append(numeros.substring(3, 6));
				cpfFormatado.append(".");
				cpfFormatado.append(numeros.substring(6, 9));
				cpfFormatado.append("-");
				cpfFormatado.append(numeros.substring(9, 11));

				cpfFormatado.toString();
				Object[] row = { cpfFormatado, retorno.getNome(),retorno.getPrecoIngresso() };
				model.addRow(row);
			}
			
		});

		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "cell 1 10 5 1,grow");
		panel.setLayout(new MigLayout("", "[100px,grow][][100px,grow][][100px,grow]", "[20px][grow]"));

		JLabel cpfLabel = new JLabel("CPF");
		panel.add(cpfLabel, "cell 0 0,width 50,alignx center,aligny center");

		JSeparator separator1 = new JSeparator(SwingConstants.VERTICAL);
		panel.add(separator1, "cell 1 0,width 4,alignx center,growy");

		JLabel nomeLabel = new JLabel("Nome");
		panel.add(nomeLabel, "cell 2 0,width 50,alignx center,aligny center");

		JSeparator separator2 = new JSeparator(SwingConstants.VERTICAL);
		panel.add(separator2, "cell 3 0,width 4,alignx center,growy");

		JLabel precoLabel = new JLabel("Preço");
		panel.add(precoLabel, "cell 4 0,width 50,alignx center,aligny center");

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "CPF", "Nome", "Preço" }));
		panel.add(table, "cell 0 1 5 1,grow");

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setVisible(true);
		btnAlterar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		contentPane.add(btnAlterar, "flowx,cell 1 12 2 1,alignx center");
		btnAlterar.setBackground(Color.WHITE);

		JButton btnExcluir = new JButton("Excluir");

		btnExcluir.setVisible(true);



		btnExcluir.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		contentPane.add(btnExcluir, "cell 4 12 2 1,alignx center");
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usua = new Usuario();
				// Criação dos componentes do painel
				MaskFormatter cpfFormatter = null;
				try {
					cpfFormatter = new MaskFormatter("###.###.###-##");
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JPanel painel = new JPanel(new GridLayout(0, 2)); // Criação do painel personalizado
				painel.add(new JLabel("CPF:"));
				campo1 = new JFormattedTextField(cpfFormatter);// Criação do painel personalizado
				painel.add(campo1);
				painel.add(new JLabel("Nome:"));
				JTextField campo2 = new JTextField();
				painel.add(campo2);

				int opcao = JOptionPane.showOptionDialog(null, painel, "Digite o CPF e NOME para EXCLUSÃO!",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

				if (opcao == JOptionPane.OK_OPTION) {
					Long cpf1 = null;
					String cpf = campo1.getText();
					cpf = cpf.replace(".", "");
					cpf = cpf.replace("-", "");
					cpf = cpf.trim();
					cpf1 = Long.parseLong(cpf);
					String nome = campo2.getText();

					if (nome.isEmpty() || cpf.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
					} else {
						usua.setCpf(cpf1);
						usua.setNome(nome);
						boolean a = usuarioDAO.remover(usua, assento, assento1, salaN);
						if (a) {
							JOptionPane.showMessageDialog(null, "Excluido com sucesso");
							AssentosB2.assentosOcupados[assento][assento1] = false;
						} else {
							JOptionPane.showMessageDialog(null, "Erro, CPF ou/e Nome não encontrado!");
						}
					}
				}

			}
		});
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usua = new Usuario();
				JRadioButton radioMeia = new JRadioButton("Meia-entrada");
				MaskFormatter cpfFormatter = null;
				try {
					cpfFormatter = new MaskFormatter("###.###.###-##");
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JTextField campo2 = new JTextField();
				campo1 = new JFormattedTextField(cpfFormatter);// Criação do painel personalizado

				JPanel painel = new JPanel(new GridLayout(0, 2));
				painel.add(new JLabel("CPF:"));
				painel.add(campo1);
				painel.add(new JLabel("Nome:"));
				painel.add(campo2);
				painel.add(radioMeia); // Add the radio button to the panel
				int opcao = JOptionPane.showOptionDialog(null, painel,
						"Digite o CPF e informe o nome e preço para alterar", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, null, null);

				if (opcao == JOptionPane.OK_OPTION) {
					Long cpf1 = null;
					String cpf = campo1.getText();
					cpf = cpf.replace(".", "");
					cpf = cpf.replace("-", "");
					cpf = cpf.trim();
					cpf1 = Long.parseLong(cpf);
					String nome = campo2.getText();
					
					if (nome.isEmpty() || cpf.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nome ou CPF nulos!");
					} else {
						usua.setCpf(cpf1);
						usua.setNome(nome);
						boolean isMeia = radioMeia.isSelected();
						if (isMeia) {
							usua.setPrecoIngresso(valorIngresso / 2);
						} else {
							usua.setPrecoIngresso(valorIngresso);
						}

						boolean a = usuarioDAO.alterar(usua, assento, assento1, salaN);
						if (a) {
							JOptionPane.showMessageDialog(null, "Nome e/ou preço alterado!");
						} else {
							JOptionPane.showMessageDialog(null, "Erro, CPF não encontrado!");

						}
					}
				}

			}
		});

	}

}
