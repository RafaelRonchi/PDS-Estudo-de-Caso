package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssentosC2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssentosC2 frame = new AssentosC2();
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
	public AssentosC2() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAssentosC = new JLabel("Assentos C2");
		lblAssentosC.setForeground(Color.WHITE);
		lblAssentosC.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 43));
		lblAssentosC.setBounds(303, 11, 248, 49);
		contentPane.add(lblAssentosC);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala3 selctSala = new SelecionarSala3();
				selctSala.setLocationRelativeTo(null);
				selctSala.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 11, 98, 23);
		contentPane.add(btnNewButton);
	}

}
