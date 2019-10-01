import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco = 0;
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();

		if (codigo == 1) {
			preco = 4.0;
		} else if (codigo == 2) {
			preco = 4.5;
		} else if (codigo == 3) {
			preco = 5.0;
		} else if (codigo == 4) {
			preco = 2.0;
		} else if (codigo == 5) {
			preco = 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", qtd * preco);

		sc.close();

	}
}