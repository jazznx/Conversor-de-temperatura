package Faculdade;
import java.util.Scanner;
public class temperatura {
    public static void main(String[] args){
        double resultado, resultado2, resultado3;

        char operador;

        Scanner input = new Scanner(System.in);


        System.out.println("Digite a temperatura: ");
        double temperatura = input.nextDouble();

        System.out.println("Digite o operador de seu número e para qual vai converter: (1: F/C, 2:  F/K, 3: C/F, 4: C/K, 5: K/F, 6: K/C");
        char t1 = input.next().charAt(0);


            switch (t1) {
                case '1':
                resultado = (temperatura - 32) /9;
                resultado2 = (resultado * 5);
                    System.out.println("Seu valor em Celsius será: " + resultado2);
                    break;


                case '2':
                    resultado = (temperatura - 32) /9;
                    resultado2 = (resultado * 5);
                    resultado3 = (resultado2 + 273);
                    System.out.println("Seu valor em Kelvin será: " + resultado3);
                    break;

                case '3':
                    resultado = (temperatura / 5) * 9;
                    resultado2 = resultado + 32;
                    System.out.println("O seu valor em Farehrenint será: " + resultado2);
                    break;

                case '4':
                    resultado = (temperatura / 5) * 5;
                    resultado2 = (resultado + 273);
                    System.out.println("Seu valor em Kelvin será: " + resultado2);
                    break;

                case '5':
                    resultado = (temperatura - 273) / 5;
                    resultado2 = (resultado * 9) + 32;
                    System.out.println("O seu valor em Farehrenint será: " + resultado2);
                    break;

                case '6':
                    resultado = (temperatura - 273) / 5;
                    resultado2 =(resultado * 5);
                    System.out.println("Seu valor em Celsius será: " + resultado2);
                    break;


            }











    }
}
