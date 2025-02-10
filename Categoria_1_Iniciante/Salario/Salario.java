package Categoria_1_Iniciante.Salario;
import java.util.Scanner;

/*
 * Nome Do Problema: Salario
 * Codigo:1008
 * Linguagem utilizada: Java
 * Autor do Codigo: Pedro Guimarães Alves Freitas
 * Data de inicio: 09/02/2025
 * Ultima atualização: 09/02/2025
 * Descrição: O problema é simples, basta calcular o salário de um funcionário, dado o número do funcionário, a quantidade de horas trabalhadas e o valor da hora.
 */


public class Salario {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner ler= new Scanner(System.in);
        int numero;
        int horas;
        double valorphora;

        //Processamento e saída de dados
        while(ler.hasNextLine()){

            //Vetor de strings temporário
            String tmp[]= new String[3];

            //coleta de dados e verificação de entrada vazia
            for(int i=0; i<3; i++){
                
                tmp[i] = ler.nextLine();
                if (tmp[i].isEmpty()) {
                    return;
                }
            }
            //Convertendo os valores do vetor de strings temporário para os tipos de dados corretos
            numero=Integer.parseInt(tmp[0]);
            horas=Integer.parseInt(tmp[1]);
            valorphora= Double.parseDouble(tmp[2].replaceAll(",", "."));
            
            //Saída de dados
            System.out.println("NUMBER = " + numero);
            System.out.printf("SALARY = U$ %.2f\n", horas*valorphora);

            //Limpando o vetor de strings temporário para a próxima iteração
            for(int i=0; i<3; i++){
                tmp[i]=null;
            }
            }
            //Fim
            ler.close();
        }
        
    }

