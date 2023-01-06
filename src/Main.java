public class Main {
    public static void main(String[] args) {
        int cash = 100;
        int replenishment = 1200;
        int threshold = 1000;
        int bonus = 0;
        if (replenishment > threshold) {
            bonus = replenishment / 100;

        }
        System.out.println(bonus);

        System.out.println(replenishment + cash + bonus);

    }


}