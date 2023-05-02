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
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;

public class SelecionarFilme extends JFrame {

	private JPanel contentPane;
	private String filme;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecionarFilme frame = new SelecionarFilme();
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
	public SelecionarFilme() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelecionarFilme.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1139, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnFilme1 = new JButton("");
		btnFilme1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 sl1 = new SelecionarSala1("A");
				sl1.setExtendedState(JFrame.MAXIMIZED_BOTH);
				sl1.setVisible(true);
			}
		});
		contentPane.setLayout(new MigLayout("", "[36.00,grow][200.00px,grow][36.00px][36.00px][252.00px,grow][36.00px][36.00][252px,grow][36.00,grow]", "[27.00,grow][][54.00px][36.00][337.00px,grow][][49.00,grow]"));
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				JFrameMain Jmain = new JFrameMain();
				Jmain.setExtendedState(JFrame.MAXIMIZED_BOTH);
				Jmain.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnNewButton.setBackground(Color.WHITE);
		contentPane.add(btnNewButton, "cell 0 0,alignx left,aligny top");
		btnFilme1.setBackground(Color.WHITE);
		btnFilme1.setIcon(new ImageIcon(SelecionarFilme.class.getResource("/Images/filme1_resized.jpeg")));
		contentPane.add(btnFilme1, "cell 1 4,grow");
		
		JButton btnFilme1_1 = new JButton("");
		btnFilme1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 sl2 = new SelecionarSala1("B");
				sl2.setExtendedState(JFrame.MAXIMIZED_BOTH);
				sl2.setVisible(true);
			}
		});
		btnFilme1_1.setBackground(Color.WHITE);
		btnFilme1_1.setIcon(new ImageIcon(SelecionarFilme.class.getResource("/Images/filme2_resized.jpeg")));
		contentPane.add(btnFilme1_1, "cell 4 4,grow");
		
		JButton btnFilme1_1_1 = new JButton("");
		btnFilme1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 sl3 = new SelecionarSala1("C");
				sl3.setExtendedState(JFrame.MAXIMIZED_BOTH);
				sl3.setVisible(true);
			}
		});
		btnFilme1_1_1.setBackground(Color.WHITE);
		btnFilme1_1_1.setIcon(new ImageIcon(SelecionarFilme.class.getResource("/Images/filmes_16093_01_resized.png")));
		contentPane.add(btnFilme1_1_1, "cell 7 4,grow");
		
		JLabel lblNewLabel = new JLabel("Selecione um Filme");
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 46));
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel, "cell 2 0 5 3,alignx center,aligny center");
	}
}
