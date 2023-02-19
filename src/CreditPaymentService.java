public class CreditPaymentService {
    public double calculate(int credit, double percent, int period) {
        double monthPercent = percent / 12 / 100;
        double payment = credit * ((monthPercent * Math.pow(1 + monthPercent, period)) / (Math.pow(1 + monthPercent, period) -1 ));
        return payment;
    }
}

