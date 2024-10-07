package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

/**
 * Tela de carregar terreno salvo na pasta "Terrenos"
 */
public class TelaCarregarTerreno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarregarTerreno frame = new TelaCarregarTerreno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCarregarTerreno() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cata-Frutas");
		setSize(1100, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton btnCarregarArquivo = new JButton("Carregar arquivo");
		btnCarregarArquivo.setBounds(240, 139, 604, 282);
		btnCarregarArquivo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 68));
		btnCarregarArquivo.setBackground(new Color(119, 136, 153));
		btnCarregarArquivo.setForeground(Color.WHITE);
		btnCarregarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeArquivo = JOptionPane.showInputDialog(contentPane, "Digite o nome do arquivo:",
						"Carregar Arquivo", JOptionPane.PLAIN_MESSAGE);

				if (nomeArquivo != null && !nomeArquivo.trim().isEmpty()) {
					File arquivo = new File("Terrenos" + System.getProperty("file.separator") + nomeArquivo + ".txt");
					if (arquivo.exists() && arquivo.isFile()) {
						JOptionPane.showMessageDialog(contentPane, "Arquivo  encontrado!");
						dispose();
						TelaJogar TelaJogar = new TelaJogar(nomeArquivo);
						TelaJogar.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(contentPane, "Arquivo não encontrado!", "Erro",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(contentPane, "Nome do arquivo não fornecido!", "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnVoltarTelaInicial = new JButton("Voltar");
		btnVoltarTelaInicial.setBounds(84, 494, 915, 56);
		btnVoltarTelaInicial.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 28));
		btnVoltarTelaInicial.setForeground(Color.WHITE);
		btnVoltarTelaInicial.setBackground(new Color(119, 136, 153));
		btnVoltarTelaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame frame = new MainFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCarregarArquivo);
		contentPane.add(btnVoltarTelaInicial);

	}
}
