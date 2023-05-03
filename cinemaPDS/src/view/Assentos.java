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

public class Assentos extends JFrame {

	private JPanel contentPane;
	private String sala;
	private JButton[][] assentos;
	public  boolean cor;
	private boolean[][] assentosOcupados = new boolean[5][6];
	private String sessao;


	/**
	 * Launch the application.
	 */
	public Assentos() {}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assentos frame = new Assentos();
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
	public Assentos(String sessao,String sala) {
		this.sala = sala;
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Assentos.class.getResource("/Images/0609b1d7-4a7d-41be-bd18-081ecb35eb9e.png")));
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 500);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("",
				"[47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow][47px,grow]",
				"[49px,grow][49px,grow][49px,grow][49px,grow][49px,grow][49px,grow][49px,grow][49px,grow][49px,grow]"));

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // fecha tela atual
				SelecionarSala1 selctSala = new SelecionarSala1(sala);
				selctSala.setExtendedState(JFrame.MAXIMIZED_BOTH);
				selctSala.setVisible(true);
			}
		});

		btnVoltar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		btnVoltar.setBackground(Color.WHITE);
		contentPane.add(btnVoltar, "cell 0 0,alignx left,aligny top");

		JLabel lblAssentosA = new JLabel("Assentos A1");
		lblAssentosA.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssentosA.setForeground(Color.WHITE);
		lblAssentosA.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 47));

		contentPane.add(lblAssentosA, "cell 0 1 14 1,grow");

		// Cria a matriz de botões
		assentos = new JButton[5][6];

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 6; col++) {
				final int finalRow = row;
				final int finalCol = col;

				JButton btn = new JButton("");
				btn.setIcon(new ImageIcon(Assentos.class.getResource("/Images/24868_redmensioned.jpeg")));
				btn.setBackground(assentosOcupados(sessao,sala,row,col) ? Color.RED : Color.WHITE);
				assentos[row][col] = btn;
				contentPane.add(btn, "cell " + (4 + col) + " " + (3 + row) + ",grow");
				
				btn.addActionListener( new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						CadastroAssentos selctSala = new CadastroAssentos( sessao, sala, finalRow, finalCol);
						dispose();
						selctSala.setExtendedState(JFrame.MAXIMIZED_BOTH);
						selctSala.setVisible(true);

						CadastroAssentos.assento = finalRow;
						CadastroAssentos.assento1 = finalCol;
						assentosOcupados[finalRow][finalCol]=false;
				
					
					}
				});
			}
			
		}
		
		
		
		

	}
	private boolean assentosOcupados(String sessao, String sala, int row, int column ) {
			this.sessao = sessao;
			this.sala=sala;
			
		return !assentosOcupados[row][column] ;
	}
	public JButton[][] getAssentos() {
		return assentos;
	}
	public void setAssentos(JButton[][] assentos) {
		this.assentos = assentos;
		
		
		
	}
	public boolean[][] getAssentosOcupados() {
		return assentosOcupados;
	}
	public void setAssentosOcupados(boolean[][] assentosOcupados) {
	
		this.assentosOcupados = assentosOcupados;
		
	}



}
