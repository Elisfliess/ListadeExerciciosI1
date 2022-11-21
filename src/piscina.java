public class piscina {

        public static void main(String[] args) {
            double primeiraDimensao = 10;
            double segundaDimensao = 20;
            double terceiraDimensao = 1.8;
            double resultado =  (primeiraDimensao * segundaDimensao * terceiraDimensao);

            System.out.println( resultado + " É a quantidade de litros de água que a piscina comporta .");

            double quartaDimensao =  10;
            double quintaDimensao = 20;
            double dimensoes = quartaDimensao * quintaDimensao;
            double profundidadeI = 1.2;
            double profundidadeF = 1.8;

            double profundidadeM = (profundidadeI + profundidadeF) / 2;

            double resultadoF = dimensoes* profundidadeM;
            System.out.println(resultadoF);


        }
    }


