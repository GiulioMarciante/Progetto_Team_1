public class Main {
    public static void main(String[] args) {
    }

    public static void funzioneAddizione (int num1, int num2) {

        int result = num1 + num2;
        System.out.println(result);
    }

    public static void funzioneMoltiplicazione (int num1, int num2) {

        int result = num1 * num2;
        System.out.println(result);
    }
    public static void funzionePariDispari (int num1){

        boolean isPari = false;
        if (num1 % 2 == 0){
            isPari = true;
            System.out.println("Numero Pari");
        } else {
            isPari = false;
            System.out.println("Numero Dispari");
        }
        System.out.println(isPari);
    }
}