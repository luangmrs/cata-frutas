package main;
import terreno.Terreno;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  
		Scanner in = new Scanner(System.in);
		
	    Terreno ter1 = new Terreno
	    		(7,7,
	    		3, 1,
	    		2, 1,
	    		2, 3,
	    		2, 1, 
	    		1, 2, 
	    		1, 1, 
	    		1, 1, 
	    		25, 10);
	    
	    ter1.criarTerreno();
	    ter1.imprimirTerreno();

	    System.out.println("Deseja salvar a configuracao?");
		System.out.print("S/N: ");
		String save = in.nextLine();
		System.out.println(save);
		
	    if(save.equalsIgnoreCase("S")) {
	    	ter1.salvarConfig("Terrenos"+ System.getProperty("file.separator")+"ter12.txt");
	    }
	    in.close();
  }
  
  
  
}



