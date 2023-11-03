public class Main {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 2;

        multi(num1, num2);

        public static void multi(int num, int esp){
            int resMulti = num;
            for (int i = 0; i <= esp; i++) {
                resMulti *= num1;
                System.out.println(resMulti);
            }
        }
    }
}