package main;

import terreno.Terreno;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaCriarTerreno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ArvAbacate;
	private JTextField ArvCoco;
	private JTextField ArvLaranja;
	private JTextField FrutaOuro;
	private JTextField Dimensao;
	private JTextField ArvAcerola;
	private JTextField ArvAmora;
	private JTextField ArvGoiaba;
	private JTextField bichadas;
	private JTextField Pedras;
	private JTextField FrutaOuroChao;
	private JTextField Laranja;
	private JTextField Abacate;
	private JTextField Coco;
	private JTextField Acerola;
	private JTextField Amora;
	private JTextField Goiaba;
	private JTextField mochila;

	private JLabel lblNewLabel;
	private JLabel lblDimensao;
	private JLabel lblFrutaOuro;
	private JLabel lblArvLaranja;
	private JLabel lblArvAbacate;
	private JLabel lblArvCoco;
	private JLabel lblArvAcerola;
	private JLabel lblArvAmora;
	private JLabel lblArvGoiaba;
	private JLabel lblBichadas;
	private JLabel lblPedras;
	private JLabel lblFrutaOuroChao;
	private JLabel lblLaranjasChao;
	private JLabel lblAbacatesChao;
	private JLabel lblCocosChao;
	private JLabel lblAcerolasChao;
	private JLabel lblAmorasChao;
	private JLabel lblGoiabasChao;
	private JLabel lblMochila;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarTerreno frame = new TelaCriarTerreno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCriarTerreno() {
		setResizable(false);
		setForeground(new Color(0, 0, 0));
		setBackground(Color.BLACK);
		setTitle("Cata-Frutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ArvAbacate = new JTextField();
		ArvAbacate.setHorizontalAlignment(SwingConstants.CENTER);
		ArvAbacate.setBounds(300, 255, 200, 20);
		contentPane.add(ArvAbacate);
		ArvAbacate.setColumns(10);

		ArvCoco = new JTextField();
		ArvCoco.setHorizontalAlignment(SwingConstants.CENTER);
		ArvCoco.setColumns(10);
		ArvCoco.setBounds(300, 311, 200, 20);
		contentPane.add(ArvCoco);

		ArvLaranja = new JTextField();
		ArvLaranja.setHorizontalAlignment(SwingConstants.CENTER);
		ArvLaranja.setColumns(10);
		ArvLaranja.setBounds(300, 199, 200, 20);
		contentPane.add(ArvLaranja);

		FrutaOuro = new JTextField();
		FrutaOuro.setHorizontalAlignment(SwingConstants.CENTER);
		FrutaOuro.setColumns(10);
		FrutaOuro.setBounds(300, 143, 200, 20);
		contentPane.add(FrutaOuro);

		Dimensao = new JTextField();
		Dimensao.setHorizontalAlignment(SwingConstants.CENTER);
		Dimensao.setColumns(5);
		Dimensao.setBounds(300, 87, 200, 20);
		contentPane.add(Dimensao);

		ArvAcerola = new JTextField();
		ArvAcerola.setHorizontalAlignment(SwingConstants.CENTER);
		ArvAcerola.setColumns(10);
		ArvAcerola.setBounds(300, 367, 200, 20);
		contentPane.add(ArvAcerola);

		ArvAmora = new JTextField();
		ArvAmora.setHorizontalAlignment(SwingConstants.CENTER);
		ArvAmora.setColumns(10);
		ArvAmora.setBounds(300, 423, 200, 20);
		contentPane.add(ArvAmora);

		ArvGoiaba = new JTextField();
		ArvGoiaba.setHorizontalAlignment(SwingConstants.CENTER);
		ArvGoiaba.setColumns(10);
		ArvGoiaba.setBounds(300, 479, 200, 20);
		contentPane.add(ArvGoiaba);

		bichadas = new JTextField();
		bichadas.setHorizontalAlignment(SwingConstants.CENTER);
		bichadas.setColumns(10);
		bichadas.setBounds(300, 535, 200, 20);
		contentPane.add(bichadas);

		Pedras = new JTextField();
		Pedras.setHorizontalAlignment(SwingConstants.CENTER);
		Pedras.setColumns(10);
		Pedras.setBounds(600, 87, 200, 20);
		contentPane.add(Pedras);

		FrutaOuroChao = new JTextField();
		FrutaOuroChao.setHorizontalAlignment(SwingConstants.CENTER);
		FrutaOuroChao.setColumns(10);
		FrutaOuroChao.setBounds(600, 143, 200, 20);
		contentPane.add(FrutaOuroChao);

		Laranja = new JTextField();
		Laranja.setHorizontalAlignment(SwingConstants.CENTER);
		Laranja.setColumns(10);
		Laranja.setBounds(600, 199, 200, 20);
		contentPane.add(Laranja);

		Abacate = new JTextField();
		Abacate.setHorizontalAlignment(SwingConstants.CENTER);
		Abacate.setColumns(10);
		Abacate.setBounds(600, 255, 200, 20);
		contentPane.add(Abacate);

		Coco = new JTextField();
		Coco.setHorizontalAlignment(SwingConstants.CENTER);
		Coco.setColumns(10);
		Coco.setBounds(600, 311, 200, 20);
		contentPane.add(Coco);

		Acerola = new JTextField();
		Acerola.setHorizontalAlignment(SwingConstants.CENTER);
		Acerola.setColumns(10);
		Acerola.setBounds(600, 367, 200, 20);
		contentPane.add(Acerola);

		Amora = new JTextField();
		Amora.setHorizontalAlignment(SwingConstants.CENTER);
		Amora.setColumns(10);
		Amora.setBounds(600, 423, 200, 20);
		contentPane.add(Amora);

		Goiaba = new JTextField();
		Goiaba.setHorizontalAlignment(SwingConstants.CENTER);
		Goiaba.setColumns(10);
		Goiaba.setBounds(600, 479, 200, 20);
		contentPane.add(Goiaba);

		mochila = new JTextField();
		mochila.setHorizontalAlignment(SwingConstants.CENTER);
		mochila.setColumns(10);
		mochila.setBounds(600, 535, 200, 20);
		contentPane.add(mochila);

		lblNewLabel = new JLabel("DIGITE AS INFORMAÇÕES DO TERRENO");
		lblNewLabel.setForeground(new Color(119, 136, 153));
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(233, -9, 618, 58);
		contentPane.add(lblNewLabel);

		lblDimensao = new JLabel("Dimensão:");
		lblDimensao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblDimensao.setLabelFor(Dimensao);
		lblDimensao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDimensao.setBounds(300, 60, 200, 26);
		contentPane.add(lblDimensao);

		lblFrutaOuro = new JLabel("Total Maracujás:");
		lblFrutaOuro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutaOuro.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblFrutaOuro.setBounds(321, 118, 161, 26);
		contentPane.add(lblFrutaOuro);

		lblArvLaranja = new JLabel("Árvores Laranja:");
		lblArvLaranja.setHorizontalAlignment(SwingConstants.CENTER);
		lblArvLaranja.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblArvLaranja.setBounds(321, 174, 161, 26);
		contentPane.add(lblArvLaranja);

		lblArvAbacate = new JLabel("Árvores Abacate:");
		lblArvAbacate.setHorizontalAlignment(SwingConstants.CENTER);
		lblArvAbacate.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblArvAbacate.setBounds(321, 230, 161, 26);
		contentPane.add(lblArvAbacate);

		lblArvCoco = new JLabel("Árvores Coco:");
		lblArvCoco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArvCoco.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblArvCoco.setBounds(321, 286, 161, 26);
		contentPane.add(lblArvCoco);

		lblArvAcerola = new JLabel("Árvores Acerola:");
		lblArvAcerola.setHorizontalAlignment(SwingConstants.CENTER);
		lblArvAcerola.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblArvAcerola.setBounds(321, 343, 161, 26);
		contentPane.add(lblArvAcerola);

		lblArvAmora = new JLabel("Árvores Amora:");
		lblArvAmora.setHorizontalAlignment(SwingConstants.CENTER);
		lblArvAmora.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblArvAmora.setBounds(321, 398, 161, 26);
		contentPane.add(lblArvAmora);

		lblArvGoiaba = new JLabel("Árvores Goiaba:");
		lblArvGoiaba.setHorizontalAlignment(SwingConstants.CENTER);
		lblArvGoiaba.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblArvGoiaba.setBounds(321, 454, 161, 26);
		contentPane.add(lblArvGoiaba);

		lblBichadas = new JLabel("Frutas bichadas:");
		lblBichadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBichadas.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblBichadas.setBounds(321, 510, 161, 26);
		contentPane.add(lblBichadas);

		lblPedras = new JLabel("Pedras:");
		lblPedras.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedras.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblPedras.setBounds(600, 60, 200, 26);
		contentPane.add(lblPedras);

		lblFrutaOuroChao = new JLabel("Maracujás no chão:");
		lblFrutaOuroChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrutaOuroChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblFrutaOuroChao.setBounds(600, 118, 200, 26);
		contentPane.add(lblFrutaOuroChao);

		lblLaranjasChao = new JLabel("Laranjas no chão:");
		lblLaranjasChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaranjasChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblLaranjasChao.setBounds(623, 174, 161, 26);
		contentPane.add(lblLaranjasChao);

		lblAbacatesChao = new JLabel("Abacates no chão:");
		lblAbacatesChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbacatesChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblAbacatesChao.setBounds(600, 230, 200, 26);
		contentPane.add(lblAbacatesChao);

		lblCocosChao = new JLabel("Cocos no chão:");
		lblCocosChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblCocosChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblCocosChao.setBounds(600, 286, 200, 26);
		contentPane.add(lblCocosChao);

		lblAcerolasChao = new JLabel("Acerolas no chão:");
		lblAcerolasChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcerolasChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblAcerolasChao.setBounds(600, 343, 200, 26);
		contentPane.add(lblAcerolasChao);

		lblAmorasChao = new JLabel("Amoras no chão:");
		lblAmorasChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmorasChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblAmorasChao.setBounds(623, 398, 161, 26);
		contentPane.add(lblAmorasChao);

		lblGoiabasChao = new JLabel("Goiabas no chão:");
		lblGoiabasChao.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoiabasChao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblGoiabasChao.setBounds(623, 454, 161, 26);
		contentPane.add(lblGoiabasChao);

		lblMochila = new JLabel("Tamanho da mochila:");
		lblMochila.setHorizontalAlignment(SwingConstants.CENTER);
		lblMochila.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		lblMochila.setBounds(600, 510, 200, 26);
		contentPane.add(lblMochila);

		JButton btnGerarTerreno = new JButton("Gerar terreno");
		btnGerarTerreno.setForeground(new Color(245, 245, 245));
		btnGerarTerreno.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		btnGerarTerreno.setBackground(new Color(119, 136, 153));
		btnGerarTerreno.setBounds(870, 8, 200, 83);
		contentPane.add(btnGerarTerreno);

		JButton btnVoltarMainFrame = new JButton("Voltar à tela inicial");
		btnVoltarMainFrame.setForeground(new Color(245, 245, 245));
		btnVoltarMainFrame.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		btnVoltarMainFrame.setBackground(new Color(119, 136, 153));
		btnVoltarMainFrame.setBounds(10, 10, 200, 83);
		contentPane.add(btnVoltarMainFrame);

		btnVoltarMainFrame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame frame = new MainFrame();
				frame.setVisible(true);
				dispose();
			}

		});

		btnGerarTerreno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					int dimensao = Integer.parseInt(Dimensao.getText());
					int qtdFrutaOuro = Integer.parseInt(FrutaOuro.getText());
					int qtdArvLaranja = Integer.parseInt(ArvLaranja.getText());
					int qtdArvAbacate = Integer.parseInt(ArvAbacate.getText());
					int qtdArvCoco = Integer.parseInt(ArvCoco.getText());
					int qtdArvAcerola = Integer.parseInt(ArvAcerola.getText());
					int qtdArvAmora = Integer.parseInt(ArvAmora.getText());
					int qtdArvGoiaba = Integer.parseInt(ArvGoiaba.getText());
					int qtdBichadas = Integer.parseInt(bichadas.getText());
					int qtdPedras = Integer.parseInt(Pedras.getText());
					int qtdFrutaOuroChao = Integer.parseInt(FrutaOuroChao.getText());
					int qtdLaranja = Integer.parseInt(Laranja.getText());
					int qtdAbacate = Integer.parseInt(Abacate.getText());
					int qtdCoco = Integer.parseInt(Coco.getText());
					int qtdAcerola = Integer.parseInt(Acerola.getText());
					int qtdAmora = Integer.parseInt(Amora.getText());
					int qtdGoiaba = Integer.parseInt(Goiaba.getText());
					int qtdMochila = Integer.parseInt(mochila.getText());

					Terreno ter1 = new Terreno(dimensao, qtdPedras, qtdFrutaOuro, qtdFrutaOuroChao, qtdArvLaranja,
							qtdLaranja, qtdArvAbacate, qtdAbacate, qtdArvCoco, qtdCoco, qtdArvAcerola, qtdAcerola,
							qtdArvAmora, qtdAmora, qtdArvGoiaba, qtdGoiaba, qtdBichadas, qtdMochila);

					try {
						ter1.validarTerreno();

						TelaSalvarTerreno TelaSalvarTerreno = new TelaSalvarTerreno(ter1, TelaCriarTerreno.this);
						TelaSalvarTerreno.setVisible(true);
						setVisible(false);
					} catch (IllegalArgumentException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro de Validação",
								JOptionPane.ERROR_MESSAGE);
					}

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.");
				}
			}
		});
	}

}