package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelecionarFilme extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecionarFilme frame = new SelecionarFilme();
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
	public SelecionarFilme() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFilme1 = new JButton("");
		btnFilme1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 sl1 = new SelecionarSala1();
				sl1.setLocationRelativeTo(null);
				sl1.setVisible(true);
			}
		});
		btnFilme1.setBackground(Color.WHITE);
		btnFilme1.setIcon(new ImageIcon(SelecionarFilme.class.getResource("/Images/filme1_resized.jpeg")));
		btnFilme1.setBounds(20, 68, 252, 359);
		contentPane.add(btnFilme1);
		
		JButton btnFilme1_1 = new JButton("");
		btnFilme1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala2 sl2 = new SelecionarSala2();
				sl2.setLocationRelativeTo(null);
				sl2.setVisible(true);
			}
		});
		btnFilme1_1.setBackground(Color.WHITE);
		btnFilme1_1.setIcon(new ImageIcon(SelecionarFilme.class.getResource("/Images/filme2_resized.jpeg")));
		btnFilme1_1.setBounds(297, 68, 252, 359);
		contentPane.add(btnFilme1_1);
		
		JButton btnFilme1_1_1 = new JButton("");
		btnFilme1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala3 sl3 = new SelecionarSala3();
				sl3.setLocationRelativeTo(null);
				sl3.setVisible(true);
			}
		});
		btnFilme1_1_1.setBackground(Color.WHITE);
		btnFilme1_1_1.setIcon(new ImageIcon(SelecionarFilme.class.getResource("/Images/filmes_16093_01_resized.png")));
		btnFilme1_1_1.setBounds(571, 68, 252, 359);
		contentPane.add(btnFilme1_1_1);
		
		JLabel lblNewLabel = new JLabel("Selecione um Filme");
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(216, 11, 410, 46);
		contentPane.add(lblNewLabel);
	}
}
