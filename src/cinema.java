public class cinema {
            public static void main(String[] args) {
                int fileiras = 10;
                int cadeiras = 8;
                int reserva = 8;
                int porcentagem = 100;
                int totalLugares = (fileiras * cadeiras);
                int resultado = (totalLugares * reserva) / porcentagem;

                System.out.println(" A sala de cinema tem " + fileiras + " fileiras com " + cadeiras + " cadeiras ");

                System.out.println(" A capacidade dessa sala é de " + totalLugares + " pessoas " + " Sendo que " + reserva + " lugares são reservados para PCDs!");

            }
        }

