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
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class AssentosA2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssentosA2 frame = new AssentosA2();
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
	public AssentosA2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AssentosA1.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[47px,grow][47px,grow][35px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][37px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow]", "[49px,grow][49px,grow][][35px,grow][35px,grow][35px,grow][35px,grow][49px,grow]"));
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 selctSala = new SelecionarSala1();
				selctSala.setExtendedState(JFrame.MAXIMIZED_BOTH);
				selctSala.setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnNewButton.setBackground(Color.WHITE);
		contentPane.add(btnNewButton, "cell 0 0,alignx left,aligny top");
		
		JLabel lblAssentosA = new JLabel("Assentos A2");
		lblAssentosA.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssentosA.setForeground(Color.WHITE);
		lblAssentosA.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 43));
		contentPane.add(lblAssentosA, "cell 0 1 14 1,grow");
		
		JButton btn1 = new JButton("");
		
				btn1.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
				btn1.setBackground(Color.WHITE);
				contentPane.add(btn1, "cell 2 3,grow");
		
		JButton btn2 = new JButton("");
		btn2.setBackground(Color.WHITE);
		btn2.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		contentPane.add(btn2, "cell 4 3,grow");
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn3.setBackground(Color.WHITE);
		contentPane.add(btn3, "cell 5 3,grow");
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn4.setBackground(Color.WHITE);
		contentPane.add(btn4, "cell 6 3,grow");
		
		JButton btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn5.setBackground(Color.WHITE);
		contentPane.add(btn5, "cell 7 3,grow");
		
		JButton btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn6.setBackground(Color.WHITE);
		contentPane.add(btn6, "cell 8 3,grow");
		
		JButton btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn7.setBackground(Color.WHITE);
		contentPane.add(btn7, "cell 9 3,grow");
		
		JButton btn11 = new JButton("");
		btn11.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn11.setBackground(Color.WHITE);
		contentPane.add(btn11, "cell 2 4,grow");
		
		JButton btn12 = new JButton("");
		btn12.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn12.setBackground(Color.WHITE);
		contentPane.add(btn12, "cell 4 4,grow");
		
		JButton btn13 = new JButton("");
		btn13.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn13.setBackground(Color.WHITE);
		contentPane.add(btn13, "cell 5 4,grow");
		
		JButton btn14 = new JButton("");
		btn14.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn14.setBackground(Color.WHITE);
		contentPane.add(btn14, "cell 6 4,grow");
		
		JButton btn15 = new JButton("");
		btn15.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn15.setBackground(Color.WHITE);
		contentPane.add(btn15, "cell 7 4,grow");
		
		JButton btn16 = new JButton("");
		btn16.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn16.setBackground(Color.WHITE);
		contentPane.add(btn16, "cell 8 4,grow");
		
		JButton btn17 = new JButton("");
		btn17.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn17.setBackground(Color.WHITE);
		contentPane.add(btn17, "cell 9 4,grow");
		
		JButton btn20 = new JButton("");
		btn20.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn20.setBackground(Color.WHITE);
		contentPane.add(btn20, "cell 4 5,grow");
		
		JButton btn21 = new JButton("");
		btn21.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn21.setBackground(Color.WHITE);
		contentPane.add(btn21, "cell 5 5,grow");
		
		JButton btn22 = new JButton("");
		btn22.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn22.setBackground(Color.WHITE);
		contentPane.add(btn22, "cell 6 5,grow");
		
		JButton btn23 = new JButton("");
		btn23.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn23.setBackground(Color.WHITE);
		contentPane.add(btn23, "cell 7 5,grow");
		
		JButton btn24 = new JButton("");
		btn24.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		
				btn24.setBackground(Color.WHITE);
				contentPane.add(btn24, "cell 8 5,grow");
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn8.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn8.setBackground(Color.WHITE);
		contentPane.add(btn8, "cell 11 3,grow");
		
		JButton btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn9.setBackground(Color.WHITE);
		contentPane.add(btn9, "cell 12 3,grow");
		
		JButton btn0 = new JButton("");
		btn0.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn0.setBackground(Color.WHITE);
		contentPane.add(btn0, "cell 1 3,grow");
		
		JButton btn25 = new JButton("");
		btn25.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		
				btn25.setBackground(Color.WHITE);
				contentPane.add(btn25, "cell 9 5,grow");
		
		JButton btn26 = new JButton("");
		btn26.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn26.setBackground(Color.WHITE);
		contentPane.add(btn26, "cell 4 6,grow");
		
		JButton btn27 = new JButton("");
		btn27.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn27.setBackground(Color.WHITE);
		contentPane.add(btn27, "cell 5 6,grow");
		
		JButton btn28 = new JButton("");
		btn28.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn28.setBackground(Color.WHITE);
		contentPane.add(btn28, "cell 6 6,grow");
		
		JButton btn29 = new JButton("");
		btn29.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn29.setBackground(Color.WHITE);
		contentPane.add(btn29, "cell 7 6,grow");
		
		JButton btn30 = new JButton("");
		btn30.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		
				btn30.setBackground(Color.WHITE);
				contentPane.add(btn30, "cell 8 6,grow");
		
		JButton btn10 = new JButton("");
		btn10.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		btn10.setBackground(Color.WHITE);
		contentPane.add(btn10, "cell 1 4,grow");
		
		JButton btn18 = new JButton("");
		btn18.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn18.setBackground(Color.WHITE);
		contentPane.add(btn18, "cell 11 4,grow");
		
		JButton btn19 = new JButton("");
		btn19.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));

		btn19.setBackground(Color.WHITE);
		contentPane.add(btn19, "cell 12 4,grow");
		
		JButton btn31 = new JButton("");
		btn31.setIcon(new ImageIcon(AssentosA1.class.getResource("/Images/24868_redmensioned.jpeg")));
		
				btn31.setBackground(Color.WHITE);
				contentPane.add(btn31, "cell 9 6,grow");

		
	}
}
