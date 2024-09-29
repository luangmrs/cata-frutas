package main;
import terreno.Terreno;

public class Main {
  public static void main(String[] args) {
    Terreno ter1 = new Terreno(9, 12, 12);
    ter1.criarTerreno();
    ter1.imprimirTerreno();
  }
}
