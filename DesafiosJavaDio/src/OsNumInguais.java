import java.util.*;

public class OsNumInguais {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite primeiro numero");
        int num1 = leitor.nextInt();

        System.out.println("Digite segundo numero");
        int num2 = leitor.nextInt();

        if (num1 == num2)
            System.out.println("são iguais");

        else
            System.out.println("não são iguais");

    }
}