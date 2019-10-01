import java.util.Locale;
import java.util.Scanner;

public class uri1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R1, R2;
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if ((a == 0 || (((b * b) - (4 * a * c)) < 0))) {
			System.out.printf("Impossivel calcular%n");
		} else {
			R1 = ((-b + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));
			R2 = ((-b - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));

			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}
		sc.close();

	}
}