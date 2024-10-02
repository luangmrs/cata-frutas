package terreno;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Terreno {
	// Atributos
	private int dimensao;

	private int qtdPedra;
	private int qtdFrutaOuro;
	private int qtdFrutaOuroChao;
	private int qtdLaranja;
	private int qtdAbacate;
	private int qtdCoco;
	private int qtdAcerola;
	private int qtdAmora;
	private int qtdGoiaba;

	private int qtdArvoreLaranja;
	private int qtdArvoreAbacate;
	private int qtdArvoreCoco;
	private int qtdArvoreAcerola;
	private int qtdArvoreAmora;
	private int qtdArvoreGoiaba;

	private int bichadas;
	private int mochila;

	ObjEstaticos[][] matriz;
	List<ObjEstaticos> listaElementos = new ArrayList<>();

	// Construtor
	public Terreno(int dimensao, int qtdPedra, int qtdFrutaOuro, int qtdFrutaOuroChao, int qtdArvoreLaranja,
			int qtdLaranja, int qtdArvoreAbacate, int qtdAbacate, int qtdArvoreCoco, int qtdCoco, int qtdArvoreAcerola,
			int qtdAcerola, int qtdArvoreAmora, int qtdAmora, int qtdArvoreGoiaba, int qtdGoiaba, int bichadas,
			int mochila) {

		this.dimensao = dimensao;
		this.qtdPedra = qtdPedra;

		this.qtdFrutaOuro = qtdFrutaOuro;
		this.qtdFrutaOuroChao = qtdFrutaOuroChao;

		this.qtdLaranja = qtdLaranja;
		this.qtdAbacate = qtdAbacate;
		this.qtdCoco = qtdCoco;
		this.qtdAcerola = qtdAcerola;
		this.qtdAmora = qtdAmora;
		this.qtdGoiaba = qtdGoiaba;

		this.qtdArvoreLaranja = qtdArvoreLaranja;
		this.qtdArvoreAbacate = qtdArvoreAbacate;
		this.qtdArvoreCoco = qtdArvoreCoco;
		this.qtdArvoreAcerola = qtdArvoreAcerola;
		this.qtdArvoreAmora = qtdArvoreAmora;
		this.qtdArvoreGoiaba = qtdArvoreGoiaba;

		this.bichadas = bichadas;
		this.mochila = mochila;

		matriz = new ObjEstaticos[dimensao][dimensao];

	}

	public int getDimensao() {
		return dimensao;
	}

	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}

	public int getQtdPedra() {
		return qtdPedra;
	}

	public void setQtdPedra(int qtdPedra) {
		this.qtdPedra = qtdPedra;
	}

	public int getQtdFrutaOuro() {
		return qtdFrutaOuro;
	}

	public void setQtdFrutaOuro(int qtdFrutaOuro) {
		this.qtdFrutaOuro = qtdFrutaOuro;
	}

	public int getQtdFrutaOuroChao() {
		return qtdFrutaOuroChao;
	}

	public void setQtdFrutaOuroChao(int qtdFrutaOuroChao) {
		this.qtdFrutaOuroChao = qtdFrutaOuroChao;
	}

	public int getQtdLaranja() {
		return qtdLaranja;
	}

	public void setQtdLaranja(int qtdLaranja) {
		this.qtdLaranja = qtdLaranja;
	}

	public int getQtdAbacate() {
		return qtdAbacate;
	}

	public void setQtdAbacate(int qtdAbacate) {
		this.qtdAbacate = qtdAbacate;
	}

	public int getQtdCoco() {
		return qtdCoco;
	}

	public void setQtdCoco(int qtdCoco) {
		this.qtdCoco = qtdCoco;
	}

	public int getQtdAcerola() {
		return qtdAcerola;
	}

	public void setQtdAcerola(int qtdAcerola) {
		this.qtdAcerola = qtdAcerola;
	}

	public int getQtdAmora() {
		return qtdAmora;
	}

	public void setQtdAmora(int qtdAmora) {
		this.qtdAmora = qtdAmora;
	}

	public int getQtdGoiaba() {
		return qtdGoiaba;
	}

	public void setQtdGoiaba(int qtdGoiaba) {
		this.qtdGoiaba = qtdGoiaba;
	}

	public int getQtdArvoreLaranja() {
		return qtdArvoreLaranja;
	}

	public void setQtdArvoreLaranja(int qtdArvoreLaranja) {
		this.qtdArvoreLaranja = qtdArvoreLaranja;
	}

	public int getQtdArvoreAbacate() {
		return qtdArvoreAbacate;
	}

	public void setQtdArvoreAbacate(int qtdArvoreAbacate) {
		this.qtdArvoreAbacate = qtdArvoreAbacate;
	}

	public int getQtdArvoreCoco() {
		return qtdArvoreCoco;
	}

	public void setQtdArvoreCoco(int qtdArvoreCoco) {
		this.qtdArvoreCoco = qtdArvoreCoco;
	}

	public int getQtdArvoreAcerola() {
		return qtdArvoreAcerola;
	}

	public void setQtdArvoreAcerola(int qtdArvoreAcerola) {
		this.qtdArvoreAcerola = qtdArvoreAcerola;
	}

	public int getQtdArvoreAmora() {
		return qtdArvoreAmora;
	}

	public void setQtdArvoreAmora(int qtdArvoreAmora) {
		this.qtdArvoreAmora = qtdArvoreAmora;
	}

	public int getQtdArvoreGoiaba() {
		return qtdArvoreGoiaba;
	}

	public void setQtdArvoreGoiaba(int qtdArvoreGoiaba) {
		this.qtdArvoreGoiaba = qtdArvoreGoiaba;
	}

	public int getBichadas() {
		return bichadas;
	}

	public void setBichadas(int bichadas) {
		this.bichadas = bichadas;
	}

	public int getMochila() {
		return mochila;
	}

	public void setMochila(int mochila) {
		this.mochila = mochila;
	}

	// Método criaTerreno cria uma lista com todos os elementos, para depois usar o
	// método shuffle
	public void criarTerreno() {

		for (int i = 0; i < qtdPedra; i++)
			listaElementos.add(new Pedra());

		for (int i = 0; i < qtdArvoreLaranja; i++)
			listaElementos.add(new Arvore("Tl"));
		for (int i = 0; i < qtdArvoreAbacate; i++)
			listaElementos.add(new Arvore("Tab"));
		for (int i = 0; i < qtdArvoreCoco; i++)
			listaElementos.add(new Arvore("Tc"));
		for (int i = 0; i < qtdArvoreAcerola; i++)
			listaElementos.add(new Arvore("Tac"));
		for (int i = 0; i < qtdArvoreAmora; i++)
			listaElementos.add(new Arvore("Tam"));
		for (int i = 0; i < qtdArvoreGoiaba; i++)
			listaElementos.add(new Arvore("Tg"));

		for (int i = 0; i < qtdFrutaOuroChao; i++)
			listaElementos.add(new FrutaOuro());
		for (int i = 0; i < qtdCoco; i++)
			listaElementos.add(new Coco());
		for (int i = 0; i < qtdAbacate; i++)
			listaElementos.add(new Abacate());
		for (int i = 0; i < qtdLaranja; i++)
			listaElementos.add(new Laranja());
		for (int i = 0; i < qtdAcerola; i++)
			listaElementos.add(new Acerola());
		for (int i = 0; i < qtdAmora; i++)
			listaElementos.add(new Amora());
		for (int i = 0; i < qtdGoiaba; i++)
			listaElementos.add(new Goiaba());

		while (listaElementos.size() < dimensao * dimensao) {
			listaElementos.add(new Grama());
		}
		// shuffle
		Collections.shuffle(listaElementos);

		// transforma a lista em matriz
		int ci = 0;
		for (int i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				matriz[i][j] = listaElementos.get(ci++);
			}
		}
	}

	public void shuffleMatriz() {
		List<ObjEstaticos> listaShuffle = new ArrayList<>();

		// Converte a matriz em uma lista
		for (ObjEstaticos[] linha : matriz) {
			for (ObjEstaticos elemento : linha) {
				listaShuffle.add(elemento);
			}
		}

		// Embaralha a lista
		Collections.shuffle(listaShuffle);

		// Transforma a lista de volta em uma matriz
		int index = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = listaShuffle.get(index++);
			}
		}
	}

	// imprime a matriz
	public void imprimirTerreno() {
		validarTerreno();
		for (int i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				System.out.print("[ " + matriz[i][j].getTipo() + " ]");
			}
			System.out.println();
		}
	}

	// método para salvar a config
	public void salvarConfig(String nomeArq) {
		try (BufferedWriter arquivo = new BufferedWriter(new FileWriter(nomeArq))) {
			arquivo.write("dimensao " + dimensao + System.getProperty("line.separator"));
			arquivo.write("pedras " + qtdPedra + System.getProperty("line.separator"));
			arquivo.write("maracuja " + qtdFrutaOuro + " " + qtdFrutaOuroChao + System.getProperty("line.separator"));
			arquivo.write("laranja " + qtdArvoreLaranja + " " + qtdLaranja + System.getProperty("line.separator"));
			arquivo.write("abacate " + qtdArvoreAbacate + " " + qtdAbacate + System.getProperty("line.separator"));
			arquivo.write("coco " + qtdArvoreCoco + " " + qtdCoco + System.getProperty("line.separator"));
			arquivo.write("acerola " + qtdArvoreAcerola + " " + qtdAcerola + System.getProperty("line.separator"));
			arquivo.write("amora " + qtdArvoreAmora + " " + qtdAmora + System.getProperty("line.separator"));
			arquivo.write("goiaba " + qtdArvoreGoiaba + " " + qtdGoiaba + System.getProperty("line.separator"));
			arquivo.write("bichadas " + bichadas + System.getProperty("line.separator"));
			arquivo.write("mochila " + mochila);

			arquivo.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ObjEstaticos getMatriz(int i, int j) {
		return matriz[i][j];
	}

	public void lerConfiguracao(String nomeArquivo) {
		try (BufferedReader file = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha;
			while ((linha = file.readLine()) != null) {
				String[] partes = linha.split(" ");

				// Verifica a palavra-chave e atribui os valores adequados
				switch (partes[0]) {
				case "dimensao":
					dimensao = Integer.parseInt(partes[1]);
					break;
				case "pedras":
					qtdPedra = Integer.parseInt(partes[1]);
					break;
				case "maracuja":
					qtdFrutaOuro = Integer.parseInt(partes[1]);
					qtdFrutaOuroChao = Integer.parseInt(partes[2]);
					break;
				case "laranja":
					qtdArvoreLaranja = Integer.parseInt(partes[1]);
					qtdLaranja = Integer.parseInt(partes[2]);
					break;
				case "abacate":
					qtdArvoreAbacate = Integer.parseInt(partes[1]);
					qtdAbacate = Integer.parseInt(partes[2]);
					break;
				case "coco":
					qtdArvoreCoco = Integer.parseInt(partes[1]);
					qtdCoco = Integer.parseInt(partes[2]);
					break;
				case "acerola":
					qtdArvoreAcerola = Integer.parseInt(partes[1]);
					qtdAcerola = Integer.parseInt(partes[2]);
					break;
				case "amora":
					qtdArvoreAmora = Integer.parseInt(partes[1]);
					qtdAmora = Integer.parseInt(partes[2]);
					break;
				case "goiaba":
					qtdArvoreGoiaba = Integer.parseInt(partes[1]);
					qtdGoiaba = Integer.parseInt(partes[2]);
					break;
				case "bichadas":
					bichadas = Integer.parseInt(partes[1]);
					break;
				case "mochila":
					mochila = Integer.parseInt(partes[1]);
					break;
				}
			}
			matriz = new ObjEstaticos[dimensao][dimensao];
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void validarTerreno() {
		if (dimensao < 5)
			throw new IllegalArgumentException("Dimensão menor que 5.");
		if (dimensao * dimensao < (qtdLaranja + qtdAbacate + qtdCoco + qtdAcerola + qtdAmora + qtdGoiaba
				+ qtdArvoreLaranja + qtdArvoreAbacate + qtdArvoreCoco + qtdArvoreAcerola + qtdArvoreAmora
				+ qtdArvoreGoiaba + qtdPedra))
			throw new IllegalArgumentException("Dimensão menor que a quantidade de elementos.");
	}
}
