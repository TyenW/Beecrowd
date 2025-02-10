import java.util.Scanner;

/*
 * Nome Do Problema: Área do Círculo
 * Codigo:1002
 * Linguagem utilizada: Java
 * Autor do Codigo: Pedro Guimarães Alves Freitas
 * Data de inicio: 09/02/2025
 * Ultima atualização: 09/02/2025
 * Descrição: O problema é simples, basta calcular a área de um círculo, dado o valor do raio.
 */

//Classe
class area{

public static void main(String[] args) {

    //Entrada de dados
    Scanner ler =new Scanner(System.in);
    String numero;
    double raio;
    double area;
    double pi = 3.14159; 
    
    

    //Processamento e saída de dados
    while (ler.hasNextLine()) {
        numero = ler.nextLine();
        if (numero.isEmpty()) {
            break;
        }
        numero = numero.replaceAll(",", ".");
        raio = Double.parseDouble(numero);
        area = pi * (raio * raio);
        System.out.printf("A=%.4f\n", area);
    }
    ler.close();
    //Fim
}
}