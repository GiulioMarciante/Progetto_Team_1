import java.util.Scanner;

public class Main2Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una lista di numeri separati da ',':");

        String inputNumeri = scanner.nextLine();

        System.out.println("Inserisci l'operatore ( + , - , * , /):");

        char operatore = scanner.next().charAt(0);

        while (true) {
            if (operatore != '+' && operatore != '-' && operatore != '*' && operatore != '/') {
                System.out.println("Inserisci l'operatore corretto ( + , - , * , /):");
                operatore = scanner.next().charAt(0);
            } else break;
        }
        String[] numberStrs = inputNumeri.split(",");
        double[] numbers = new double[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++)
        {
            numbers[i] = Double.parseDouble(numberStrs[i]);
        }
        double risultato = numbers[0];

            for (int i = 1 ; i < numbers.length; i++) {

                switch (operatore) {
                    case '+':
                        risultato += numbers[i];
                        break;
                    case '-':
                        risultato -= numbers[i];
                        break;
                    case '*':
                        risultato   *= numbers[i];
                        break;
                    case '/':
                        if (numbers[i] != 0) {
                            risultato /= numbers[i];
                        }else {
                            System.out.println("Non si può dividere per 0");
                            return;
                        }
                        break;
                }
            }
        System.out.println("Risultato: " + risultato);
        scanner.close();
        }
    }