import java.util.Scanner;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class fahrenheit {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double temperatura;
            System.out.println("Entre F e C ,indique a temperatura desejada!");
            String unidadedeMedida = scanner.nextLine();

            if (unidadedeMedida.equals("C")) {
                System.out.println("Coloque o valor da temperatura escolhida!");
                temperatura = scanner.nextDouble();
                System.out.println("A temperatura foi" + temperatura + "°");
                double conversaoF = (temperatura * 1.8) + 32.0;
                System.out.println(" Que equivale " + conversaoF + "Farenheit.");

            } else if (unidadedeMedida.equals("F")) {
                System.out.println("indique o valor da temperatura");
                temperatura = scanner.nextDouble();
                System.out.println("A temperatura informada foi " + temperatura + "°");
                double conversaoC = (temperatura - 32.0) / 1.8;
                System.out.println(" Que equivale a " + conversaoC + "° Celsius");

            } else {
                System.out.println("A letra " + unidadedeMedida + " que você indicou não é uma unidade de medida");


            }
        }
    }
