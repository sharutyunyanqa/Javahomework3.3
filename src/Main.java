public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("12 месяцев");
        System.out.println(service.calculate(9.99, 1_000_000, 12));

        System.out.println("24 месяца");
        System.out.println(service.calculate(9.99, 1_000_000, 24));

        System.out.println("36 месяцев");
        System.out.println(service.calculate(9.99, 1_000_000, 36));


    }
}