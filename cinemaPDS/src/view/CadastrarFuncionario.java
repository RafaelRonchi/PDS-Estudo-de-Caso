package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import control.Funcionario;
import control.FuncionarioDAO;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;


public class CadastrarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTable table;
	private FuncionarioDAO funcionarioDAO = FuncionarioDAO.getInstancia();
	private Funcionario funcio = new Funcionario();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
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
		contentPane.setLayout(new MigLayout("", "[100.00px,grow 71][138.00px,grow][][138.00px,grow][16px,grow]", "[grow][53px][grow][41px][22.00px][45px][grow][23px][36.00][130.00px,grow][grow]"));
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Cadastrar Funcionario");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 66));
		contentPane.add(lblNewLabel_2, "cell 1 0 3 3,alignx center,growy");
		
				
				
				JButton btnCadastrar = new JButton("Cadastar");
				btnCadastrar.setBackground(new Color(255, 255, 255));
				btnCadastrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Long cpf = Long.parseLong(txtCpf.getText());
						String nome = txtNome.getText();
						
						
						funcio.setCpf(cpf);
						funcio.setNome(nome);
						
						funcionarioDAO.inserir(funcio);
					}
				});
				contentPane.add(btnCadastrar, "cell 1 7,alignx center,growy");
		
		
		JButton btnListar = new JButton("Listar Cadastros");
		btnListar.setBackground(new Color(255, 255, 255));
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Funcionario> lista = funcionarioDAO.listarFuncionario();				
	
					DefaultTableModel model = (DefaultTableModel) table.getModel();
			        model.setRowCount(0); //limpa as linhas da tabela

			        for (Funcionario funcionario : lista) {
			            Object[] row = {funcionario.getCpf(), funcionario.getNome()};
			            model.addRow(row);
			        }
				
			}
		});
		contentPane.add(btnListar, "cell 3 7,alignx center,growy");

		JPanel panel = new JPanel();
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
		table.setModel(new DefaultTableModel(
		    new Object[][] {
		    },
		    new String[] {
		        "CPF", "Nome"
		    }
		));
		panel.add(table, "cell 0 1 3 1,grow");

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(255, 255, 255));
		btnExcluir.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int selectedRow = table.getSelectedRow(); //pega a linha selecionada na tabela
		        if (selectedRow != -1) { //se alguma linha foi selecionada
		            funcionarioDAO.remover(funcio);
		            ((DefaultTableModel) table.getModel()).removeRow(selectedRow); //remove a linha da tabela
		        }
		    }
		});
		panel.add(btnExcluir);

	}
}
