package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(374, 215, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarFilme sf = new SelecionarFilme();
				sf.setLocationRelativeTo(null);
				sf.setVisible(true);

			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Abrir sistema:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 29));
		lblNewLabel.setBounds(330, 79, 244, 66);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(305, 171, 260, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 14));
		lblNewLabel_1.setBounds(223, 172, 71, 25);
		contentPane.add(lblNewLabel_1);
	}
}
