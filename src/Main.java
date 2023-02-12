public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int recharged = 1200;
        int bonus = recharged / 100;
        if (recharged < 1000) {
            bonus = 0;
        }
        System.out.println(amount + bonus + recharged);
    }
}
