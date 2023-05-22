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
import java.awt.event.ActionListener;
import java.security.interfaces.DSAKey;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

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
	public SelecionarSala1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelecionarSala1.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1107, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][278px,grow][grow 50][278px,grow][grow]", "[20.00px,grow][31.00][24.00][][150px,grow][51.00,grow]"));
		
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
		
		JLabel lblSelecioneUmaSala = new JLabel("Selecione uma Sala");
		lblSelecioneUmaSala.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneUmaSala.setForeground(Color.WHITE);
		lblSelecioneUmaSala.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		contentPane.add(lblSelecioneUmaSala, "cell 0 1 5 1,growx,aligny center");
		
		JButton BtnSalaA1 = new JButton("");
		BtnSalaA1.setBackground(new Color(255, 255, 255));
		BtnSalaA1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
				
				dispose(); // fecha tela atual
				AssentosA1 a1  = new AssentosA1 ();

				a1.setExtendedState(JFrame.MAXIMIZED_BOTH);
				a1.setVisible(true);
			}
		});
		
		JLabel lblNewLabel1 = new JLabel("13:35 - Sala A1");
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		contentPane.add(lblNewLabel1, "cell 1 3,growx,aligny center");
		
		//2
		JLabel lblNewLabel = new JLabel("13:35 - Sala A2");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		contentPane.add(lblNewLabel, "cell 3 3,alignx center,aligny center");
		
		BtnSalaA1.setIcon(new ImageIcon(SelecionarSala1.class.getResource("/Images/Sala_resized.jpeg")));
		contentPane.add(BtnSalaA1, "cell 1 4,grow");
		
		JButton BtnSalaA2 = new JButton("");
		BtnSalaA2.setBackground(new Color(255, 255, 255));
		BtnSalaA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
						dispose(); // fecha tela atual
						AssentosA2 a2  = new AssentosA2 ();

						a2.setExtendedState(JFrame.MAXIMIZED_BOTH);
						a2.setVisible(true);
			}
		});
		BtnSalaA2.setIcon(new ImageIcon(SelecionarSala1.class.getResource("/Images/Sala_resized.jpeg")));
		contentPane.add(BtnSalaA2, "cell 3 4,grow");
	}

}
