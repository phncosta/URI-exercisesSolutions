import java.util.Scanner;

public class uri1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tipo1 = sc.next();
		String tipo2 = sc.next();
		String tipo3 = sc.next();
		String animal = null;

		if (tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnivoro")) {
			animal = "aguia";
		} else if (tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")) {
			animal = "pomba";
		} else if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
			animal = "homem";
		} else if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
			animal = "vaca";
		} else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")) {
			animal = "pulga";
		} else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro")) {
			animal = "lagarta";
		} else if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
			animal = "sanguessuga";
		} else if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
			animal = "minhoca";
		}
		
		System.out.println(animal);

		sc.close();
	}

}