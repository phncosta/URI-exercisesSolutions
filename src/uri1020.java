import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anos, meses, restoAnos, restoMeses, dias;
		int idade = sc.nextInt();
		anos = idade / 365;
		restoAnos = idade - (365 * anos);
		meses = restoAnos / 30;
		restoMeses = restoAnos %= 30;
		dias = restoMeses;

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

		sc.close();
	}

}