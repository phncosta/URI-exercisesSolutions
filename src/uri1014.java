import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		double consumo = X / Y;
	
		System.out.printf("%.3f km/l%n", consumo);

		sc.close();
	}

}
