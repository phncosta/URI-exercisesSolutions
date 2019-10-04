import java.util.Scanner;

public class uri1070 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int X = input.nextInt();
		int i = 0;

		if (X > 0) {
			while (i < 6) {
				if (X % 2 != 0) {
					i++;
					System.out.println(X);
				}
				X++;
			}
		}

		input.close();
	}

}
