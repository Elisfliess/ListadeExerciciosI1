import java.util.Scanner;

public class argumentos {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int nascimento;
            int anoAtual;

            System.out.println( " Digite seu ano de Nascimento !");
            nascimento = scanner.nextInt();

            System.out.println( "Digite seu ano atual ! ");
            anoAtual = scanner.nextInt();

            int idade = anoAtual - nascimento;
            System.out.println(idade);
        }
    }


