package terreno;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Terreno{
  //Atributos
  private int dimensao;
  private int qtdPedra;
  private int qtdArvore;
  //Contador da quantidade de pedras e árvores
  public int cPedra = 0;
  public int cArvore = 0;
  
  ObjEstaticos matriz[][];
  //Obj para randomizar as posições
  Random random = new Random();
  
  //Construtor
  public Terreno(int dimensao, int qtdPedra, int qtdArvore){
    this.dimensao = dimensao;
    this.qtdPedra = qtdPedra;
    this.qtdArvore = qtdArvore;
    matriz = new ObjEstaticos[dimensao][dimensao];
  }

  public int getQtdPedras(){
    return qtdPedra;
  }
  public int getQtdArvores(){
    return qtdArvore;
  }
  //Método criaTerreno cria uma matriz com todas as árvores e pedras passadas no construtor
  //usando o contador para fazer a verificação
  public void criarTerreno(){
    for(int i = 0; i < dimensao; i++){
      for(int j = 0; j < dimensao; j++){
        if(cPedra < getQtdPedras()){
          matriz[i][j] = new Pedra();
          cPedra++;
        }
        else if(cArvore < getQtdArvores()){
          matriz[i][j] = new Arvore();
          cArvore++;
        }
        else{
          matriz[i][j] = new Grama();
        }
      }
    }
    //Depois de criada, o método misturaMatriz faz um shuffle e embaralha todos os elementos,
    //Para deixar randomico
    misturaMatriz(matriz);
  }

  public void misturaMatriz(ObjEstaticos[][] matriz){
    List<ObjEstaticos> lista = new ArrayList<ObjEstaticos>();

        //Transforma a matriz em lista, pq o método Shuffle só funciona em listas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                lista.add(matriz[i][j]);
            }
        }

        //Embaralha a lista
        Collections.shuffle(lista);

        //Coloca de volta na matriz
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lista.get(index++);
            }
        }
    }
  //================ LÓGICA ANTIGA, IGNORAR =================
  // public void criarTerreno(){
  //   double chanceGramaInicial = 0.8;
  //   double chanceGramaFinal = 0.2;
  //   for(int i = 0; i < dimensao; i++){
  //     for(int j = 0; j < dimensao; j++){
  //        double progresso = ((double)(i * dimensao + j)) / (dimensao * dimensao);
  //        double chanceGrama = chanceGramaInicial * (1 - progresso) + chanceGramaFinal * progresso;
  //        double randomValue = random.nextDouble();
  //        if (randomValue < chanceGrama) {  
  //            matriz[i][j] = new Grama();
  //        }else{
  //         int nrandom = random.nextInt(2) + 1;
  //         switch(nrandom){
  //           case 1:
  //             if(cPedra < getQtdPedras()){
  //               matriz[i][j] = new Pedra();
  //               cPedra++;
  //             }
  //             else{
  //               matriz[i][j] = new Grama();
  //             }
  //             break;
  //           case 2:
  //             if(cArvore < getQtdArvores()){
  //               matriz[i][j] = new Arvore();
  //               cArvore++;
  //             }
  //             else{
  //               matriz[i][j] = new Grama();
  //             }
  //             break;
  //           default:
  //             matriz[i][j] = new Grama();
  //             break;
  //         }
  //       }
  //     }
  //   }
  //   while (cPedra < getQtdPedras() || cArvore < getQtdArvores()) {
  //     for (int i = 0; i < dimensao; i++) {
  //       for (int j = 0; j < dimensao; j++) {
  //         if (matriz[i][j] instanceof Grama) {  
  //           if (cPedra < getQtdPedras()) {   
  //               matriz[i][j] = new Pedra();
  //               cPedra++;
  //           }else if (cArvore < getQtdArvores()) {  
  //               matriz[i][j] = new Arvore();
  //               cArvore++;
  //           }
  //       }
        
  //       if (cPedra >= getQtdPedras() && cArvore >= getQtdArvores()) {
  //           break;
  //         }
  //       }
  //     }
  //   }
  // }

  
  //Imprime a matriz
  public void imprimirTerreno(){
    for(int i = 0; i < dimensao; i++){
      for(int j = 0; j < dimensao; j++){
        System.out.print("[" + matriz[i][j].getTipo() + "]");
      }
    System.out.println();
    }
  }
}