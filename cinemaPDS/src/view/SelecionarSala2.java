package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class SelecionarSala2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecionarSala2 frame = new SelecionarSala2();
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
	public SelecionarSala2() {
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneUmaSala = new JLabel("Selecione uma Sala");
		lblSelecioneUmaSala.setForeground(Color.WHITE);
		lblSelecioneUmaSala.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		lblSelecioneUmaSala.setBounds(220, 11, 411, 62);
		contentPane.add(lblSelecioneUmaSala);
		
		JLabel lblSalaB = new JLabel("Sala B1");
		lblSalaB.setForeground(Color.WHITE);
		lblSalaB.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		lblSalaB.setBounds(171, 105, 79, 29);
		contentPane.add(lblSalaB);
		
		JLabel lblSalaB_2 = new JLabel("Sala B2");
		lblSalaB_2.setForeground(Color.WHITE);
		lblSalaB_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		lblSalaB_2.setBounds(565, 105, 79, 29);
		contentPane.add(lblSalaB_2);
		
		JButton BtnSalaB1 = new JButton("");
		BtnSalaB1.setBounds(66, 145, 307, 280);
		contentPane.add(BtnSalaB1);
		
		JButton BtnSalaB2 = new JButton("");
		BtnSalaB2.setBounds(445, 145, 307, 280);
		contentPane.add(BtnSalaB2);
	}

}
