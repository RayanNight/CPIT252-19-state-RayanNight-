import shopping.ShoppingCart;
import shopping.Product;
import paymentsStrategy.*;
import java.util.Scanner;  

public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
		
		Product item1 = new Product("Body wash", "549032", 10.99);
		Product item2 = new Product("Shampoo", "872150",14.99);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
        System.out.println("Shopping cart:\n"+ cart.toString());
        System.out.println("Your total is: $" + cart.calculateTotal());
        System.out.println("\nPlease select your payment method:\n" +
                "1. Credit Card\n2. PayPal\n");
		Scanner scanner = new Scanner(System.in);
        int paymentMethod = scanner.nextInt();
        if (paymentMethod == 1){
            cart.checkout(new CreditCardPayment("Ali Omar", "4111111111111111", "123", "12/23"));
        }
        else if(paymentMethod == 2){
            cart.checkout(new PayPalPayment("email@example.com", "my-merchant-ID"));
        }
    }
}
