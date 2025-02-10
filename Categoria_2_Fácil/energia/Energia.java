package Categoria_2_Fácil.energia;

import java.util.Scanner;

public class Energia {

    public static void main(String[] args) {
        // Entrada de dados
        Scanner ler = new Scanner(System.in);
        int n;
        int m = 0;

        // loop para leitura de n
        while ((n = ler.nextInt()) != 0) {
            // ordem das cidades selecionadas
            int ordem[] = new int[n];

            // loop para percorrer todas as possibilidades
            for (int i = 1; i < n; i++) {
                // m é o número de cidades puladas
                m++;
                // cid é a cidade atual
                int cid = 1;
                // ordem[0] é a primeira cidade
                ordem[0] = 1;

                // loop para percorrer todas as cidades
                for (int z = 1; z < n; z++) {
                    // cid é a cidade atual

                    cid = cid + m;
                    if (cid > n) {
                        cid = cid - n;
                    }
                    ordem[z] = cid;
                }

                // loop para imprimir a ordem das cidades
                

                // loop para imprimir a ordem das cidades
                if (ordem[n-1] == 13) {
                    System.out.println(i);
                    break;

                }
            }

        }
    }
}
ler.close();