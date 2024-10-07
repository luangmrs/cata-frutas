package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Tela inicial do jogo, com botões de iniciar jogo e criar terreno
 * 
 * @author Luan
 * @author Rafael
 * @author Maria
 * @author Thayla
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setSize(1100, 600);
		setResizable(false);
		setForeground(new Color(0, 0, 0));
		setBackground(Color.BLACK);
		setTitle("Cata-Frutas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 8));

		JLabel lblCataFrutas = new JLabel("Cata-Frutas");
		lblCataFrutas.setForeground(new Color(119, 136, 153));
		lblCataFrutas.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 72));
		lblCataFrutas.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCataFrutas);

		JButton btnIniciarJogo = new JButton("Iniciar jogo");
		btnIniciarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCarregarTerreno TelaJogo = new TelaCarregarTerreno();
				TelaJogo.setVisible(true);
				dispose();
			}
		});
		btnIniciarJogo.setForeground(new Color(245, 245, 245));
		btnIniciarJogo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		btnIniciarJogo.setBackground(new Color(119, 136, 153));
		contentPane.add(btnIniciarJogo);

		JButton btnCriarTerreno = new JButton("Criar terreno");
		btnCriarTerreno.setForeground(new Color(245, 245, 245));
		btnCriarTerreno.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		btnCriarTerreno.setBackground(new Color(119, 136, 153));
		contentPane.add(btnCriarTerreno);

		btnCriarTerreno.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCriarTerreno frame = new TelaCriarTerreno();
				frame.setVisible(true);
				dispose();
			}
		});

	}
}
