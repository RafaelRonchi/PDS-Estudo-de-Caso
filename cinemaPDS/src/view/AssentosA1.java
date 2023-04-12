package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AssentosA1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssentosA1 frame = new AssentosA1();
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
	public AssentosA1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AssentosA1.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAssentosA = new JLabel("Assentos A1");
		lblAssentosA.setForeground(Color.WHITE);
		lblAssentosA.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 43));
		lblAssentosA.setBounds(295, 0, 239, 49);
		contentPane.add(lblAssentosA);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 selctSala = new SelecionarSala1();
				selctSala.setLocationRelativeTo(null);
				selctSala.setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 11, 98, 23);
		contentPane.add(btnNewButton);
		
		JButton btn2 = new JButton("");
		btn2.setBackground(Color.WHITE);
		btn2.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn2.setBounds(184, 124, 47, 35);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(260, 124, 47, 35);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(342, 124, 47, 35);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(425, 124, 47, 35);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(509, 124, 47, 35);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(592, 124, 47, 35);
		contentPane.add(btn7);
		
		JButton btn12 = new JButton("");
		btn12.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn12.setBackground(Color.WHITE);
		btn12.setBounds(184, 191, 47, 35);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("");
		btn13.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn13.setBackground(Color.WHITE);
		btn13.setBounds(260, 191, 47, 35);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("");
		btn14.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn14.setBackground(Color.WHITE);
		btn14.setBounds(342, 191, 47, 35);
		contentPane.add(btn14);
		
		JButton btn15 = new JButton("");
		btn15.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn15.setBackground(Color.WHITE);
		btn15.setBounds(425, 191, 47, 35);
		contentPane.add(btn15);
		
		JButton btn16 = new JButton("");
		btn16.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn16.setBackground(Color.WHITE);
		btn16.setBounds(509, 191, 47, 35);
		contentPane.add(btn16);
		
		JButton btn17 = new JButton("");
		btn17.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn17.setBackground(Color.WHITE);
		btn17.setBounds(592, 191, 47, 35);
		contentPane.add(btn17);
		
		JButton btn20 = new JButton("");
		btn20.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn20.setBackground(Color.WHITE);
		btn20.setBounds(184, 262, 47, 35);
		contentPane.add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn21.setBackground(Color.WHITE);
		btn21.setBounds(260, 262, 47, 35);
		contentPane.add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn22.setBackground(Color.WHITE);
		btn22.setBounds(342, 262, 47, 35);
		contentPane.add(btn22);
		
		JButton btn23 = new JButton("");
		btn23.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn23.setBackground(Color.WHITE);
		btn23.setBounds(425, 262, 47, 35);
		contentPane.add(btn23);
		
		JButton btn24 = new JButton("");
		btn24.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn24.setBackground(Color.WHITE);
		btn24.setBounds(509, 262, 47, 35);
		contentPane.add(btn24);
		
		JButton btn25 = new JButton("");
		btn25.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn25.setBackground(Color.WHITE);
		btn25.setBounds(592, 262, 47, 35);
		contentPane.add(btn25);
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn8.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(673, 124, 47, 35);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(749, 124, 47, 35);
		contentPane.add(btn9);
		
		JButton btn1 = new JButton("");

		btn1.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(103, 124, 47, 35);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("");
		btn0.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(21, 124, 47, 35);
		contentPane.add(btn0);
		
		JButton btn26 = new JButton("");
		btn26.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn26.setBackground(Color.WHITE);
		btn26.setBounds(184, 331, 47, 35);
		contentPane.add(btn26);
		
		JButton btn27 = new JButton("");
		btn27.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn27.setBackground(Color.WHITE);
		btn27.setBounds(260, 331, 47, 35);
		contentPane.add(btn27);
		
		JButton btn28 = new JButton("");
		btn28.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn28.setBackground(Color.WHITE);
		btn28.setBounds(342, 331, 47, 35);
		contentPane.add(btn28);
		
		JButton btn29 = new JButton("");
		btn29.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn29.setBackground(Color.WHITE);
		btn29.setBounds(425, 331, 47, 35);
		contentPane.add(btn29);
		
		JButton btn30 = new JButton("");
		btn30.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn30.setBackground(Color.WHITE);
		btn30.setBounds(509, 331, 47, 35);
		contentPane.add(btn30);
		
		JButton btn31 = new JButton("");
		btn31.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn31.setBackground(Color.WHITE);
		btn31.setBounds(592, 331, 47, 35);
		contentPane.add(btn31);
		
		JButton btn11 = new JButton("");
		btn11.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn11.setBackground(Color.WHITE);
		btn11.setBounds(103, 191, 47, 35);
		contentPane.add(btn11);
		
		JButton btn10 = new JButton("");
		btn10.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn10.setBackground(Color.WHITE);
		btn10.setBounds(21, 191, 47, 35);
		contentPane.add(btn10);
		
		JButton btn18 = new JButton("");
		btn18.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn18.setBackground(Color.WHITE);
		btn18.setBounds(673, 191, 47, 35);
		contentPane.add(btn18);
		
		JButton btn19 = new JButton("");
		btn19.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn19.setBackground(Color.WHITE);
		btn19.setBounds(749, 191, 47, 35);
		contentPane.add(btn19);

		
	}
}
