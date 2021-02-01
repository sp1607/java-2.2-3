public class CreditPaymentService {
    public double calculate(double years, double amount, double rate) {
        double month = years * 12;
        double percentRatio = rate / 100 / 12;
        double degree = Math.pow(1 + percentRatio, month);
        double annuityRatio = ((percentRatio * degree) / (degree - 1));
        double payment = Math.round(amount * annuityRatio);
        return payment;
    }
}
