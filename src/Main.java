
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;

        String operacion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Captura tu operacion: ");
        operacion = scanner.nextLine();

        System.out.println("Dame el operando 1: ");
        num1 = scanner.nextInt();
        System.out.println("Dame el operando 2: ");
        num2 = scanner.nextInt();

        switch (operacion) {
            case "SUMA":
                System.out.println("La suma es " + (num1 + num2));
                break;
            case "RESTA":
                System.out.println("La resta es " + (num1 - num2));
                break;
            case  "MULTIPLICACION":
                System.out.println("La multiplicacion es " + (num1 * num2));
                break;
            case  "DIVISION":
                System.out.println("La division es " + (num1 / num2));
                break;
            default:
                System.out.println("Operacion no soportada");
                break;
        }

    }
}