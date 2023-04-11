package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class SelecionarSala1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecionarSala1 frame = new SelecionarSala1();
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
	public SelecionarSala1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelecionarSala1.class.getResource("/Images/filme1_resized.jpeg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneUmaSala = new JLabel("Selecione uma Sala");
		lblSelecioneUmaSala.setBounds(211, 0, 411, 62);
		lblSelecioneUmaSala.setForeground(Color.WHITE);
		lblSelecioneUmaSala.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		contentPane.add(lblSelecioneUmaSala);
		
		JButton BtnSalaA1 = new JButton("");
		BtnSalaA1.setIcon(new ImageIcon(SelecionarSala1.class.getResource("/Images/Sala_resized.jpeg")));
		BtnSalaA1.setBounds(52, 120, 307, 280);
		contentPane.add(BtnSalaA1);
		
		JLabel lblNewLabel = new JLabel("Sala A1");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		lblNewLabel.setBounds(165, 84, 79, 29);
		contentPane.add(lblNewLabel);
		
		JButton BtnSalaA2 = new JButton("");
		BtnSalaA2.setIcon(new ImageIcon(SelecionarSala1.class.getResource("/Images/Sala_resized.jpeg")));
		BtnSalaA2.setBounds(466, 120, 307, 280);
		contentPane.add(BtnSalaA2);
		
		JLabel lblSalaA = new JLabel("Sala A2");
		lblSalaA.setForeground(Color.WHITE);
		lblSalaA.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		lblSalaA.setBounds(581, 84, 79, 29);
		contentPane.add(lblSalaA);
	}

}
