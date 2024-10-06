package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import terreno.Terreno;


import java.awt.Color;



public class TelaJogar extends JFrame {
	private static final long serialVersionUID = 1L;

	
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelaJogar frame = new TelaJogar(arquivo);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	
	public TelaJogar(String arquivo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(1100,650);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(242, 5, 600, 600);
		getContentPane().add(panel);
		
		Terreno terreno = new Terreno(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		terreno.lerConfiguracao("Terrenos"+System.getProperty("file.separator")+arquivo+".txt");
		try {
			terreno.validarTerreno();
			terreno.criarTerreno();
			TelaSalvarTerreno.exibirTerrenoPainel(panel, terreno);	
		}catch(IllegalArgumentException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Terreno inválido, verifique os dados.",
					JOptionPane.ERROR_MESSAGE);
			 SwingUtilities.invokeLater(() -> {
		            this.dispose();
		            TelaCarregarTerreno telaCarregarTerreno = new TelaCarregarTerreno();
		            telaCarregarTerreno.setVisible(true);
		            telaCarregarTerreno.toFront();
			 });
		}
		
	}
}
