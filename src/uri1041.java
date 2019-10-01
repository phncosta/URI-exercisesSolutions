import java.util.Locale;
import java.util.Scanner;

public class uri1041 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String ponto;
		float x, y;
		x = input.nextFloat();
		y = input.nextFloat();

		if (x == 0 && y == 0) {
			ponto = "Origem";
		} else if (x == 0 && y != 0) {
			ponto = "Eixo Y";
		} else if (x != 0 && y == 0) {
			ponto = "Eixo X";
		} else if (x > 0 && y > 0) {
			ponto = "Q1";
		} else if (x < 0 && y > 0) {
			ponto = "Q2";
		} else if (x < 0 && y < 0) {
			ponto = "Q3";
		} else {
			ponto = "Q4";
		}

		System.out.println(ponto);

		input.close();
	}
}
