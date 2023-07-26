public class CreditPaymentService {
    public int calculate(double percent, int sum, int month) {
        double monthlypercent = percent / 12 / 100;
        double monthlyPayment = sum * monthlypercent * (Math.pow(1 + monthlypercent, month)) / (Math.pow(1 + monthlypercent, month) - 1);
        return (int) monthlyPayment;

    }
}
