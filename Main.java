public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double years = 1;
        double amount = 1_000_000;
        double rate = 9.99;
        double payment = service.calculate(years, amount, rate);
        System.out.println(Math.round(payment));

        years = 2;
        amount = 1_000_000;
        rate = 9.99;
        payment = service.calculate(years, amount, rate);
        System.out.println(Math.round(payment));

        years = 3;
        amount = 1_000_000;
        rate = 9.99;
        payment = service.calculate(years, amount, rate);
        System.out.println(Math.round(payment));

    }
}
