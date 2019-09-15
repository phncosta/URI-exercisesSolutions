import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int horas, restoHoras, minutos, restoMinutos, segundos;

		horas = total / 3600;
		restoHoras = total %= 3600;
		minutos = restoHoras / 60;
		restoMinutos = restoHoras %= 60;
		segundos = restoMinutos;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}

}