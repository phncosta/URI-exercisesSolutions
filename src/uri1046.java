import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int hInicial, hFinal, duracao;

		hInicial = input.nextInt();
		hFinal = input.nextInt();

		if (hInicial == hFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (hInicial > hFinal) {
			duracao = (24 - hInicial) + hFinal;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

		input.close();
	}

}