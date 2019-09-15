import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior = a;

		if (a < b || a < c) {
			if (b > c) {
				maior = b;
			} else {
				maior = c;
			}

		}
		System.out.printf("%d eh o maior%n", maior);

		sc.close();
	}
}