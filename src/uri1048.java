import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String percentual;
		double reajuste, salario;
		salario = input.nextFloat();

		if (salario > 0 && salario <= 400) {
			reajuste = salario * 0.15;
			salario += reajuste;
			percentual = "15 %";
		} else if (salario > 400 && salario <= 800) {
			reajuste = salario * 0.12;
			salario += reajuste;
			percentual = "12 %";
		} else if (salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10;
			salario += reajuste;
			percentual = "10 %";
		} else if (salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			salario += reajuste;
			percentual = "7 %";
		} else {
			reajuste = salario * 0.04;
			salario += reajuste;
			percentual = "4 %";
		}

		System.out.printf("Novo salario: %.2f\n", salario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.printf("Em percentual: %s\n", percentual);

		input.close();
	}
}
