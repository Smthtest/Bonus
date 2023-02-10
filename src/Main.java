public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int Recharged = 1200;
        boolean phoneRecharged = true;
        int bonus = Recharged / 100;
        if (Recharged < 1000) {
            bonus = 0;
        }
        System.out.println(amount + bonus + Recharged);
    }
}
