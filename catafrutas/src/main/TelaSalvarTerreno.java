package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import terreno.ObjEstaticos;
import terreno.Terreno;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JOptionPane;

import java.io.IOException;

public class TelaSalvarTerreno extends JFrame {
	private Terreno terreno;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Terreno ter1 = new Terreno(15, 6, 0, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0);
					TelaSalvarTerreno frame = new TelaSalvarTerreno(ter1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaSalvarTerreno(Terreno terreno) {
		terreno.criarTerreno();
		setResizable(false);
		this.terreno = terreno;
		setTitle("Cata-Frutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(374, 30, 700, 700);
		contentPane.add(panel);

		exibirTerrenoPainel(panel, terreno);

		JButton btnSalvarConfig = new JButton("Salvar configuração");
		btnSalvarConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeArq = JOptionPane.showInputDialog(null, "Digite o nome do arquivo sem a extensão.");
				if (nomeArq != null && !nomeArq.trim().isEmpty()) {
					String caminhoArquivo = "Terrenos" + System.getProperty("file.separator") + nomeArq + ".txt";
					terreno.salvarConfig(caminhoArquivo);

					JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso: " + caminhoArquivo,
							"Salvar Configuração", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Operação cancelada.", "Salvar Configuração",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnSalvarConfig.setBounds(89, 128, 161, 83);
		contentPane.add(btnSalvarConfig);

		JButton btnRandomNovamente = new JButton("Gerar novamente");
		btnRandomNovamente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				terreno.shuffleMatriz();
				exibirTerrenoPainel(panel, terreno);
			}
		});
		btnRandomNovamente.setBounds(89, 339, 161, 83);
		contentPane.add(btnRandomNovamente);

		JButton btnVoltarTelaCriarTerreno = new JButton("Voltar");
		btnVoltarTelaCriarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCriarTerreno frame = new TelaCriarTerreno();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltarTelaCriarTerreno.setBounds(89, 550, 161, 83);
		contentPane.add(btnVoltarTelaCriarTerreno);
	}

	public void exibirTerrenoPainel(JPanel panel, Terreno terreno) {
		panel.removeAll();
		int dimensao = terreno.getDimensao();

		panel.setLayout(new GridLayout(dimensao, dimensao, 1, 1));
		for (int i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				JLabel label = new JLabel();
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setOpaque(true);

				ObjEstaticos elemento = terreno.getMatriz(i, j);

				if (elemento.getTipo().equalsIgnoreCase("*")) {
					label.setBackground(Color.GRAY);
					label.setText("Pedra");
				} else if (elemento.getTipo().equalsIgnoreCase("M")) {
					label.setBackground(new Color(196, 199, 4));
					label.setText("Maracujá");
				} else if (elemento.getTipo().equalsIgnoreCase("M")) {
					label.setBackground(new Color(196, 199, 4));
					label.setText("Maracujá");
				} else if (elemento.getTipo().equalsIgnoreCase("Tl")) {
					label.setBackground(new Color(196, 107, 4));
					label.setText("Laranjeira");
				} else if (elemento.getTipo().equalsIgnoreCase("L")) {
					label.setBackground(new Color(211, 156, 4));
					label.setText("Laranja");
				} else if (elemento.getTipo().equalsIgnoreCase("Tab")) {
					label.setBackground(new Color(211, 84, 0));
					label.setText("Abacateira");
				} else if (elemento.getTipo().equalsIgnoreCase("ab")) {
					label.setBackground(new Color(186, 74, 0));
					label.setText("Abacate");
				} else if (elemento.getTipo().equalsIgnoreCase("Tc")) {
					label.setBackground(new Color(20, 90, 50));
					label.setText("Coqueiro");
				} else if (elemento.getTipo().equalsIgnoreCase("C")) {
					label.setBackground(new Color(25, 111, 61));
					label.setText("Coco");
				} else if (elemento.getTipo().equalsIgnoreCase("Tac")) {
					label.setBackground(new Color(205, 97, 85));
					label.setText("Aceroleira");
				} else if (elemento.getTipo().equalsIgnoreCase("Ac")) {
					label.setBackground(new Color(217, 136, 128));
					label.setText("Acerola");
				} else if (elemento.getTipo().equalsIgnoreCase("Tam")) {
					label.setBackground(new Color(123, 36, 28));
					label.setText("Amoreira");
				} else if (elemento.getTipo().equalsIgnoreCase("Am")) {
					label.setBackground(new Color(169, 50, 38));
					label.setText("Amora");
				} else if (elemento.getTipo().equalsIgnoreCase("Tg")) {
					label.setBackground(new Color(142, 68, 173));
					label.setText("Goiabeira");
				} else if (elemento.getTipo().equalsIgnoreCase("G")) {
					label.setBackground(new Color(187, 143, 206));
					label.setText("Goiaba");
				} else {
					label.setBackground(new Color(46, 204, 113));
					label.setText("Grama");
				}

				panel.add(label);
			}
		}
		panel.revalidate();
		panel.repaint();
	}

}
