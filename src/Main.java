public class Main {
    public static void funzionePotenza(double num, double esp){
        double result = 1;
        if(esp==0){
            System.out.println(result);
        }else {
            for (int i = 1; i <= esp; i++) {
                result *= num;
                System.out.println(result);
            }
        }
    }
}