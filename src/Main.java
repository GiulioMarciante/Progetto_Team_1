import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Inserisci l'operatore ( + , - , * , / , ^, p):");
        char operatore = scanner.next().charAt(0);

        if (operatore != '*' && operatore != 'p'){
            System.out.println("Inserisci l'operatore corretto ( + , - , * , / , ^, p):");
            operatore = scanner.next().charAt(0);
        }

        double num2 = 0;

        if(operatore != 'p'){
            System.out.println("Inserisci il secondo numero:");
            num2 = scanner.nextDouble();
        }

        scanner.close();

        switch(operatore){
           case '+':
                funzioneAddizione();
                break;
            case '-':
                funzioneSottrazione();
                break;*/
            case '*':
                funzioneMoltiplicazione(num1,num2);
                break;
            case '/':
                funzioneDivisione();
                break;
            case '^':
                funzionePotenza();
                break;*/
            case 'p':
                funzionePariDispari(num1);
                break;
            default:
                System.out.println("Not Operator!");

        }
    }
   public static void funzionePotenza(double num, double esp){
        double result = 1;
        if(esp == 0){
            System.out.println(result);
        }else {
            for (int i = 1; i <= esp; i++) {
                result *= num;
                System.out.println(result);
            }
        }
    public static void funzioneMoltiplicazione (double num1, double num2) {

        double result = num1 * num2;
        System.out.println(result);
    }
          
    public static void funzionePariDispari (double num1){

        boolean isPari = false;
        if (num1 % 2 == 0){
            isPari = true;
            System.out.println("Numero Pari");
        } else {
            System.out.println("Numero Dispari");
        }
    }


    public static void funzioneSottrazione(double num1, double num2) {
        double result;
        result = num1 - num2;
        System.out.println(result);
    }
    public static void funzioneAddizione (double num1, double num2) {

        double result = num1 + num2;
        System.out.println(result);
    }
}
