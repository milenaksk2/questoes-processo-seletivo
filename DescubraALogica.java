import java.util.Scanner;

public class DescubraALogica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = input.nextInt();
        int a = 0, b = 1, c;
        boolean encontrado = false;
        
        while (b <= numero) {
            if (b == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
                encontrado = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }
        
        if (!encontrado) {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

}
