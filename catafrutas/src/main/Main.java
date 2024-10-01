package main;

import terreno.Terreno;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		try {
			Terreno ter1 = new Terreno(4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			ter1.lerConfiguracao("Terrenos" + System.getProperty("file.separator") + "ter12.txt");
			ter1.criarTerreno();
			ter1.imprimirTerreno();

			System.out.println("Deseja salvar a configuracao?");
			System.out.print("S/N: ");
			String save = in.nextLine();
			System.out.println(save);
			in.close();
			if (save.equalsIgnoreCase("S")) {
				ter1.salvarConfig("Terrenos" + System.getProperty("file.separator") + "ter12.txt");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao criar terreno: " + e.getMessage());
		}

	}
}
