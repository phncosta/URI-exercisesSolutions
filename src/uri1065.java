import java.util.Scanner;

public class uri1065 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int pares = 0, i = 0;
		while (i < 5) {
			i++;
			int n = input.nextInt();
			if (n % 2 == 0) {
				pares++;
			}
		}
		System.out.println(pares + " valores pares");

		input.close();
	}
}
