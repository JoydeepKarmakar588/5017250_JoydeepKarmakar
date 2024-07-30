//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234567890123456", "786", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(100.00);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("myemail@example.com", "mypwd");
        context.setPaymentStrategy(payPalPayment);
        context.pay(200.00);
    }
}