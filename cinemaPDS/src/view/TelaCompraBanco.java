package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class TelaCompraBanco extends JFrame {
	
	public static Float valorIngresso= (float) 30;
	public static boolean statusBotao=false;
		
		
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompraBanco frame = new TelaCompraBanco();
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
	public TelaCompraBanco() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[46px][][][grow]", "[14px][][][][][][]"));

		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				AssentosA1 Assentos = new AssentosA1();
				Assentos.setExtendedState(JFrame.MAXIMIZED_BOTH);
				Assentos.setVisible(true);
		

			}
		});
		contentPane.add(btnNewButton_2, "cell 0 0");

		JLabel lblNewLabel = new JLabel("Nome:");
		contentPane.add(lblNewLabel, "cell 2 0,alignx trailing,aligny top");

		textField = new JTextField();
		contentPane.add(textField, "cell 3 0,growx");
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		contentPane.add(lblNewLabel_1, "cell 2 1,alignx trailing");
		// get text
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 1,growx");
		textField_1.setColumns(10);

		JLabel lblPagaMeia = new JLabel("Paga meia?");
		contentPane.add(lblPagaMeia, "cell 2 4");
		
		JButton btnNewButton = new JButton("sim");
		btnNewButton.addActionListener(new ActionListener() {
		 
			
			public void actionPerformed(ActionEvent e ) {
			  
		valorIngresso =2/valorIngresso;
			
			
			}
		});
		contentPane.add(btnNewButton, "flowx,cell 3 4");

		JButton btnNewButton_1 = new JButton("não");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// valor ingresso padrao

			}
		});
		contentPane.add(btnNewButton_1, "cell 3 4");

		JButton btnNewButton_3 = new JButton("Concluir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                      
				String	textoNome = textField.getText();
				String	textoCPF= textField.getText();
				Integer  banco = AssentosA1.nBanco;
				
				
				//fazer validação
				
			
				
                       
                 
				// retornar um método com um valor referenciando o banco
				// dispose
			}
		});
		
		contentPane.add(btnNewButton_3, "cell 3 6");
	}
	
	

}
