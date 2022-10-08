public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Aguinaldo Américo";

        System.out.println(meuNome);

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;
        System.out.println("Aqui é uma variável: " + numero);

        /*
         * aqui é uma constante final garante que essa variável
         * não sera alterada e por convenção essa variaval devera ser escrita em caixa
         * alta
         */
        final double VALOR_DE_PI = 3.14;
        System.out.println("Aqui é uma constante: " + VALOR_DE_PI);
    }
}
