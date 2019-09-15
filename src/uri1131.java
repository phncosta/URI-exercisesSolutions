import java.util.Scanner;

public class uri1131 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int golsI, golsG, inter = 0, gremio = 0, empate = 0, novoGrenal, grenal = 1;

        do {
            golsI = input.nextInt();
            golsG = input.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = input.nextInt();
            if (novoGrenal == 1) {
                grenal++;
            }
            if (golsI > golsG) {
                inter++;
            } else if (golsG == golsI) {
                empate++;
            } else {
                gremio++;
            }

        } while (novoGrenal == 1);

        System.out.println(grenal + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (inter == gremio) {
            System.out.println("Nao houve vencedor");
        } else {
            System.out.println("Gremio venceu mais");
        }

        input.close();
    } 
}
