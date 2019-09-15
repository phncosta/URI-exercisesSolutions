import java.util.Locale;
import java.util.Scanner;

public class uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double a1, b1, c1, a, b = 0, c = 0;
		a1 = input.nextDouble();
		b1 = input.nextDouble();
		c1 = input.nextDouble();

		a = Math.max(a1, Math.max(b1, c1));

		if (a == a1) {
			b = Math.max(b1, c1);
			c = Math.min(b1, c1);
		}
		if (a == b1) {
			b = Math.max(a1, c1);
			c = Math.min(a1, c1);
		}
		if (a == c1) {
			b = Math.max(b1, a1);
			c = Math.min(b1, a1);
		}

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if (a * a > (b * b + c * c)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (a * a == (b * b + c * c)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if (a * a < (b * b + c * c)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && a == c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		input.close();
	}

}