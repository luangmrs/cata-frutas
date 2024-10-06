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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JOptionPane;
import java.awt.Font;

public class TelaSalvarTerreno extends JFrame {
	private Terreno terreno;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarTerreno frame2 = new TelaCriarTerreno();
					Terreno ter1 = new Terreno(15, 6, 0, 2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0);
					TelaSalvarTerreno frame = new TelaSalvarTerreno(ter1, frame2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaSalvarTerreno(Terreno terreno, TelaCriarTerreno frame) {
		terreno.criarTerreno();
		setSize(1100, 600);
		setResizable(false);
		this.terreno = terreno;
		setTitle("Cata-Frutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 255, 51));
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(417, -2, 666, 562);
		contentPane.add(panel);

		exibirTerrenoPainel(panel, terreno);

		JButton btnSalvarConfig = new JButton("Salvar configuração");
		btnSalvarConfig.setForeground(Color.WHITE);
		btnSalvarConfig.setBackground(new Color(119, 136, 153));
		btnSalvarConfig.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
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
		btnSalvarConfig.setBounds(99, 78, 212, 83);
		contentPane.add(btnSalvarConfig);

		JButton btnRandomNovamente = new JButton("Gerar novamente");
		btnRandomNovamente.setForeground(Color.WHITE);
		btnRandomNovamente.setBackground(new Color(119, 136, 153));
		btnRandomNovamente.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		btnRandomNovamente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				terreno.shuffleMatriz();
				exibirTerrenoPainel(panel, terreno);
			}
		});
		btnRandomNovamente.setBounds(99, 239, 212, 83);
		contentPane.add(btnRandomNovamente);

		JButton btnVoltarTelaCriarTerreno = new JButton("Voltar");
		btnVoltarTelaCriarTerreno.setForeground(Color.WHITE);
		btnVoltarTelaCriarTerreno.setBackground(new Color(119, 136, 153));
		btnVoltarTelaCriarTerreno.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		btnVoltarTelaCriarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltarTelaCriarTerreno.setBounds(99, 400, 212, 83);
		contentPane.add(btnVoltarTelaCriarTerreno);
	}

	public static void exibirTerrenoPainel(JPanel panel, Terreno terreno) {
		panel.removeAll();
		int dimensao = terreno.getDimensao();

		panel.setLayout(new GridLayout(dimensao, dimensao, 1, 1));
		int cellWidth = (panel.getWidth() / dimensao);
		int cellHeight = (panel.getHeight() / dimensao);
		for (int i = 0; i < dimensao; i++) {;
			for (int j = 0; j < dimensao; j++) {
				JLabel label = new JLabel();
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setOpaque(true);

				ObjEstaticos elemento = terreno.getMatriz(i, j);

				if (elemento.getTipo().equalsIgnoreCase("*")) {
					label.setBackground(Color.GRAY);
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"pedra.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("M")) {
					label.setBackground(new Color(196, 199, 4));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"fruta-ouro-0005.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Tl")) {
					label.setBackground(new Color(196, 107, 4));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"laranjeira.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("L")) {
					label.setBackground(new Color(211, 156, 4));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"laranja.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Tab")) {
					label.setBackground(new Color(211, 84, 0));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"abacateira.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("ab")) {
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"abacate.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Tc")) {
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"coqueiro.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("C")) {
					label.setBackground(new Color(25, 111, 61));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"coco.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Tac")) {
					label.setBackground(new Color(205, 97, 85));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"aceroleira.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Ac")) {
					label.setBackground(new Color(217, 136, 128));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"acerola.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Tam")) {
					label.setBackground(new Color(123, 36, 28));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"amoeira.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Am")) {
					label.setBackground(new Color(169, 50, 38));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"amora.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("Tg")) {
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"goiabeira.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else if (elemento.getTipo().equalsIgnoreCase("G")) {
					label.setBackground(new Color(187, 143, 206));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"goiaba.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				} else {
					label.setBackground(new Color(46, 204, 113));
					label.setIcon(new ImageIcon("img"+System.getProperty("file.separator")+"finalizados"+System.getProperty("file.separator")+"grama.jpg"));
					Image img = ((ImageIcon) label.getIcon()).getImage();
					Image newimg = img.getScaledInstance(cellWidth, cellHeight, Image.SCALE_SMOOTH);
					label.setIcon(new ImageIcon(newimg));
				}

				panel.add(label);
			}
		}
		panel.revalidate();
		panel.repaint();
	}
}
