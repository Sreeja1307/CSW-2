package chapter12;

public class Q13 {

    static class Payment {
        public void processPayment() {
            System.out.println("Processing payment");
        }
    }

    static class CreditCardPayment extends Payment {
        @Override
        public void processPayment() {
            System.out.println("Processing Credit card payment");
        }
    }

    static class PayPalPayment extends Payment {
        @Override
        public void processPayment() {
            System.out.println("Processing PayPal payment");
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processPayment();

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();

        PayPalPayment payPalPayment = new PayPalPayment();
        payPalPayment.processPayment();
    }
}

