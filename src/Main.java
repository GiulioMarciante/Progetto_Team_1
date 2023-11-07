import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero o una lista di numeri separati da ',':");

        String inputNumeri = scanner.nextLine();

        System.out.println("Inserisci l'operatore ( + , - , * , / , ^, p):");

        char operatore = scanner.next().charAt(0);

        while (true) {
            if (operatore != '+' && operatore != '-' && operatore != '*' && operatore != '/' && operatore != '^' && operatore != 'p') {
                System.out.println("Inserisci l'operatore corretto ( + , - , * , / , ^, p):");
                operatore = scanner.next().charAt(0);
            } else break;
        }
        //ho rimosso double risultato = 0; dava errore perché nominato alla riga 41.
        String[] numberStrs = inputNumeri.split(",");

        double[] numbers = new double[numberStrs.length];

        for(int i = 0; i < numberStrs.length; i++) {

            numbers[i] = Double.parseDouble(numberStrs[i]);
        }
        double risultato = numbers[0];

        if(numbers.length == 1){

            if (risultato % 2 == 0) {
                System.out.println("Il numero è Pari"); //il double entrava in conflitto con la stringa in coercizione.
            } else {
                System.out.println("Il numero è Dispari"); //stessa cosa.
            }

        } else if (numbers.length == 2){

            double num1 = numbers[0];
            double num2 = numbers[1];

            switch (operatore) {
                case '+':
                    risultato = num1 + num2;
                    break;
                case '-':
                    risultato = num1 - num2;
                    break;
                case '*':
                    risultato = num1 * num2;
                    break;
                case '/':
                    int quoto = (int) (num1 / num2);
                    int resto = (int) (num1 % num2);
                    risultato = quoto;
                    System.out.println("Il resto della divisione è: " + resto);
                    break;
                case '^':
                    risultato = Math.pow(num1, num2); //scusa ma mi dava problemi senza Math.pow
                    break;
                default:
            }
        } else {
            for (int i = 1 ; i < numbers.length; i++) {
                switch (operatore) {
                    case '+':
                        risultato += numbers[i];
                        break;
                    case '-':
                        risultato -= numbers[i];
                        break;
                    case '*':
                        risultato *= numbers[i];
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
        }
        System.out.println("Risultato: " + risultato);
        scanner.close();
    }
}