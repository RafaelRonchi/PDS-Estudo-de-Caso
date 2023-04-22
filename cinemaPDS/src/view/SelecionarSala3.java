package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class SelecionarSala3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecionarSala3 frame = new SelecionarSala3();
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
	public SelecionarSala3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelecionarSala3.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 615);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][278px,grow][grow 50][278px,grow][grow]", "[20.00px,grow][31.00][24.00][35.00px][150px,grow][51.00,grow]"));
		
		JButton BtnSalaC1 = new JButton("");
		BtnSalaC1.setBackground(new Color(255, 255, 255));
		BtnSalaC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose(); // fecha tela atual
				AssentosC1 c1  = new AssentosC1();

				c1.setExtendedState(JFrame.MAXIMIZED_BOTH);
				c1.setVisible(true);
			
			
			}
		});
		
		JLabel lblSelecioneUmaSala = new JLabel("Selecione uma Sala");
		lblSelecioneUmaSala.setForeground(Color.WHITE);
		lblSelecioneUmaSala.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		contentPane.add(lblSelecioneUmaSala, "cell 0 1 5 1,alignx center,aligny bottom");
		
		JLabel lblSalaB = new JLabel("14:50 - Sala C1");
		lblSalaB.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalaB.setForeground(Color.LIGHT_GRAY);
		lblSalaB.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		contentPane.add(lblSalaB, "cell 1 3,grow");
		
		JLabel lblSalaB_2 = new JLabel("21:45 - Sala C2");
		lblSalaB_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalaB_2.setForeground(Color.LIGHT_GRAY);
		lblSalaB_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		contentPane.add(lblSalaB_2, "cell 3 3,grow");
		BtnSalaC1.setIcon(new ImageIcon(SelecionarSala3.class.getResource("/Images/Sala_resized.jpeg")));
		contentPane.add(BtnSalaC1, "cell 1 4,grow");
		
		JButton BtnSalaC2 = new JButton("");
		BtnSalaC2.setBackground(new Color(255, 255, 255));
		BtnSalaC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose(); // fecha tela atual
				AssentosC2 c2  = new AssentosC2 ();

				c2.setExtendedState(JFrame.MAXIMIZED_BOTH);
				c2.setVisible(true);
			
			}
		});
		BtnSalaC2.setIcon(new ImageIcon(SelecionarSala3.class.getResource("/Images/Sala_resized.jpeg")));
		contentPane.add(BtnSalaC2, "cell 3 4,grow");
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarFilme selctFilm = new SelecionarFilme();
				selctFilm.setVisible(true);
				selctFilm.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnNewButton.setBackground(Color.WHITE);
		contentPane.add(btnNewButton, "cell 0 0,alignx left,aligny top");
	}

}
