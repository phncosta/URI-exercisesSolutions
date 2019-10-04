import java.util.Locale;
import java.util.Scanner;

public class uri1060 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int positivo = 0, i = 0;

		while (i < 6) {
			i++;
			float n = input.nextFloat();
			if (n > 0) {
				positivo++;
			}
		}
		
		System.out.println(positivo + " valores positivos");

		input.close();
	}
}
