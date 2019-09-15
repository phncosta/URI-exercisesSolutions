package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {

	private Random random = new Random();

	public static void main(String[] args) {

		List<String> grupos = new ArrayList<>();

		grupos.add("Caio");
		grupos.add("Gustavo");
		grupos.add("João");
		grupos.add("Murillo");
		grupos.add("Paulo");
		grupos.add("Renan");
		grupos.add("Sillas");
		grupos.add("Unknown");

		Random numberGenerator = new Random();
		int nextRandom;

		for (int i = 0; i < 8; i++) {
			nextRandom = numberGenerator.nextInt(8 - i);
			System.out.println("Grupo 1:");
			System.out.println(grupos.get(nextRandom));
			grupos.remove(nextRandom);

		}
	}

	public int getRandomList(List<Integer> list) {

		// Math.random() = greater than or equal to 0.0 and less than 1
		// 0-4
		int index = (int) (Math.random() * list.size());
		System.out.println("\nIndex :" + index);
		return list.get(index);

	}

}
