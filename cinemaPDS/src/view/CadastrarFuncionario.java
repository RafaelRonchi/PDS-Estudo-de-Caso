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
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[16.00px,grow][55.00][][20.00][54.00px][][63.00px][138.00px][][16px,grow]", "[][grow][53px][][41px][2px][45px][][23px][36.00][135px,grow][grow]"));
		
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
		contentPane.add(btnNewButton, "cell 0 0,alignx left,aligny center");
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		contentPane.add(lblNewLabel, "cell 1 4,alignx right,aligny center");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 3 4 5 1,growx,aligny center");
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1, "cell 1 6,alignx right,growy");
		
		txtCpf = new JTextField();
		contentPane.add(txtCpf, "cell 3 6 5 1,growx,aligny center");
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastrar Funcionario");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 35));
		contentPane.add(lblNewLabel_2, "cell 3 2 5 1,alignx center,growy");
		
				
				
				JButton btnCadastrar = new JButton("Cadastar");
				btnCadastrar.setBackground(new Color(255, 255, 255));
				btnCadastrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Long cpf = Long.parseLong(txtCpf.getText());
						String nome = txtNome.getText();
						
						Funcionario funcio = new Funcionario();
						
						funcio.setCpf(cpf);
						funcio.setNome(nome);
						
						funcionarioDAO.inserir(funcio);
					}
				});
				contentPane.add(btnCadastrar, "cell 2 8 2 1,alignx left,aligny top");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "cell 1 10 8 1,grow");
		panel.setLayout(new MigLayout("", "[100px,grow][100px,grow]", "[grow]"));

		table = new JTable();
		table.setModel(new DefaultTableModel(
		    new Object[][] {
		    },
		    new String[] {
		        "CPF", "Nome"
		    }
		));
		panel.add(table, "cell 0 0 2 1,grow");
		
		
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
		contentPane.add(btnListar, "cell 7 8,alignx right,aligny top");
	}
}
