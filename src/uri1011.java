import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double raio = sc.nextInt();
		double volume = (4 / 3.0) * pi * (raio * raio * raio);

		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();

	}
}