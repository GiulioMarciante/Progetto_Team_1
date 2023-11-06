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

            String[] numeri = inputNumeri.split(",");

            double risultato = Double.parseDouble(numeri[0]);

            for (int i = 1 ; i < numeri.length; i++) {
                double numero = Double.parseDouble(numeri[i]);

                switch (operatore) {
                    case '+':
                        risultato += numero;
                        break;
                    case '-':
                        risultato -= numero;
                        break;
                    case '*':
                        risultato   *= numero;
                        break;
                    case '/':
                        if (numero != 0) {
                            risultato /= numero;
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