import java.util.Scanner;
public class Main1Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Inserisci l'operatore ( + , - , * , / , ^, p):");

        char operatore = scanner.next().charAt(0);

        while (true) {
            if (operatore != '+' && operatore != '-' && operatore != '*' && operatore != '/' && operatore != '^' && operatore != 'p') {
                System.out.println("Inserisci l'operatore corretto ( + , - , * , / , ^, p):");
                operatore = scanner.next().charAt(0);
            } else break;
        }

        double num2 = 0;

        if (operatore != 'p') {
            System.out.println("Inserisci il secondo numero:");
            num2 = scanner.nextDouble();
        }

        scanner.close();

        switch (operatore) {
            case '+':
                funzioneAddizione(num1, num2);
                break;
            case '-':
                funzioneSottrazione(num1, num2);
                break;
            case '*':
                funzioneMoltiplicazione(num1, num2);
                break;
            case '/':
                funzioneDivisione(num1, num2);
                break;
            case '^':
                funzionePotenza(num1, num2);
                break;
            case 'p':
                funzionePariDispari(num1);
                break;
            default:
        }
    }

    public static void funzioneAddizione(double num1, double num2) {

        double result = num1 + num2;
        System.out.println(result);
    }

    public static void funzioneSottrazione(double num1, double num2) {
        double result;
        result = num1 - num2;
        System.out.println(result);
    }

    public static void funzioneMoltiplicazione(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(result);
    }

    public static void funzioneDivisione(double num1, double num2) {
        double result = num1 / num2;
        int rest = (int) (num1 % num2);
        System.out.println(result + " con il resto di: " + rest);
    }

    public static void funzionePotenza(double num, double esp) {
        double result = 1;
        if (esp == 0) {
            System.out.println(result);
        } else {
            for (int i = 1; i <= esp; i++) {
                result *= num;
            }
            System.out.println(result);
        }
    }

    public static void funzionePariDispari(double num1) {
        if (num1 % 2 == 0) {
            System.out.println("Numero " + num1 + " è Pari");
        } else {
            System.out.println("Numero " + num1 + " è Dispari");
        }
    }
}