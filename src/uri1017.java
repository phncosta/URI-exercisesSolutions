import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double tempo = sc.nextInt();
		double velocidade = sc.nextInt();
		double litros = tempo * velocidade / 12;

		System.out.printf("%.3f%n", litros);

		sc.close();
	}

}
